import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.createMultiplePublicProfiles
import truetest.common.inputPersonalDetailsAndContact
import truetest.common.inputPhoneAndCitizenIdAndSelectFile
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

"Step 2: Create multiple public profiles through repeated actions"

createMultiplePublicProfiles.execute()

"Step 3: Click on button createPublicProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile2'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 3-Click on button createPublicProfile.png')

"Step 4: Click on link signIn -> Navigate to page '/signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 4-Click on link signIn - Navigate to page signin.png')

"Step 5: Click on button signInWithGoogle -> Navigate to page '/user/create-notarization-profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_signInWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 5-Click on button signInWithGoogle - Navigate to page usercreate-notarization-profile.png')

"Step 6: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 6-Click on div object.png')

"Step 7: Select notary and public services then continue with the process"

selectNotaryAndPublicService.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on input amount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 8-Click on input amount.png')

"Step 9: Input personal details and contact information again"

inputPersonalDetailsAndContact.execute(data_path_1, Integer.valueOf(index_1))

"Step 10: Click on input phoneNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 10-Click on input phoneNumber.png')

"Step 11: Input phone number and citizen ID then select a file from machine"

inputPhoneAndCitizenIdAndSelectFile.execute(data_path_2, Integer.valueOf(index_2))

"Step 12: Click on label fileSelection (selectFile3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection', ['label_fileSelection_nth': label_fileSelection_nth]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 12-Click on label fileSelection selectFile3.png')

"Step 13: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 13-Click on item selectFromMachine.png')

"Step 14: Click on label fileSelection (selectFile2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection', ['label_fileSelection_nth': label_fileSelection_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 14-Click on label fileSelection selectFile2.png')

"Step 15: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 15-Click on item selectFromMachine.png')

"Step 16: Click on button action (continue3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_action"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_action', ['button_action_internalHasText': button_action_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 16-Click on button action continue3.png')

"Step 17: Click on button action (retry)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_action"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_action', ['button_action_internalHasText': button_action_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 17-Click on button action retry.png')

"Step 18: Click on input citizenId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_citizenId'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 18-Click on input citizenId.png')

"Step 19: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 19-Click on input email.png')

"Step 20: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC19/Step 20-Enter input value in input email.png')

"Step 21: Click on input citizenId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_citizenId'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 21-Click on input citizenId.png')

"Step 22: Click on input citizenId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_citizenId'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 22-Click on input citizenId.png')

"Step 23: Enter input value in input citizenId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_citizenId'), input_citizenId)

WebUI.takeScreenshot(reportLocation + '/TC19/Step 23-Enter input value in input citizenId.png')

"Step 24: Click on input phoneNumber2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber2'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 24-Click on input phoneNumber2.png')

"Step 25: Enter input value in input phoneNumber2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber2'), input_phoneNumber2)

WebUI.takeScreenshot(reportLocation + '/TC19/Step 25-Enter input value in input phoneNumber2.png')

"Step 26: Enter input value in input fullName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_fullName'), input_fullName)

WebUI.takeScreenshot(reportLocation + '/TC19/Step 26-Enter input value in input fullName.png')

"Step 27: Click on p citizenIdRequired"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/p_citizenIdRequired'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 27-Click on p citizenIdRequired.png')

"Step 28: Click on input phoneNumber2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber2'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 28-Click on input phoneNumber2.png')

"Step 29: Click on input phoneNumber2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber2'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 29-Click on input phoneNumber2.png')

"Step 30: Click on input phoneNumber2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber2'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 30-Click on input phoneNumber2.png')

"Step 31: Click on input phoneNumber2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber2'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 31-Click on input phoneNumber2.png')

"Step 32: Enter input value in input phoneNumber2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber2'), input_phoneNumber2_1)

WebUI.takeScreenshot(reportLocation + '/TC19/Step 32-Enter input value in input phoneNumber2.png')

"Step 33: Click on input fullName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_fullName'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 33-Click on input fullName.png')

"Step 34: Enter input value in input fullName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_fullName'), input_fullName_1)

WebUI.takeScreenshot(reportLocation + '/TC19/Step 34-Enter input value in input fullName.png')

"Step 35: Click on button action (continue3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_action"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_action', ['button_action_internalHasText': button_action_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 35-Click on button action continue3.png')

"Step 36: Click on button submitRequest2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/button_submitRequest2'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 36-Click on button submitRequest2.png')

"Step 37: Click on span serviceList -> Navigate to page '/user/history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/span_serviceList'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 37-Click on span serviceList - Navigate to page userhistory.png')

"Step 38: Click on tr processingDocument"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/tr_processingDocument'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 38-Click on tr processingDocument.png')

"Step 39: Click on p cancelDocument"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/p_cancelDocument'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 39-Click on p cancelDocument.png')

"Step 40: Click on p statusInformation (processingStatus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_history/p_statusInformation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_history/p_statusInformation', ['p_statusInformation_divNthChild': p_statusInformation_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 40-Click on p statusInformation processingStatus.png')

"Step 41: Click on p statusInformation (processingStatus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_history/p_statusInformation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_history/p_statusInformation', ['p_statusInformation_divNthChild': p_statusInformation_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 41-Click on p statusInformation processingStatus.png')

"Step 42: Click on span verificationStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/span_verificationStep'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 42-Click on span verificationStep.png')

"Step 43: Click on p statusInformation (readyToSign)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_history/p_statusInformation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_history/p_statusInformation', ['p_statusInformation_divNthChild': p_statusInformation_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 43-Click on p statusInformation readyToSign.png')

"Step 44: Click on item publicationVersion -> Navigate to page '/user/notarization-session'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_history/item_publicationVersion'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 44-Click on item publicationVersion - Navigate to page usernotarization-session.png')

"Step 45: Click on span documentItem -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/notarization-session?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_notarization_session/span_documentItem'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 45-Click on span documentItem - Navigate to page .png')

"Step 46: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC19-Create Notarization Profile and Verify Home Page Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}