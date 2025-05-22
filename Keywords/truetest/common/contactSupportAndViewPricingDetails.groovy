package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class contactSupportAndViewPricingDetails {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on header pricingTable"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/header_pricingTable'))
        
        "Step 2: Click on button registerNow3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/button_registerNow'))
        
        "Step 3: Click on button contactSupport"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/button_contactSupport'))
        
        "Step 4: Click on header priceDetails"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/header_priceDetails'))
        
        "Step 5: Click on header priceDetails"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/header_priceDetails'))
        
        "Step 6: Click on header priceDetails"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/header_priceDetails'))
        
        "Step 7: Click on header priceDetails"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/header_priceDetails'))
        
        "Step 8: Click on header priceDetails"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/header_priceDetails'))
        
        "Step 9: Click on header priceDetails"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/header_priceDetails'))
        
        "Step 10: Click on header priceDetails"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/header_priceDetails'))
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

