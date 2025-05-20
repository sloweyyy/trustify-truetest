import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.createPublicProfileMultipleTimes
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

"Step 2: Repeatedly click to create a public profile multiple times"

createPublicProfileMultipleTimes.execute()

"Step 3: Click on button createPublicProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on button createPublicProfile.png')

"Step 4: Click on link signIn -> Navigate to page 'signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on link signIn - Navigate to page signin.png')

"Step 5: Click on button signInWithGoogle -> Navigate to page 'user/create-notarization-profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_signInWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on button signInWithGoogle - Navigate to page usercreate-notarization-profile.png')

"Step 6: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on div object.png')

"Step 7: Select service options and request action with specified amount"

selectServiceAndRequestActions.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on input amount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on input amount.png')

"Step 9: Enter input value in input amount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount'), input_amount)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Enter input value in input amount.png')

"Step 10: Click on input fullName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_fullName'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Click on input fullName.png')

"Step 11: Enter input value in input fullName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_fullName'), input_fullName)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Enter input value in input fullName.png')

"Step 12: Enter input value in input phoneNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber'), input_phoneNumber)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 12-Enter input value in input phoneNumber.png')

"Step 13: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 13-Enter input value in input email.png')

"Step 14: Click on input phoneNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 14-Click on input phoneNumber.png')

"Step 15: Click on input phoneNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 15-Click on input phoneNumber.png')

"Step 16: Click on input phoneNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 16-Click on input phoneNumber.png')

"Step 17: Enter input value in input phoneNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber'), input_phoneNumber_1)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 17-Enter input value in input phoneNumber.png')

"Step 18: Click on input citizenId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_citizenId'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 18-Click on input citizenId.png')

"Step 19: Enter input value in input citizenId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_citizenId'), input_citizenId)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 19-Enter input value in input citizenId.png')

"Step 20: Click on label fileSelection (selectResource)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection', ['label_fileSelection_nth': label_fileSelection_nth]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 20-Click on label fileSelection selectResource.png')

"Step 21: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 21-Click on item selectFromMachine.png')

"Step 22: Click on label fileSelection (selectFile)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection', ['label_fileSelection_nth': label_fileSelection_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 22-Click on label fileSelection selectFile.png')

"Step 23: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 23-Click on item selectFromMachine.png')

"Step 24: Click on label fileSelection (selectFile2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection', ['label_fileSelection_nth': label_fileSelection_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 24-Click on label fileSelection selectFile2.png')

"Step 25: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 25-Click on item selectFromMachine.png')

"Step 26: Click on button requestActions (continue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions', ['button_requestActions_internalHasText': button_requestActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 26-Click on button requestActions continue.png')

"Step 27: Click on button requestActions (retry)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions', ['button_requestActions_internalHasText': button_requestActions_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 27-Click on button requestActions retry.png')

"Step 28: Click on input citizenId2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_citizenId2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 28-Click on input citizenId2.png')

"Step 29: Click on input email2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_email2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 29-Click on input email2.png')

"Step 30: Enter input value in input email2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_email2'), input_email2)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 30-Enter input value in input email2.png')

"Step 31: Click on input citizenId2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_citizenId2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 31-Click on input citizenId2.png')

"Step 32: Click on input citizenId2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_citizenId2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 32-Click on input citizenId2.png')

"Step 33: Enter input value in input citizenId2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_citizenId2'), input_citizenId2)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 33-Enter input value in input citizenId2.png')

"Step 34: Click on input phoneNumber2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 34-Click on input phoneNumber2.png')

"Step 35: Enter input value in input phoneNumber2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber2'), input_phoneNumber2)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 35-Enter input value in input phoneNumber2.png')

"Step 36: Enter input value in input fullName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_fullName2'), input_fullName2)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 36-Enter input value in input fullName2.png')

"Step 37: Click on p citizenIdRequired"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/p_citizenIdRequired'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 37-Click on p citizenIdRequired.png')

"Step 38: Click on input phoneNumber2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 38-Click on input phoneNumber2.png')

"Step 39: Click on input phoneNumber2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 39-Click on input phoneNumber2.png')

"Step 40: Click on input phoneNumber2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 40-Click on input phoneNumber2.png')

"Step 41: Click on input phoneNumber2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 41-Click on input phoneNumber2.png')

"Step 42: Enter input value in input phoneNumber2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber2'), input_phoneNumber2_1)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 42-Enter input value in input phoneNumber2.png')

"Step 43: Click on input fullName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_fullName2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 43-Click on input fullName2.png')

"Step 44: Enter input value in input fullName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_fullName2'), input_fullName2_1)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 44-Enter input value in input fullName2.png')

"Step 45: Click on button requestActions (continue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions', ['button_requestActions_internalHasText': button_requestActions_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 45-Click on button requestActions continue.png')

"Step 46: Click on button requestActions (submitRequest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions', ['button_requestActions_internalHasText': button_requestActions_internalHasText_3]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 46-Click on button requestActions submitRequest.png')

"Step 47: Click on span serviceList -> Navigate to page 'user profile#user/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/span_serviceList'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 47-Click on span serviceList - Navigate to page user profileuser.png')

"Step 48: Click on tr processingDocument"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/tr_profileCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 48-Click on tr processingDocument.png')

"Step 49: Click on p cancelDocument"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/p_cancelDocument'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 49-Click on p cancelDocument.png')

"Step 50: Click on p statusIndicators (processing)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/p_statusIndicators"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/p_statusIndicators', ['p_statusIndicators_divNthChild': p_statusIndicators_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 50-Click on p statusIndicators processing.png')

"Step 51: Click on p statusIndicators (processing)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/p_statusIndicators"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/p_statusIndicators', ['p_statusIndicators_divNthChild': p_statusIndicators_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 51-Click on p statusIndicators processing.png')

"Step 52: Click on span verifying"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/span_verifying'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 52-Click on span verifying.png')

"Step 53: Click on p statusIndicators (readyToSign)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/p_statusIndicators"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/p_statusIndicators', ['p_statusIndicators_divNthChild': p_statusIndicators_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 53-Click on p statusIndicators readyToSign.png')

"Step 54: Click on item congChung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/item_congChung'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 54-Click on item congChung.png')

"Step 55: Click on span serviceInformation (resource) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/span_serviceInformation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/span_serviceInformation', ['span_serviceInformation_liNthChild': span_serviceInformation_liNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 55-Click on span serviceInformation resource - Navigate to page .png')

"Step 56: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Create Public Profile and Request Notarization Action_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}