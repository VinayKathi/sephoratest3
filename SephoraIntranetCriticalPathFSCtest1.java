package com.sephora.test.intranet.home;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.google.common.base.Verify;
import com.sephora.core.annotations.QMetryTestID;
import com.sephora.core.intranet.constants.TestConstants;
import com.sephora.core.utils.Config;
import com.sephora.core.utils.ExtentManager;
import com.sephora.pages.SephoraBasePage;
import com.sephora.pages.intranet.FSCHomePage;
import com.sephora.pages.intranet.StoreHomePage;
import com.sephora.pages.intranet.WorkareaPage;
import com.sephora.test.intranet.SephoraIntranetBaseTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod123;




public class SephoraIntranetCriticalPathFSCtest extends SephoraIntranetBaseTest {
	private static final Logger logger = LogManager.getLogger(SephoraIntranetCriticalPathFSCtest.class.getName());
	private FSCHomePage fscHomePage;
	private WorkareaPage workAreaPage;


	@BeforeClass(alwaysRun=true)
		public void classSetUp(){
			workAreaPage = new WorkareaPage(driver);
			fscHomePage = new FSCHomePage(driver);
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethodSetUp(Method m)throws Exception {
		System.out.println("Before Method");
		driver.loadApplication();
		extent=ExtentManager.getInstance();
		Test t;
		t=m.getAnnotation(Test.class);
		System.out.println(null==extent);
		test= extent.startTest(m.getName(),t.description());
		s_Assert= new SoftAssert(driver,test);
		String environmentDetails = environment();
	    s_Assert.assertTrue(true, "EXECUTION ENVIRONMENT DETAILS: " + environmentDetails);
		workAreaPage.loginToWorkarea(driver);
		workAreaPage.navigateToFSC(driver);
	}
	
	
	@Test(testName = "VerifyCriticalPathFSCTest", dataProvider = "intranetTestData", description = "Verify Critical Path FSC Test")
	@QMetryTestID(id = { "C107110" })
			public void criticalPathFSCTest(String test){
				try{
					
					logger.info("\n\n****** Test Case: C107162, C107163/Internal/External directories link ******\n");
					s_Assert.assertTrue(fscHomePage.verifyInternalExternalDirectorieslinks(), "Validated C107163-\'Internal/External directories link\'");
					logger.info("Validated \'Internal/External directories link\'");
					
					logger.info("\n\n****** Test Case: C107165, C107166/Internal/External Help link ******\n");
					s_Assert.assertTrue(fscHomePage.verifyInternalExternalHelplinks(), "Validated C107165-\'Internal/External Help link\'");
					logger.info("Validated \'Internal/External Help link\'");
					
					logger.info("\n\n****** Test Case: C107226/Calvin widget ******\n");
					s_Assert.assertTrue(fscHomePage.verifyCalvinBlogWidget_CriticalPath(), "Validated C107226-\'Calvin widget\'");
					logger.info("Validated \'Calvin widget\'");
					
					logger.info("\n\n****** Test Case: C107227/Campaign widget ******\n");
					s_Assert.assertTrue(fscHomePage.verifyCampaignRotatingWidget_CriticalPath(), "Validated C107227-\'Campaign widget\'");
					logger.info("Validated \'Campaign widget\'"); 
					
					logger.info("\n\n****** Test Case: C107228/Campaign Roatating widget ******\n");
					s_Assert.assertTrue(fscHomePage.verifyCampaignWidget(), "Validated C107228-\'Campaign Roatating widget\'");
					logger.info("Validated \'Campaign Roatating widget\'");
					
					logger.info("\n\n****** Test Case: C107230/Upcoming events widget ******\n");
					s_Assert.assertTrue(fscHomePage.verifyUpcomingEventsWidget_CriticalPath(), "Validated C107230-\'Upcoming events widget\'");
					logger.info("Validated \'Upcoming events widget\'");
					
					logger.info("\n\n****** Test Case: C107235/Quicklinks widget ******\n");
					s_Assert.assertTrue(fscHomePage.verifyQuicklinksWidget_CriticalPath(), "Validated C107235-\'Quicklinks widget\'");
					logger.info("Validated \'Quicklinks widget\'");
					
					logger.info("\n\n****** Test Case: C107237/Promo widget ******\n");
					s_Assert.assertTrue(fscHomePage.verifyPromoWidgets_CriticalPath(), "Validated C107237-\'Promo widget\'");
					logger.info("Validated \'Promo widget\'");
					
					logger.info("\n\n****** Test Case: C107241/Announcements widget_Truncate summary ******\n");
					s_Assert.assertTrue(fscHomePage.verifyAnnouncementsWidgetViewAllLink(), "Validated \'C107241-Announcements Widget View All Link\'");
					logger.info("Validated \'Announcements Widget View All Link\'");
					
					logger.info("\n\n****** Test Case: C107244/Tabbed News Feed widget ******\n");
					s_Assert.assertTrue(fscHomePage.verifyTabbedNewsFeedWidget(), "Validated \'C107244-Tabbed News Feed widget\'");
					logger.info("Validated \'Tabbed News Feed widget\'");
					
					logger.info("\n\n****** Test Case: C107292/Footer links and Icons ******\n");
					s_Assert.assertTrue(fscHomePage.verifyFooterCriticalPath(), "Validated \'C107292/Footer links and Icons\'");
					logger.info("Validated \'C107292/Footer links and Icons\'");
					
					logger.info("\n\n****** Test Case: C107296/FSC Site Search Result page content ******\n");
					s_Assert.assertTrue(fscHomePage.verifyFSCSiteSearchResultTypeSection(), "Validated \'C107296/FSC Site Search Result page content\'");
					logger.info("Validated \'C107296/FSC Site Search Result page content\'");
					
					logger.info("\n\n****** Test Case: C107300/FSC People Search ******\n");
					s_Assert.assertTrue(fscHomePage.verifyEmptySearch(), "Validated \'C107300/FSC People Search\'");
					logger.info("Validated \'C107300/FSC People Search\'");
					
					logger.info("\n\n****** Test Case: C107301/FSC People Search Sections ******\n");
					s_Assert.assertTrue(fscHomePage.verifyFSCPeopleSearchSections(), "Validated \'C107301/FSC People Search Sections\'");
					logger.info("Validated \'C107301/FSC People Search Sections\'");
					
					logger.info("\n\n****** Test Case: C107303/FSC People Search_Paging ******\n");
					s_Assert.assertTrue(fscHomePage.verifyFSCPeopleSearchPaging(), "Validated \'C107303/FSC People Search_Paging\'");
					logger.info("Validated \'C107303/FSC People Search_Paging\'");
					
					logger.info("\n\n****** Test Case: C107304/FSC People Search_Keyword fields ******\n");
					s_Assert.assertTrue(fscHomePage.verifyFSCPeopleSearchKeywordFields(), "Validated \'C107304/FSC People Search_Keyword fields\'");
					logger.info("Validated \'C107304/FSC People Search_Keyword fields\'");
					
					logger.info("\n\n****** Test Case: C107305/FSC People Search Filter ******\n");
					s_Assert.assertTrue(fscHomePage.verifyFSCPeopleSearchFilter(), "Validated \'C107305/FSC People Search Filter\'");
					logger.info("Validated \'C107305/FSC People Search Filter\'");
					
					logger.info("\n\n****** Test Case: C107307/FSC People Search_Sorting ******\n");
					s_Assert.assertTrue(fscHomePage.verifyFSCPeopleSearchSorting(), "Validated \'C107307/FSC People Search_Sorting\'");
					logger.info("Validated \'C107307/FSC People Search_Sorting\'");
					
					logger.info("\n\n****** Test Case: C107309/FSC People Search Clickable fields ******\n");
					s_Assert.assertTrue(fscHomePage.verifyFSCPeopleSearchClickableFields(), "Validated \'C107309/FSC People Search Clickable fields\'");
					logger.info("Validated \'C107309/FSC People Search Clickable fields\'");
					
					logger.info("\n\n****** Test Case: C107318/FSC Events Calendar Event details ******\n");
					s_Assert.assertTrue(fscHomePage.verifyFSCEventsCalendarEventDetails(), "Validated \'C107318/FSC Events Calendar Event details\'");
					logger.info("Validated \'C107318/FSC Events Calendar Event details\'");
					
				}
				catch(Exception e){
					logger.info("Some unexpected exception occurred :: "+ e.getMessage().toString().substring(0, 40));
				}
			}
	
	@AfterMethod(alwaysRun = true)
	public void afterMethodCleanUp(Method m,ITestResult result) {
	quit();
	extent.endTest(test);
	}

}