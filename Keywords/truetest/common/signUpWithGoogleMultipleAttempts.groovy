package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class signUpWithGoogleMultipleAttempts {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button signUpWithGoogle"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))
        
        "Step 2: Click on button signUpWithGoogle2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))
        
        "Step 3: Click on button signUpWithGoogle2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))
        
        "Step 4: Click on button signUpWithGoogle2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))
        
        "Step 5: Click on button signUpWithGoogle2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))
        
        "Step 6: Click on button signUpWithGoogle2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))
        
        "Step 7: Click on button signUpWithGoogle2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))
        
        "Step 8: Click on button signUpWithGoogle2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))
        
        "Step 9: Click on button signUpWithGoogle2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))
        
        "Step 10: Click on button signUpWithGoogle2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))
        
        "Step 11: Click on button signUpWithGoogle2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))
        
        "Step 12: Click on button signUpWithGoogle2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))
        
        "Step 13: Click on div signUpForm"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/div_signUpForm'))
        
        "Step 14: Click on div signUpForm"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/div_signUpForm'))
        
        "Step 15: Click on div signUpForm"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/div_signUpForm'))
        
        "Step 16: Click on button signUpWithGoogle2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))
        
        "Step 17: Click on button signUpWithGoogle2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))
        
        "Step 18: Click on button signUpWithGoogle2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signUpWithGoogle'))
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

