import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.createPublicProfileMultipleTimes
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

"Step 3: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3-Click on button next.png')

"Step 4: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on button next.png')

"Step 5: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on button next.png')

"Step 6: Click on header agreementBuySell"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/header_agreementBuySell'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on header agreementBuySell.png')

"Step 7: Click on span whatIsPublicService"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_whatIsPublicService'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on span whatIsPublicService.png')

"Step 8: Click on item publicServiceLegalValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/item_publicServiceLegalValue'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on item publicServiceLegalValue.png')

"Step 9: Click on span canPublicServiceSignMultiplePeople"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_canPublicServiceSignMultiplePeople'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on span canPublicServiceSignMultiplePeople.png')

"Step 10: Click on span price -> Navigate to page 'pricing'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_price'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on span price - Navigate to page pricing.png')

"Step 11: Click on item securityPolicy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/item_securityPolicy'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 11-Click on item securityPolicy.png')

"Step 12: Click on item securityPolicy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/item_securityPolicy'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 12-Click on item securityPolicy.png')

"Step 13: Click on span securityPolicy -> Navigate to page 'privacy-policy'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_securityPolicy'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 13-Click on span securityPolicy - Navigate to page privacy-policy.png')

"Step 14: Click on span termsOfUse -> Navigate to page '/terms-of-service'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/privacy-policy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_privacy_policy/span_termsOfUse'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 14-Click on span termsOfUse - Navigate to page terms-of-service.png')

"Step 15: Click on span forVpcc -> Navigate to page 'for-notary-offices'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/span_forVpcc'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 15-Click on span forVpcc - Navigate to page for-notary-offices.png')

"Step 16: Click on button fileActions (requestDemo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_for_notary_offices/button_fileActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_for_notary_offices/button_fileActions', ['button_fileActions_internalText': button_fileActions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 16-Click on button fileActions requestDemo.png')

"Step 17: Click on button fileActions (downloadFile)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_for_notary_offices/button_fileActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_for_notary_offices/button_fileActions', ['button_fileActions_internalText': button_fileActions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 17-Click on button fileActions downloadFile.png')

"Step 18: Click on button fileActions (downloadFile2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_for_notary_offices/button_fileActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_for_notary_offices/button_fileActions', ['button_fileActions_internalText': button_fileActions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 18-Click on button fileActions downloadFile2.png')

"Step 19: Click on button fileActions (requestDemo2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_for_notary_offices/button_fileActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_for_notary_offices/button_fileActions', ['button_fileActions_internalText': button_fileActions_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 19-Click on button fileActions requestDemo2.png')

"Step 20: Click on span explanation -> Navigate to page 'dispute-resolution'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/span_explanation'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 20-Click on span explanation - Navigate to page dispute-resolution.png')

"Step 21: Click on button linkedIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dispute-resolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dispute_resolution/button_linkedIn'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 21-Click on button linkedIn.png')

"Step 22: Click on link signIn -> Navigate to page 'signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dispute-resolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dispute_resolution/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 22-Click on link signIn - Navigate to page signin.png')

"Step 23: Click on link signUp -> Navigate to page 'signup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/link_signUp'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 23-Click on link signUp - Navigate to page signup.png')

"Step 24: Click on button signUpWithGoogle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 24-Click on button signUpWithGoogle.png')

"Step 25: Click on button signUpWithGoogle2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 25-Click on button signUpWithGoogle2.png')

"Step 26: Click on button signUpWithGoogle2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 26-Click on button signUpWithGoogle2.png')

"Step 27: Click on button signUpWithGoogle2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 27-Click on button signUpWithGoogle2.png')

"Step 28: Click on button signUpWithGoogle2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 28-Click on button signUpWithGoogle2.png')

"Step 29: Click on button signUpWithGoogle2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 29-Click on button signUpWithGoogle2.png')

"Step 30: Click on button signUpWithGoogle2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 30-Click on button signUpWithGoogle2.png')

"Step 31: Click on button signUpWithGoogle2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 31-Click on button signUpWithGoogle2.png')

"Step 32: Click on button signUpWithGoogle2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 32-Click on button signUpWithGoogle2.png')

"Step 33: Click on button signUpWithGoogle2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 33-Click on button signUpWithGoogle2.png')

"Step 34: Click on button signUpWithGoogle2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 34-Click on button signUpWithGoogle2.png')

"Step 35: Click on button signUpWithGoogle2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 35-Click on button signUpWithGoogle2.png')

"Step 36: Click on div signUpForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/div_signUpForm'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 36-Click on div signUpForm.png')

"Step 37: Click on div signUpForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/div_signUpForm'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 37-Click on div signUpForm.png')

"Step 38: Click on div signUpForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/div_signUpForm'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 38-Click on div signUpForm.png')

"Step 39: Click on button signUpWithGoogle2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 39-Click on button signUpWithGoogle2.png')

"Step 40: Click on button signUpWithGoogle2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 40-Click on button signUpWithGoogle2.png')

"Step 41: Click on button signUpWithGoogle2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 41-Click on button signUpWithGoogle2.png')

"Step 42: Click on button signUpWithGoogle2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 42-Click on button signUpWithGoogle2.png')

"Step 43: Click on link signInAlternative -> Navigate to page 'signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/link_signInAlternative'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 43-Click on link signInAlternative - Navigate to page signin.png')

"Step 44: Click on button signInWithGoogle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_signInWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 44-Click on button signInWithGoogle.png')

"Step 45: Click on button signInWithGoogle2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_signInWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 45-Click on button signInWithGoogle2.png')

"Step 46: Click on button signInWithGoogle2 -> Navigate to page 'user/create-notarization-profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_signInWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 46-Click on button signInWithGoogle2 - Navigate to page usercreate-notarization-profile.png')

"Step 47: Click on span userName -> Navigate to page 'profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/span_userName'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 47-Click on span userName - Navigate to page profile.png')

"Step 48: Click on span createProfile -> Navigate to page 'user/create-notarization-profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/span_createProfile'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 48-Click on span createProfile - Navigate to page usercreate-notarization-profile.png')

"Step 49: Click on item licensing -> Navigate to page 'user profile#user/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_licensing'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 49-Click on item licensing - Navigate to page user profileuser.png')

"Step 50: Click on div licensingInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/div_licensingInfo'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 50-Click on div licensingInfo.png')

"Step 51: Click on span serviceInformation (publicService)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/span_serviceInformation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/span_serviceInformation', ['span_serviceInformation_liNthChild': span_serviceInformation_liNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 51-Click on span serviceInformation publicService.png')

"Step 52: Click on span resource2 -> Navigate to page 'user/document-wallet'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/span_resource2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 52-Click on span resource2 - Navigate to page userdocument-wallet.png')

"Step 53: Click on span createPublicProfile -> Navigate to page 'user/create-notarization-profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/span_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 53-Click on span createPublicProfile - Navigate to page usercreate-notarization-profile.png')

"Step 54: Click on input serviceSelection (chonLinhVucCongChung)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection', ['input_serviceSelection_inputPlaceholder': input_serviceSelection_inputPlaceholder]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 54-Click on input serviceSelection chonLinhVucCongChung.png')

"Step 55: Click on div chonLoaiCongChung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_chonLoaiCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 55-Click on div chonLoaiCongChung.png')

"Step 56: Click on div autocompleteInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_autocompleteInput'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 56-Click on div autocompleteInput.png')

"Step 57: Click on div serviceOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_serviceOptions'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 57-Click on div serviceOptions.png')

"Step 58: Click on input serviceSelection (chonLinhVucCongChung)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection', ['input_serviceSelection_inputPlaceholder': input_serviceSelection_inputPlaceholder_1]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 58-Click on input serviceSelection chonLinhVucCongChung.png')

"Step 59: Click on div chonLoaiCongChung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_chonLoaiCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 59-Click on div chonLoaiCongChung.png')

"Step 60: Click on input serviceSelection (chonLinhVucCongChung)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection', ['input_serviceSelection_inputPlaceholder': input_serviceSelection_inputPlaceholder_2]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 60-Click on input serviceSelection chonLinhVucCongChung.png')

"Step 61: Click on item optionSelection (option)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection', ['item_optionSelection_id': item_optionSelection_id]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 61-Click on item optionSelection option.png')

"Step 62: Click on input serviceSelection (selectPublicService)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection', ['input_serviceSelection_inputPlaceholder': input_serviceSelection_inputPlaceholder_3]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 62-Click on input serviceSelection selectPublicService.png')

"Step 63: Click on item optionSelection (selectOption2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection', ['item_optionSelection_id': item_optionSelection_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 63-Click on item optionSelection selectOption2.png')

"Step 64: Click on button requestActions (continue4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions', ['button_requestActions_internalHasText': button_requestActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 64-Click on button requestActions continue4.png')

"Step 65: Click on input amount2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 65-Click on input amount2.png')

"Step 66: Enter input value in input amount2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount2'), input_amount2)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 66-Enter input value in input amount2.png')

"Step 67: Click on input fullName3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_fullName3'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 67-Click on input fullName3.png')

"Step 68: Enter input value in input fullName3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_fullName3'), input_fullName3)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 68-Enter input value in input fullName3.png')

"Step 69: Click on input phoneNumber3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber3'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 69-Click on input phoneNumber3.png')

"Step 70: Enter input value in input phoneNumber3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber3'), input_phoneNumber3)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 70-Enter input value in input phoneNumber3.png')

"Step 71: Click on input citizenId3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_citizenId3'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 71-Click on input citizenId3.png')

"Step 72: Enter input value in input citizenId3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_citizenId3'), input_citizenId3)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 72-Enter input value in input citizenId3.png')

"Step 73: Click on input email3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_email3'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 73-Click on input email3.png')

"Step 74: Enter input value in input email3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_email3'), input_email3)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 74-Enter input value in input email3.png')

"Step 75: Click on div selectType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_chonLoaiCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 75-Click on div selectType.png')

"Step 76: Click on label fileSelection (selectResource)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection', ['label_fileSelection_nth': label_fileSelection_nth]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 76-Click on label fileSelection selectResource.png')

"Step 77: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 77-Click on div backdrop.png')

"Step 78: Click on label fileSelection (selectResource2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection', ['label_fileSelection_nth': label_fileSelection_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 78-Click on label fileSelection selectResource2.png')

"Step 79: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 79-Click on item selectFromMachine.png')

"Step 80: Click on button requestActions (continue3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions', ['button_requestActions_internalHasText': button_requestActions_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 80-Click on button requestActions continue3.png')

"Step 81: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 81-Click on button close.png')

"Step 82: Click on label fileSelection (selectFile4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection', ['label_fileSelection_nth': label_fileSelection_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 82-Click on label fileSelection selectFile4.png')

"Step 83: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 83-Click on item selectFromMachine.png')

"Step 84: Click on label fileSelection (selectFile5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection', ['label_fileSelection_nth': label_fileSelection_nth_3]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 84-Click on label fileSelection selectFile5.png')

"Step 85: Click on item selectFromMachine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 85-Click on item selectFromMachine.png')

"Step 86: Click on label fileSelection (selectResource3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection', ['label_fileSelection_nth': label_fileSelection_nth_4]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 86-Click on label fileSelection selectResource3.png')

"Step 87: Click on item selectFromMachine2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 87-Click on item selectFromMachine2.png')

"Step 88: Click on button requestActions (continue3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions', ['button_requestActions_internalHasText': button_requestActions_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 88-Click on button requestActions continue3.png')

"Step 89: Click on button requestActions (submitRequest2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions', ['button_requestActions_internalHasText': button_requestActions_internalHasText_3]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 89-Click on button requestActions submitRequest2.png')

"Step 90: Click on span serviceList -> Navigate to page 'user profile#user/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/span_serviceList'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 90-Click on span serviceList - Navigate to page user profileuser.png')

"Step 91: Click on span serviceInformation (publicService)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile/span_serviceInformation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile/span_serviceInformation', ['span_serviceInformation_liNthChild': span_serviceInformation_liNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 91-Click on span serviceInformation publicService.png')

"Step 92: Click on span resource2 -> Navigate to page 'user/document-wallet'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/span_resource2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 92-Click on span resource2 - Navigate to page userdocument-wallet.png')

"Step 93: Click on span createPublicProfile -> Navigate to page 'user/create-notarization-profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/span_createPublicProfile'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 93-Click on span createPublicProfile - Navigate to page usercreate-notarization-profile.png')

"Step 94: Click on div selectTypeList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_selectTypeList'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 94-Click on div selectTypeList.png')

"Step 95: Click on div serviceOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_serviceOptions'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 95-Click on div serviceOptions.png')

"Step 96: Click on input serviceSelection (selectFunction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection', ['input_serviceSelection_inputPlaceholder': input_serviceSelection_inputPlaceholder_4]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 96-Click on input serviceSelection selectFunction.png')

"Step 97: Click on item optionSelection (selectFunctionOption)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection', ['item_optionSelection_id': item_optionSelection_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 97-Click on item optionSelection selectFunctionOption.png')

"Step 98: Click on div autocompleteInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_autocompleteInput'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 98-Click on div autocompleteInput.png')

"Step 99: Click on item optionSelection (selectContractOption)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection', ['item_optionSelection_id': item_optionSelection_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 99-Click on item optionSelection selectContractOption.png')

"Step 100: Click on button requestActions (continue2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions', ['button_requestActions_internalHasText': button_requestActions_internalHasText_4]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 100-Click on button requestActions continue2.png')

"Step 101: Click on span documentFile -> Navigate to page 'user/document-wallet'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/span_documentFile'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 101-Click on span documentFile - Navigate to page userdocument-wallet.png')

"Step 102: Click on span versionContract -> Navigate to page 'user profile#user/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/span_versionContract'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 102-Click on span versionContract - Navigate to page user profileuser.png')

"Step 103: Click on item history"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/item_history'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 103-Click on item history.png')

"Step 104: Click on span createContractFile -> Navigate to page 'user/create-notarization-profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/span_createContractFile'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 104-Click on span createContractFile - Navigate to page usercreate-notarization-profile.png')

"Step 105: Click on span versionContract -> Navigate to page 'user profile#user/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/create-notarization-profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/span_versionContract'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 105-Click on span versionContract - Navigate to page user profileuser.png')

"Step 106: Click on item financialResource -> Navigate to page 'user/document-wallet'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile/item_financialResource'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 106-Click on item financialResource - Navigate to page userdocument-wallet.png')

"Step 107: Click on span userName -> Navigate to page 'profile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/document-wallet?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_document_wallet/span_userName'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 107-Click on span userName - Navigate to page profile.png')

"Step 108: Click on span dangXuat"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/span_dangXuat'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 108-Click on span dangXuat.png')

"Step 109: Click on button co -> Navigate to page 'signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/button_co'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 109-Click on button co - Navigate to page signin.png')

"Step 110: Click on link trangChu -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/link_trangChu'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 110-Click on link trangChu - Navigate to page .png')

"Step 111: Click on link dichVuCongChung -> Navigate to page 'services page#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_dichVuCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 111-Click on link dichVuCongChung - Navigate to page services page.png')

"Step 112: Click on link traCuuHoSoCongChung -> Navigate to page 'lookup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_services_page/link_traCuuHoSoCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 112-Click on link traCuuHoSoCongChung - Navigate to page lookup.png')

"Step 113: Click on link dichVuCongChung -> Navigate to page 'services page#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/lookup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_lookup/link_dichVuCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 113-Click on link dichVuCongChung - Navigate to page services page.png')

"Step 114: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_services_page/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 114-Click on div object.png')

"Step 115: Click on item congChungHopDong"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_services_page/item_congChungHopDong'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 115-Click on item congChungHopDong.png')

"Step 116: Click on div taoHoSo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_services_page/div_taoHoSo'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 116-Click on div taoHoSo.png')

"Step 117: Click on p object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_services_page/p_object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 117-Click on p object.png')

"Step 118: Click on link taoHoSo -> Navigate to page 'signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_services_page/link_taoHoSo'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 118-Click on link taoHoSo - Navigate to page signin.png')

"Step 119: Click on div assistantIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/div_assistantIcon'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 119-Click on div assistantIcon.png')

"Step 120: Click on input nhapTinNhan"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/input_nhapTinNhan'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 120-Click on input nhapTinNhan.png')

"Step 121: Enter input value in input nhapTinNhan"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_signin/input_nhapTinNhan'), input_nhapTinNhan)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 121-Enter input value in input nhapTinNhan.png')

"Step 122: Press key Enter on input nhapTinNhan"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_signin/input_nhapTinNhan'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 122-Press key Enter on input nhapTinNhan.png')

"Step 123: Press key Enter on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_signin/body_object'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 123-Press key Enter on body object.png')

"Step 124: Click on header object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/header_object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 124-Click on header object.png')

"Step 125: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 125-Click on button close.png')

"Step 126: Click on link trustify -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/link_trustify'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 126-Click on link trustify - Navigate to page .png')

"Step 127: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 127-Click on button next.png')

"Step 128: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 128-Click on button next.png')

"Step 129: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 129-Click on button next.png')

"Step 130: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 130-Click on button next.png')

"Step 131: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 131-Click on button next.png')

"Step 132: Click on button arrowLeft"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_arrowLeft'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 132-Click on button arrowLeft.png')

"Step 133: Click on button arrowLeft"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_arrowLeft'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 133-Click on button arrowLeft.png')

"Step 134: Click on button arrowLeft"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_arrowLeft'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 134-Click on button arrowLeft.png')

"Step 135: Click on div phoneIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_phoneIcon'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 135-Click on div phoneIcon.png')

"Step 136: Click on button github -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_github'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 136-Click on button github - Navigate to page .png')

"Step 137: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Create Public Profile and Navigate Services_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}