package UtilityDrive;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReport {

	public static ExtentReports getExtentReport() {

		String extentReportPath = System.getProperty("user.dir") + "\\reports\\extentreport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(extentReportPath);
		reporter.config().setReportName("IRCTC Results");
		reporter.config().setDocumentTitle("IRCTC Test Results");

		ExtentReports extentReport = new ExtentReports();
		extentReport.attachReporter(reporter);

		return extentReport;
	}

}
