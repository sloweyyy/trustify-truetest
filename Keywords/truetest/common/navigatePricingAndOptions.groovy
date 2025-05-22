package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class navigatePricingAndOptions {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link trustify -> Navigate to page '/'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/link_trustify'))
        
        "Step 2: Click on span price -> Navigate to page 'pricing'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_price'))
        
        "Step 3: Click on span taiLieuUuTien"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_taiLieuUuTien'))
        
        "Step 4: Click on span taiLieuUuTien"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_taiLieuUuTien'))
        
        "Step 5: Click on span taiLieuUuTien"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_taiLieuUuTien'))
        
        "Step 6: Click on span toiDa5TaiKhoan"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_toiDa5TaiKhoan'))
        
        "Step 7: Click on span toiDa5TaiKhoan"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_toiDa5TaiKhoan'))
        
        "Step 8: Click on span toiDa5TaiKhoan"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_toiDa5TaiKhoan'))
        
        "Step 9: Click on span tuyChonThanhToan"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tuyChonThanhToan'))
        
        "Step 10: Click on span tuyChonThanhToan"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tuyChonThanhToan'))
        
        "Step 11: Click on span tuyChonThanhToan"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_tuyChonThanhToan'))
        
        "Step 12: Click on span troTroTieuChuan"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_troTroTieuChuan'))
        
        "Step 13: Click on span troTroTieuChuan"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_troTroTieuChuan'))
        
        "Step 14: Click on span troTroTieuChuan"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_troTroTieuChuan'))
        
        "Step 15: Click on span troTroUuTien247"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_troTroUuTien247'))
        
        "Step 16: Click on span pricingFeatures"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_pricingFeatures'))
        
        "Step 17: Click on span pricingFeatures"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_pricingFeatures'))
        
        "Step 18: Click on span pricingFeatures"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_pricingFeatures'))
        
        "Step 19: Click on span nftKhongGioiHan"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_nftKhongGioiHan'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

