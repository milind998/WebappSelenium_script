package runner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.core.config.Order;
import org.junit.runner.RunWith;

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
				 "src/test/resources/com/features/02mainsettings.feature",
				//"src/test/resources/com/features/03promoCode.feature"
				//"src/test/resources/com/features/04transactions.feature",
				//"src/test/resources/com/features/05SuperAdmin.feature",
				//"src/test/resources/com/features/06SKU.feature"
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
	
}
