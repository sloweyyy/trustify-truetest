import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.createMultiplePublicProfiles
import truetest.common.navigateThroughPublicServiceSteps
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

"Step 6: Click on button linkedIn -> Navigate to page '/signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dispute-resolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dispute_resolution/button_linkedIn'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Click on button linkedIn - Navigate to page signin.png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Create Public Profiles and Verify Sign In for Service Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}