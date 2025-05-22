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

"Step 1: Navigate to user/create-notarization-profile"

TrueTestScripts.navigate("user/create-notarization-profile")

"Step 2: Click on span serviceList -> Navigate to page 'user profile#user/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/span_serviceList'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 2-Click on span serviceList - Navigate to page user profileuser.png')

"Step 3: Click on tr requestDetails (nguoiYeuCauDangXuLy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/tr_requestDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/tr_requestDetails', ['tr_requestDetails_nth': tr_requestDetails_nth]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 3-Click on tr requestDetails nguoiYeuCauDangXuLy.png')

"Step 4: Click on tr requestDetails (nguoiYeuCauHoanTat)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/tr_requestDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/tr_requestDetails', ['tr_requestDetails_nth': tr_requestDetails_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 4-Click on tr requestDetails nguoiYeuCauHoanTat.png')

"Step 5: Click on tr requestDetails (nguoiYeuCauDangXuLy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/tr_requestDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/tr_requestDetails', ['tr_requestDetails_nth': tr_requestDetails_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 5-Click on tr requestDetails nguoiYeuCauDangXuLy.png')

"Step 6: Click on item financialResource -> Navigate to page 'user/document-wallet'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/item_financialResource'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 6-Click on item financialResource - Navigate to page userdocument-wallet.png')

"Step 7: Click on button sidebarToggle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_sidebarToggle'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 7-Click on button sidebarToggle.png')

"Step 8: Click on button sidebarToggle2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_sidebarToggle2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 8-Click on button sidebarToggle2.png')

"Step 9: Click on header trustify"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/header_trustify'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 9-Click on header trustify.png')

"Step 10: Click on header trustify"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/header_trustify'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 10-Click on header trustify.png')

"Step 11: Click on header trustify"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/header_trustify'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 11-Click on header trustify.png')

"Step 12: Click on button sidebarToggle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_sidebarToggle'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 12-Click on button sidebarToggle.png')

"Step 13: Click on item object -> Navigate to page 'profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 13-Click on item object - Navigate to page profile.png')

"Step 14: Click on item object -> Navigate to page 'user/document-wallet'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 14-Click on item object - Navigate to page userdocument-wallet.png')

"Step 15: Click on div object -> Navigate to page 'user profile#user/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 15-Click on div object - Navigate to page user profileuser.png')

"Step 16: Click on button sidebarToggle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/button_sidebarToggle'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 16-Click on button sidebarToggle.png')

"Step 17: Click on span actionHistory"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/span_actionHistory'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 17-Click on span actionHistory.png')

"Step 18: Click on span resource2 -> Navigate to page 'user/document-wallet'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/span_resource2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 18-Click on span resource2 - Navigate to page userdocument-wallet.png')

"Step 19: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 19-Click on div object2.png')

"Step 20: Click on p soLuong"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/p_soLuong'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 20-Click on p soLuong.png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC22-View User Document Wallet and Verify Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}