package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectNotaryAndPublicService {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input selectNotaryService"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_selectNotaryService'))
        
        "Step 2: Click on item optionSelection"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection', ['item_optionSelection_id': data['item_optionSelection_id']]))
        
        "Step 3: Click on input selectPublicService"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_selectPublicService'))
        
        "Step 4: Click on item optionSelection"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_create_notarization_profile/item_optionSelection', ['item_optionSelection_id': data['item_optionSelection_id_1']]))
        
        "Step 5: Click on button continue4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/button_continue4'))
        
        "Step 6: Click on input amount3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_create_notarization_profile/input_amount3'))
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

