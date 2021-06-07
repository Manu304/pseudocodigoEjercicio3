//202030799 Manuel Rojas
//Se pide desarrollar un programa que lee un valor N y determine su factorial.
Proceso Ejercicio3Parte2
	Escribir "Ingrese un numero entero para calcular su factorial"
	Leer num
	factorial <- 1
	Si num == 0 Entonces
		Escribir "El factorial de 0 es 1"
	SiNo
		Mientras num > 1 Hacer
			factorial <- factorial*num
			num <- num - 1
		Fin Mientras
		
		Escribir "El factorial de ", num, " es: ", factorial
	FinSi
FinProceso
	