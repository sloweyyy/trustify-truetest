import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.contactSupportAndViewPricingDetails
import truetest.common.selectDocumentAndPaymentOptions
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

"Step 3: Click on span accountLimit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_accountLimit'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 3-Click on span accountLimit.png')

"Step 4: Click on link trustifyLogo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/link_trustifyLogo'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 4-Click on link trustifyLogo.png')

"Step 5: Click on span price"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_price'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 5-Click on span price.png')

"Step 6: Select document types and payment options multiple times"

selectDocumentAndPaymentOptions.execute()

"Step 7: Click on span troTroTieuChuan -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_troTroTieuChuan'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 7-Click on span troTroTieuChuan - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC32-Contact Support and Verify Home Page Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}