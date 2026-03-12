Algoritmo Tipos_de_datos
	Definir a, b, respuesta, num1, num2 Como Real
	Definir tipodecalculo Como Entero
	Escribir "¡Vamos a calcular!"
	Escribir "____________________________________________________"
	Escribir "[1] Suma [2] Resta [3] División [4] Multiplicación"
	Leer tipodecalculo
	Escribir "Ahora ingrese el valor 1"
	Leer num1
	Escribir "Y acá ingrese el valor 2"
	Leer num2
	Limpiar Pantalla
	Según tipodecalculo Hacer
		1:
			respuesta <- num1+num2
			Escribir "Su resultado es: ", respuesta
		2:
			respuesta <- num1-num2
			Escribir "Su resultado es: ", respuesta
		3:
			respuesta <- num1/num2
			Escribir "Su resultado es: ", respuesta
		4:
			respuesta <- num1*num2
			Escribir "Su resultado es: ", respuesta
		De Otro Modo:
			Escribir "Parámetros inválidos, por favor vuelva a iniciar el programa"
	FinSegún
	Escribir "Presiona cualquier tecla para salir"
	Esperar Tecla
FinAlgoritmo
