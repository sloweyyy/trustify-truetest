import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.viewPriceDetailsMultipleTimes
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to pricing"

TrueTestScripts.navigate("pricing")

"Step 2: Click on header pricingTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/header_pricingTable'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 2-Click on header pricingTable.png')

"Step 3: Click on button registerNow2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/button_registerNow2'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3-Click on button registerNow2.png')

"Step 4: Click on button registerNow3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/button_registerNow2'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on button registerNow3.png')

"Step 5: Click to view price details multiple times"

viewPriceDetailsMultipleTimes.execute()

"Step 6: Click on span pricingFeatures (accountLimit) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures', ['span_pricingFeatures_liNthChild': span_pricingFeatures_liNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on span pricingFeatures accountLimit - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-View Pricing and Register for Services_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}