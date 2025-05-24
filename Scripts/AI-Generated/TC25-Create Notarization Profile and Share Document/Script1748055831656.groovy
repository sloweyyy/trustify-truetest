import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.selectNotaryAndPublicService
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

"Step 2: Click on link signIn -> Navigate to page '/signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 2-Click on link signIn - Navigate to page signin.png')

"Step 3: Click on button signInWithGoogle -> Navigate to page '/user/create-notarization-profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_signInWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 3-Click on button signInWithGoogle - Navigate to page usercreate-notarization-profile.png')

"Step 4: Click on div serviceOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_serviceOptions'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 4-Click on div serviceOptions.png')

"Step 5: Click on input selectService"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_selectService'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 5-Click on input selectService.png')

"Step 6: Click on input selectService"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_selectService'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 6-Click on input selectService.png')

"Step 7: Click on span serviceList -> Navigate to page '/user/history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/span_serviceList'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 7-Click on span serviceList - Navigate to page userhistory.png')

"Step 8: Click on tr object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/tr_processingDocument'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 8-Click on tr object.png')

"Step 9: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 9-Click on div backdrop.png')

"Step 10: Click on span publicServiceVersion -> Navigate to page '/user/notarization-session'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/span_publicServiceVersion'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 10-Click on span publicServiceVersion - Navigate to page usernotarization-session.png')

"Step 11: Click on span documentItem -> Navigate to page '/user/document-wallet'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/notarization-session?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_notarization_session/span_documentItem'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 11-Click on span documentItem - Navigate to page userdocument-wallet.png')

"Step 12: Click on button resourceManagement (viewResource)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_document_wallet/button_resourceManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_document_wallet/button_resourceManagement', ['button_resourceManagement_internalText': button_resourceManagement_internalText, 'button_resourceManagement_nth': button_resourceManagement_nth]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 12-Click on button resourceManagement viewResource.png')

"Step 13: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 13-Click on button close.png')

"Step 14: Click on div documentDetails2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_documentName'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 14-Click on div documentDetails2.png')

"Step 15: Click on div pdfIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_pdfIcon'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 15-Click on div pdfIcon.png')

"Step 16: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 16-Click on button close.png')

"Step 17: Click on button resourceManagement (shareResource)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_document_wallet/button_resourceManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_document_wallet/button_resourceManagement', ['button_resourceManagement_internalText': button_resourceManagement_internalText_1, 'button_resourceManagement_nth': button_resourceManagement_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 17-Click on button resourceManagement shareResource.png')

"Step 18: Click on input emailRecipient"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/input_emailRecipient'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 18-Click on input emailRecipient.png')

"Step 19: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 19-Click on div object.png')

"Step 20: Click on button sidebarToggle -> Navigate to page '/user/notarization-session'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_sidebarToggle'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 20-Click on button sidebarToggle - Navigate to page usernotarization-session.png')

"Step 21: Click on div addCircleIcon -> Navigate to page '/user/create-notarization-profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/notarization-session?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_notarization_session/div_addCircleIcon'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 21-Click on div addCircleIcon - Navigate to page usercreate-notarization-profile.png')

"Step 22: Click on button sidebarToggle2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/button_sidebarToggle2'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 22-Click on button sidebarToggle2.png')

"Step 23: Click on div chonLoaiCongChung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_chonLoaiCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 23-Click on div chonLoaiCongChung.png')

"Step 24: Click on input chonLinhVucCongChung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_chonLinhVucCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 24-Click on input chonLinhVucCongChung.png')

"Step 25: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 25-Click on div object.png')

"Step 26: Click on item optionSelection (linhVucCongChungOption)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection', ['item_optionSelection_id': item_optionSelection_id]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 26-Click on item optionSelection linhVucCongChungOption.png')

"Step 27: Select notary and public services then continue with the process"

selectNotaryAndPublicService.execute(data_path_0, Integer.valueOf(index_0))

"Step 28: Click on input amount2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount2'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 28-Click on input amount2.png')

"Step 29: Enter input value in input amount2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount2'), input_amount2)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 29-Enter input value in input amount2.png')

"Step 30: Press key Tab on input amount2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount2'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 30-Press key Tab on input amount2.png')

"Step 31: Enter input value in input fullName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_fullName2'), input_fullName2)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 31-Enter input value in input fullName2.png')

"Step 32: Press key Tab on input fullName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_fullName2'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 32-Press key Tab on input fullName2.png')

"Step 33: Click on input phoneNumber3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber3'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 33-Click on input phoneNumber3.png')

"Step 34: Enter input value in input phoneNumber3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber3'), input_phoneNumber3)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 34-Enter input value in input phoneNumber3.png')

"Step 35: Press key Tab on input phoneNumber3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber3'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 35-Press key Tab on input phoneNumber3.png')

"Step 36: Enter input value in input citizenId2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_citizenId2'), input_citizenId2)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 36-Enter input value in input citizenId2.png')

"Step 37: Press key Tab on input citizenId2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_citizenId2'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 37-Press key Tab on input citizenId2.png')

"Step 38: Enter input value in input email2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_email2'), input_email2)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 38-Enter input value in input email2.png')

"Step 39: Press key Tab on input email2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_email2'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 39-Press key Tab on input email2.png')

"Step 40: Click on label selectFile4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/label_selectFile4'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 40-Click on label selectFile4.png')

"Step 41: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 41-Click on item selectFromMachine.png')

"Step 42: Click on p originalDocument"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/p_originalDocument'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 42-Click on p originalDocument.png')

"Step 43: Click on div closeIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_closeIcon'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 43-Click on div closeIcon.png')

"Step 44: Click on label selectFile4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/label_selectFile4'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 44-Click on label selectFile4.png')

"Step 45: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 45-Click on item selectFromMachine.png')

"Step 46: Click on button continue2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/button_continue2'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 46-Click on button continue2.png')

"Step 47: Click on button action (submitRequest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_action"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_action', ['button_action_internalHasText': button_action_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 47-Click on button action submitRequest.png')

"Step 48: Click on span serviceList -> Navigate to page '/user/history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/span_serviceList'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 48-Click on span serviceList - Navigate to page userhistory.png')

"Step 49: Click on tr userRequests (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_history/tr_userRequests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_history/tr_userRequests', ['tr_userRequests_nth': tr_userRequests_nth]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 49-Click on tr userRequests object2.png')

"Step 50: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 50-Click on div backdrop.png')

"Step 51: Click on input checkbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/input_checkbox'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 51-Click on input checkbox.png')

"Step 52: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 52-Click on button object.png')

"Step 53: Click on button historyActions (process)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_history/button_historyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_history/button_historyActions', ['button_historyActions_internalText': button_historyActions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 53-Click on button historyActions process.png')

"Step 54: Click on button historyActions (processing)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_history/button_historyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_history/button_historyActions', ['button_historyActions_internalText': button_historyActions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 54-Click on button historyActions processing.png')

"Step 55: Click on button historyActions (all)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_history/button_historyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_history/button_historyActions', ['button_historyActions_internalText': button_historyActions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 55-Click on button historyActions all.png')

"Step 56: Click on input checkbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/input_checkbox'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 56-Click on input checkbox.png')

"Step 57: Click on button arrowBack"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/button_arrowBack'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 57-Click on button arrowBack.png')

"Step 58: Click on input checkbox2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/input_checkbox2'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 58-Click on input checkbox2.png')

"Step 59: Click on input checkbox2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/input_checkbox2'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 59-Click on input checkbox2.png')

"Step 60: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 60-Click on div object.png')

"Step 61: Click on span publicServiceVersion -> Navigate to page '/user/notarization-session'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/span_publicServiceVersion'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 61-Click on span publicServiceVersion - Navigate to page usernotarization-session.png')

"Step 62: Click on span lichSu -> Navigate to page '/user/history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/notarization-session?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_notarization_session/span_lichSu'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 62-Click on span lichSu - Navigate to page userhistory.png')

"Step 63: Click on tr userRequests (tinhTrang)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_history/tr_userRequests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_history/tr_userRequests', ['tr_userRequests_nth': tr_userRequests_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 63-Click on tr userRequests tinhTrang.png')

"Step 64: Click on p caseStudyFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/p_caseStudyFile'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 64-Click on p caseStudyFile.png')

"Step 65: Click on canvas object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/canvas_object'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 65-Click on canvas object.png')

"Step 66: Click on canvas object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/canvas_object'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 66-Click on canvas object.png')

"Step 67: Click on canvas object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/canvas_object'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 67-Click on canvas object.png')

"Step 68: Click on canvas object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/canvas_object'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 68-Click on canvas object.png')

"Step 69: Click on canvas object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/canvas_object'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 69-Click on canvas object.png')

"Step 70: Click on canvas object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/canvas_object'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 70-Click on canvas object.png')

"Step 71: Click on canvas object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/canvas_object'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 71-Click on canvas object.png')

"Step 72: Click on div detailHoso"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/div_detailHoso'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 72-Click on div detailHoso.png')

"Step 73: Click on button luuThayDoi"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/button_luuThayDoi'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 73-Click on button luuThayDoi.png')

"Step 74: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 74-Click on div backdrop.png')

"Step 75: Click on div lichSuCongChung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 75-Click on div lichSuCongChung.png')

"Step 76: Click on span publicServiceVersion -> Navigate to page '/user/notarization-session'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/span_publicServiceVersion'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 76-Click on span publicServiceVersion - Navigate to page usernotarization-session.png')

"Step 77: Click on span documentItem -> Navigate to page '/user/document-wallet'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/notarization-session?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_notarization_session/span_documentItem'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 77-Click on span documentItem - Navigate to page userdocument-wallet.png')

"Step 78: Click on span createPublicProfile -> Navigate to page '/user/create-notarization-profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/span_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 78-Click on span createPublicProfile - Navigate to page usercreate-notarization-profile.png')

"Step 79: Click on div chonLoaiCongChung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_chonLoaiCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 79-Click on div chonLoaiCongChung.png')

"Step 80: Click on span documentFile -> Navigate to page '/user/document-wallet'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/span_documentFile'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 80-Click on span documentFile - Navigate to page userdocument-wallet.png')

"Step 81: Click on div pictureAsPdfIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_pictureAsPdfIcon'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 81-Click on div pictureAsPdfIcon.png')

"Step 82: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 82-Click on button close.png')

"Step 83: Click on button shareDocument"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_shareDocument'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 83-Click on button shareDocument.png')

"Step 84: Click on div shareDocumentModal"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_shareDocumentModal'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 84-Click on div shareDocumentModal.png')

"Step 85: Click on input emailRecipient2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/input_emailRecipient2'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 85-Click on input emailRecipient2.png')

"Step 86: Enter input value in input emailRecipient2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_document_wallet/input_emailRecipient2'), input_emailRecipient2)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 86-Enter input value in input emailRecipient2.png')

"Step 87: Click on item emailOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/item_emailOption'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 87-Click on item emailOption.png')

"Step 88: Click on input numberField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/input_numberField'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 88-Click on input numberField.png')

"Step 89: Enter input value in input numberField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_document_wallet/input_numberField'), input_numberField)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 89-Enter input value in input numberField.png')

"Step 90: Click on button share"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_share'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 90-Click on button share.png')

"Step 91: Click on button buyMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_buyMore'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 91-Click on button buyMore.png')

"Step 92: Click on input numberField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/input_numberField2'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 92-Click on input numberField2.png')

"Step 93: Enter input value in input numberField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_document_wallet/input_numberField2'), input_numberField2)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 93-Enter input value in input numberField2.png')

"Step 94: Click on button buyMoreResources"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_buyMoreResources'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 94-Click on button buyMoreResources.png')

"Step 95: Click on button viewResources"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_viewResources'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 95-Click on button viewResources.png')

"Step 96: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 96-Click on button close.png')

"Step 97: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 97-Click on button close.png')

"Step 98: Click on div resourceList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_resourceList'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 98-Click on div resourceList.png')

"Step 99: Click on div resourceList2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_resourceList'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 99-Click on div resourceList2 - Navigate to page .png')

"Step 100: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC25-Create Notarization Profile and Share Document_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}