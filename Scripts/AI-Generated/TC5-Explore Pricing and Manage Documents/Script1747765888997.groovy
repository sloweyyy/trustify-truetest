import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.viewPriceDetailsMultipleTimes
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

"Step 2: Click on header pricingTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/header_pricingTable'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on header pricingTable.png')

"Step 3: Click on button registerNow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/button_registerNow'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on button registerNow.png')

"Step 4: Click on button contactSupport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/button_contactSupport'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on button contactSupport.png')

"Step 5: Click to view price details multiple times"

viewPriceDetailsMultipleTimes.execute()

"Step 6: Click on div pricingTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/div_pricingTable'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on div pricingTable.png')

"Step 7: Click on link trustify -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/link_trustify'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on link trustify - Navigate to page .png')

"Step 8: Click on span price -> Navigate to page 'pricing'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_price'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on span price - Navigate to page pricing.png')

"Step 9: Click on span pricingDetails (taiLieuUuTien)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails', ['span_pricingDetails_liNthChild': span_pricingDetails_liNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on span pricingDetails taiLieuUuTien.png')

"Step 10: Click on span pricingDetails (taiLieuUuTien)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails', ['span_pricingDetails_liNthChild': span_pricingDetails_liNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on span pricingDetails taiLieuUuTien.png')

"Step 11: Click on span pricingDetails (taiLieuUuTien)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails', ['span_pricingDetails_liNthChild': span_pricingDetails_liNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Click on span pricingDetails taiLieuUuTien.png')

"Step 12: Click on span pricingDetails (toiDa5TaiKhoan)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails', ['span_pricingDetails_liNthChild': span_pricingDetails_liNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Click on span pricingDetails toiDa5TaiKhoan.png')

"Step 13: Click on span pricingDetails (toiDa5TaiKhoan)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails', ['span_pricingDetails_liNthChild': span_pricingDetails_liNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Click on span pricingDetails toiDa5TaiKhoan.png')

"Step 14: Click on span pricingDetails (toiDa5TaiKhoan)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails', ['span_pricingDetails_liNthChild': span_pricingDetails_liNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 14-Click on span pricingDetails toiDa5TaiKhoan.png')

"Step 15: Click on span pricingDetails (tuyChonThanhToan)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails', ['span_pricingDetails_liNthChild': span_pricingDetails_liNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 15-Click on span pricingDetails tuyChonThanhToan.png')

"Step 16: Click on span pricingDetails (tuyChonThanhToan)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails', ['span_pricingDetails_liNthChild': span_pricingDetails_liNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 16-Click on span pricingDetails tuyChonThanhToan.png')

"Step 17: Click on span pricingDetails (tuyChonThanhToan)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails', ['span_pricingDetails_liNthChild': span_pricingDetails_liNthChild_8]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 17-Click on span pricingDetails tuyChonThanhToan.png')

"Step 18: Click on span pricingDetails (troTroTieuChuan)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails', ['span_pricingDetails_liNthChild': span_pricingDetails_liNthChild_9]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 18-Click on span pricingDetails troTroTieuChuan.png')

"Step 19: Click on span pricingDetails (troTroTieuChuan)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails', ['span_pricingDetails_liNthChild': span_pricingDetails_liNthChild_10]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 19-Click on span pricingDetails troTroTieuChuan.png')

"Step 20: Click on span pricingDetails (troTroTieuChuan)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingDetails', ['span_pricingDetails_liNthChild': span_pricingDetails_liNthChild_11]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 20-Click on span pricingDetails troTroTieuChuan.png')

"Step 21: Click on span pricingFeatures (troTroUuTien247)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures', ['span_pricingFeatures_liNthChild': span_pricingFeatures_liNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 21-Click on span pricingFeatures troTroUuTien247.png')

"Step 22: Click on span pricingFeatures (baoCaoToanDien)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures', ['span_pricingFeatures_liNthChild': span_pricingFeatures_liNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 22-Click on span pricingFeatures baoCaoToanDien.png')

"Step 23: Click on span pricingFeatures (baoCaoToanDien)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures', ['span_pricingFeatures_liNthChild': span_pricingFeatures_liNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 23-Click on span pricingFeatures baoCaoToanDien.png')

"Step 24: Click on span pricingFeatures (baoCaoToanDien)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures', ['span_pricingFeatures_liNthChild': span_pricingFeatures_liNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 24-Click on span pricingFeatures baoCaoToanDien.png')

"Step 25: Click on span pricingFeatures (nftKhongGioiHan)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures', ['span_pricingFeatures_liNthChild': span_pricingFeatures_liNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 25-Click on span pricingFeatures nftKhongGioiHan.png')

"Step 26: Click on span pricingFeatures (nftKhongGioiHan)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures', ['span_pricingFeatures_liNthChild': span_pricingFeatures_liNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 26-Click on span pricingFeatures nftKhongGioiHan.png')

"Step 27: Click on span pricingFeatures (nftKhongGioiHan)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures', ['span_pricingFeatures_liNthChild': span_pricingFeatures_liNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 27-Click on span pricingFeatures nftKhongGioiHan.png')

"Step 28: Click on list features"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/list_features'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 28-Click on list features.png')

"Step 29: Click on span pricingFeatures (congCuAinangCao)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures', ['span_pricingFeatures_liNthChild': span_pricingFeatures_liNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 29-Click on span pricingFeatures congCuAinangCao.png')

"Step 30: Click on span pricingFeatures (congCuAinangCao)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures', ['span_pricingFeatures_liNthChild': span_pricingFeatures_liNthChild_8]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 30-Click on span pricingFeatures congCuAinangCao.png')

"Step 31: Click on span pricingFeatures (congCuAinangCao)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures', ['span_pricingFeatures_liNthChild': span_pricingFeatures_liNthChild_9]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 31-Click on span pricingFeatures congCuAinangCao.png')

"Step 32: Click on span pricingFeatures (baoCaoToanDien)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pricing/span_pricingFeatures', ['span_pricingFeatures_liNthChild': span_pricingFeatures_liNthChild_10]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 32-Click on span pricingFeatures baoCaoToanDien.png')

"Step 33: Click on button registerNow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/button_registerNow'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 33-Click on button registerNow.png')

"Step 34: Click on span danhChoVpcc -> Navigate to page 'for-notary-offices'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/pricing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_danhChoVpcc'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 34-Click on span danhChoVpcc - Navigate to page for-notary-offices.png')

"Step 35: Click on link traCuuHoSoCongChung -> Navigate to page '*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/for-notary-offices?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/link_traCuuHoSoCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 35-Click on link traCuuHoSoCongChung - Navigate to page dashboard.png')

"Step 36: Click on span taiLieuChodXacNhan -> Navigate to page 'notary document management#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dashboard/span_taiLieuChodXacNhan'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 36-Click on span taiLieuChodXacNhan - Navigate to page notary document management.png')

"Step 37: Click on button xemChiTiet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/button_xemChiTiet2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 37-Click on button xemChiTiet.png')

"Step 38: Click on p documentNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/p_documentNumber'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 38-Click on p documentNumber.png')

"Step 39: Click on p documentNumber -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/p_documentNumber'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 39-Click on p documentNumber - Navigate to page .png')

"Step 40: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Explore Pricing and Manage Documents_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}