import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.contactSupportAndViewPricingDetails
import truetest.common.explorePricingAndFeatures
import truetest.common.navigatePricingAndOptions
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

"Step 2: Interact with support and review pricing details."

contactSupportAndViewPricingDetails.execute()

"Step 3: Click on list features"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/list_features'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 3-Click on list features.png')

"Step 4: Explore pricing options and features for various services."

navigatePricingAndOptions.execute()

"Step 5: View pricing features and explore advanced tools."

explorePricingAndFeatures.execute()

"Step 6: Click on button registerNow (registerNow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/button_registerNow"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/button_registerNow', ['button_registerNow_nth': button_registerNow_nth]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 6-Click on button registerNow registerNow.png')

"Step 7: Click on span danhChoVpcc -> Navigate to page 'for-notary-offices'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_danhChoVpcc'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 7-Click on span danhChoVpcc - Navigate to page for-notary-offices.png')

"Step 8: Click on link lookupNotaryOffices -> Navigate to page 'lookup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/link_lookupNotaryOffices'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 8-Click on link lookupNotaryOffices - Navigate to page lookup.png')

"Step 9: Click on span paymentSecurity -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/lookup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_lookup/span_paymentSecurity'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 9-Click on span paymentSecurity - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Explore Pricing Details and Features for Services_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}