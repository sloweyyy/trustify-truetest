import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.inputAmountAndPersonalDetails
import truetest.common.inputCitizenIdAndEmailAndSelectFile
import truetest.common.selectMultipleServices
import truetest.common.selectNotaryAndPublicService
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /user/create-notarization-profile"

TrueTestScripts.navigate("/user/create-notarization-profile")

"Step 2: Click on span userName -> Navigate to page '/profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/span_userName'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 2-Click on span userName - Navigate to page profile.png')

"Step 3: Click on span createProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/span_createProfile'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 3-Click on span createProfile.png')

"Step 4: Select multiple services from the options provided"

selectMultipleServices.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Click on button action (continue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_action"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_action', ['button_action_internalHasText': button_action_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 5-Click on button action continue.png')

"Step 6: Click on button sidebarToggle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/button_sidebarToggle'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 6-Click on button sidebarToggle.png')

"Step 7: Click on item userProfileOption -> Navigate to page '/profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_userProfileOption'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 7-Click on item userProfileOption - Navigate to page profile.png')

"Step 8: Click on button sidebarToggle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/button_sidebarToggle'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 8-Click on button sidebarToggle.png')

"Step 9: Click on span createProfile -> Navigate to page '/user/create-notarization-profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/span_createProfile'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 9-Click on span createProfile - Navigate to page usercreate-notarization-profile.png')

"Step 10: Click on input selectNotaryService"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_selectNotaryService'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 10-Click on input selectNotaryService.png')

"Step 11: Click on item optionSelection (notaryServiceOption)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection', ['item_optionSelection_id': item_optionSelection_id]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 11-Click on item optionSelection notaryServiceOption.png')

"Step 12: Click on input selectPublicService"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_selectPublicService'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 12-Click on input selectPublicService.png')

"Step 13: Click on item optionSelection (publicServiceOption)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection', ['item_optionSelection_id': item_optionSelection_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 13-Click on item optionSelection publicServiceOption.png')

"Step 14: Click on input selectPublicService"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_selectPublicService'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 14-Click on input selectPublicService.png')

"Step 15: Select notary and public services then continue with the process"

selectNotaryAndPublicService.execute(data_path_1, Integer.valueOf(index_1))

"Step 16: Input amount and personal details including name and contact information"

inputAmountAndPersonalDetails.execute(data_path_2, Integer.valueOf(index_2))

"Step 17: Input citizen ID and email then select a file from machine"

inputCitizenIdAndEmailAndSelectFile.execute(data_path_3, Integer.valueOf(index_3))

"Step 18: Click on label fileSelection (selectFile)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection', ['label_fileSelection_nth': label_fileSelection_nth]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 18-Click on label fileSelection selectFile.png')

"Step 19: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 19-Click on item selectFromMachine.png')

"Step 20: Click on label fileSelection (selectFile2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection', ['label_fileSelection_nth': label_fileSelection_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 20-Click on label fileSelection selectFile2.png')

"Step 21: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 21-Click on item selectFromMachine.png')

"Step 22: Click on label fileSelection (selectResource)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection', ['label_fileSelection_nth': label_fileSelection_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 22-Click on label fileSelection selectResource.png')

"Step 23: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 23-Click on item selectFromMachine.png')

"Step 24: Click on button continue2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/button_continue2'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 24-Click on button continue2.png')

"Step 25: Click on button action (submitRequest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_action"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_action', ['button_action_internalHasText': button_action_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 25-Click on button action submitRequest.png')

"Step 26: Click on list notarizationProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/list_notarizationProfile'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 26-Click on list notarizationProfile.png')

"Step 27: Click on span serviceList -> Navigate to page '/user/history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/span_serviceList'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 27-Click on span serviceList - Navigate to page userhistory.png')

"Step 28: Click on tr userRequests (userRequest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_history/tr_userRequests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_history/tr_userRequests', ['tr_userRequests_nth': tr_userRequests_nth]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 28-Click on tr userRequests userRequest.png')

"Step 29: Click on div userHistoryNote"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/div_userHistoryNote'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 29-Click on div userHistoryNote.png')

"Step 30: Click on div userHistoryNote"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/div_userHistoryNote'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 30-Click on div userHistoryNote.png')

"Step 31: Click on div userHistoryFiles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/div_userHistoryFiles'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 31-Click on div userHistoryFiles.png')

"Step 32: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 32-Click on div backdrop.png')

"Step 33: Click on tr userRequests (publicationDate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_history/tr_userRequests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_history/tr_userRequests', ['tr_userRequests_nth': tr_userRequests_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 33-Click on tr userRequests publicationDate.png')

"Step 34: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 34-Click on div backdrop.png')

"Step 35: Click on tr userRequests (publicationDate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_history/tr_userRequests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_history/tr_userRequests', ['tr_userRequests_nth': tr_userRequests_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 35-Click on tr userRequests publicationDate.png')

"Step 36: Click on span documentTitle -> Navigate to page '/user/document-wallet'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/span_documentTitle'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 36-Click on span documentTitle - Navigate to page userdocument-wallet.png')

"Step 37: Click on div documentDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_documentDetails'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 37-Click on div documentDetails.png')

"Step 38: Click on div documentDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_documentDetails'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 38-Click on div documentDetails.png')

"Step 39: Click on div documentName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/div_documentName'))

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

WebUI.takeFullPageScreenshotAsCheckpoint('TC18-Create Notarization Profile and Verify Home Page Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}