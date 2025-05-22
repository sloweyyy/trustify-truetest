import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.createPublicProfileMultipleTimes
import truetest.common.navigateAgreementAndPublicService
import truetest.common.navigateTermsAndRequestDemo
import truetest.common.signUpWithGoogleMultipleAttempts
import truetest.common.viewPublicNoticeAndPolicies
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

"Step 2: Repeatedly click to create a public profile multiple times"

createPublicProfileMultipleTimes.execute()

"Step 3: Proceed through agreement steps and learn about public service."

navigateAgreementAndPublicService.execute()

"Step 4: Access public notice and security/privacy policies."

viewPublicNoticeAndPolicies.execute()

"Step 5: Access terms of service and request a demo or download files."

navigateTermsAndRequestDemo.execute()

"Step 6: Click on button linkedIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dispute-resolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dispute_resolution/button_linkedIn'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 6-Click on button linkedIn.png')

"Step 7: Click on link signIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dispute-resolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dispute_resolution/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 7-Click on link signIn.png')

"Step 8: Attempt multiple sign ups using Google account."

signUpWithGoogleMultipleAttempts.execute()

"Step 9: Click on button signUpWithGoogle2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 9-Click on button signUpWithGoogle2.png')

"Step 10: Click on link signIn -> Navigate to page 'signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 10-Click on link signIn - Navigate to page signin.png')

"Step 11: Click on button signInWithGoogle -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_signInWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 11-Click on button signInWithGoogle - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC17-Create Public Profile and Multiple Sign Up Attempts_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}