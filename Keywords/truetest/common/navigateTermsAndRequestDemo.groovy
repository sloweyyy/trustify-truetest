package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class navigateTermsAndRequestDemo {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on span termsOfUse -> Navigate to page '/terms-of-service'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_privacy_policy/span_termsOfUse'))
        
        "Step 2: Click on span forVpcc -> Navigate to page 'for-notary-offices'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_terms_of_service/span_forVpcc'))
        
        "Step 3: Click on button requestDemo"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/button_requestDemo'))
        
        "Step 4: Click on button downloadFile"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/button_downloadFile'))
        
        "Step 5: Click on button downloadFile2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/button_downloadFile'))
        
        "Step 6: Click on button requestDemo2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/button_requestDemo'))
        
        "Step 7: Click on span explanation"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_for_notary_offices/span_explanation'))
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

