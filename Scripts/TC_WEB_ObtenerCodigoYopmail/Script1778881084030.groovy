// =====================
// IMPORTS
// =====================
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// =====================
// ABRIR YOPMAIL
// =====================
WebUI.openBrowser('')

WebUI.navigateToUrl('https://yopmail.com/es/')

// =====================
// ESCRIBIR CORREO
// =====================
WebUI.setText(
	findTestObject('Object Repository/12 YOPMAIL ALTA DE CAJA/txt_escribir correo'),
	'divethrodriguez1'
)

// =====================
// ENTRAR
// =====================
WebUI.click(
	findTestObject('Object Repository/12 YOPMAIL ALTA DE CAJA/bttn-entrar correo')
)

// =====================
// ESPERAR BANDEJA
// =====================
WebUI.waitForElementVisible(
	findTestObject('Object Repository/12 YOPMAIL ALTA DE CAJA/bttn-refresh'),
	15
)

// =====================
// REFRESCAR
// =====================
WebUI.click(
	findTestObject('Object Repository/12 YOPMAIL ALTA DE CAJA/bttn-refresh')
)

// =====================
// ABRIR PRIMER CORREO
// =====================
WebUI.click(
	findTestObject('Object Repository/12 YOPMAIL ALTA DE CAJA/iframe-Seleccionar primer correo')
)

// =====================
// ENTRAR AL IFRAME
// =====================
WebUI.switchToFrame(
	findTestObject('Object Repository/12 YOPMAIL ALTA DE CAJA/iframe_Undo_ifmail'),
	10
)

// =====================
// LEER BODY
// =====================
TestObject cuerpoCorreo = new TestObject().addProperty(
	"xpath",
	ConditionType.EQUALS,
	"//body"
)

WebUI.waitForElementPresent(cuerpoCorreo, 10)

String texto = WebUI.getText(cuerpoCorreo)

println(texto)

// =====================
// EXTRAER CODIGO
// =====================
def matcher = (texto =~ /\d{6}/)

String codigo = ""

if (matcher.find()) {

	codigo = matcher.group(0)

	println("✅ Código obtenido: " + codigo)

} else {

	WebUI.closeBrowser()

	assert false : "❌ No se encontró código en Yopmail"
}

// =====================
// CERRAR NAVEGADOR
// =====================
WebUI.closeBrowser()

// =====================
// RETORNAR CODIGO
// =====================
return codigo