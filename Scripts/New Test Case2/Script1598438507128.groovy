import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/img'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Admin'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_PIM'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Leave'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Time'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Recruitment'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_My Info'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Performance'))

assert true

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Directory'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Maintenance'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Buzz'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Welcome Linda'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_About'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

