package com.extent.reports.extent;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.extent.reports.service.ExtentReporterService;
import com.extent.reports.extent.spark.SparkReporter;
import com.extent.reports.test.Test;
import com.extent.reports.test.TestService;

import java.util.HashMap;
import java.util.Map;

/**
 * The {@code ExtentReport} abstract class implements the {@code TestReporterInterface}
 * and serves as a base class for custom report generation using ExtentReports library.
 *
 * <p>
 * This class encapsulates the core functionality for report generation,
 * including test creation, test removal, attaching reporters, and flushing reports.
 * </p>
 *
 * @version 1.1
 * @Author Navin Jones
 * @see ExtentReporterService
 * @see ExtentReports
 */
public abstract class ExtentReportBuilder implements ExtentReporterService {

    protected static ExtentReports reports;
    private final Map<Test, com.aventstack.extentreports.model.Test> test = new HashMap<>();

    /**
     * Initializes a new ExtentReport instance with a new ExtentReports object.
     */
    protected ExtentReportBuilder() {
        reports = new ExtentReports();
    }

    /**
     * Attaches a SparkReporter to the ExtentReports instance for enhanced reporting.
     *
     * @param reporter The SparkReporter instance to attach.
     */
    public void attachReporter(final SparkReporter reporter) {
        reports.attachReporter(reporter.getExtentSparkReporter());
    }

    /**
     * Flushes the ExtentReports instance to write all logs and close the report.
     */
    public void flush() {
        reports.flush();
    }

    /**
     * Creates a new test with the provided name and associates it with a custom Test object.
     *
     * @param name The name of the test.
     * @return A custom Test object representing the newly created test.
     */
    public Test createTest(final String name) {
        final ExtentTest extentTest = reports.createTest(name);
        final Test test = new TestService(extentTest);

        this.test.put(test, extentTest.getModel());

        return test;
    }

    /**
     * Creates a new test with the provided name and description, associating it with a custom Test object.
     *
     * @param name        The name of the test.
     * @param description The description of the test.
     * @return A custom Test object representing the newly created test.
     */
    public Test createTestWithDes(final String name, final String description) {
        final ExtentTest extentTest = reports.createTest(name, description);
        final Test test = new TestService(extentTest);

        this.test.put(test, extentTest.getModel());

        return test;
    }

    /**
     * Removes a custom Test object from the report.
     *
     * @param test The custom Test object to remove.
     */
    public void removeTest(final Test test) {
        final com.aventstack.extentreports.model.Test extentTest = this.test.get(test);

        if (extentTest != null) {
            reports.removeTest(String.valueOf(extentTest));
            this.test.remove(test);
        }
    }

    /**
     * Abstract method to obtain a default reporter instance.
     *
     * @return An instance of ExtentReport.
     */
    protected abstract ExtentReportBuilder getReporter();

    protected abstract ExtentReportBuilder getReporter(final String path);
}


