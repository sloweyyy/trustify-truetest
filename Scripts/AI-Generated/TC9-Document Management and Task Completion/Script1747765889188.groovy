import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to signin"

TrueTestScripts.navigate("signin")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Enter input value in input password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dashboard/input_password'), input_password)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Enter input value in input password.png')

"Step 4: Click on span taiLieuChodXacNhan -> Navigate to page 'notary document management#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dashboard/span_taiLieuChodXacNhan'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on span taiLieuChodXacNhan - Navigate to page notary document management.png')

"Step 5: Click on item document"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/item_document'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on item document.png')

"Step 6: Click on span documentManagement (quanLyPhien) -> Navigate to page 'notary management#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_notary_document_management/span_documentManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_notary_document_management/span_documentManagement', ['span_documentManagement_liNthChild': span_documentManagement_liNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on span documentManagement quanLyPhien - Navigate to page notary management.png')

"Step 7: Click on button sloweyCongChung2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_management/button_sloweyCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on button sloweyCongChung2.png')

"Step 8: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_management/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on div backdrop.png')

"Step 9: Click on span lichSuCongChung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_management/span_lichSuCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on span lichSuCongChung.png')

"Step 10: Click on span dashboard -> Navigate to page '*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_management/span_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Click on span dashboard - Navigate to page dashboard.png')

"Step 11: Click on span dashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dashboard/span_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Click on span dashboard.png')

"Step 12: Click on span taiLieuChodXacNhan -> Navigate to page 'notary document management#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dashboard/span_taiLieuChodXacNhan'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Click on span taiLieuChodXacNhan - Navigate to page notary document management.png')

"Step 13: Click on div documentDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/div_documentDetails'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 13-Click on div documentDetails.png')

"Step 14: Click on button viewDetails (viewDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_notary_document_management/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_notary_document_management/button_viewDetails', ['button_viewDetails_nth': button_viewDetails_nth]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Click on button viewDetails viewDetails.png')

"Step 15: Click on textarea noteContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/textarea_noteContent2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 15-Click on textarea noteContent2.png')

"Step 16: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 16-Click on div backdrop.png')

"Step 17: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/html_object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 17-Click on html object.png')

"Step 18: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/html_object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 18-Click on html object.png')

"Step 19: Click on span dashboard -> Navigate to page '*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/span_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 19-Click on span dashboard - Navigate to page dashboard.png')

"Step 20: Click on div userDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dashboard/div_userDetails'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 20-Click on div userDetails.png')

"Step 21: Click on html dashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dashboard/html_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 21-Click on html dashboard.png')

"Step 22: Click on span taiLieuChodXacNhan -> Navigate to page 'notary document management#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dashboard/span_taiLieuChodXacNhan'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 22-Click on span taiLieuChodXacNhan - Navigate to page notary document management.png')

"Step 23: Click on button viewDetails (viewDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_notary_document_management/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_notary_document_management/button_viewDetails', ['button_viewDetails_nth': button_viewDetails_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 23-Click on button viewDetails viewDetails.png')

"Step 24: Click on textarea noteContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/textarea_noteContent3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 24-Click on textarea noteContent3.png')

"Step 25: Enter input value in textarea noteContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_notary_document_management/textarea_noteContent3'), textarea_noteContent3)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 25-Enter input value in textarea noteContent3.png')

"Step 26: Click on div uploadFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/div_uploadFile'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 26-Click on div uploadFile.png')

"Step 27: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 27-Click on button confirm.png')

"Step 28: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/html_object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 28-Click on html object.png')

"Step 29: Click on span resourceSignature"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/span_resourceSignature'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 29-Click on span resourceSignature.png')

"Step 30: Click on html documentManagement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/html_object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 30-Click on html documentManagement.png')

"Step 31: Click on button viewDetails (viewDetails2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_notary_document_management/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_notary_document_management/button_viewDetails', ['button_viewDetails_nth': button_viewDetails_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 31-Click on button viewDetails viewDetails2.png')

"Step 32: Click on p documentName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/p_documentName'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 32-Click on p documentName.png')

"Step 33: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 33-Click on div backdrop.png')

"Step 34: Click on button viewDetails (viewDetails3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_notary_document_management/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_notary_document_management/button_viewDetails', ['button_viewDetails_nth': button_viewDetails_nth_3]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 34-Click on button viewDetails viewDetails3.png')

"Step 35: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 35-Click on div backdrop.png')

"Step 36: Click on button xemChiTiet2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/button_xemChiTiet2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 36-Click on button xemChiTiet2.png')

"Step 37: Click on p originalDocument"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/p_originalDocument'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 37-Click on p originalDocument.png')

"Step 38: Click on button confirm2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/button_confirm2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 38-Click on button confirm2.png')

"Step 39: Click on html documentManagement2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/html_object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 39-Click on html documentManagement2.png')

"Step 40: Click on html documentManagement2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/html_object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 40-Click on html documentManagement2.png')

"Step 41: Click on span documentManagement (publicServiceHistory) -> Navigate to page 'notary management#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_notary_document_management/span_documentManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_notary_document_management/span_documentManagement', ['span_documentManagement_liNthChild': span_documentManagement_liNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 41-Click on span documentManagement publicServiceHistory - Navigate to page notary management.png')

"Step 42: Click on button taskCompletion (completeTask)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_notary_management/button_taskCompletion"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_notary_management/button_taskCompletion', ['button_taskCompletion_buttonNthChild': button_taskCompletion_buttonNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 42-Click on button taskCompletion completeTask.png')

"Step 43: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_management/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 43-Click on div backdrop.png')

"Step 44: Click on button taskCompletion (completeTask2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_notary_management/button_taskCompletion"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_notary_management/button_taskCompletion', ['button_taskCompletion_buttonNthChild': button_taskCompletion_buttonNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 44-Click on button taskCompletion completeTask2.png')

"Step 45: Click on div backdrop -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_management/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 45-Click on div backdrop - Navigate to page .png')

"Step 46: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Document Management and Task Completion_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}