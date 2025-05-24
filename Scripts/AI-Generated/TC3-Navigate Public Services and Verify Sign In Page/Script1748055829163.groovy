import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.navigateThroughPublicServiceSteps
import truetest.common.viewTermsAndRequestDemo
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Navigate through steps related to public services"

navigateThroughPublicServiceSteps.execute()

"Step 3: Click on span publicNotice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_publicNotice'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on span publicNotice.png')

"Step 4: Click on span canPublicServiceSignMultiplePeople"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_canPublicServiceSignMultiplePeople'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on span canPublicServiceSignMultiplePeople.png')

"Step 5: Click on span price"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_price'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on span price.png')

"Step 6: Click on span policy -> Navigate to page '/privacy-policy'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_policy'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on span policy - Navigate to page privacy-policy.png')

"Step 7: Click on span privacyPolicy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/privacy-policy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_privacy_policy/span_privacyPolicy'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on span privacyPolicy.png')

"Step 8: Click on span privacyPolicy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/privacy-policy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_privacy_policy/span_privacyPolicy'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on span privacyPolicy.png')

"Step 9: View terms of use and request a demo or download files"

viewTermsAndRequestDemo.execute()

"Step 10: Click on button linkedIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dispute-resolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dispute_resolution/button_linkedIn'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on button linkedIn.png')

"Step 11: Click on link signIn -> Navigate to page '/signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dispute-resolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dispute_resolution/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on link signIn - Navigate to page signin.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Navigate Public Services and Verify Sign In Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}