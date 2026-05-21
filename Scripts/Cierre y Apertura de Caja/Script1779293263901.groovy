// =====================
// IMPORTS
// =====================
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// =====================
// 1. INICIAR APP
// =====================
Mobile.startExistingApplication('lat.brio.brio3.quality')


// =====================
// 2. SWIPE MENU
// =====================
Mobile.swipe(0, 80, 0, 10)

// =====================
// 3. IR A CIERRE DE CAJA
// =====================
Mobile.tap(findTestObject('Object Repository/CierreCaja/menu-CierreCaja'), 0)

// =====================
// 3.3 CANCELAR Y VOLVER A ENTRAR
// =====================
Mobile.tap(findTestObject('Object Repository/CierreCaja/btn-CANCELAR'), 0)

Mobile.tap(findTestObject('Object Repository/CierreCaja/menu-CierreCaja'), 0)

// =====================
// 4. CIERRE DE CAJA
// =====================

// Esperar carga
WebUI.delay(2)

// Desplegar tipo cierre
Mobile.tap(findTestObject('Object Repository/CierreCaja/combo-TipoCierre'), 0)

WebUI.delay(2)

// Seleccionar Salida de dinero
Mobile.tap(findTestObject('Object Repository/CierreCaja/opcion-SalidaDinero'), 0)

WebUI.delay(3)

// Generar monto dinámico (ejemplo simple)
String montoCierre = "100.00"

// Ingresar monto
Mobile.setText(findTestObject('Object Repository/CierreCaja/txt-Monto'), montoCierre, 0)

// Seleccionar concepto
Mobile.tap(findTestObject('Object Repository/CierreCaja/combo-Concepto'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/CierreCaja/opcion-CierreCaja'), 0)

// Comentarios
Mobile.setText(findTestObject('Object Repository/CierreCaja/txt-Comentarios'), 'APROBADO', 0)

// Continuar
Mobile.tap(findTestObject('Object Repository/CierreCaja/btn-CONTINUAR'), 0)

WebUI.delay(2)

// Validar cierre exitoso
Mobile.verifyElementExist(findTestObject('Object Repository/CierreCaja/lbl-CierreExitoso'), 10)

Mobile.tap(findTestObject('Object Repository/CierreCaja/btn-ACEPTAR'), 0)


// =====================
// 5. APERTURA DE CAJA
// =====================

// Login otra vez
Mobile.setText(findTestObject('Object Repository/AperturaCaja/txt-Comercio'), 'TU_COMERCIO', 0)
Mobile.setText(findTestObject('Object Repository/AperturaCaja/txt-Usuario'), 'Berali8428#QA', 0)
Mobile.setText(findTestObject('Object Repository/AperturaCaja/txt-Password'), 'U65hxl', 0)

Mobile.tap(findTestObject('Object Repository/AperturaCaja/btn-INGRESAR'), 0)

WebUI.delay(15)

// Tipo apertura
Mobile.tap(findTestObject('Object Repository/AperturaCaja/combo-Tipo'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/AperturaCaja/opcion-EntradaDinero'), 0)

// Monto dinámico
String montoApertura = "200"

// Ingresar monto
Mobile.setText(findTestObject('Object Repository/AperturaCaja/txt-Monto'), montoApertura, 0)

// Concepto
Mobile.tap(findTestObject('Object Repository/AperturaCaja/combo-Concepto'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/AperturaCaja/opcion-AperturaCaja'), 0)

// Comentarios
Mobile.setText(findTestObject('Object Repository/AperturaCaja/txt-Comentarios'), 'APROBADO', 0)

// Continuar
Mobile.tap(findTestObject('Object Repository/AperturaCaja/btn-CONTINUAR'), 0)

WebUI.delay(10)


// =====================
// 6. VALIDAR VENTAS
// =====================
Mobile.verifyElementExist(findTestObject('Object Repository/Ventas/lbl-Ventas'), 10)


// =====================
// 7. VALIDAR EFECTIVO FINAL
// =====================
Mobile.tap(findTestObject('Object Repository/Ventas/icono-Comercio'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Ventas/lbl-EfectivoCaja'), 10)

Mobile.tap(findTestObject('Object Repository/Ventas/btn-Cerrar'), 0)


// =====================
// FIN
// =====================
Mobile.closeApplication()
