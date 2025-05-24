package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectMultipleServices {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/div_object'))
        
        "Step 2: Click on input selectService"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_selectService'))
        
        "Step 3: Click on item optionSelection"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection', ['item_optionSelection_id': data['item_optionSelection_id']]))
        
        "Step 4: Click on input selectService2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_selectService2'))
        
        "Step 5: Click on item optionSelection"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection', ['item_optionSelection_id': data['item_optionSelection_id_1']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['item_optionSelection_id'] = testData.getValue('item_optionSelection_id', rowIndex)
        data['item_optionSelection_id_1'] = testData.getValue('item_optionSelection_id_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['item_optionSelection_id'] = 'default_data'
        data['item_optionSelection_id_1'] = 'default_data'
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

