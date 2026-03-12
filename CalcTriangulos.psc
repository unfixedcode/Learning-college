Algoritmo CalcTriangulos
	Definir opcion Como Entero
	Definir a, b, c, cosMax, area, s, lado1 Como Real
	Definir tipolado, tipoangulo Como Cadena
	Definir valido Como Logico
	
	Repetir
		Limpiar Pantalla
		Escribir ""
		Escribir "                Clasificador de Triángulos"
		Escribir "_________________________________________________________________"
		Escribir "               ¿Qué datos deseas ingresar?"
		Escribir "                  [1] Los tres lados"
		Escribir "                  [2] Los tres ángulos"
		Escribir "_________________________________________________________________"
		Escribir ""
		Leer opcion
		Si opcion <> 1 Y opcion <> 2 Entonces
			Escribir ""
			Escribir "_________________________________________________________________"
			Escribir "              Opción inválida. Ingrese 1 o 2"
			Escribir "_________________________________________________________________"
			Escribir ""
			Esperar Tecla
		FinSi
	Hasta Que opcion = 1 O opcion = 2
	
	//  OPCIÓN 1: LADOS =
	Si opcion = 1 Entonces
		valido <- Falso
		Mientras valido = Falso Hacer
			Limpiar Pantalla
			Escribir ""
			Escribir "       Ingresa los tres lados en centímetros "
		    Escribir "        (valores positivos de 0 a infinito):"
			Escribir ""
			Escribir "  Lado a: "
			Leer a
			Escribir ""
			Escribir "  Lado b: "
			Leer b
			Escribir ""
			Escribir "  Lado c: "
			Leer c
			Si a <= 0 O b <= 0 O c <= 0 Entonces
				Escribir ""
				Escribir "_________________________________________________________________"
				Escribir "          Error: los lados deben ser mayores que 0"
				Escribir "_________________________________________________________________"
				Escribir ""
				Esperar Tecla
			FinSi
			Si a > 0 Y b > 0 Y c > 0 Entonces
				Si a+b <= c O a+c <= b O b+c <= a Entonces
					Escribir ""
					Escribir "_________________________________________________________________"
					Escribir "       Error: esos valores no forman un triángulo válido"
					Escribir "_________________________________________________________________"
					Escribir ""
					Esperar Tecla
				SiNo
					valido <- Verdadero
				FinSi
			FinSi
		FinMientras
		
		Limpiar Pantalla
		Escribir ""
		Escribir "                     Los lados ingresados son:"
		Escribir "                              A = ", a, "cm"
		Escribir "                              B = ", b, "cm"
		Escribir "                              C = ", c, "cm"
		Escribir ""
		Escribir "_________________________________________________________________"
		Escribir "         Si esto es correcto, presione cualquier tecla,"
		Escribir "                  si no lo es, presione ESC"
		Escribir "_________________________________________________________________"
		Escribir ""
		Esperar Tecla
		
		// Acá elige el tipo de triángulo por sus lados
		Si a = b Y b = c Entonces
			tipolado <- "Equilátero"
		FinSi
		Si (a <> b O b <> c) Y (a = b O b = c O a = c) Entonces
			tipolado <- "Isósceles"
		FinSi
		Si a <> b Y b <> c Y a <> c Entonces
			tipolado <- "Escaleno"
		FinSi
		
		// Ley de cosenos sobre el lado mayor en variable a-b-c
		Si a >= b Y a >= c Entonces
			cosMax <- (b*b + c*c - a*a) / (2*b*c)
		FinSi
		Si b > a Y b >= c Entonces
			cosMax <- (a*a + c*c - b*b) / (2*a*c)
		FinSi
		Si c > a Y c > b Entonces
			cosMax <- (a*a + b*b - c*c) / (2*a*b)
		FinSi
		
		Si abs(cosMax) < 0.0001 Entonces
			tipoangulo <- "Rectángulo"
		FinSi
		Si cosMax > 0.0001 Entonces
			tipoangulo <- "Acutángulo"
		FinSi
		Si cosMax < -0.0001 Entonces
			tipoangulo <- "Obtusángulo"
		FinSi
		
		// Área por fórmula de "Herón"
		s <- (a + b + c) / 2
		area <- raiz(s * (s-a) * (s-b) * (s-c))
	FinSi
	
	//  OPCIÓN 2: ÁNGULOS
	Si opcion = 2 Entonces
		valido <- Falso
		Mientras valido = Falso Hacer
			Limpiar Pantalla
			Escribir ""
			Escribir "      Ingresa los tres ángulos en grados (deben sumar 180°):"
			Escribir ""
			Escribir "  Ángulo A: "
			Leer a
			Escribir ""
			Escribir "  Ángulo B: "
			Leer b
			Escribir ""
			Escribir "  Ángulo C: "
			Leer c
			Si a <= 0 O b <= 0 O c <= 0 Entonces
				Escribir ""
				Escribir "_________________________________________________________________"
				Escribir "         Error: los ángulos deben ser mayores que 0°"
				Escribir "_________________________________________________________________"
				Escribir ""
				Esperar Tecla
			FinSi
			Si a > 0 Y b > 0 Y c > 0 Entonces
				Si abs(a + b + c - 180) > 0.01 Entonces
					Escribir ""
					Escribir "_________________________________________________________________"
					Escribir "         Error: los ángulos deben sumar 180°"
					Escribir "                  Tu suma fue: ", a+b+c
					Escribir "_________________________________________________________________"
					Escribir ""
					Esperar Tecla
				SiNo
					valido <- Verdadero
				FinSi
			FinSi
		FinMientras
		
		Limpiar Pantalla
		Escribir ""
		Escribir "                     Los ángulos ingresados son:"
		Escribir "                              A = ", a, "°"
		Escribir "                              B = ", b, "°"
		Escribir "                              C = ", c, "°"
		Escribir ""
		Escribir "_________________________________________________________________"
		Escribir "         Si esto es correcto, presione cualquier tecla,"
		Escribir "                  si no lo es, presione ESC"
		Escribir "_________________________________________________________________"
		Escribir ""
		Esperar Tecla
		
		// Tipo por sus ángulos
		Si abs(a-90) < 0.01 O abs(b-90) < 0.01 O abs(c-90) < 0.01 Entonces
			tipoangulo <- "Rectángulo"
		FinSi
		Si a > 90 O b > 90 O c > 90 Entonces
			tipoangulo <- "Obtusángulo"
		FinSi
		Si a < 90 Y b < 90 Y c < 90 Entonces
			tipoangulo <- "Acutángulo"
		FinSi
		
		// Tipo por lados para sección angulos
		Si abs(a-b) < 0.01 Y abs(b-c) < 0.01 Entonces
			tipolado <- "Equilátero"
		FinSi
		Si abs(a-b) >= 0.01 O abs(b-c) >= 0.01 Entonces
			Si abs(a-b) < 0.01 O abs(b-c) < 0.01 O abs(a-c) < 0.01 Entonces
				tipolado <- "Isósceles"
			FinSi
			Si abs(a-b) >= 0.01 Y abs(b-c) >= 0.01 Y abs(a-c) >= 0.01 Entonces
				tipolado <- "Escaleno"
			FinSi
		FinSi
		
		// Acá se pide un lado para calcular el área (ley de senos)
		Limpiar Pantalla
		Escribir ""
		Escribir "_________________________________________________________________"
		Escribir "          Para calcular el área con los ángulos se 
		Escribir "                necesita al menos un lado."
		Escribir "_________________________________________________________________"
		Escribir ""
		Escribir "  Ingresa el lado opuesto al ángulo A (: "
		Leer lado1
		area <- (lado1 * lado1 * sen(b * 3.14159265 / 180) * sen(c * 3.14159265 / 180)) / (2 * sen(a * 3.14159265 / 180)) // Uy profe esta fórmula casi me saca canas, jodí y jodí hasta que llegué a la función de seno con pi por 180 que siempre son los grados de un triángulo :(
	FinSi
	
	// RESULTADOS
	Limpiar Pantalla
	Escribir ""
	Escribir ""
	Escribir ""
	Escribir ""
	Escribir "              El triángulo ingresado es:"
	Escribir "_________________________________________________________________"
	Escribir ""
	Escribir "               Tipo por lados:    ", tipolado
	Escribir "               Tipo por ángulos:  ", tipoangulo
	Escribir "               Área:              ", Redon(area*100)/100, " centímetros cuadrados"
	Escribir ""
	Escribir "_________________________________________________________________"
	Escribir "                    Y debe verse algo similar a: "
	// DIBUJITOOOOOOOOOOOOOOOOOOOOOOOOOOSSSSSSSS
	Si tipolado = "Equilátero" Entonces
		Escribir "                                /\"
		Escribir "                               /  \"
		Escribir "                              /    \"
		Escribir "                             /______\ *Sus 3 lados miden lo mismo"
	FinSi
	Si tipoangulo = "Rectángulo" Y tipolado <> "Equilátero" Entonces
		Escribir "                             |\"
		Escribir "                             | \"
		Escribir "                             |  \"
		Escribir "                             |___\ *Uno de los ángulos es de exactamente 90°"
	FinSi
	Si tipoangulo = "Obtusángulo" Entonces
		Escribir "                          *"
		Escribir "                           \  \ "
		Escribir "                            \    \"
		Escribir "                             \     \"
		Escribir "                              -------- *Uno de sus ángulos mayor a 90°"
	FinSi
	Si tipoangulo = "Acutángulo" Y tipolado <> "Equilátero" Entonces
		Escribir "                        /\"
		Escribir "                       /  \"
		Escribir "                      /    \"
		Escribir "                     /______\ *Todos sus ángulos son menores a 90°"
	FinSi
	
	Escribir ""
	Escribir "_________________________________________________________________"
	Escribir "             Presione cualquier tecla para salir..."
	Escribir "_________________________________________________________________"
	Escribir ""
	Esperar Tecla

FinAlgoritmo