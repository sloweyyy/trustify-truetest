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

"Step 3: Enter input value in input password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_notary_dashboard/input_password'), input_password)

WebUI.takeScreenshot(reportLocation + '/TC22/Step 3-Enter input value in input password.png')

"Step 4: Click on span verificationResource -> Navigate to page '/notary/pending-notarization-documents'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_dashboard/span_verificationResource'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 4-Click on span verificationResource - Navigate to page notarypending-notarization-documents.png')

"Step 5: Click on item documentPending -> Navigate to page '/notary/awaiting-signature-documents'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/pending-notarization-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_pending_notarization_documents/item_documentPending'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 5-Click on item documentPending - Navigate to page notaryawaiting-signature-documents.png')

"Step 6: Click on span manageFee -> Navigate to page '/notary/notary-session-management'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/awaiting-signature-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_awaiting_signature_documents/span_manageFee'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 6-Click on span manageFee - Navigate to page notarynotary-session-management.png')

"Step 7: Click on button createNotarySession"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/notary-session-management?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_notary_session_management/button_createNotarySession'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 7-Click on button createNotarySession.png')

"Step 8: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/notary-session-management?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_notary_session_management/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 8-Click on div backdrop.png')

"Step 9: Click on span publicServiceRecord -> Navigate to page '/notary/notarization-history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/notary-session-management?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_notary_session_management/span_publicServiceRecord'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 9-Click on span publicServiceRecord - Navigate to page notarynotarization-history.png')

"Step 10: Click on span dashboard -> Navigate to page '/notary/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/notarization-history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_notarization_history/span_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 10-Click on span dashboard - Navigate to page notarydashboard.png')

"Step 11: Click on span dashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_dashboard/span_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 11-Click on span dashboard.png')

"Step 12: Click on span verificationResource -> Navigate to page '/notary/pending-notarization-documents'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_dashboard/span_verificationResource'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 12-Click on span verificationResource - Navigate to page notarypending-notarization-documents.png')

"Step 13: Click on div documentDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/pending-notarization-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_pending_notarization_documents/div_documentDetails'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 13-Click on div documentDetails.png')

"Step 14: Click on button viewDetails2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/pending-notarization-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_pending_notarization_documents/button_viewDetails2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 14-Click on button viewDetails2.png')

"Step 15: Click on textarea noteContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/pending-notarization-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_pending_notarization_documents/textarea_noteContent'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 15-Click on textarea noteContent.png')

"Step 16: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/pending-notarization-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_pending_notarization_documents/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 16-Click on div backdrop.png')

"Step 17: Click on html documentPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/pending-notarization-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_pending_notarization_documents/html_documentPage'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 17-Click on html documentPage.png')

"Step 18: Click on html documentPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/pending-notarization-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_pending_notarization_documents/html_documentPage'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 18-Click on html documentPage.png')

"Step 19: Click on span dashboard -> Navigate to page '/notary/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/pending-notarization-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_pending_notarization_documents/span_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 19-Click on span dashboard - Navigate to page notarydashboard.png')

"Step 20: Click on div userInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_dashboard/div_userInfo'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 20-Click on div userInfo.png')

"Step 21: Click on html dashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_dashboard/html_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 21-Click on html dashboard.png')

"Step 22: Click on span verificationResource -> Navigate to page '/notary/pending-notarization-documents'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_dashboard/span_verificationResource'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 22-Click on span verificationResource - Navigate to page notarypending-notarization-documents.png')

"Step 23: Click on button viewDetails2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/pending-notarization-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_pending_notarization_documents/button_viewDetails2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 23-Click on button viewDetails2.png')

"Step 24: Click on textarea noteContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/pending-notarization-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_pending_notarization_documents/textarea_noteContent2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 24-Click on textarea noteContent2.png')

"Step 25: Enter input value in textarea noteContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/pending-notarization-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_notary_pending_notarization_documents/textarea_noteContent2'), textarea_noteContent2)

WebUI.takeScreenshot(reportLocation + '/TC22/Step 25-Enter input value in textarea noteContent2.png')

"Step 26: Click on div uploadFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/pending-notarization-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_pending_notarization_documents/div_uploadFile'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 26-Click on div uploadFile.png')

"Step 27: Click on button accept"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/pending-notarization-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_pending_notarization_documents/button_accept'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 27-Click on button accept.png')

"Step 28: Click on html documentPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/pending-notarization-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_pending_notarization_documents/html_documentPage'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 28-Click on html documentPage.png')

"Step 29: Click on span pendingSignature -> Navigate to page '/notary/awaiting-signature-documents'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/pending-notarization-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_pending_notarization_documents/span_pendingSignature'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 29-Click on span pendingSignature - Navigate to page notaryawaiting-signature-documents.png')

"Step 30: Click on html signatureDashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/awaiting-signature-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_awaiting_signature_documents/html_signatureDashboard'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 30-Click on html signatureDashboard.png')

"Step 31: Click on button viewDetails (viewDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/awaiting-signature-documents?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_notary_awaiting_signature_documents/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_notary_awaiting_signature_documents/button_viewDetails', ['button_viewDetails_nth': button_viewDetails_nth]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 31-Click on button viewDetails viewDetails.png')

"Step 32: Click on p documentName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/awaiting-signature-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_awaiting_signature_documents/p_documentName'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 32-Click on p documentName.png')

"Step 33: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/awaiting-signature-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_awaiting_signature_documents/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 33-Click on div backdrop.png')

"Step 34: Click on button viewDetails (viewDetails2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/awaiting-signature-documents?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_notary_awaiting_signature_documents/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_notary_awaiting_signature_documents/button_viewDetails', ['button_viewDetails_nth': button_viewDetails_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 34-Click on button viewDetails viewDetails2.png')

"Step 35: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/awaiting-signature-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_awaiting_signature_documents/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 35-Click on div backdrop.png')

"Step 36: Click on button viewDetails3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/awaiting-signature-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_awaiting_signature_documents/button_viewDetails3'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 36-Click on button viewDetails3.png')

"Step 37: Click on p originalDocument"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/awaiting-signature-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_awaiting_signature_documents/p_originalDocument'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 37-Click on p originalDocument.png')

"Step 38: Click on button accept"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/awaiting-signature-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_awaiting_signature_documents/button_accept'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 38-Click on button accept.png')

"Step 39: Click on html signatureDashboard2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/awaiting-signature-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_awaiting_signature_documents/html_signatureDashboard'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 39-Click on html signatureDashboard2.png')

"Step 40: Click on html signatureDashboard2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/awaiting-signature-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_awaiting_signature_documents/html_signatureDashboard'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 40-Click on html signatureDashboard2.png')

"Step 41: Click on span publicService -> Navigate to page '/notary/notarization-history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/awaiting-signature-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_awaiting_signature_documents/span_publicService'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 41-Click on span publicService - Navigate to page notarynotarization-history.png')

"Step 42: Click on button taskManagement (completeTask)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/notarization-history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_notary_notarization_history/button_taskManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_notary_notarization_history/button_taskManagement', ['button_taskManagement_buttonNthChild': button_taskManagement_buttonNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 42-Click on button taskManagement completeTask.png')

"Step 43: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/notarization-history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_notarization_history/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 43-Click on div object.png')

"Step 44: Click on button taskManagement (viewNotarizationDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/notarization-history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_notary_notarization_history/button_taskManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_notary_notarization_history/button_taskManagement', ['button_taskManagement_buttonNthChild': button_taskManagement_buttonNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 44-Click on button taskManagement viewNotarizationDetails.png')

"Step 45: Click on div object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/notarization-history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_notarization_history/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 45-Click on div object - Navigate to page .png')

"Step 46: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC22-Login and Manage Notarization Documents_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}