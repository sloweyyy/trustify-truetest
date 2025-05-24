import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.contactSupportAndViewPricingDetails
import truetest.common.selectDocumentAndPaymentOptions
import truetest.common.viewComprehensiveReports
import truetest.common.viewToolsAndComprehensiveReports
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /pricing"

TrueTestScripts.navigate("/pricing")

"Step 2: Contact support and view pricing details multiple times"

contactSupportAndViewPricingDetails.execute()

"Step 3: Click on span baoCaoToanDien"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_baoCaoToanDien'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 3-Click on span baoCaoToanDien.png')

"Step 4: Click on link trustifyLogo -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/link_trustifyLogo'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 4-Click on link trustifyLogo - Navigate to page .png')

"Step 5: Click on span price"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_price'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 5-Click on span price.png')

"Step 6: Select document types and payment options multiple times"

selectDocumentAndPaymentOptions.execute()

"Step 7: View comprehensive reports and additional options multiple times"

viewComprehensiveReports.execute()

"Step 8: View tools and comprehensive reports multiple times"

viewToolsAndComprehensiveReports.execute()

"Step 9: Click on button register (registerNow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/button_register"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/button_register', ['button_register_nth': button_register_nth]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 9-Click on button register registerNow.png')

"Step 10: Click on span danhChoVpcc -> Navigate to page '/for-notary-offices'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_danhChoVpcc'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 10-Click on span danhChoVpcc - Navigate to page for-notary-offices.png')

"Step 11: Click on link traCuuHoSoCongChung -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/link_traCuuHoSoCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 11-Click on link traCuuHoSoCongChung - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC34-Contact Support and Verify Home Page Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}