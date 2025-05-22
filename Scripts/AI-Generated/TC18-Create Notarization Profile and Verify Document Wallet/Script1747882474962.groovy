import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillUserInformationForm
import truetest.common.inputCitizenIdAndSelectFile
import truetest.common.selectNotarizationServices
import truetest.common.selectNotaryAndPublicServices
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

"Step 2: Click on span userName -> Navigate to page 'profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/span_userName'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 2-Click on span userName - Navigate to page profile.png')

"Step 3: Click on span createProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/span_createProfile'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 3-Click on span createProfile.png')

"Step 4: Choose notarization services from available options."

selectNotarizationServices.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Click on button requestActions (requestActions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions', ['button_requestActions_internalHasText': button_requestActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 5-Click on button requestActions requestActions.png')

"Step 6: Click on button sidebarToggle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/button_sidebarToggle_1'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 6-Click on button sidebarToggle.png')

"Step 7: Click on item userProfileOption -> Navigate to page 'profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_userProfileOption'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 7-Click on item userProfileOption - Navigate to page profile.png')

"Step 8: Click on button sidebarToggle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/button_sidebarToggle'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 8-Click on button sidebarToggle.png')

"Step 9: Click on span createProfile -> Navigate to page 'user/create-notarization-profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/span_createProfile'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 9-Click on span createProfile - Navigate to page usercreate-notarization-profile.png')

"Step 10: Click on input selectNotaryService"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_selectNotaryService'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 10-Click on input selectNotaryService.png')

"Step 11: Click on item notarizationOptions (notaryServiceOption)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_notarizationOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_notarizationOptions', ['item_notarizationOptions_id': item_notarizationOptions_id]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 11-Click on item notarizationOptions notaryServiceOption.png')

"Step 12: Click on input selectPublicService"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_selectPublicService'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 12-Click on input selectPublicService.png')

"Step 13: Click on item notarizationOptions (publicServiceOption)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_notarizationOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_notarizationOptions', ['item_notarizationOptions_id': item_notarizationOptions_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 13-Click on item notarizationOptions publicServiceOption.png')

"Step 14: Click on input selectPublicService"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_selectPublicService'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 14-Click on input selectPublicService.png')

"Step 15: Select notary and public services and continue."

selectNotaryAndPublicServices.execute(data_path_1, Integer.valueOf(index_1))

"Step 16: Input personal details and contact information."

fillUserInformationForm.execute(data_path_2, Integer.valueOf(index_2))

"Step 17: Enter citizen ID and select a file for upload."

inputCitizenIdAndSelectFile.execute(data_path_3, Integer.valueOf(index_3))

"Step 18: Click on label fileSelection (fileSelection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection', ['label_fileSelection_nth': label_fileSelection_nth]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 18-Click on label fileSelection fileSelection.png')

"Step 19: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 19-Click on item selectFromMachine.png')

"Step 20: Click on label fileSelection (fileSelection2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection', ['label_fileSelection_nth': label_fileSelection_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 20-Click on label fileSelection fileSelection2.png')

"Step 21: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 21-Click on item selectFromMachine.png')

"Step 22: Click on label fileSelection (fileSelection3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection', ['label_fileSelection_nth': label_fileSelection_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 22-Click on label fileSelection fileSelection3.png')

"Step 23: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 23-Click on item selectFromMachine.png')

"Step 24: Click on button continue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/button_continue'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 24-Click on button continue.png')

"Step 25: Click on button requestActions (requestActions2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions', ['button_requestActions_internalHasText': button_requestActions_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 25-Click on button requestActions requestActions2.png')

"Step 26: Click on list notarizationProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/list_notarizationProfile'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 26-Click on list notarizationProfile.png')

"Step 27: Click on span serviceList -> Navigate to page 'user profile#user/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/span_serviceList'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 27-Click on span serviceList - Navigate to page user profileuser.png')

"Step 28: Click on tr requestDetails (requester)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/tr_requestDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/tr_requestDetails', ['tr_requestDetails_nth': tr_requestDetails_nth]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 28-Click on tr requestDetails requester.png')

"Step 29: Click on div note"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/div_note'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 29-Click on div note.png')

"Step 30: Click on div note"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/div_note'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 30-Click on div note.png')

"Step 31: Click on div documentFiles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/div_documentFiles'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 31-Click on div documentFiles.png')

"Step 32: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 32-Click on div backdrop.png')

"Step 33: Click on tr requestDetails (publicationDate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/tr_requestDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/tr_requestDetails', ['tr_requestDetails_nth': tr_requestDetails_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 33-Click on tr requestDetails publicationDate.png')

"Step 34: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 34-Click on div backdrop.png')

"Step 35: Click on tr requestDetails (publicationDate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/tr_requestDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/tr_requestDetails', ['tr_requestDetails_nth': tr_requestDetails_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 35-Click on tr requestDetails publicationDate.png')

"Step 36: Click on span resource2 -> Navigate to page 'user/document-wallet'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/span_resource2'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 36-Click on span resource2 - Navigate to page userdocument-wallet.png')

"Step 37: Click on div documentDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_documentDetails_1'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 37-Click on div documentDetails.png')

"Step 38: Click on div documentDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_documentDetails_1'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 38-Click on div documentDetails.png')

"Step 39: Click on div documentName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_documentDetails'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 39-Click on div documentName.png')

"Step 40: Click on div pdfIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_pdfIcon'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 40-Click on div pdfIcon.png')

"Step 41: Click on button close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 41-Click on button close - Navigate to page .png')

"Step 42: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC18-Create Notarization Profile and Verify Document Wallet_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}