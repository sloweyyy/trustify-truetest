import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.contactSupportAndViewPricingDetails
import truetest.common.selectDocumentAndPaymentOptions
import truetest.common.viewComprehensiveReports
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /pricing"

TrueTestScripts.navigate("/pricing")

"Step 2: Contact support and view pricing details multiple times"

contactSupportAndViewPricingDetails.execute()

"Step 3: Click on div pricingTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/div_pricingTable'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 3-Click on div pricingTable.png')

"Step 4: Click on link trustify -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/link_trustify'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 4-Click on link trustify - Navigate to page .png')

"Step 5: Click on span price"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_price'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 5-Click on span price.png')

"Step 6: Select document types and payment options multiple times"

selectDocumentAndPaymentOptions.execute()

"Step 7: View comprehensive reports and additional options multiple times"

viewComprehensiveReports.execute()

"Step 8: Click on list features"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/list_features'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 8-Click on list features.png')

"Step 9: Click on span congCuAinangCao"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_congCuAinangCao'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 9-Click on span congCuAinangCao.png')

"Step 10: Click on span congCuAinangCao"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_congCuAinangCao'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 10-Click on span congCuAinangCao.png')

"Step 11: Click on span congCuAinangCao"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_congCuAinangCao'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 11-Click on span congCuAinangCao.png')

"Step 12: Click on span baoCaoToanDien"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_baoCaoToanDien'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 12-Click on span baoCaoToanDien.png')

"Step 13: Click on button registerNow3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/button_registerNow3'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 13-Click on button registerNow3.png')

"Step 14: Click on span danhChoVpcc -> Navigate to page '/for-notary-offices'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_danhChoVpcc'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 14-Click on span danhChoVpcc - Navigate to page for-notary-offices.png')

"Step 15: Click on link traCuuHoSoCongChung -> Navigate to page '/notary/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/link_traCuuHoSoCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 15-Click on link traCuuHoSoCongChung - Navigate to page notarydashboard.png')

"Step 16: Click on span verificationResource -> Navigate to page '/notary/pending-notarization-documents'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_dashboard/span_verificationResource'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 16-Click on span verificationResource - Navigate to page notarypending-notarization-documents.png')

"Step 17: Click on button viewDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/pending-notarization-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_pending_notarization_documents/button_viewDetails'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 17-Click on button viewDetails.png')

"Step 18: Click on p phoneNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/pending-notarization-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_pending_notarization_documents/p_phoneNumber'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 18-Click on p phoneNumber.png')

"Step 19: Click on p phoneNumber -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notary/pending-notarization-documents?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_pending_notarization_documents/p_phoneNumber'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 19-Click on p phoneNumber - Navigate to page .png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC21-Contact Support and Verify Home Page Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}