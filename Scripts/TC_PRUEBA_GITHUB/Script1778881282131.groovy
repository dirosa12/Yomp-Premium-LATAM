//comentarios de prueba github 123
// =====================
// IMPORTS
// =====================
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// =====================
// 1. INICIAR APP
// =====================
Mobile.startExistingApplication('lat.brio.brio3.quality')

// =====================
// 2. PERMISOS
// =====================
Mobile.tap(findTestObject('Object Repository/00 PERMISOS/btn-PERMITIR'), 0)
Mobile.tap(findTestObject('Object Repository/00 PERMISOS/btn-PERMITIR'), 0)
Mobile.tap(findTestObject('Object Repository/00 PERMISOS/btn-PERMITIR'), 0)

// =====================
// 3. FLUJO INICIAL
// =====================
Mobile.tap(findTestObject('Object Repository/01 ALTA DE BODEGA/04 Elige País/txtbx-paises'), 0)

Mobile.tap(findTestObject('Object Repository/01 ALTA DE BODEGA/05 ComboBox Paises/bttn-Peru2'), 0)

Mobile.tap(findTestObject('Object Repository/01 ALTA DE BODEGA/04 Elige País/btn-CONTINUAR'), 0)

Mobile.tap(findTestObject('Object Repository/01 ALTA DE BODEGA/06 Act Teclado Pant/btn-ACEPTAR2'), 0)

Mobile.tap(findTestObject('Object Repository/01 ALTA DE BODEGA/07 Cambiar el Teclado/rbtn-Espanol Espana'), 0)

Mobile.tap(findTestObject('Object Repository/01 ALTA DE BODEGA/08 Menu Inicial de Opciones/btn-REGISTRAR'), 0)

// =====================
// 4. LOGIN
// =====================
Mobile.setText(
    findTestObject('Object Repository/02_NUEVA_CAJA/01 Inicio Nueva Caja/txt-Comercio'),
    '206889',
    0
)

Mobile.hideKeyboard()

Mobile.setText(
    findTestObject('Object Repository/02_NUEVA_CAJA/01 Inicio Nueva Caja/txtbx-Usuario'),
    'qayomp123',
    0
)

Mobile.hideKeyboard()

Mobile.setText(
    findTestObject('Object Repository/02_NUEVA_CAJA/01 Inicio Nueva Caja/txtbx-Contrasena'),
    'QAYomp!123',
    0
)

Mobile.hideKeyboard()

Mobile.tap(
    findTestObject('Object Repository/02_NUEVA_CAJA/01 Inicio Nueva Caja/btn-INGRESAR'),
    0
)

// =====================
// 5. ESPERAR OTP MANUAL
// =====================

// Espera a que cargue pantalla del OTP
Mobile.waitForElementPresent(
    findTestObject('Object Repository/02_NUEVA_CAJA/02 Nueva Caja - Clave de Seguridad/txtbx-Clave de Seguridad'),
    30
)

println("⚠️ Ingresa el código OTP manualmente en la app (tienes 60 segundos)...")

// Tiempo para que escribas el código en el celular
WebUI.delay(60)

// =====================
// 6. CONTINUAR FLUJO
// =====================
Mobile.tap(
    findTestObject('Object Repository/02_NUEVA_CAJA/02 Nueva Caja - Clave de Seguridad/btn-INGRESAR'),
    0
)

Mobile.tap(
    findTestObject('Object Repository/02_NUEVA_CAJA/03 Mensaje Alta de Caja Exitoso/btn-ACEPTAR'),
    0
)

// =====================
// 7. LOGIN FINAL
// =====================
Mobile.setText(
    findTestObject('Object Repository/03 PANTALLA DE LOGIN/01 Bienvenido a tu Negocio/txtbx-Usuario'),
    'qayomp123',
    0
)

Mobile.hideKeyboard()

Mobile.setText(
    findTestObject('Object Repository/03 PANTALLA DE LOGIN/01 Bienvenido a tu Negocio/txtbx-Contrasena'),
    'QAYomp!123',
    0
)

Mobile.hideKeyboard()

Mobile.tap(
    findTestObject('Object Repository/03 PANTALLA DE LOGIN/01 Bienvenido a tu Negocio/btn-INGRESAR'),
    0
)

// =====================
// FIN
// =====================



