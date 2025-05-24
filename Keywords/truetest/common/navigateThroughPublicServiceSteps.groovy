package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class navigateThroughPublicServiceSteps {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button next"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_next'))
        
        "Step 2: Click on button next"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_next'))
        
        "Step 3: Click on button next"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_next'))
        
        "Step 4: Click on header agreementBuySell"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/header_agreementBuySell'))
        
        "Step 5: Click on span whatIsPublicService"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_whatIsPublicService'))
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

