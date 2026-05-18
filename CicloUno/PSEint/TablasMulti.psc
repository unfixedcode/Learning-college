Algoritmo TablasAFAM
	Definir a, b, resultado Como Entero
	Para a <- 1 Hasta 12 Con Paso 1 Hacer
		Escribir "                         --- Tabla del ", a, ": ---"
		Para b<-1 Hasta 10 Con Paso 1 Hacer
			resultado <- a*b
			Escribir "                              ", a, ' x ', b, ' = ', resultado
		FinPara
		Escribir "                  ___________________________________"
	FinPara
FinAlgoritmo
