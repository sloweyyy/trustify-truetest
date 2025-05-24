package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class inputPersonalDetailsAndContact {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input amount"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount'))
        
        "Step 2: Enter input value in input amount"
        
        WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount'), data['input_amount'])
        
        "Step 3: Click on input fullName4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_fullName4'))
        
        "Step 4: Enter input value in input fullName4"
        
        WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_fullName4'), data['input_fullName4'])
        
        "Step 5: Enter input value in input phoneNumber"
        
        WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber'), data['input_phoneNumber'])
        
        "Step 6: Enter input value in input email4"
        
        WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_email4'), data['input_email4'])
        
        "Step 7: Click on input phoneNumber"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_amount'] = testData.getValue('input_amount', rowIndex)
        data['input_email4'] = testData.getValue('input_email4', rowIndex)
        data['input_fullName4'] = testData.getValue('input_fullName4', rowIndex)
        data['input_phoneNumber'] = testData.getValue('input_phoneNumber', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_amount'] = 'default_data'
        data['input_email4'] = 'default_data'
        data['input_fullName4'] = 'default_data'
        data['input_phoneNumber'] = 'default_data'
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

