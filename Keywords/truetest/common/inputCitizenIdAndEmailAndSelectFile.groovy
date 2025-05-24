package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class inputCitizenIdAndEmailAndSelectFile {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Enter input value in input citizenId4"
        
        WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_citizenId4'), data['input_citizenId4'])
        
        "Step 2: Click on input email3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_email3'))
        
        "Step 3: Enter input value in input email3"
        
        WebUI.setText(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_email3'), data['input_email3'])
        
        "Step 4: Click on label fileSelection"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/label_fileSelection', ['label_fileSelection_nth': data['label_fileSelection_nth']]))
        
        "Step 5: Click on item selectFromMachine"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/item_selectFromMachine'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_citizenId4'] = testData.getValue('input_citizenId4', rowIndex)
        data['input_email3'] = testData.getValue('input_email3', rowIndex)
        data['label_fileSelection_nth'] = testData.getValue('label_fileSelection_nth', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_citizenId4'] = 'default_data'
        data['input_email3'] = 'default_data'
        data['label_fileSelection_nth'] = 'default_data'
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

