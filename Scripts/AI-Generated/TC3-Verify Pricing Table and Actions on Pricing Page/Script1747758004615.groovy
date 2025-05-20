import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on header pricingTable.png')

"Step 3: Click on button pricingActions (registerNow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/button_pricingActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/button_pricingActions', ['button_pricingActions_internalText': button_pricingActions_internalText, 'button_pricingActions_nth': button_pricingActions_nth]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on button pricingActions registerNow.png')

"Step 4: Click on button pricingActions (contactSupport)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/button_pricingActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/button_pricingActions', ['button_pricingActions_internalText': button_pricingActions_internalText_1, 'button_pricingActions_nth': button_pricingActions_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on button pricingActions contactSupport.png')

"Step 5: Click on header priceDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/header_priceDetails'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on header priceDetails.png')

"Step 6: Click on header priceDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/header_priceDetails'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on header priceDetails.png')

"Step 7: Click on header priceDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/header_priceDetails'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on header priceDetails.png')

"Step 8: Click on header priceDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/header_priceDetails'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on header priceDetails.png')

"Step 9: Click on header priceDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/header_priceDetails'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on header priceDetails.png')

"Step 10: Click on header priceDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/header_priceDetails'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on header priceDetails.png')

"Step 11: Click on header priceDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/header_priceDetails'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on header priceDetails.png')

"Step 12: Click on div pricingTable -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/div_pricingTable'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on div pricingTable - Navigate to page .png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Pricing Table and Actions on Pricing Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}