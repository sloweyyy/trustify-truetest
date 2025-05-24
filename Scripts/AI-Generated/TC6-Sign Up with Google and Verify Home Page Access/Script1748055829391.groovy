import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.signUpWithGoogleMultipleTimes
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

"Step 2: Click on link signUp"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/link_signUp'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Click on link signUp.png')

"Step 3: Sign up with Google multiple times using the sign-up form"

signUpWithGoogleMultipleTimes.execute()

"Step 4: Click on button signUpWithGoogle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on button signUpWithGoogle.png')

"Step 5: Click on link signInAlternative -> Navigate to page '/signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/link_signInAlternative'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on link signInAlternative - Navigate to page signin.png')

"Step 6: Click on button signInWithGoogle -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_signInWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on button signInWithGoogle - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Sign Up with Google and Verify Home Page Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}