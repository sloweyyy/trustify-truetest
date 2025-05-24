package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class viewComprehensiveReports {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on span troTroTieuChuan"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_troTroTieuChuan'))
        
        "Step 2: Click on span troTroUuTien247"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_troTroUuTien247'))
        
        "Step 3: Click on span baoCaoToanDien"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_baoCaoToanDien'))
        
        "Step 4: Click on span baoCaoToanDien"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_baoCaoToanDien'))
        
        "Step 5: Click on span baoCaoToanDien"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_baoCaoToanDien'))
        
        "Step 6: Click on span nftKhongGioiHan"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_nftKhongGioiHan'))
        
        "Step 7: Click on span nftKhongGioiHan"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_nftKhongGioiHan'))
        
        "Step 8: Click on span nftKhongGioiHan"
        
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

