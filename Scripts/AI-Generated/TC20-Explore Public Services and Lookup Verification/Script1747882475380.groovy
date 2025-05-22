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

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_next_1'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 2-Click on button next.png')

"Step 3: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_next_1'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 3-Click on button next.png')

"Step 4: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_next_1'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 4-Click on button next.png')

"Step 5: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_next_1'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 5-Click on button next.png')

"Step 6: Click on button expandMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_expandMore'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 6-Click on button expandMore.png')

"Step 7: Click on item publicServiceLegalValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/item_publicServiceLegalValue'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 7-Click on item publicServiceLegalValue.png')

"Step 8: Click on item congChucTrucTuyen"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/item_congChucTrucTuyen'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 8-Click on item congChucTrucTuyen.png')

"Step 9: Click on link signIn -> Navigate to page 'signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 9-Click on link signIn - Navigate to page signin.png')

"Step 10: Click on link trustify -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/link_trustify'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 10-Click on link trustify - Navigate to page .png')

"Step 11: Click on link traCuuHoSoCongChuc"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_traCuuHoSoCongChuc'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 11-Click on link traCuuHoSoCongChuc.png')

"Step 12: Click on link traCuuHoSoCongChuc -> Navigate to page 'lookup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_traCuuHoSoCongChuc'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 12-Click on link traCuuHoSoCongChuc - Navigate to page lookup.png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC20-Explore Public Services and Lookup Verification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}