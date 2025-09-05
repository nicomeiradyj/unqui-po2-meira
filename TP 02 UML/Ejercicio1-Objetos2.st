!classDefinition: #Ejercicio1Test category: #'Ejercicio1-Objetos2'!
TestCase subclass: #Ejercicio1Test
	instanceVariableNames: ''
	classVariableNames: ''
	poolDictionaries: ''
	category: 'Ejercicio1-Objetos2'!

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/20/2025 15:09:20'!
test001_seCreaUnEmpleadoDeNombreJuan
	
	| empleado1 |
	empleado1 := Empleado inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000.
	
	Assert that: empleado1 nombre isEqualTo: 'Juan'. 
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/20/2025 15:09:53'!
test002_seCreaUnEmpleadoDeNombreJuanQueViveEnSuipacha123
	
	| empleado1 |
	empleado1 := Empleado inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000.
	
	Assert that: empleado1 direccion isEqualTo: 'Suipacha 123'. 
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/20/2025 15:10:29'!
test003_seCreaUnEmpleadoDeNombreJuanQueViveEnSuipacha123YEsSoltero
	
	| empleado1 |
	empleado1 := Empleado inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000.
	
	Assert that: empleado1 estadoCivil isEqualTo: 'Soltero'. 
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 9/5/2025 08:55:01'!
test004_seCreaUnEmpleadoDeNombreJuanQueTiene25Años
	
	| empleado1 |
	empleado1 := Empleado inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' edad: 25 ySueldoBasico: 500000.
	
	Assert that: empleado1 edad isEqualTo: 25. 
	
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/20/2025 15:14:43'!
test005_seCreaUnEmpleadoDeNombreJuanQueCobra500000
	
	| empleado1 |
	empleado1 := Empleado inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000.
	
	Assert that: empleado1 sueldoBasico isEqualTo: 500000. 
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/20/2025 15:23:19'!
test006_seCreaUnEmpleadoPermanenteDeNombreJuanQueTiene2Hijos
	
	| empleado1 |
	empleado1 := EmpleadoPermanente inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000 conHijos: 2 conAntiguedad: 13.
	
	Assert that: empleado1 hijos isEqualTo: 2. 
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/20/2025 15:23:43'!
test007_seCreaUnEmpleadoPermanenteDeNombreJuanQueTiene13AñosDeAntiguedad
	
	| empleado1 |
	empleado1 := EmpleadoPermanente inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000 conHijos: 2 conAntiguedad: 13.
	
	Assert that: empleado1 antiguedad isEqualTo: 13. 
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/20/2025 15:33:25'!
test008_seCreaUnEmpleadoTemporarioDeNombreJuanQueTieneFechaDeFinDeDesignacion
	
	| empleado1 |
	empleado1 := EmpleadoTemporario inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000 fechaDeFinDeDesignacion: July/20/2026 conHorasExtras: 16.
	
	Assert that: empleado1 horasExtras isEqualTo: 16. 
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/20/2025 15:33:37'!
test009_seCreaUnEmpleadoTemporarioDeNombreJuanQueTiene16HorasExtras
	
	| empleado1 |
	empleado1 := EmpleadoTemporario inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000 fechaDeFinDeDesignacion: July/20/2026 conHorasExtras: 16.
	
	Assert that: empleado1 horasExtras isEqualTo: 16. 
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/20/2025 15:46:49'!
test010_seVerificaQueUnEmpleadoPermanenteCobreDeSueldoBruto
	
	| empleado1 |
	empleado1 := EmpleadoPermanente inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000 conHijos: 2 conAntiguedad: 3.
	
	Assert that: empleado1 sueldoBruto isEqualTo: 500450. 
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/20/2025 16:14:19'!
test011_seVerificaQueUnEmpleadoPermanenteTengaRetenciones
	
	| empleado1 |
	empleado1 := EmpleadoPermanente inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000 conHijos: 2 conAntiguedad: 3.
	
	Assert that: empleado1 retenciones isEqualTo: 125152.5. 
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/20/2025 16:16:00'!
test012_seVerificaQueUnEmpleadoPermanenteTengaSueldoNeto
	
	| empleado1 |
	empleado1 := EmpleadoPermanente inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000 conHijos: 2 conAntiguedad: 3.
	
	Assert that: empleado1 sueldoNeto isEqualTo: 375297.5. 
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/20/2025 16:19:25'!
test013_seVerificaQueUnEmpleadoTemporarioCobreSueldoBruto
	
	| empleado1 |
	empleado1 := EmpleadoTemporario inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000 fechaDeFinDeDesignacion: July/20/2026 conHorasExtras: 16.
	
	Assert that: empleado1 sueldoBruto isEqualTo: 500640. 
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 9/5/2025 09:00:05'!
test014_seVerificaQueAUnEmpleadoTemporarioSeLeCobreRetenciones
	
	| empleado1 |
	empleado1 := EmpleadoTemporario inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' edad: 25 ySueldoBasico: 500000 fechaDeFinDeDesignacion: July/20/2026 conHorasExtras: 16.
	
	Assert that: empleado1 retenciones isEqualTo: 100208. 
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 9/5/2025 09:00:37'!
test015_seVerificaQueUnEmpleadoTemporarioCobreSueldoNeto
	
	| empleado1 |
	empleado1 := EmpleadoTemporario inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' edad: 23 ySueldoBasico: 500000 fechaDeFinDeDesignacion: July/20/2026 conHorasExtras: 16.
	
	Assert that: empleado1 sueldoNeto isEqualTo: 400432. 
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/21/2025 09:17:16'!
test016_seCreaUnaEmpresaConUnNombre
	
	| empresa1 |
	empresa1 := Empresa inicializarEmpresaConNombre: 'El Halcon' conCUIT: 123456.
	
	Assert that: empresa1 nombre isEqualTo: 'El Halcon'.
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/21/2025 09:18:50'!
test017_seCreaUnaEmpresaConUnCUIT
	
	| empresa1 |
	empresa1 := Empresa inicializarEmpresaConNombre: 'El Halcon' conCUIT: 123456.
	
	Assert that: empresa1 cuit isEqualTo: 123456.
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/21/2025 09:25:35'!
test018_seCreaUnaEmpresaYSeLeAgreganEmpleados
	
	| empresa1 empleado1 empleado2|
	empresa1 := Empresa inicializarEmpresaConNombre: 'El Halcon' conCUIT: 123456.
	empleado1 := EmpleadoPermanente inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000 conHijos: 2 conAntiguedad: 3.
	empleado2 := EmpleadoPermanente inicializarEmpleadoConNombre: 'Marcos' direccion: 'Suipacha 124' estadoCivil: 'Casado' fechaDeNacimiento: May/14/1990 ySueldoBasico: 700000 conHijos: 1 conAntiguedad: 14.
	
	empresa1 agregarEmpleado: empleado1.
	empresa1 agregarEmpleado: empleado2.
	
	Assert that: empresa1 empleados isEqualTo: {empleado1 . empleado2} asOrderedCollection.
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/21/2025 09:28:44'!
test019_seCreaUnaEmpresa_SeLeAgreganEmpleadosYSeVerificaSusSueldosNetos
	
	| empresa1 empleado1 empleado2|
	empresa1 := Empresa inicializarEmpresaConNombre: 'El Halcon' conCUIT: 123456.
	empleado1 := EmpleadoPermanente inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000 conHijos: 2 conAntiguedad: 3.
	empleado2 := EmpleadoPermanente inicializarEmpleadoConNombre: 'Marcos' direccion: 'Suipacha 124' estadoCivil: 'Casado' fechaDeNacimiento: May/14/1990 ySueldoBasico: 700000 conHijos: 1 conAntiguedad: 14.
	
	empresa1 agregarEmpleado: empleado1.
	empresa1 agregarEmpleado: empleado2.
	
	Assert that: empresa1 totalSueldosNetos isEqualTo: 900990.
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/21/2025 09:29:53'!
test020_seCreaUnaEmpresa_SeLeAgreganEmpleadosYSeVerificaSusSueldosBrutos
	
	| empresa1 empleado1 empleado2|
	empresa1 := Empresa inicializarEmpresaConNombre: 'El Halcon' conCUIT: 123456.
	empleado1 := EmpleadoPermanente inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000 conHijos: 2 conAntiguedad: 3.
	empleado2 := EmpleadoPermanente inicializarEmpleadoConNombre: 'Marcos' direccion: 'Suipacha 124' estadoCivil: 'Casado' fechaDeNacimiento: May/14/1990 ySueldoBasico: 700000 conHijos: 1 conAntiguedad: 14.
	
	empresa1 agregarEmpleado: empleado1.
	empresa1 agregarEmpleado: empleado2.
	
	Assert that: empresa1 totalSueldosBrutos isEqualTo: 1201400.
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/21/2025 09:31:24'!
test021_seCreaUnaEmpresa_SeLeAgreganEmpleadosYSeVerificaSusRetenciones
	
	| empresa1 empleado1 empleado2|
	empresa1 := Empresa inicializarEmpresaConNombre: 'El Halcon' conCUIT: 123456.
	empleado1 := EmpleadoPermanente inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000 conHijos: 2 conAntiguedad: 3.
	empleado2 := EmpleadoPermanente inicializarEmpleadoConNombre: 'Marcos' direccion: 'Suipacha 124' estadoCivil: 'Casado' fechaDeNacimiento: May/14/1990 ySueldoBasico: 700000 conHijos: 1 conAntiguedad: 14.
	
	empresa1 agregarEmpleado: empleado1.
	empresa1 agregarEmpleado: empleado2.
	
	Assert that: empresa1 totalRetenciones isEqualTo: 300410.
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/24/2025 10:38:28'!
test022_seRealizaUnaLiquidacionDeSueldosEnLaEmpresa
	
	| empresa1 empleado1 empleado2 empleado3 |
	empresa1 := Empresa inicializarEmpresaConNombre: 'El Halcon' conCUIT: 123456.
	empleado1 := EmpleadoPermanente inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000 conHijos: 2 conAntiguedad: 3.
	empleado2 := EmpleadoPermanente inicializarEmpleadoConNombre: 'Marcos' direccion: 'Suipacha 124' estadoCivil: 'Casado' fechaDeNacimiento: May/14/1990 ySueldoBasico: 700000 conHijos: 1 conAntiguedad: 14.
	empleado3 := EmpleadoPermanente inicializarEmpleadoConNombre: 'Nico' direccion: 'Suipacha 124' estadoCivil: 'Casado' fechaDeNacimiento: May/14/1990 ySueldoBasico: 700000 conHijos: 1 conAntiguedad: 14.
	
	empresa1 agregarEmpleado: empleado1.
	empresa1 agregarEmpleado: empleado2.
	empresa1 agregarEmpleado: empleado3.
	
	empresa1 realizarUnaLiquidacionDeSueldosConRecibo.
	
	Assert that: (empresa1 recibos) size isEqualTo: 3.
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/27/2025 09:39:55'!
test023_unReciboDeHaberesGuardaConceptosCorrectamente

	| recibo concepto1 concepto2 empleado|
	empleado := EmpleadoPermanente inicializarEmpleadoConNombre: 'Test' direccion: 'Calle Falsa 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/1/2000 ySueldoBasico: 100000 conHijos: 0 conAntiguedad: 0.
	recibo := ReciboDeHaberes reciboPara: empleado.
	concepto1 := ConceptoRecibo inicializarConDescripcion: 'Sueldo Básico' monto: 100000.
	concepto2 := ConceptoRecibo inicializarConDescripcion: 'Descuento Jubilatorio' monto: -5000.
	
	recibo agregarConcepto: concepto1.
	recibo agregarConcepto: concepto2.
	
	Assert that: (recibo conceptosRecibos) size isEqualTo: 2.
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/27/2025 09:44:56'!
test024_seCreaUnEmpleadoContratadoDeNombreJuan
	
	| empleado |
	empleado := EmpleadoContratado inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000 nroDeContrato: 5 conMedioDePago: 'Cheque'.
	
	Assert that: empleado nroDeContrato isEqualTo: 5. 
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/27/2025 09:50:49'!
test024_seVerificaQueElSueldoBrutoDeUnEmpleadoContratadoEsIgualASuSueldoBasico
	
	| empleado |
	empleado := EmpleadoContratado inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000 nroDeContrato: 5 conMedioDePago: 'Cheque'.
	
	Assert that: empleado sueldoBruto isEqualTo: 500000. 
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/27/2025 09:51:42'!
test025_seVerificaQueLasRetencionesDeUnEmpleadoContratadoSonDe50Pesos
	
	| empleado |
	empleado := EmpleadoContratado inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000 nroDeContrato: 5 conMedioDePago: 'Cheque'.
	
	Assert that: empleado retenciones isEqualTo: 50. 
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 9/5/2025 09:07:42'!
test026_seVerificaQueElSueldoNetoDeUnEmpleadoContratadoEsIgualASuSueldoBrutoMenosLasRetenciones
	
	| empleado |
	empleado := EmpleadoContratado inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000 nroDeContrato: 5 conMedioDePago: 'Cheque'.
	
	Assert that: empleado sueldoNeto isEqualTo: 499950. 
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 9/5/2025 09:10:14'!
test027_seCreaUnaEmpresa_SeLeAgreganDosEmpleadoContratados_YSeVerificaElTotalDeSueldosNetos
	
	| empresa1 empleado1 empleado2|
	empresa1 := Empresa inicializarEmpresaConNombre: 'El Halcon' conCUIT: 123456.
	empleado1 := EmpleadoContratado inicializarEmpleadoConNombre: 'Marcos' direccion: 'Suipacha 124' estadoCivil: 'Casado' fechaDeNacimiento: May/14/1990 ySueldoBasico: 800000 nroDeContrato: 1 conMedioDePago: 'Efectivo'.
	empleado2 := EmpleadoContratado inicializarEmpleadoConNombre: 'Jorge' direccion: 'Suipacha 129' estadoCivil: 'Soletero' fechaDeNacimiento: May/14/1980 ySueldoBasico: 950000 nroDeContrato: 1 conMedioDePago: 'Transferencia'.
	
	empresa1 agregarEmpleado: empleado1.
	empresa1 agregarEmpleado: empleado2.
	
	Assert that: empresa1 totalSueldosNetos isEqualTo: 1749900.
	! !

!Ejercicio1Test methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/29/2025 20:36:50'!
test028_seRealizaUnaLiquidacionDeSueldosEnLaEmpresaCon2EmpleadosPermanentesYUnoContratado
	
	| empresa1 empleado1 empleado2 empleado3 |
	empresa1 := Empresa inicializarEmpresaConNombre: 'El Halcon' conCUIT: 123456.
	empleado1 := EmpleadoPermanente inicializarEmpleadoConNombre: 'Juan' direccion: 'Suipacha 123' estadoCivil: 'Soltero' fechaDeNacimiento: June/26/2000 ySueldoBasico: 500000 conHijos: 2 conAntiguedad: 3.
	empleado2 := EmpleadoPermanente inicializarEmpleadoConNombre: 'Marcos' direccion: 'Suipacha 124' estadoCivil: 'Casado' fechaDeNacimiento: May/14/1990 ySueldoBasico: 700000 conHijos: 1 conAntiguedad: 14.
	empleado3 := EmpleadoContratado inicializarEmpleadoConNombre: 'Nico' direccion: 'Suipacha 124' estadoCivil: 'Casado' fechaDeNacimiento: May/14/1990 ySueldoBasico: 700000 nroDeContrato: 1 conMedioDePago: 14.
	
	empresa1 agregarEmpleado: empleado1.
	empresa1 agregarEmpleado: empleado2.
	empresa1 agregarEmpleado: empleado3.
	
	empresa1 realizarUnaLiquidacionDeSueldosConRecibo.
	
	Assert that: (empresa1 recibos) size isEqualTo: 3.
	! !


!classDefinition: #ConceptoRecibo category: #'Ejercicio1-Objetos2'!
Object subclass: #ConceptoRecibo
	instanceVariableNames: 'descripcion monto'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'Ejercicio1-Objetos2'!

!ConceptoRecibo methodsFor: 'initialization' stamp: 'NMDGA 8/27/2025 09:19:38'!
initializeInicializarConDescripcion: unaDescripcion monto: unMonto 
	
	descripcion := unaDescripcion.
	monto := unMonto.! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'ConceptoRecibo class' category: #'Ejercicio1-Objetos2'!
ConceptoRecibo class
	instanceVariableNames: ''!

!ConceptoRecibo class methodsFor: 'instance creation' stamp: 'NMDGA 8/27/2025 09:19:30'!
inicializarConDescripcion: unaDescripcion monto: unMonto 
	
	^self new initializeInicializarConDescripcion: unaDescripcion monto: unMonto ! !


!classDefinition: #Empleado category: #'Ejercicio1-Objetos2'!
Object subclass: #Empleado
	instanceVariableNames: 'nombre direccion estadoCivil fechaDeNacimiento sueldoBasico reciboDeSueldo edad'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'Ejercicio1-Objetos2'!

!Empleado methodsFor: 'initialization' stamp: 'NMDGA 8/20/2025 15:09:59'!
direccion
	
	^direccion! !

!Empleado methodsFor: 'initialization' stamp: 'NMDGA 9/5/2025 08:50:38'!
edad
	  ^edad! !

!Empleado methodsFor: 'initialization' stamp: 'NMDGA 8/20/2025 15:10:36'!
estadoCivil
	
	^estadoCivil! !

!Empleado methodsFor: 'initialization' stamp: 'NMDGA 9/5/2025 08:55:48'!
initializeInicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil edad: unaEdad ySueldoBasico: unSueldoBasico 
	
	nombre := unNombre.
	direccion := unaDireccion.
	estadoCivil := unEstadoCivil.
	edad := unaEdad.
	sueldoBasico := unSueldoBasico.! !

!Empleado methodsFor: 'initialization' stamp: 'NMDGA 8/21/2025 16:39:41'!
initializeInicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento ySueldoBasico: unSueldoBasico 
	
	nombre := unNombre.
	direccion := unaDireccion.
	estadoCivil := unEstadoCivil.
	fechaDeNacimiento := unaFechaDeNacimiento.
	sueldoBasico := unSueldoBasico.
	reciboDeSueldo := 0.! !

!Empleado methodsFor: 'initialization' stamp: 'NMDGA 8/20/2025 15:09:26'!
nombre
	
	^nombre! !

!Empleado methodsFor: 'initialization' stamp: 'NMDGA 8/21/2025 16:38:53'!
otorgarReciboDeSueldo: unReciboDeSueldo 
	reciboDeSueldo := unReciboDeSueldo.! !

!Empleado methodsFor: 'initialization' stamp: 'NMDGA 8/21/2025 16:03:24'!
retenciones

	self subclassResponsibility! !

!Empleado methodsFor: 'initialization' stamp: 'NMDGA 8/20/2025 15:14:49'!
sueldoBasico
	
	^sueldoBasico! !

!Empleado methodsFor: 'initialization' stamp: 'NMDGA 8/21/2025 16:39:06'!
sueldoBruto

	self subclassResponsibility! !

!Empleado methodsFor: 'initialization' stamp: 'NMDGA 8/21/2025 16:39:14'!
sueldoNeto

	self subclassResponsibility! !


!Empleado methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/21/2025 16:40:18'!
reciboDeSueldo 
	^reciboDeSueldo ! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'Empleado class' category: #'Ejercicio1-Objetos2'!
Empleado class
	instanceVariableNames: ''!

!Empleado class methodsFor: 'instance creation' stamp: 'NMDGA 9/5/2025 08:55:33'!
inicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil edad: unaEdad ySueldoBasico: unSueldoBasico 
	
	^self new initializeInicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil edad: unaEdad ySueldoBasico: unSueldoBasico ! !

!Empleado class methodsFor: 'instance creation' stamp: 'NMDGA 8/20/2025 15:02:15'!
inicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento ySueldoBasico: unSueldoBasico 
	
	^self new initializeInicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento ySueldoBasico: unSueldoBasico ! !


!classDefinition: #EmpleadoContratado category: #'Ejercicio1-Objetos2'!
Empleado subclass: #EmpleadoContratado
	instanceVariableNames: 'nroDeContrato medioDePago'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'Ejercicio1-Objetos2'!

!EmpleadoContratado methodsFor: 'initialization' stamp: 'NMDGA 8/27/2025 09:46:47'!
initializeInicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento ySueldoBasico: unSueldoBasico nroDeContrato: unNroDeContrato conMedioDePago: unMedioDePago 
	
	nombre := unNombre.
	direccion := unaDireccion.
	estadoCivil := unEstadoCivil.
	fechaDeNacimiento := unaFechaDeNacimiento.
	sueldoBasico := unSueldoBasico.
	nroDeContrato := unNroDeContrato.
	medioDePago := unMedioDePago.! !

!EmpleadoContratado methodsFor: 'initialization' stamp: 'NMDGA 8/27/2025 09:46:53'!
nroDeContrato
	
	^nroDeContrato! !


!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/27/2025 09:52:14'!
retenciones
	^50! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/29/2025 20:32:25'!
sueldoBruto
	^sueldoBasico ! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/29/2025 20:29:50'!
sueldoNeto
	^(self sueldoBruto) - (self retenciones)! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'EmpleadoContratado class' category: #'Ejercicio1-Objetos2'!
EmpleadoContratado class
	instanceVariableNames: ''!

!EmpleadoContratado class methodsFor: 'instance creation' stamp: 'NMDGA 8/27/2025 09:46:33'!
inicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento ySueldoBasico: unSueldoBasico nroDeContrato: unNroDeContrato conMedioDePago: unMedioDePago 
	
	^self new initializeInicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento ySueldoBasico: unSueldoBasico nroDeContrato: unNroDeContrato conMedioDePago: unMedioDePago ! !


!classDefinition: #EmpleadoPermanente category: #'Ejercicio1-Objetos2'!
Empleado subclass: #EmpleadoPermanente
	instanceVariableNames: 'cantidadDeHijos_CHANGE_ME añosDeAntiguedad_CHANGE_ME hijos antiguedad'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'Ejercicio1-Objetos2'!

!EmpleadoPermanente methodsFor: 'initialization' stamp: 'NMDGA 8/20/2025 15:23:52'!
antiguedad
	
	^antiguedad! !

!EmpleadoPermanente methodsFor: 'initialization' stamp: 'NMDGA 8/20/2025 15:22:50'!
hijos
	
	^hijos! !

!EmpleadoPermanente methodsFor: 'initialization' stamp: 'NMDGA 9/5/2025 08:53:18'!
initializeInicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil edad: unaEdad ySueldoBasico: unSueldoBasico conHijos: cantidadDeHijos conAntiguedad: añosDeAntiguedad 
	
	nombre := unNombre.
	direccion := unaDireccion.
	estadoCivil := unEstadoCivil.
	edad := unaEdad.
	sueldoBasico := unSueldoBasico.
	hijos := cantidadDeHijos.
	antiguedad := añosDeAntiguedad.! !

!EmpleadoPermanente methodsFor: 'initialization' stamp: 'NMDGA 8/20/2025 15:22:41'!
initializeInicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento ySueldoBasico: unSueldoBasico conHijos: cantidadDeHijos conAntiguedad: añosDeAntiguedad 
	
	nombre := unNombre.
	direccion := unaDireccion.
	estadoCivil := unEstadoCivil.
	fechaDeNacimiento := unaFechaDeNacimiento.
	sueldoBasico := unSueldoBasico.
	hijos := cantidadDeHijos.
	antiguedad := añosDeAntiguedad.! !

!EmpleadoPermanente methodsFor: 'initialization' stamp: 'NMDGA 8/20/2025 16:10:58'!
retenciones
	|obraSocial jubilacion|
	obraSocial := (self sueldoBruto * 0.10) + (hijos * 20).
	jubilacion := (self sueldoBruto * 0.15).
	^obraSocial + jubilacion! !

!EmpleadoPermanente methodsFor: 'initialization' stamp: 'NMDGA 8/20/2025 15:44:47'!
sueldoBruto
	
	| salarioFamiliar |
	salarioFamiliar := (self hijos * 150).
	estadoCivil = 'Casado' ifTrue: [salarioFamiliar := salarioFamiliar + 100].
	salarioFamiliar := salarioFamiliar + (antiguedad * 50).
	^sueldoBasico + salarioFamiliar 
	
	
	! !

!EmpleadoPermanente methodsFor: 'initialization' stamp: 'NMDGA 8/29/2025 20:30:03'!
sueldoNeto
	^(self sueldoBruto) - (self retenciones)! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'EmpleadoPermanente class' category: #'Ejercicio1-Objetos2'!
EmpleadoPermanente class
	instanceVariableNames: ''!

!EmpleadoPermanente class methodsFor: 'instance creation' stamp: 'NMDGA 9/5/2025 08:52:51'!
inicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil edad: unaEdad ySueldoBasico: unSueldoBasico conHijos: cantidadDeHijos conAntiguedad: añosDeAntiguedad 
	
	^self new initializeInicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil edad: unaEdad ySueldoBasico: unSueldoBasico conHijos: cantidadDeHijos conAntiguedad: añosDeAntiguedad ! !

!EmpleadoPermanente class methodsFor: 'instance creation' stamp: 'NMDGA 8/20/2025 15:22:15'!
inicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento ySueldoBasico: unSueldoBasico conHijos: cantidadDeHijos conAntiguedad: añosDeAntiguedad 
	
	^self new initializeInicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento ySueldoBasico: unSueldoBasico conHijos: cantidadDeHijos conAntiguedad: añosDeAntiguedad ! !


!classDefinition: #EmpleadoTemporario category: #'Ejercicio1-Objetos2'!
Empleado subclass: #EmpleadoTemporario
	instanceVariableNames: 'fechaDeFinDeDesignacion_CHANGE_ME cantidadDeHorasExtras fechaDeFinDeDesignacionAPlantaTemporaria horasExtras'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'Ejercicio1-Objetos2'!

!EmpleadoTemporario methodsFor: 'initialization' stamp: 'NMDGA 8/20/2025 15:33:08'!
fechaDeFinDeDesignacion
	^fechaDeFinDeDesignacionAPlantaTemporaria ! !

!EmpleadoTemporario methodsFor: 'initialization' stamp: 'NMDGA 8/20/2025 15:34:13'!
horasExtras
	^cantidadDeHorasExtras! !

!EmpleadoTemporario methodsFor: 'initialization' stamp: 'NMDGA 9/5/2025 08:58:27'!
initializeInicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil edad: unaEdad ySueldoBasico: unSueldoBasico conHijos: fechaDeFinDeDesignacion conAntiguedad: unaCantidadDeHorasExtras 
	
	nombre := unNombre.
	direccion := unaDireccion.
	estadoCivil := unEstadoCivil.
	edad := unaEdad.
	sueldoBasico := unSueldoBasico.
	fechaDeFinDeDesignacionAPlantaTemporaria := fechaDeFinDeDesignacion.
	cantidadDeHorasExtras := unaCantidadDeHorasExtras.! !

!EmpleadoTemporario methodsFor: 'initialization' stamp: 'NMDGA 8/20/2025 15:32:53'!
initializeInicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento ySueldoBasico: unSueldoBasico conHijos: fechaDeFinDeDesignacion conAntiguedad: unaCantidadDeHorasExtras 
	
	nombre := unNombre.
	direccion := unaDireccion.
	estadoCivil := unEstadoCivil.
	fechaDeNacimiento := unaFechaDeNacimiento.
	sueldoBasico := unSueldoBasico.
	fechaDeFinDeDesignacionAPlantaTemporaria := fechaDeFinDeDesignacion.
	cantidadDeHorasExtras := unaCantidadDeHorasExtras.! !

!EmpleadoTemporario methodsFor: 'initialization' stamp: 'NMDGA 9/5/2025 08:59:12'!
retenciones
	|obraSocial aportesJubilatorios|
	obraSocial := (self sueldoBruto * 0.10).
	(self edad > 50) ifTrue: [ obraSocial := obraSocial + 25 ].
	aportesJubilatorios := (self sueldoBruto * 0.10) + (self horasExtras * 5).
	^obraSocial + aportesJubilatorios! !

!EmpleadoTemporario methodsFor: 'initialization' stamp: 'NMDGA 8/20/2025 16:18:07'!
sueldoBruto
	^sueldoBasico + (self horasExtras * 40) 
	! !

!EmpleadoTemporario methodsFor: 'initialization' stamp: 'NMDGA 8/20/2025 16:26:29'!
sueldoNeto
	^self sueldoBruto - self retenciones! !


!EmpleadoTemporario methodsFor: 'as yet unclassified' stamp: 'NMDGA 9/5/2025 08:58:50'!
edad
	^edad! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'EmpleadoTemporario class' category: #'Ejercicio1-Objetos2'!
EmpleadoTemporario class
	instanceVariableNames: ''!

!EmpleadoTemporario class methodsFor: 'instance creation' stamp: 'NMDGA 9/5/2025 08:57:27'!
inicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil edad: unaEdad ySueldoBasico: unSueldoBasico fechaDeFinDeDesignacion: fechaDeFinDeDesignacion conHorasExtras: unaCantidadDeHorasExtras 
	
	^self new initializeInicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil edad: unaEdad ySueldoBasico: unSueldoBasico conHijos: fechaDeFinDeDesignacion conAntiguedad: unaCantidadDeHorasExtras ! !

!EmpleadoTemporario class methodsFor: 'instance creation' stamp: 'NMDGA 8/20/2025 15:32:25'!
inicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento ySueldoBasico: unSueldoBasico fechaDeFinDeDesignacion: fechaDeFinDeDesignacion conHorasExtras: unaCantidadDeHorasExtras 
	
	^self new initializeInicializarEmpleadoConNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento ySueldoBasico: unSueldoBasico conHijos: fechaDeFinDeDesignacion conAntiguedad: unaCantidadDeHorasExtras ! !


!classDefinition: #Empresa category: #'Ejercicio1-Objetos2'!
Object subclass: #Empresa
	instanceVariableNames: 'nombre cUIT cuit empleados recibos'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'Ejercicio1-Objetos2'!

!Empresa methodsFor: 'initialization' stamp: 'NMDGA 8/21/2025 09:25:56'!
agregarEmpleado: unEmpleado 
	empleados add: unEmpleado.! !

!Empresa methodsFor: 'initialization' stamp: 'NMDGA 8/21/2025 09:18:57'!
cuit
	
	^cuit! !

!Empresa methodsFor: 'initialization' stamp: 'NMDGA 8/21/2025 09:25:10'!
empleados
	
	^empleados! !

!Empresa methodsFor: 'initialization' stamp: 'NMDGA 8/24/2025 10:35:38'!
initializeInicializarEmpresaConNombre: unNombre conCUIT: unCUIT 
	
	nombre := unNombre.
	cuit := unCUIT.
	empleados := OrderedCollection new.
	recibos := OrderedCollection new.! !

!Empresa methodsFor: 'initialization' stamp: 'NMDGA 8/21/2025 09:18:28'!
nombre
	
	^nombre! !

!Empresa methodsFor: 'initialization' stamp: 'NMDGA 8/24/2025 10:36:50'!
realizarUnaLiquidacionDeSueldosConRecibo
	recibos := empleados collect: [: empleado | ReciboDeHaberes reciboPara: empleado]! !

!Empresa methodsFor: 'initialization' stamp: 'NMDGA 8/24/2025 10:40:21'!
recibos
	
	^recibos! !

!Empresa methodsFor: 'initialization' stamp: 'NMDGA 8/21/2025 09:31:14'!
totalRetenciones
	^empleados sum: [:empleado | empleado retenciones]! !

!Empresa methodsFor: 'initialization' stamp: 'NMDGA 8/21/2025 09:29:40'!
totalSueldosBrutos
	^empleados sum: [:empleado | empleado sueldoBruto]! !

!Empresa methodsFor: 'initialization' stamp: 'NMDGA 8/21/2025 09:28:30'!
totalSueldosNetos
	^empleados sum: [:empleado | empleado sueldoNeto]! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'Empresa class' category: #'Ejercicio1-Objetos2'!
Empresa class
	instanceVariableNames: ''!

!Empresa class methodsFor: 'instance creation' stamp: 'NMDGA 8/21/2025 09:17:51'!
inicializarEmpresaConNombre: unNombre conCUIT: unCUIT 

	^self new initializeInicializarEmpresaConNombre: unNombre conCUIT: unCUIT ! !


!classDefinition: #ReciboDeHaberes category: #'Ejercicio1-Objetos2'!
Object subclass: #ReciboDeHaberes
	instanceVariableNames: 'nombreDeEmpleado direccionDeEmpleado fechaDeEmision sueldoBrutoDelEmpleado sueldoNetoDelEmpleado nombre direccion fechaEmision sueldoBruto sueldoNeto conceptosRecibos'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'Ejercicio1-Objetos2'!

!ReciboDeHaberes methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/27/2025 09:27:18'!
agregarConcepto: unConcepto 
	conceptosRecibos add: unConcepto.! !

!ReciboDeHaberes methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/27/2025 09:15:30'!
conceptosRecibos
	^conceptosRecibos ! !

!ReciboDeHaberes methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/21/2025 16:48:28'!
direccionDelEmpleado
	^direccionDeEmpleado ! !

!ReciboDeHaberes methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/27/2025 09:15:09'!
initializeReciboPara: unEmpleado
	nombre := unEmpleado nombre.
       direccion := unEmpleado direccion.
       fechaEmision := Date today.
       sueldoBruto := unEmpleado sueldoBruto.
       sueldoNeto := unEmpleado sueldoNeto.
	conceptosRecibos := OrderedCollection new. ! !

!ReciboDeHaberes methodsFor: 'as yet unclassified' stamp: 'NMDGA 8/21/2025 16:41:44'!
nombreDeEmpleado
	
	^nombreDeEmpleado! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'ReciboDeHaberes class' category: #'Ejercicio1-Objetos2'!
ReciboDeHaberes class
	instanceVariableNames: ''!

!ReciboDeHaberes class methodsFor: 'instance creation' stamp: 'NMDGA 8/24/2025 10:39:55'!
reciboPara: empleado 
	
	^self new initializeReciboPara: empleado ! !
