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

"Step 2: Click on button createPublicProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on button createPublicProfile.png')

"Step 3: Click on button createPublicProfile2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on button createPublicProfile2.png')

"Step 4: Click on button createPublicProfile2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on button createPublicProfile2.png')

"Step 5: Click on button createPublicProfile2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on button createPublicProfile2.png')

"Step 6: Click on button createPublicProfile2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button createPublicProfile2.png')

"Step 7: Click on button createPublicProfile2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on button createPublicProfile2.png')

"Step 8: Click on button createPublicProfile2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on button createPublicProfile2.png')

"Step 9: Click on button createPublicProfile2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on button createPublicProfile2.png')

"Step 10: Click on button createPublicProfile2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on button createPublicProfile2.png')

"Step 11: Click on button createPublicProfile2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on button createPublicProfile2.png')

"Step 12: Click on button createPublicProfile2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on button createPublicProfile2.png')

"Step 13: Click on button createPublicProfile2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on button createPublicProfile2.png')

"Step 14: Click on button createPublicProfile2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on button createPublicProfile2.png')

"Step 15: Click on button createPublicProfile2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Click on button createPublicProfile2.png')

"Step 16: Click on button createPublicProfile2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Click on button createPublicProfile2.png')

"Step 17: Click on button createPublicProfile2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Click on button createPublicProfile2.png')

"Step 18: Click on button createPublicProfile2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Click on button createPublicProfile2.png')

"Step 19: Click on button createPublicProfile2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Click on button createPublicProfile2.png')

"Step 20: Click on button createPublicProfile2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 20-Click on button createPublicProfile2.png')

"Step 21: Click on link signIn -> Navigate to page 'signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 21-Click on link signIn - Navigate to page signin.png')

"Step 22: Click on button signInWithGoogle -> Navigate to page 'user/create-notarization-profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_signInWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 22-Click on button signInWithGoogle - Navigate to page usercreate-notarization-profile.png')

"Step 23: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 23-Click on div object.png')

"Step 24: Click on input serviceSelection (selectService)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection', ['input_serviceSelection_inputPlaceholder': input_serviceSelection_inputPlaceholder]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 24-Click on input serviceSelection selectService.png')

"Step 25: Click on item serviceOptions (selectPublicService)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_serviceOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_serviceOptions', ['item_serviceOptions_id': item_serviceOptions_id]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 25-Click on item serviceOptions selectPublicService.png')

"Step 26: Click on input serviceSelection (selectService2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection', ['input_serviceSelection_inputPlaceholder': input_serviceSelection_inputPlaceholder_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 26-Click on input serviceSelection selectService2.png')

"Step 27: Click on item serviceOptions (selectOption)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_serviceOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_serviceOptions', ['item_serviceOptions_id': item_serviceOptions_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 27-Click on item serviceOptions selectOption.png')

"Step 28: Click on button formActions (continue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_formActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_formActions', ['button_formActions_internalHasText': button_formActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 28-Click on button formActions continue.png')

"Step 29: Click on input amount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 29-Click on input amount.png')

"Step 30: Click on input amount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 30-Click on input amount.png')

"Step 31: Click on input amount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 31-Click on input amount.png')

"Step 32: Enter input value in input amount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount'), input_amount)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 32-Enter input value in input amount.png')

"Step 33: Click on input userDetails (fullName)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 33-Click on input userDetails fullName.png')

"Step 34: Enter input value in input userDetails (fullName)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_1]), input_userDetails)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 34-Enter input value in input userDetails fullName.png')

"Step 35: Enter input value in input userDetails (phoneNumber)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_2]), input_userDetails_1)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 35-Enter input value in input userDetails phoneNumber.png')

"Step 36: Enter input value in input userDetails (email)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_3]), input_userDetails_2)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 36-Enter input value in input userDetails email.png')

"Step 37: Click on input userDetails (phoneNumber)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_4]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 37-Click on input userDetails phoneNumber.png')

"Step 38: Click on input userDetails (phoneNumber)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_5]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 38-Click on input userDetails phoneNumber.png')

"Step 39: Click on input userDetails (phoneNumber)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_6]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 39-Click on input userDetails phoneNumber.png')

"Step 40: Enter input value in input userDetails (phoneNumber)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_7]), input_userDetails_3)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 40-Enter input value in input userDetails phoneNumber.png')

"Step 41: Click on input userDetails (citizenId)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_8]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 41-Click on input userDetails citizenId.png')

"Step 42: Enter input value in input userDetails (citizenId)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_9]), input_userDetails_4)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 42-Enter input value in input userDetails citizenId.png')

"Step 43: Click on label resourceSelection (selectResource)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_resourceSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_resourceSelection', ['label_resourceSelection_nth': label_resourceSelection_nth]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 43-Click on label resourceSelection selectResource.png')

"Step 44: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 44-Click on item selectFromMachine.png')

"Step 45: Click on label selectFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/label_selectFile'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 45-Click on label selectFile.png')

"Step 46: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 46-Click on item selectFromMachine.png')

"Step 47: Click on label resourceSelection (selectFile2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_resourceSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_resourceSelection', ['label_resourceSelection_nth': label_resourceSelection_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 47-Click on label resourceSelection selectFile2.png')

"Step 48: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 48-Click on item selectFromMachine.png')

"Step 49: Click on button formActions (continue2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_formActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_formActions', ['button_formActions_internalHasText': button_formActions_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 49-Click on button formActions continue2.png')

"Step 50: Click on button formActions (retry)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_formActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_formActions', ['button_formActions_internalHasText': button_formActions_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 50-Click on button formActions retry.png')

"Step 51: Click on input userDetails (citizenId2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_10]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 51-Click on input userDetails citizenId2.png')

"Step 52: Click on input userDetails (email2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_11]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 52-Click on input userDetails email2.png')

"Step 53: Enter input value in input userDetails (email2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_12]), input_userDetails_5)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 53-Enter input value in input userDetails email2.png')

"Step 54: Click on input userDetails (citizenId2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_13]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 54-Click on input userDetails citizenId2.png')

"Step 55: Click on input userDetails (citizenId2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_14]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 55-Click on input userDetails citizenId2.png')

"Step 56: Enter input value in input userDetails (citizenId2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_15]), input_userDetails_6)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 56-Enter input value in input userDetails citizenId2.png')

"Step 57: Click on input userDetails (phoneNumber2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_16]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 57-Click on input userDetails phoneNumber2.png')

"Step 58: Enter input value in input userDetails (phoneNumber2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_17]), input_userDetails_7)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 58-Enter input value in input userDetails phoneNumber2.png')

"Step 59: Enter input value in input userDetails (fullName2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_18]), input_userDetails_8)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 59-Enter input value in input userDetails fullName2.png')

"Step 60: Click on p citizenIdRequired"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/p_citizenIdRequired'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 60-Click on p citizenIdRequired.png')

"Step 61: Click on input userDetails (phoneNumber2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_19]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 61-Click on input userDetails phoneNumber2.png')

"Step 62: Click on input userDetails (phoneNumber2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_20]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 62-Click on input userDetails phoneNumber2.png')

"Step 63: Click on input userDetails (phoneNumber2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_21]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 63-Click on input userDetails phoneNumber2.png')

"Step 64: Click on input userDetails (phoneNumber2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_22]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 64-Click on input userDetails phoneNumber2.png')

"Step 65: Enter input value in input userDetails (phoneNumber2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_23]), input_userDetails_9)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 65-Enter input value in input userDetails phoneNumber2.png')

"Step 66: Click on input userDetails (fullName2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_24]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 66-Click on input userDetails fullName2.png')

"Step 67: Enter input value in input userDetails (fullName2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_userDetails', ['input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_25]), input_userDetails_10)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 67-Enter input value in input userDetails fullName2.png')

"Step 68: Click on button formActions (continue2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_formActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_formActions', ['button_formActions_internalHasText': button_formActions_internalHasText_3]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 68-Click on button formActions continue2.png')

"Step 69: Click on button formActions (submitRequest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_formActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_formActions', ['button_formActions_internalHasText': button_formActions_internalHasText_4]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 69-Click on button formActions submitRequest.png')

"Step 70: Click on span serviceList -> Navigate to page 'user profile#user/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/span_serviceList'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 70-Click on span serviceList - Navigate to page user profileuser.png')

"Step 71: Click on tr processingDocument"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/tr_processingDocument'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 71-Click on tr processingDocument.png')

"Step 72: Click on p cancelDocument"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/p_cancelDocument'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 72-Click on p cancelDocument.png')

"Step 73: Click on p statusMessages (processing)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/p_statusMessages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/p_statusMessages', ['p_statusMessages_divNthChild': p_statusMessages_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 73-Click on p statusMessages processing.png')

"Step 74: Click on p statusMessages (processing)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/p_statusMessages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/p_statusMessages', ['p_statusMessages_divNthChild': p_statusMessages_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 74-Click on p statusMessages processing.png')

"Step 75: Click on span verifying"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/span_verifying'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 75-Click on span verifying.png')

"Step 76: Click on p statusMessages (readyToSign)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/p_statusMessages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/p_statusMessages', ['p_statusMessages_divNthChild': p_statusMessages_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 76-Click on p statusMessages readyToSign.png')

"Step 77: Click on item congChung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/item_congChung'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 77-Click on item congChung.png')

"Step 78: Click on span serviceInfo (resource2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/span_serviceInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/span_serviceInfo', ['span_serviceInfo_liNthChild': span_serviceInfo_liNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 78-Click on span serviceInfo resource2 - Navigate to page .png')

"Step 79: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Create Public Profile and Submit User Details for Verification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}