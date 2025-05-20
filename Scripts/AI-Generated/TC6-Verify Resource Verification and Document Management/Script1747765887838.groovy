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

"Step 3: Click on item resourceVerification -> Navigate to page 'notary document management#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dashboard/item_resourceVerification'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on item resourceVerification - Navigate to page notary document management.png')

"Step 4: Click on span infoIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/span_infoIcon'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on span infoIcon.png')

"Step 5: Click on div identityDocument"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/div_identityDocument'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on div identityDocument.png')

"Step 6: Click on p identityDocument"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/p_identityDocument'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on p identityDocument.png')

"Step 7: Click on textarea noteContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/textarea_noteContent'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on textarea noteContent.png')

"Step 8: Click on textarea noteContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/textarea_noteContent'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on textarea noteContent.png')

"Step 9: Enter input value in textarea noteContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_notary_document_management/textarea_noteContent'), textarea_noteContent)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Enter input value in textarea noteContent.png')

"Step 10: Click on div fileUploadInstructions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/div_fileUploadInstructions'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Click on div fileUploadInstructions.png')

"Step 11: Click on button fileUpload"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/button_fileUpload'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11-Click on button fileUpload.png')

"Step 12: Click on textarea noteContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/textarea_noteContent'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 12-Click on textarea noteContent.png')

"Step 13: Click on textarea noteContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/textarea_noteContent'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 13-Click on textarea noteContent.png')

"Step 14: Enter input value in textarea noteContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_notary_document_management/textarea_noteContent'), textarea_noteContent_1)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 14-Enter input value in textarea noteContent.png')

"Step 15: Click on div emptyInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/div_emptyInput'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 15-Click on div emptyInput.png')

"Step 16: Enter input value in textarea noteContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_notary_document_management/textarea_noteContent'), textarea_noteContent_2)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 16-Enter input value in textarea noteContent.png')

"Step 17: Click on button fileUpload2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/button_fileUpload'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 17-Click on button fileUpload2.png')

"Step 18: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 18-Click on button confirm.png')

"Step 19: Click on span resourceSignature"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/span_resourceSignature'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 19-Click on span resourceSignature.png')

"Step 20: Click on div signatureIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/div_signatureIcon'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 20-Click on div signatureIcon.png')

"Step 21: Click on button xemChiTiet2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/button_xemChiTiet2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 21-Click on button xemChiTiet2.png')

"Step 22: Click on image signature"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/image_signature'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 22-Click on image signature.png')

"Step 23: Click on button confirm2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/button_confirm2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 23-Click on button confirm2.png')

"Step 24: Click on div confirmationModal"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/div_confirmationModal'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 24-Click on div confirmationModal.png')

"Step 25: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_document_management/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 25-Click on div backdrop.png')

"Step 26: Click on span documentManagement (quanLyPhien) -> Navigate to page 'notary management#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_notary_document_management/span_documentManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_notary_document_management/span_documentManagement', ['span_documentManagement_liNthChild': span_documentManagement_liNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 26-Click on span documentManagement quanLyPhien - Navigate to page notary management.png')

"Step 27: Click on button sloweyCongChung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_management/button_sloweyCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 27-Click on button sloweyCongChung.png')

"Step 28: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_management/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 28-Click on div backdrop.png')

"Step 29: Click on button sloweyCongChung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_management/button_sloweyCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 29-Click on button sloweyCongChung.png')

"Step 30: Click on textarea noiDungGhiChu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_management/textarea_noiDungGhiChu'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 30-Click on textarea noiDungGhiChu.png')

"Step 31: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_management/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 31-Click on div backdrop.png')

"Step 32: Click on span lichSuCongChung -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notary_management/span_lichSuCongChung'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 32-Click on span lichSuCongChung - Navigate to page .png')

"Step 33: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Verify Resource Verification and Document Management_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}