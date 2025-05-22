package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class viewPublicNoticeAndPolicies {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on span publicNotice"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_publicNotice'))
        
        "Step 2: Click on span canPublicServiceSignMultiplePeople"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_canPublicServiceSignMultiplePeople'))
        
        "Step 3: Click on span price -> Navigate to page 'pricing'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_price'))
        
        "Step 4: Click on span securityPolicy -> Navigate to page 'privacy-policy'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_pricing/span_securityPolicy'))
        
        "Step 5: Click on span privacyPolicy"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_privacy_policy/span_privacyPolicy'))
        
        "Step 6: Click on span privacyPolicy"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_privacy_policy/span_privacyPolicy'))
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

