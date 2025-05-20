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

"Step 2: Click on link signIn -> Navigate to page 'signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link signIn - Navigate to page signin.png')

"Step 3: Click on button signInWithGoogle -> Navigate to page 'user/create-notarization-profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_signInWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on button signInWithGoogle - Navigate to page usercreate-notarization-profile.png')

"Step 4: Click on div serviceOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_serviceOptions'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on div serviceOptions.png')

"Step 5: Click on input serviceSelection (selectService)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection', ['input_serviceSelection_inputPlaceholder': input_serviceSelection_inputPlaceholder]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on input serviceSelection selectService.png')

"Step 6: Click on input serviceSelection (selectService)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection', ['input_serviceSelection_inputPlaceholder': input_serviceSelection_inputPlaceholder_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on input serviceSelection selectService.png')

"Step 7: Click on span serviceList -> Navigate to page 'user profile#user/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/span_serviceList'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on span serviceList - Navigate to page user profileuser.png')

"Step 8: Click on tr profileCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/tr_processingDocument'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on tr profileCheckbox.png')

"Step 9: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on div backdrop.png')

"Step 10: Click on span serviceInfo (publicService)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/span_serviceInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/span_serviceInfo', ['span_serviceInfo_liNthChild': span_serviceInfo_liNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on span serviceInfo publicService.png')

"Step 11: Click on span resource -> Navigate to page 'user/document-wallet'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/span_resource'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on span resource - Navigate to page userdocument-wallet.png')

"Step 12: Click on button resourceActions (viewResource)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_document_wallet/button_resourceActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_document_wallet/button_resourceActions', ['button_resourceActions_internalText': button_resourceActions_internalText, 'button_resourceActions_nth': button_resourceActions_nth]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on button resourceActions viewResource.png')

"Step 13: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on button close.png')

"Step 14: Click on div documentDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_documentDetails'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on div documentDetails.png')

"Step 15: Click on div pdfIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_pdfIcon'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on div pdfIcon.png')

"Step 16: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on button close.png')

"Step 17: Click on button resourceActions (shareResource)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_document_wallet/button_resourceActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_document_wallet/button_resourceActions', ['button_resourceActions_internalText': button_resourceActions_internalText_1, 'button_resourceActions_nth': button_resourceActions_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on button resourceActions shareResource.png')

"Step 18: Click on input emailRecipient"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/input_emailRecipient'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on input emailRecipient.png')

"Step 19: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on div object.png')

"Step 20: Click on button sidebarToggle -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_sidebarToggle'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on button sidebarToggle - Navigate to page .png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate and Interact with User Profile and Document Wallet_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}