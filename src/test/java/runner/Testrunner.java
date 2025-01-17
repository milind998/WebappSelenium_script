package runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.core.config.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@Order(value = 0)
@CucumberOptions(
		monochrome = false,
		dryRun = false,
		features={"src/test/resources/com/features/01homePage.feature",
				// ** "src/test/resources/com/features/02SuperAdmin.feature",
				// "src/test/resources/com/features/03SKU.feature",
				// ** "src/test/resources/com/features/04usersPage.feature",
				// ** "src/test/resources/com/features/05transactions.feature",
				// ** "src/test/resources/com/features/06reportsPage.feature",
				 "src/test/resources/com/features/07mainsettings.feature",
				// ** "src/test/resources/com/features/08promoCode.feature",
				// ** "src/test/resources/com/features/09influencerPage.feature"
				},
		
		glue={"stepDefination"},
		//plugin = "html:target/cucumber"
		plugin= {"pretty","html:target/cucumber.html",
				//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		 "html:target/cucumber.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" ,
       		         "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
       		        // "tech.grasshopper.pdf.extentreport.ExtentPdfCucumberReporter:output/ExtentPdfReport.pdf",
       		        }
		
		 )


public class Testrunner {
	private static ExtentReports extent;
	
	
	
	 
    public static ExtentReports getInstance() {
        if (extent == null) {
            createInstance();
        }
        return extent;
    }

    public static ExtentReports createInstance() {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("src/test/resources/extent.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String baseFolder = properties.getProperty("basefolder.name");
        
        String sparkReportPath = properties.getProperty("extent.reporter.spark.out");

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(sparkReportPath);
        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setDocumentTitle("Extent Reports");
        sparkReporter.config().setReportName("Automation Test Results");

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        
     // Initialize PDF Reporter
//        String pdfReportPath = properties.getProperty("extent.reporter.pdf.out");
//        if (pdfReportPath != null) {
//            ExtentPdfReporter pdfReporter = new ExtentPdfReporter(pdfReportPath);
//            extent.attachReporter(pdfReporter);
//        }

     // Initialize HTML Reporter
        String htmlReportPath = properties.getProperty("extent.reporter.html.out");
        if (htmlReportPath != null) {
            ExtentSparkReporter htmlReporter = new ExtentSparkReporter(htmlReportPath);
            htmlReporter.config().setTheme(com.aventstack.extentreports.reporter.configuration.Theme.STANDARD);
            extent.attachReporter(htmlReporter);
        }

        extent.setSystemInfo("OS", properties.getProperty("systeminfo.os"));
        extent.setSystemInfo("Version", properties.getProperty("systeminfo.version"));

        return extent;
    }
	
    @BeforeSuite
    public void setupSuite() {
        String extentReportsFolder = System.getProperty("user.dir") + "/ExtentReports"; // Adjust folder path as needed
        clearExtentReportsFolder(extentReportsFolder);
    }
 
    @Test
    public void runTests() {
        // Code to trigger the Cucumber tests
        System.out.println("Running test suite...");
    }
 
    @AfterSuite
    public void teardownSuite() {
        System.out.println("Test execution completed!");
    }
 
    private void clearExtentReportsFolder(String folderPath) {
        File folder = new File(folderPath);
 
        if (folder.exists() && folder.isDirectory()) {
            for (File file : folder.listFiles()) {
                deleteRecursively(file);
            }
            System.out.println("Extent Reports folder cleared: " + folderPath);
        } else {
            System.out.println("Folder does not exist or is not a directory: " + folderPath);
        }
    }
 
    private void deleteRecursively(File file) {
        if (file.isDirectory()) {
            for (File subFile : file.listFiles()) {
                deleteRecursively(subFile);
            }
        }
        file.delete();
    }
    
}
