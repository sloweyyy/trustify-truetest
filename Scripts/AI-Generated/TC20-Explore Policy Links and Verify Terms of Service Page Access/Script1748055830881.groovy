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

"Step 2: Click on list policyLinks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/list_policyLinks'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 2-Click on list policyLinks.png')

"Step 3: Click on div pageDetails (productDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/div_pageDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/div_pageDetails', ['div_pageDetails_divNthChild': div_pageDetails_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 3-Click on div pageDetails productDetails.png')

"Step 4: Click on div footerContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_footerContent'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 4-Click on div footerContent.png')

"Step 5: Click on div pageDetails (aboutUs)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/div_pageDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/div_pageDetails', ['div_pageDetails_divNthChild': div_pageDetails_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 5-Click on div pageDetails aboutUs.png')

"Step 6: Click on div pageDetails (aboutUs)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/div_pageDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/div_pageDetails', ['div_pageDetails_divNthChild': div_pageDetails_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 6-Click on div pageDetails aboutUs.png')

"Step 7: Click on header pageTitle (productSection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/header_pageTitle"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/header_pageTitle', ['header_pageTitle_nth': header_pageTitle_nth]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 7-Click on header pageTitle productSection.png')

"Step 8: Click on div navigationMenu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_navigationMenu'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 8-Click on div navigationMenu.png')

"Step 9: Click on link dichVuCongChung -> Navigate to page '/services'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_dichVuCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 9-Click on link dichVuCongChung - Navigate to page services.png')

"Step 10: Click on link homePage -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/services?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_services/link_homePage'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 10-Click on link homePage - Navigate to page .png')

"Step 11: Click on list policyLinks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/list_policyLinks'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 11-Click on list policyLinks.png')

"Step 12: Click on list policyLinks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/list_policyLinks'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 12-Click on list policyLinks.png')

"Step 13: Click on list policyLinks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/list_policyLinks'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 13-Click on list policyLinks.png')

"Step 14: Click on list policyLinks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/list_policyLinks'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 14-Click on list policyLinks.png')

"Step 15: Click on list policyLinks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/list_policyLinks'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 15-Click on list policyLinks.png')

"Step 16: Click on list policyLinks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/list_policyLinks'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 16-Click on list policyLinks.png')

"Step 17: Click on div homePageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_homePageContent'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 17-Click on div homePageContent.png')

"Step 18: Click on list policyLinks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/list_policyLinks'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 18-Click on list policyLinks.png')

"Step 19: Click on list policyLinks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/list_policyLinks'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 19-Click on list policyLinks.png')

"Step 20: Click on item servicePolicy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/item_servicePolicy'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 20-Click on item servicePolicy.png')

"Step 21: Click on div pageDetails (productDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/div_pageDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/div_pageDetails', ['div_pageDetails_divNthChild': div_pageDetails_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 21-Click on div pageDetails productDetails.png')

"Step 22: Click on div pageDetails (productDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/div_pageDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/div_pageDetails', ['div_pageDetails_divNthChild': div_pageDetails_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 22-Click on div pageDetails productDetails.png')

"Step 23: Click on list policyLinks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/list_policyLinks'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 23-Click on list policyLinks.png')

"Step 24: Click on header pageTitle (homePageTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/header_pageTitle"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/header_pageTitle', ['header_pageTitle_nth': header_pageTitle_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 24-Click on header pageTitle homePageTitle.png')

"Step 25: Click on div footerContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_footerContent'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 25-Click on div footerContent.png')

"Step 26: Click on header pageTitle (homePageTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/header_pageTitle"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/header_pageTitle', ['header_pageTitle_nth': header_pageTitle_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 26-Click on header pageTitle homePageTitle.png')

"Step 27: Click on header pageTitle (homePageTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/header_pageTitle"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/header_pageTitle', ['header_pageTitle_nth': header_pageTitle_nth_3]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 27-Click on header pageTitle homePageTitle.png')

"Step 28: Click on header pageTitle (homePageTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/header_pageTitle"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/header_pageTitle', ['header_pageTitle_nth': header_pageTitle_nth_4]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 28-Click on header pageTitle homePageTitle.png')

"Step 29: Click on list policyLinks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/list_policyLinks'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 29-Click on list policyLinks.png')

"Step 30: Click on item paymentSecurity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/item_paymentSecurity'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 30-Click on item paymentSecurity.png')

"Step 31: Click on item securityPolicy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/item_securityPolicy'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 31-Click on item securityPolicy.png')

"Step 32: Click on list policyLinks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/list_policyLinks'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 32-Click on list policyLinks.png')

"Step 33: Click on span termsOfUse -> Navigate to page '/terms-of-service'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_termsOfUse'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 33-Click on span termsOfUse - Navigate to page terms-of-service.png')

"Step 34: Click on list termsOfService"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/list_termsOfService'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 34-Click on list termsOfService.png')

"Step 35: Click on list termsOfService"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/list_termsOfService'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 35-Click on list termsOfService.png')

"Step 36: Click on list termsOfService"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/list_termsOfService'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 36-Click on list termsOfService.png')

"Step 37: Click on list termsOfService"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/list_termsOfService'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 37-Click on list termsOfService.png')

"Step 38: Click on list termsOfService"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/list_termsOfService'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 38-Click on list termsOfService.png')

"Step 39: Click on header aboutSection (productSection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_terms_of_service/header_aboutSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_terms_of_service/header_aboutSection', ['header_aboutSection_nth': header_aboutSection_nth]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 39-Click on header aboutSection productSection.png')

"Step 40: Click on header aboutSection (productSection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_terms_of_service/header_aboutSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_terms_of_service/header_aboutSection', ['header_aboutSection_nth': header_aboutSection_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 40-Click on header aboutSection productSection.png')

"Step 41: Click on header aboutSection (aboutUs)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_terms_of_service/header_aboutSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_terms_of_service/header_aboutSection', ['header_aboutSection_nth': header_aboutSection_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 41-Click on header aboutSection aboutUs.png')

"Step 42: Click on item contactInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/item_contactInfo'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 42-Click on item contactInfo.png')

"Step 43: Click on div productDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/div_productDetails'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 43-Click on div productDetails.png')

"Step 44: Click on span contactLocation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/span_contactLocation'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 44-Click on span contactLocation.png')

"Step 45: Click on span contactLocation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/span_contactLocation'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 45-Click on span contactLocation.png')

"Step 46: Click on span contactLocation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/span_contactLocation'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 46-Click on span contactLocation.png')

"Step 47: Click on span contactLocation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/span_contactLocation'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 47-Click on span contactLocation.png')

"Step 48: Click on header aboutSection (aboutUs)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_terms_of_service/header_aboutSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_terms_of_service/header_aboutSection', ['header_aboutSection_nth': header_aboutSection_nth_3]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 48-Click on header aboutSection aboutUs.png')

"Step 49: Click on header aboutSection (aboutUs)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_terms_of_service/header_aboutSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_terms_of_service/header_aboutSection', ['header_aboutSection_nth': header_aboutSection_nth_4]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 49-Click on header aboutSection aboutUs.png')

"Step 50: Click on span contactPhone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/span_contactPhone'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 50-Click on span contactPhone.png')

"Step 51: Click on div productDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/div_productDetails'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 51-Click on div productDetails.png')

"Step 52: Click on div productDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/div_productDetails'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 52-Click on div productDetails.png')

"Step 53: Click on div productDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/div_productDetails'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 53-Click on div productDetails.png')

"Step 54: Click on div productDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/div_productDetails'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 54-Click on div productDetails.png')

"Step 55: Click on item contactPhoneInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/item_contactPhoneInfo'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 55-Click on item contactPhoneInfo.png')

"Step 56: Click on item contactPhoneInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/item_contactPhoneInfo'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 56-Click on item contactPhoneInfo.png')

"Step 57: Click on span contactLocation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/span_contactLocation'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 57-Click on span contactLocation.png')

"Step 58: Click on header aboutSection (productSection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/terms-of-service?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_terms_of_service/header_aboutSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_terms_of_service/header_aboutSection', ['header_aboutSection_nth': header_aboutSection_nth_5]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 58-Click on header aboutSection productSection.png')

"Step 59: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC20-Explore Policy Links and Verify Terms of Service Page Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}