**Zephyr Scale Integration with LambdaTest**

**Prerequisites:**

1\. Install Zephyr Scale - Test Management for Jira application from the Atlassian Marketplace.
2\. A LambdaTest account.
3\. A Jira Project key.
4\. A Zephyr Scale Access token.

[Image: Zephyr Scale Integration Setup]

**Integrating LambdaTest with Zephyr Scale**

1\. Clone the LambdaTest Zephyr Scale GitHub repository and navigate to the cloned directory:
`   `git clone <https://github.com/LambdaTest/junit-selenium-zephyr-scale-sample>
`   `cd junit-selenium-zephyr-scale-sample
2\. In the PostTestResults.java script, add the following String parameters:
`   `- File name of your test results.
`   `- File path of the test result file.
`   `- Jira Project key
`   `- Zephyr Scale Access token 
3\. In the test script, update test capabilities and add your LambdaTest Username and Access Key.

**How to get Jira Project Key**

You can click on create a new project, and then copy the key as this will be used in your project\_key 

![](Aspose.Words.f162cf1e-4ff9-4fcf-8c60-2e23df4500b3.001.png)


**How to get Zephyr Scale Acess Token**

Basically first you need to have the zephir app installed over your system, which you do by clicking over to app and then go over to marketplace and search for zephyr sacle and install it, once done in order to get the key please use the following option

![](Aspose.Words.f162cf1e-4ff9-4fcf-8c60-2e23df4500b3.002.png)

Then click over to  zephr scale api acess key, and generate your api key

![](Aspose.Words.f162cf1e-4ff9-4fcf-8c60-2e23df4500b3.003.png)**Running your Automation tests with LambdaTest and Zephyr Scale**

To run the test, pass the below command in the terminal:
`   `mvn test -P single
Go to the LambdaTest's Automation Dashboard to view the test execution results.

![](Aspose.Words.f162cf1e-4ff9-4fcf-8c60-2e23df4500b3.004.png)

**Viewing the Test Results in Zephyr Scale**

To view test results in Zephyr Scale, head over to your Zephyr Scale project. You can view the executed build by navigating to Test Cycles and clicking on the Zephyr project Key or Name.

![](Aspose.Words.f162cf1e-4ff9-4fcf-8c60-2e23df4500b3.005.png)

You can also view the executed build by navigating to Test Cycles.

![](Aspose.Words.f162cf1e-4ff9-4fcf-8c60-2e23df4500b3.006.png)


