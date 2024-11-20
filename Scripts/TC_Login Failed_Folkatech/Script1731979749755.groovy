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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'---- Declare Data File ----'
GlobalVariable.currentDataFile = findTestData('Folkatech/FolkatechWeb')
//
TestData dataFile = GlobalVariable.currentDataFile
//
def index = 2

// Mendapatkan data dari file
String username = dataFile.getValue('Username', index)
String encryptedPassword = dataFile.getValue('Password', index)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://lapor.folkatech.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Login/button_Sign in'))

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login/label_Email harus diisi'), '* Email harus diisi.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login/label_Kata Sandi harus diisi'), '* Kata Sandi harus diisi.')

WebUI.click(findTestObject('Object Repository/Page_Login/input_Email_email'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email_email'), username)

WebUI.click(findTestObject('Object Repository/Page_Login/input_Password_password'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password_password'), encryptedPassword)

WebUI.click(findTestObject('Object Repository/Page_Login/button_Sign in'))
