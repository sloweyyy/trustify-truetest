package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class inputAmountAndPersonalDetails {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Enter input value in input amount3"
        
        WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount3'), data['input_amount3'])
        
        "Step 2: Click on input fullName3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_fullName3'))
        
        "Step 3: Enter input value in input fullName3"
        
        WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_fullName3'), data['input_fullName3'])
        
        "Step 4: Enter input value in input phoneNumber4"
        
        WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber4'), data['input_phoneNumber4'])
        
        "Step 5: Enter input value in input email3"
        
        WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_email3'), data['input_email3'])
        
        "Step 6: Click on input citizenId4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_citizenId4'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_amount3'] = testData.getValue('input_amount3', rowIndex)
        data['input_email3'] = testData.getValue('input_email3', rowIndex)
        data['input_fullName3'] = testData.getValue('input_fullName3', rowIndex)
        data['input_phoneNumber4'] = testData.getValue('input_phoneNumber4', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_amount3'] = 'default_data'
        data['input_email3'] = 'default_data'
        data['input_fullName3'] = 'default_data'
        data['input_phoneNumber4'] = 'default_data'
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

