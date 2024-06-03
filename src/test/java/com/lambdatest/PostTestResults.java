package com.lambdatest;

import okhttp3.*;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class PostTestResults {

    // Method to call the Zephyr Scale API for posting test results
    public void callApi(List<String> fileNames, List<String> filePaths, String projectKey, String token) {
        OkHttpClient client = new OkHttpClient().newBuilder().build();

        // Iterate over each file
        for (int i = 0; i < fileNames.size(); i++) {
            String fileName = fileNames.get(i);
            String filePath = filePaths.get(i);

            // Prepare the request body with the file
            RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                    .addFormDataPart("file", fileName,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(filePath)))
                    .build();

            // Construct the URL with project key as query parameter
            HttpUrl.Builder urlBuilder = HttpUrl.parse("https://api.zephyrscale.smartbear.com/v2/automations/executions/junit").newBuilder();
            urlBuilder.addQueryParameter("projectKey", projectKey);
            urlBuilder.addQueryParameter("autoCreateTestCases", "true");
            String url = urlBuilder.build().toString();

            // Create the request
            Request request = new Request.Builder()
                    .url(url)
                    .method("POST", body)
                    .addHeader("Authorization", "Bearer " + token)
                    .build();

            try {
                // Execute the request
                Response response = client.newCall(request).execute();
                // Print response details
                System.out.println("Result Posted to Zephyr Scale for file: " + fileName);
                System.out.println(response.code());
                System.out.println(response.body().string());
            } catch (Exception e) {
                // Print error message if request fails
                System.out.println("Failed to post results for file: " + fileName);
                e.printStackTrace();
            }
        }
    }

    // Main method to run the code
    public static void main(String[] args) {
        // File names and paths
        List<String> fileNames = Arrays.asList("TEST-com.lambdatest.JUnitConcurrentTodo.xml", "TEST-com.lambdatest.JUnitTodo.xml");
        List<String> filePaths = Arrays.asList("target/surefire-reports/TEST-com.lambdatest.JUnitConcurrentTodo.xml", "target/surefire-reports/TEST-com.lambdatest.JUnitTodo.xml");

        // Create an instance of PostTestResults
        PostTestResults postTestResults = new PostTestResults();
        // Call the method to post test results
        postTestResults.callApi(fileNames, filePaths, "project_key", "api_key");
    }
}
