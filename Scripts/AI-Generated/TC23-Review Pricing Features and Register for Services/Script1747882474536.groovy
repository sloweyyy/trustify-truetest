import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.contactSupportAndViewPricingDetails
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to pricing"

TrueTestScripts.navigate("pricing")

"Step 2: Interact with support and review pricing details."

contactSupportAndViewPricingDetails.execute()

"Step 3: Click on button registerNow2 -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/button_registerNow'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 3-Click on button registerNow2 - Navigate to page .png')

"Step 4: Click on span price -> Navigate to page 'pricing'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_price'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 4-Click on span price - Navigate to page pricing.png')

"Step 5: Click on span tinhNangCongChucTrucTuyen"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tinhNangCongChucTrucTuyen'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 5-Click on span tinhNangCongChucTrucTuyen.png')

"Step 6: Click on span tinhNangCongChucTrucTuyen"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tinhNangCongChucTrucTuyen'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 6-Click on span tinhNangCongChucTrucTuyen.png')

"Step 7: Click on span tinhNangCongChucTrucTuyen"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tinhNangCongChucTrucTuyen'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 7-Click on span tinhNangCongChucTrucTuyen.png')

"Step 8: Click on span tinhNangCongChucTrucTuyen"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tinhNangCongChucTrucTuyen'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 8-Click on span tinhNangCongChucTrucTuyen.png')

"Step 9: Click on span tinhNangCongChucTrucTuyen"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tinhNangCongChucTrucTuyen'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 9-Click on span tinhNangCongChucTrucTuyen.png')

"Step 10: Click on span tinhNangCongChucTrucTuyen"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tinhNangCongChucTrucTuyen'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 10-Click on span tinhNangCongChucTrucTuyen.png')

"Step 11: Click on span tinhNangCongChucTrucTuyen"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tinhNangCongChucTrucTuyen'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 11-Click on span tinhNangCongChucTrucTuyen.png')

"Step 12: Click on span tinhNangCongChucTrucTuyen"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tinhNangCongChucTrucTuyen'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 12-Click on span tinhNangCongChucTrucTuyen.png')

"Step 13: Click on span tinhNangCongChucTrucTuyen"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tinhNangCongChucTrucTuyen'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 13-Click on span tinhNangCongChucTrucTuyen.png')

"Step 14: Click on span tinhNangCongChucTrucTuyen"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tinhNangCongChucTrucTuyen'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 14-Click on span tinhNangCongChucTrucTuyen.png')

"Step 15: Click on span tinhNangCongChucTrucTuyen"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tinhNangCongChucTrucTuyen'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 15-Click on span tinhNangCongChucTrucTuyen.png')

"Step 16: Click on span tinhNangCongChucTrucTuyen"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tinhNangCongChucTrucTuyen'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 16-Click on span tinhNangCongChucTrucTuyen.png')

"Step 17: Click on span tatCaTinhNang"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tatCaTinhNang'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 17-Click on span tatCaTinhNang.png')

"Step 18: Click on span tatCaTinhNang"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tatCaTinhNang'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 18-Click on span tatCaTinhNang.png')

"Step 19: Click on span tatCaTinhNang"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tatCaTinhNang'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 19-Click on span tatCaTinhNang.png')

"Step 20: Click on span tatCaTinhNang"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tatCaTinhNang'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 20-Click on span tatCaTinhNang.png')

"Step 21: Click on span tatCaTinhNang"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tatCaTinhNang'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 21-Click on span tatCaTinhNang.png')

"Step 22: Click on span tatCaTinhNang"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tatCaTinhNang'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 22-Click on span tatCaTinhNang.png')

"Step 23: Click on span tatCaTinhNang"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tatCaTinhNang'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 23-Click on span tatCaTinhNang.png')

"Step 24: Click on span pricingFeatures"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_pricingFeatures'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 24-Click on span pricingFeatures.png')

"Step 25: Click on span tatCaTinhNang"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tatCaTinhNang'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 25-Click on span tatCaTinhNang.png')

"Step 26: Click on span tatCaTinhNang"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tatCaTinhNang'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 26-Click on span tatCaTinhNang.png')

"Step 27: Click on span tatCaTinhNang"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tatCaTinhNang'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 27-Click on span tatCaTinhNang.png')

"Step 28: Click on span tatCaTinhNang"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tatCaTinhNang'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 28-Click on span tatCaTinhNang.png')

"Step 29: Click on button registerNow3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/button_registerNow'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 29-Click on button registerNow3.png')

"Step 30: Click on span danhChoVpcc -> Navigate to page 'for-notary-offices'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_danhChoVpcc'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 30-Click on span danhChoVpcc - Navigate to page for-notary-offices.png')

"Step 31: Click on link lookupNotaryOffices -> Navigate to page 'lookup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/link_lookupNotaryOffices'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 31-Click on link lookupNotaryOffices - Navigate to page lookup.png')

"Step 32: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC23-Review Pricing Features and Register for Services_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}