# Zephyr Scale Integration with LambdaTest

![image](https://user-images.githubusercontent.com/70570645/171432631-dcc31b10-6590-4877-98c0-4ac702fbd441.png)

<p align="center">
  <a href="https://www.lambdatest.com/blog/?utm_source=github&utm_medium=repo&utm_campaign=junit-selenium-sample" target="_bank">Blog</a>
  &nbsp; &#8901; &nbsp;
  <a href="https://www.lambdatest.com/support/docs/?utm_source=github&utm_medium=repo&utm_campaign=junit-selenium-sample" target="_bank">Docs</a>
  &nbsp; &#8901; &nbsp;
  <a href="https://www.lambdatest.com/learning-hub/?utm_source=github&utm_medium=repo&utm_campaign=junit-selenium-sample" target="_bank">Learning Hub</a>
  &nbsp; &#8901; &nbsp;
  <a href="https://www.lambdatest.com/newsletter/?utm_source=github&utm_medium=repo&utm_campaign=junit-selenium-sample" target="_bank">Newsletter</a>
  &nbsp; &#8901; &nbsp;
  <a href="https://www.lambdatest.com/certifications/?utm_source=github&utm_medium=repo&utm_campaign=junit-selenium-sample" target="_bank">Certifications</a>
  &nbsp; &#8901; &nbsp;
  <a href="https://www.youtube.com/c/LambdaTest" target="_bank">YouTube</a>
</p>
&emsp;
&emsp;
&emsp;

*Learn how to use JUnit framework to configure and run your Java automation testing scripts on the LambdaTest platform*

[<img height="58" width="200" src="https://user-images.githubusercontent.com/70570645/171866795-52c11b49-0728-4229-b073-4b704209ddde.png">](https://accounts.lambdatest.com/register?utm_source=github&utm_medium=repo&utm_campaign=junit-selenium-sample)


## Table Of Contents

* [Pre-requisites](#pre-requisites)
* [Run Your First Test](#run-your-first-test)
* [Parallel Testing With JUnit](#run-parallel-tests-using-junit)
* [Local Testing With JUnit](#testing-locally-hosted-or-privately-hosted-projects)

## Pre-requisites

Before you can start performing Java automation testing with Selenium, you would need to:

- Install the latest **Java development environment** i.e. **JDK 1.6** or higher. We recommend using the latest version.

- Download the latest **Selenium Client** and its **WebDriver bindings** from the [official website](https://www.selenium.dev/downloads/). Latest versions of Selenium Client and WebDriver are ideal for running your automation script on LambdaTest Selenium cloud grid.

- Install **Maven** which supports **JUnit** framework out of the box. **Maven** can be downloaded and installed following the steps from [the official website](https://maven.apache.org/). Maven can also be installed easily on **Linux/MacOS** using [Homebrew](https://brew.sh/) package manager.

- You would have to add the following maven dependency to your `pom.xml` file if working on your local project.
  ```xml
  <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
  </dependency>
  ```

### Cloning Repo And Installing Dependencies

**Step 1:** Clone the LambdaTest’s JUnit-Selenium-Sample repository and navigate to the code directory as shown below:

```bash
git clone [https://github.com/LambdaTest/junit-selenium-sample](https://github.com/ritamganguli/junit_xray_integration)
cd junit_xray_integration
```

You may also want to run the command below to check for outdated dependencies.

```bash
mvn versions:display-dependency-updates
```

### Setting Up Your Authentication

Make sure you have your LambdaTest credentials with you to run test automation scripts. You can get these credentials from the [LambdaTest Automation Dashboard](https://automation.lambdatest.com/build?utm_source=github&utm_medium=repo&utm_campaign=junit-selenium-sample) or by your [LambdaTest Profile](https://accounts.lambdatest.com/login?utm_source=github&utm_medium=repo&utm_campaign=junit-selenium-sample).

**Step 2:** Set LambdaTest **Username** and **Access Key** in environment variables.

* For **Linux/macOS**:
  
  ```bash
  export LT_USERNAME="YOUR_USERNAME" 
  export LT_ACCESS_KEY="YOUR ACCESS KEY"
  ```
  * For **Windows**:
  ```bash
  set LT_USERNAME="YOUR_USERNAME" 
  set LT_ACCESS_KEY="YOUR ACCESS KEY"
  ```

## Run Your First Test

>**Test Scenario**: Checkout sample [JUnitTodo.java](https://github.com/LambdaTest/junit-selenium-sample/blob/master/src/test/java/com/lambdatest/JUnitTodo.java) file. This JUnit Selenium script tests a sample to-do list app by marking couple items as done, adding a new item to the list and finally displaying the count of pending items as output.

### Configuring your Test Capabilities

**Step 3:** In the test script, you need to update your test capabilities. In this code, we are passing browser, browser version, and operating system information, along with LambdaTest Selenium grid capabilities via capabilities object. The capabilities object in the above code are defined as:

```java
ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "latest");

        Map<String, Object> ltOptions = new HashMap<>();
        ltOptions.put("build", "JUnitSampleTestApp");
        ltOptions.put("name", "JUnitSampleTest");
        ltOptions.put("selenium_version", "4.0.0");
        ltOptions.put("project", "");  //Enter Project name here
        ltOptions.put("smartUI.project", "");  //Enter smartUI Project name here
        ltOptions.put("w3c", true);
        ltOptions.put("plugin", "junit-junit");
        ltOptions.put("visual", true); // To enable step by step screenshot
        ltOptions.put("network", true); // To enable network logs
        ltOptions.put("video", true); // To enable video recording
        ltOptions.put("console", true); // To capture console logs
        browserOptions.setCapability("LT:Options", ltOptions);
```

You can generate capabilities for your test requirements with the help of our inbuilt [Desired Capability Generator](https://www.lambdatest.com/capabilities-generator/?utm_source=github&utm_medium=repo&utm_campaign=junit-selenium-sample).

 
 ##Getting Started With Zephyr Scale

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


