import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.selectServiceAndRequestActions
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

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on link signIn - Navigate to page signin.png')

"Step 3: Click on button signInWithGoogle -> Navigate to page 'user/create-notarization-profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_signInWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on button signInWithGoogle - Navigate to page usercreate-notarization-profile.png')

"Step 4: Click on div serviceOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_serviceOptions'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on div serviceOptions.png')

"Step 5: Click on input serviceSelection (selectService)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection', ['input_serviceSelection_inputPlaceholder': input_serviceSelection_inputPlaceholder]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on input serviceSelection selectService.png')

"Step 6: Click on input serviceSelection (selectService)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection', ['input_serviceSelection_inputPlaceholder': input_serviceSelection_inputPlaceholder_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on input serviceSelection selectService.png')

"Step 7: Click on span serviceList -> Navigate to page 'user profile#user/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/span_serviceList'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on span serviceList - Navigate to page user profileuser.png')

"Step 8: Click on tr profileCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/tr_profileCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on tr profileCheckbox.png')

"Step 9: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on div backdrop.png')

"Step 10: Click on span serviceInformation (publicService)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/span_serviceInformation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/span_serviceInformation', ['span_serviceInformation_liNthChild': span_serviceInformation_liNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on span serviceInformation publicService.png')

"Step 11: Click on span resource2 -> Navigate to page 'user/document-wallet'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/span_resource2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 11-Click on span resource2 - Navigate to page userdocument-wallet.png')

"Step 12: Click on button resourceActions (viewResource)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_document_wallet/button_resourceActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_document_wallet/button_resourceActions', ['button_resourceActions_internalText': button_resourceActions_internalText, 'button_resourceActions_nth': button_resourceActions_nth]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12-Click on button resourceActions viewResource.png')

"Step 13: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 13-Click on button close.png')

"Step 14: Click on div documentDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_documentDetails'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 14-Click on div documentDetails.png')

"Step 15: Click on div pdfIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_pdfIcon'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 15-Click on div pdfIcon.png')

"Step 16: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 16-Click on button close.png')

"Step 17: Click on button resourceActions (shareResource)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_document_wallet/button_resourceActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_document_wallet/button_resourceActions', ['button_resourceActions_internalText': button_resourceActions_internalText_1, 'button_resourceActions_nth': button_resourceActions_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 17-Click on button resourceActions shareResource.png')

"Step 18: Click on input emailRecipient"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/input_emailRecipient'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 18-Click on input emailRecipient.png')

"Step 19: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 19-Click on div object.png')

"Step 20: Click on button sidebarToggle -> Navigate to page 'user profile#user/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_sidebarToggle'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 20-Click on button sidebarToggle - Navigate to page user profileuser.png')

"Step 21: Click on div addCircleIcon -> Navigate to page 'user/create-notarization-profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/div_addCircleIcon'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 21-Click on div addCircleIcon - Navigate to page usercreate-notarization-profile.png')

"Step 22: Click on button sidebarToggle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/button_sidebarToggle'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 22-Click on button sidebarToggle.png')

"Step 23: Click on div chonLoaiCongChung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_chonLoaiCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 23-Click on div chonLoaiCongChung.png')

"Step 24: Click on input serviceSelection (chonLinhVucCongChung)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection', ['input_serviceSelection_inputPlaceholder': input_serviceSelection_inputPlaceholder_2]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 24-Click on input serviceSelection chonLinhVucCongChung.png')

"Step 25: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 25-Click on div object.png')

"Step 26: Click on item optionSelection (linhVucCongChungOption)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection', ['item_optionSelection_id': item_optionSelection_id]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 26-Click on item optionSelection linhVucCongChungOption.png')

"Step 27: Select service options and request action with specified amount"

selectServiceAndRequestActions.execute(data_path_0, Integer.valueOf(index_0))

"Step 28: Enter input value in input amount2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount2'), input_amount2)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 28-Enter input value in input amount2.png')

"Step 29: Press key Tab on input amount2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount2'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 29-Press key Tab on input amount2.png')

"Step 30: Enter input value in input fullName3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_fullName3'), input_fullName3)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 30-Enter input value in input fullName3.png')

"Step 31: Press key Tab on input fullName3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_fullName3'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 31-Press key Tab on input fullName3.png')

"Step 32: Click on input phoneNumber3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber3'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 32-Click on input phoneNumber3.png')

"Step 33: Enter input value in input phoneNumber3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber3'), input_phoneNumber3)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 33-Enter input value in input phoneNumber3.png')

"Step 34: Press key Tab on input phoneNumber3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber3'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 34-Press key Tab on input phoneNumber3.png')

"Step 35: Enter input value in input citizenId3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_citizenId3'), input_citizenId3)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 35-Enter input value in input citizenId3.png')

"Step 36: Press key Tab on input citizenId3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_citizenId3'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 36-Press key Tab on input citizenId3.png')

"Step 37: Enter input value in input email3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_email3'), input_email3)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 37-Enter input value in input email3.png')

"Step 38: Press key Tab on input email3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_email3'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 38-Press key Tab on input email3.png')

"Step 39: Click on label selectFile3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/label_selectFile3'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 39-Click on label selectFile3.png')

"Step 40: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 40-Click on item selectFromMachine.png')

"Step 41: Click on p originalDocument"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/p_originalDocument'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 41-Click on p originalDocument.png')

"Step 42: Click on div closeIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_closeIcon'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 42-Click on div closeIcon.png')

"Step 43: Click on label selectFile3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/label_selectFile3'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 43-Click on label selectFile3.png')

"Step 44: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 44-Click on item selectFromMachine.png')

"Step 45: Click on button requestActions (continue3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions', ['button_requestActions_internalHasText': button_requestActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 45-Click on button requestActions continue3.png')

"Step 46: Click on button requestActions (submitRequest2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions', ['button_requestActions_internalHasText': button_requestActions_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 46-Click on button requestActions submitRequest2.png')

"Step 47: Click on span serviceList -> Navigate to page 'user profile#user/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/span_serviceList'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 47-Click on span serviceList - Navigate to page user profileuser.png')

"Step 48: Click on tr checkboxStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/tr_checkboxStatus'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 48-Click on tr checkboxStatus.png')

"Step 49: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 49-Click on div backdrop.png')

"Step 50: Click on input checkbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/input_checkbox'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 50-Click on input checkbox.png')

"Step 51: Click on button action"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/button_action'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 51-Click on button action.png')

"Step 52: Click on button processActions (process)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/button_processActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/button_processActions', ['button_processActions_internalText': button_processActions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 52-Click on button processActions process.png')

"Step 53: Click on button processActions (processing)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/button_processActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/button_processActions', ['button_processActions_internalText': button_processActions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 53-Click on button processActions processing.png')

"Step 54: Click on button processActions (cancelAll)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/button_processActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/button_processActions', ['button_processActions_internalText': button_processActions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 54-Click on button processActions cancelAll.png')

"Step 55: Click on input checkbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/input_checkbox'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 55-Click on input checkbox.png')

"Step 56: Click on button backIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/button_backIcon'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 56-Click on button backIcon.png')

"Step 57: Click on input checkboxHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/input_checkboxHeader'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 57-Click on input checkboxHeader.png')

"Step 58: Click on input checkboxHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/input_checkboxHeader'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 58-Click on input checkboxHeader.png')

"Step 59: Click on div actionList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/div_licensingInfo'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 59-Click on div actionList.png')

"Step 60: Click on span serviceInformation (publicService)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/span_serviceInformation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/span_serviceInformation', ['span_serviceInformation_liNthChild': span_serviceInformation_liNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 60-Click on span serviceInformation publicService.png')

"Step 61: Click on span actionHistory"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/span_actionHistory'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 61-Click on span actionHistory.png')

"Step 62: Click on tr checkboxStatus2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/tr_checkboxStatus'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 62-Click on tr checkboxStatus2.png')

"Step 63: Click on p caseStudyDocument"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/p_caseStudyDocument'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 63-Click on p caseStudyDocument.png')

"Step 64: Click on canvas object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/canvas_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 64-Click on canvas object.png')

"Step 65: Click on canvas object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/canvas_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 65-Click on canvas object.png')

"Step 66: Click on canvas object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/canvas_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 66-Click on canvas object.png')

"Step 67: Click on canvas object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/canvas_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 67-Click on canvas object.png')

"Step 68: Click on canvas object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/canvas_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 68-Click on canvas object.png')

"Step 69: Click on canvas object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/canvas_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 69-Click on canvas object.png')

"Step 70: Click on canvas object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/canvas_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 70-Click on canvas object.png')

"Step 71: Click on div userProfileDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/div_userProfileDetails'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 71-Click on div userProfileDetails.png')

"Step 72: Click on button saveChanges"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/button_saveChanges'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 72-Click on button saveChanges.png')

"Step 73: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 73-Click on div backdrop.png')

"Step 74: Click on div publicServiceLog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/div_licensingInfo'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 74-Click on div publicServiceLog.png')

"Step 75: Click on span serviceInformation (publicService)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/span_serviceInformation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/span_serviceInformation', ['span_serviceInformation_liNthChild': span_serviceInformation_liNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 75-Click on span serviceInformation publicService.png')

"Step 76: Click on span resource2 -> Navigate to page 'user/document-wallet'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/span_resource2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 76-Click on span resource2 - Navigate to page userdocument-wallet.png')

"Step 77: Click on span createPublicProfile -> Navigate to page 'user/create-notarization-profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/span_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 77-Click on span createPublicProfile - Navigate to page usercreate-notarization-profile.png')

"Step 78: Click on div chonLoaiCongChung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_chonLoaiCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 78-Click on div chonLoaiCongChung.png')

"Step 79: Click on span documentFile -> Navigate to page 'user/document-wallet'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/span_documentFile'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 79-Click on span documentFile - Navigate to page userdocument-wallet.png')

"Step 80: Click on div pictureAsPdfIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_pictureAsPdfIcon'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 80-Click on div pictureAsPdfIcon.png')

"Step 81: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 81-Click on button close.png')

"Step 82: Click on button shareDocument"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_shareDocument'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 82-Click on button shareDocument.png')

"Step 83: Click on div shareDocumentModal"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_shareDocumentModal'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 83-Click on div shareDocumentModal.png')

"Step 84: Click on input emailRecipient2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/input_emailRecipient2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 84-Click on input emailRecipient2.png')

"Step 85: Enter input value in input emailRecipient2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_document_wallet/input_emailRecipient2'), input_emailRecipient2)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 85-Enter input value in input emailRecipient2.png')

"Step 86: Click on item emailOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/item_emailOption'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 86-Click on item emailOption.png')

"Step 87: Click on input numberField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/input_numberField'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 87-Click on input numberField.png')

"Step 88: Enter input value in input numberField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_document_wallet/input_numberField'), input_numberField)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 88-Enter input value in input numberField.png')

"Step 89: Click on button share"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_share'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 89-Click on button share.png')

"Step 90: Click on button buyMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_buyMore'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 90-Click on button buyMore.png')

"Step 91: Click on input numberField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/input_numberField2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 91-Click on input numberField2.png')

"Step 92: Enter input value in input numberField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_document_wallet/input_numberField2'), input_numberField2)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 92-Enter input value in input numberField2.png')

"Step 93: Click on button buyMoreResources"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_buyMoreResources'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 93-Click on button buyMoreResources.png')

"Step 94: Click on button viewResources"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_viewResources'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 94-Click on button viewResources.png')

"Step 95: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 95-Click on button close.png')

"Step 96: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 96-Click on button close.png')

"Step 97: Click on div resourceList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_resourceList'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 97-Click on div resourceList.png')

"Step 98: Click on div resourceList2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_resourceList'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 98-Click on div resourceList2 - Navigate to page .png')

"Step 99: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Create Notarization Profile and Manage Resources_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}