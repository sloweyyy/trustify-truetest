import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.navigateThroughSteps
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

"Step 2: Navigate through multiple steps in the process"

navigateThroughSteps.execute()

"Step 3: Click on span publicNotice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_publicNotice'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3-Click on span publicNotice.png')

"Step 4: Click on span publicService"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_publicService'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on span publicService.png')

"Step 5: Click on link login -> Navigate to page '/signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_login'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on link login - Navigate to page signin.png')

"Step 6: Click on link trustifyLogo -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/link_trustifyLogo'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on link trustifyLogo - Navigate to page .png')

"Step 7: Click on link traCuuHoSoCongChuc -> Navigate to page '/lookup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_traCuuHoSoCongChuc'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7-Click on link traCuuHoSoCongChuc - Navigate to page lookup.png')

"Step 8: Click on link lookupPublicRecord"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/lookup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_lookup/link_lookupPublicRecord'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on link lookupPublicRecord.png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Navigate to Lookup Page and Verify Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}