Algoritmo CalculadoraNotasUlti
	Definir nota1, nota2, nota3, res1, res2 Como Real
	Escribir "Defina la nota numero 1"
	Leer nota1
	Escribir ""
	Escribir "Defina la nota numero 2, su nota 1 es: (", nota1,")"
	Leer nota2
	Escribir ""
	Escribir "Defina la nota numero 3, sus notas 1 y 2 son: (", nota1,") - (", nota2,")"
	Leer nota3
	Limpiar Pantalla
	Escribir ""
	Escribir "                   Las notas ingresadas son: "
	Escribir "                              ",nota1
	Escribir "                              ",nota2
	Escribir "                              ",nota3
	Escribir ""
	Escribir "________________________________________________________________"
	Escribir "         Si esto es correcto, presione cualquier tecla, "
	Escribir "                  si no lo es, presione ESC"
	Escribir "________________________________________________________________"
	Escribir ""
	Esperar Tecla
	
	Limpiar Pantalla
	
	
	Si nota1<= 5.0 y nota2 <= 5.0 y nota3 <= 5.0 entonces
		Si nota1 >= 0.0 y nota2 >= 0.0 y nota3 >= 0.0 entonces
			res1 <- (nota1 + nota2 + nota3)/3	
			res2 <- Redon(res1*100)/100 //Tuve que buscar en internet cómo era lo que me había dicho para 
			// redondear decimales profe y no encontré en la wiki de Pseint, por lo que recurrí a internet
			// y lo encontré jajaja no fue IA ¿ok?
			Escribir ""
			Escribir "          El promedio de sus notas totales es: " res2
			Si res1 >= 3.0 Entonces
				Escribir ""
				Escribir "_________________________________________________________________"
				Escribir "      Su promedio es SUPERIOR al mínimo requerido (3.0)"
				Escribir "             ¡FELICIDADES! Ha pasado la materia"
				Escribir "_________________________________________________________________"
			SiNo
				Escribir "_________________________________________________________________"
				Escribir "      Su promedio es INFERIOR al mínimo requerido (3.0)."
				Escribir "                 ¡¡ HA PERDIDO LA MATERIA !!"
				Escribir "_________________________________________________________________"
				
			FinSi
		SiNo
			Escribir ""
			Escribir ""
			Escribir "_________________________________________________________________"
			Escribir "         Números fuera del rango ingresados (0.0 - 5.0),"
			Escribir "                por favor reinicie el programa"
			Escribir "_________________________________________________________________"
			Escribir ""
			Esperar Tecla
		FinSi
	SiNo
		Escribir ""
		Escribir ""
		Escribir "_________________________________________________________________"
		Escribir "         Números fuera del rango ingresados (0.0 - 5.0),"
		Escribir "                por favor reinicie el programa"
		Escribir "_________________________________________________________________"
		Escribir ""
		Esperar Tecla
	FinSi
	
FinAlgoritmo
