Algoritmo Puente
	// Vamos a cruzar el puente en máximo 15 minutos
	// 
	DAVID <- 1
	LAURA <- 2
	RONNY <- 5
	VANESSA <- 8
	tiempo <- 0
	// Primer cruce - David+Laura
	tiempo <- tiempo + LAURA
	// Vuelta de regreso David
	tiempo <- tiempo + DAVID
	// Segundo cruce - David+Vanessa
	tiempo <- tiempo + VANESSA
	//  Vuelta de regreso Laura
	tiempo <- tiempo + LAURA
	// Tercer cruce - Laura+David
	tiempo <- tiempo + LAURA
	
	Escribir "El tiempo total que tomó fue: ", tiempo, " minutos"
	
	si tiempo <=15 Entonces
			Escribir "Todos pasaron y sobrevivieron al asesino"
		SiNo
			Escribir "Dejaron morir al socio David :c"
		FinSi
		
		
		
	
FinAlgoritmo


