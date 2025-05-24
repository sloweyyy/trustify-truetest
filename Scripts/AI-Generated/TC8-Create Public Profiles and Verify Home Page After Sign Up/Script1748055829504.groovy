import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.createMultiplePublicProfiles
import truetest.common.navigateThroughPublicServiceSteps
import truetest.common.signUpWithGoogleMultipleTimes
import truetest.common.viewPublicServiceInfoAndPolicies
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

"Step 2: Create multiple public profiles through repeated actions"

createMultiplePublicProfiles.execute()

"Step 3: Navigate through steps related to public services"

navigateThroughPublicServiceSteps.execute()

"Step 4: View public service information and security and privacy policies"

viewPublicServiceInfoAndPolicies.execute()

"Step 5: View terms of use and request a demo or download files"

viewTermsAndRequestDemo.execute()

"Step 6: Click on button linkedIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dispute-resolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dispute_resolution/button_linkedIn'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on button linkedIn.png')

"Step 7: Sign up with Google multiple times using the sign-up form"

signUpWithGoogleMultipleTimes.execute()

"Step 8: Click on button signUpWithGoogle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on button signUpWithGoogle.png')

"Step 9: Click on link signInAlternative -> Navigate to page '/signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/link_signInAlternative'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on link signInAlternative - Navigate to page signin.png')

"Step 10: Click on button signInWithGoogle -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_signInWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on button signInWithGoogle - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Create Public Profiles and Verify Home Page After Sign Up_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}