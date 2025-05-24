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

"Step 1: Navigate to /signin"

TrueTestScripts.navigate("/signin")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Click on span paymentSecurity -> Navigate to page '/payment-security'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/span_paymentSecurity'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on span paymentSecurity - Navigate to page payment-security.png')

"Step 4: Click on item securityProcessing"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/payment-security?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_payment_security/item_securityProcessing'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on item securityProcessing.png')

"Step 5: Click on span usageGuide -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/payment-security?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_payment_security/span_usageGuide'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on span usageGuide - Navigate to page .png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Login and Verify Payment Security Page Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}