package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class fillUserInformationForm {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Enter input value in input amount2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount2_1'), data['input_amount2'])
        
        "Step 2: Click on input fullName2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_fullName2_1'))
        
        "Step 3: Enter input value in input fullName2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_fullName2_1'), data['input_fullName2'])
        
        "Step 4: Enter input value in input phoneNumber2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_phoneNumber2_1'), data['input_phoneNumber2'])
        
        "Step 5: Enter input value in input email2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_email2_1'), data['input_email2'])
        
        "Step 6: Click on input citizenId2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_citizenId2_1'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_amount2'] = testData.getValue('input_amount2', rowIndex)
        data['input_email2'] = testData.getValue('input_email2', rowIndex)
        data['input_fullName2'] = testData.getValue('input_fullName2', rowIndex)
        data['input_phoneNumber2'] = testData.getValue('input_phoneNumber2', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_amount2'] = 'default_data'
        data['input_email2'] = 'default_data'
        data['input_fullName2'] = 'default_data'
        data['input_phoneNumber2'] = 'default_data'
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

