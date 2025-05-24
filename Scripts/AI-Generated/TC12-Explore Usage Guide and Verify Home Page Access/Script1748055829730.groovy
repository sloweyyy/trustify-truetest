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

"Step 2: Click on item usageGuide"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/item_usageGuide'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 2-Click on item usageGuide.png')

"Step 3: Click on span forVpcc -> Navigate to page '/for-notary-offices'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_forVpcc'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 3-Click on span forVpcc - Navigate to page for-notary-offices.png')

"Step 4: Click on list footerContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/list_footerContent'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 4-Click on list footerContent.png')

"Step 5: Click on span email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/span_email'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 5-Click on span email.png')

"Step 6: Click on span email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/span_email'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 6-Click on span email.png')

"Step 7: Click on header aboutProduct (product)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_for_notary_offices/header_aboutProduct"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_for_notary_offices/header_aboutProduct', ['header_aboutProduct_nth': header_aboutProduct_nth]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 7-Click on header aboutProduct product.png')

"Step 8: Click on link lookupNotaryOffices -> Navigate to page '/lookup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/link_lookupNotaryOffices'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 8-Click on link lookupNotaryOffices - Navigate to page lookup.png')

"Step 9: Click on link dichVuCongChung -> Navigate to page '/services'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/lookup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_lookup/link_dichVuCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 9-Click on link dichVuCongChung - Navigate to page services.png')

"Step 10: Click on link homePage -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/services?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_services/link_homePage'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 10-Click on link homePage - Navigate to page .png')

"Step 11: Click on item usageGuide"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/item_usageGuide'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 11-Click on item usageGuide.png')

"Step 12: Click on item usageGuide"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/item_usageGuide'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 12-Click on item usageGuide.png')

"Step 13: Click on item usageGuide"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/item_usageGuide'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 13-Click on item usageGuide.png')

"Step 14: Click on item usageGuide"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/item_usageGuide'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 14-Click on item usageGuide.png')

"Step 15: Click on item usageGuide"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/item_usageGuide'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 15-Click on item usageGuide.png')

"Step 16: Click on item usageGuide"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/item_usageGuide'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 16-Click on item usageGuide.png')

"Step 17: Click on span termsOfUse -> Navigate to page '/terms-of-service'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_termsOfUse'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 17-Click on span termsOfUse - Navigate to page terms-of-service.png')

"Step 18: Click on item termsNotInfringement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/item_termsNotInfringement'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 18-Click on item termsNotInfringement.png')

"Step 19: Click on item termsNotInfringement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/item_termsNotInfringement'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 19-Click on item termsNotInfringement.png')

"Step 20: Click on span explanationForPolicy -> Navigate to page '/dispute-resolution'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/span_explanationForPolicy'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 20-Click on span explanationForPolicy - Navigate to page dispute-resolution.png')

"Step 21: Click on p disputeResolutionStaff"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dispute-resolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dispute_resolution/p_disputeResolutionStaff'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 21-Click on p disputeResolutionStaff.png')

"Step 22: Click on p disputeResolutionStaff"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dispute-resolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dispute_resolution/p_disputeResolutionStaff'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 22-Click on p disputeResolutionStaff.png')

"Step 23: Click on item disputeResolutionTimeframe"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dispute-resolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dispute_resolution/item_disputeResolutionTimeframe'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 23-Click on item disputeResolutionTimeframe.png')

"Step 24: Click on header homePage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dispute-resolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dispute_resolution/header_homePage'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 24-Click on header homePage.png')

"Step 25: Click on div footerContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dispute-resolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dispute_resolution/div_footerContent'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 25-Click on div footerContent.png')

"Step 26: Click on header homePage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dispute-resolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dispute_resolution/header_homePage'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 26-Click on header homePage.png')

"Step 27: Click on header homePage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dispute-resolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dispute_resolution/header_homePage'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 27-Click on header homePage.png')

"Step 28: Click on header homePage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dispute-resolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dispute_resolution/header_homePage'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 28-Click on header homePage.png')

"Step 29: Click on item disputeResolutionTimeframe"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dispute-resolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dispute_resolution/item_disputeResolutionTimeframe'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 29-Click on item disputeResolutionTimeframe.png')

"Step 30: Click on span securityPolicy -> Navigate to page '/privacy-policy'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dispute-resolution?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dispute_resolution/span_securityPolicy'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 30-Click on span securityPolicy - Navigate to page privacy-policy.png')

"Step 31: Click on item privacyContact"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/privacy-policy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_privacy_policy/item_privacyContact'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 31-Click on item privacyContact.png')

"Step 32: Click on span termsOfUse -> Navigate to page '/terms-of-service'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/privacy-policy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_privacy_policy/span_termsOfUse'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 32-Click on span termsOfUse - Navigate to page terms-of-service.png')

"Step 33: Click on item usageGuidelines"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/item_usageGuidelines'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 33-Click on item usageGuidelines.png')

"Step 34: Click on item usageGuidelines"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/item_usageGuidelines'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 34-Click on item usageGuidelines.png')

"Step 35: Click on item usageGuidelines"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/item_usageGuidelines'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 35-Click on item usageGuidelines.png')

"Step 36: Click on item usageGuidelines"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/item_usageGuidelines'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 36-Click on item usageGuidelines.png')

"Step 37: Click on item usageGuidelines"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/item_usageGuidelines'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 37-Click on item usageGuidelines.png')

"Step 38: Click on header aboutSection (productSection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_terms_of_service/header_aboutSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_terms_of_service/header_aboutSection', ['header_aboutSection_nth': header_aboutSection_nth]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 38-Click on header aboutSection productSection.png')

"Step 39: Click on header aboutSection (productSection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_terms_of_service/header_aboutSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_terms_of_service/header_aboutSection', ['header_aboutSection_nth': header_aboutSection_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 39-Click on header aboutSection productSection.png')

"Step 40: Click on header aboutSection (aboutUs)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_terms_of_service/header_aboutSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_terms_of_service/header_aboutSection', ['header_aboutSection_nth': header_aboutSection_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 40-Click on header aboutSection aboutUs.png')

"Step 41: Click on span contactLocation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/span_contactLocation'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 41-Click on span contactLocation.png')

"Step 42: Click on span forVpcc -> Navigate to page '/for-notary-offices'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/span_forVpcc'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 42-Click on span forVpcc - Navigate to page for-notary-offices.png')

"Step 43: Click on span officeAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/span_officeAddress'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 43-Click on span officeAddress.png')

"Step 44: Click on span officeAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/span_officeAddress'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 44-Click on span officeAddress.png')

"Step 45: Click on span officeAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/span_officeAddress'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 45-Click on span officeAddress.png')

"Step 46: Click on span officeAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/span_officeAddress'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 46-Click on span officeAddress.png')

"Step 47: Click on header aboutProduct (aboutUs)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_for_notary_offices/header_aboutProduct"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_for_notary_offices/header_aboutProduct', ['header_aboutProduct_nth': header_aboutProduct_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 47-Click on header aboutProduct aboutUs.png')

"Step 48: Click on header aboutProduct (aboutUs)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_for_notary_offices/header_aboutProduct"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_for_notary_offices/header_aboutProduct', ['header_aboutProduct_nth': header_aboutProduct_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 48-Click on header aboutProduct aboutUs.png')

"Step 49: Click on span officePhone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/span_officePhone'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 49-Click on span officePhone.png')

"Step 50: Click on item forIndividuals"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/item_forIndividuals'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 50-Click on item forIndividuals.png')

"Step 51: Click on item forIndividuals"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/item_forIndividuals'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 51-Click on item forIndividuals.png')

"Step 52: Click on item forIndividuals"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/item_forIndividuals'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 52-Click on item forIndividuals.png')

"Step 53: Click on item forIndividuals"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/item_forIndividuals'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 53-Click on item forIndividuals.png')

"Step 54: Click on span officePhone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/span_officePhone'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 54-Click on span officePhone.png')

"Step 55: Click on span officePhone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/span_officePhone'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 55-Click on span officePhone.png')

"Step 56: Click on span officeAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/span_officeAddress'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 56-Click on span officeAddress.png')

"Step 57: Click on header aboutProduct (product) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_for_notary_offices/header_aboutProduct"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_for_notary_offices/header_aboutProduct', ['header_aboutProduct_nth': header_aboutProduct_nth_3]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 57-Click on header aboutProduct product - Navigate to page .png')

"Step 58: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Explore Usage Guide and Verify Home Page Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}