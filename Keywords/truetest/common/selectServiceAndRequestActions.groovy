package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectServiceAndRequestActions {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input serviceSelection"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection', ['input_serviceSelection_inputPlaceholder': data['input_serviceSelection_inputPlaceholder']]))
        
        "Step 2: Click on item optionSelection"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection', ['item_optionSelection_id': data['item_optionSelection_id']]))
        
        "Step 3: Click on input serviceSelection"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/input_serviceSelection', ['input_serviceSelection_inputPlaceholder': data['input_serviceSelection_inputPlaceholder_1']]))
        
        "Step 4: Click on item optionSelection"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection', ['item_optionSelection_id': data['item_optionSelection_id_1']]))
        
        "Step 5: Click on button requestActions"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/button_requestActions', ['button_requestActions_internalHasText': data['button_requestActions_internalHasText']]))
        
        "Step 6: Click on input amount"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount'))
        
        "Step 7: Click on input amount"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_requestActions_internalHasText'] = testData.getValue('button_requestActions_internalHasText', rowIndex)
        data['input_serviceSelection_inputPlaceholder'] = testData.getValue('input_serviceSelection_inputPlaceholder', rowIndex)
        data['input_serviceSelection_inputPlaceholder_1'] = testData.getValue('input_serviceSelection_inputPlaceholder_1', rowIndex)
        data['item_optionSelection_id'] = testData.getValue('item_optionSelection_id', rowIndex)
        data['item_optionSelection_id_1'] = testData.getValue('item_optionSelection_id_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_requestActions_internalHasText'] = 'default_data'
        data['input_serviceSelection_inputPlaceholder'] = 'default_data'
        data['input_serviceSelection_inputPlaceholder_1'] = 'default_data'
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

