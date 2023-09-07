package com.saucedemo;

import static java.lang.String.format;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends Reporter implements ITestListener {
    @Override
    public void onTestStart(ITestResult result){
        logInfo(format("Test: %s - [STARTING...]", result.getName()));
    }

    @Override
    public void onTestSuccess(ITestResult result){
        logInfo(format("Test: %s - [PASSED]", result.getName()));
    }

    @Override
    public void onTestFailure(ITestResult result){
        logInfo(format("Test: %s - [FAILED]", result.getName()));
    }

    @Override
    public void onTestSkipped(ITestResult result){
        logInfo(format("Test: %s - [SKIPPED]", result.getName()));
    }
}
