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

WebUI.navigateToUrl('https://www.eobuwie.com.pl/')

WebUI.click(findTestObject('Object Repository/Page_Modne buty damskie, mskie, dziecice or_731cfb/button_Akceptuj'))

WebUI.click(findTestObject('Object Repository/Page_Modne buty damskie, mskie, dziecice or_731cfb/a_Zarejestruj'))

WebUI.setText(findTestObject('Object Repository/Page_Utwrz nowe konto klienta  eobuwie.pl/input_Za nowe konto_firstname'), 
    Imie)

WebUI.setText(findTestObject('Object Repository/Page_Utwrz nowe konto klienta  eobuwie.pl/input_Imi_lastname'), Nazwisko)

WebUI.setText(findTestObject('Object Repository/Page_Utwrz nowe konto klienta  eobuwie.pl/input_Nazwisko_email'), Email)

WebUI.setText(findTestObject('Object Repository/Page_Utwrz nowe konto klienta  eobuwie.pl/input_Adres e-mail_password'), 
    Haslo)

WebUI.setText(findTestObject('Object Repository/Page_Utwrz nowe konto klienta  eobuwie.pl/input_Haso_confirmation'), ReHaslo)

WebUI.click(findTestObject('Object Repository/Page_Utwrz nowe konto klienta  eobuwie.pl/svg'))

WebUI.click(findTestObject('Object Repository/Page_Utwrz nowe konto klienta  eobuwie.pl/svg_1'))

WebUI.click(findTestObject('Object Repository/Page_Utwrz nowe konto klienta  eobuwie.pl/button_Za nowe konto'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Moje konto  eobuwie.pl/a_Zarzdzaj adresami'))

