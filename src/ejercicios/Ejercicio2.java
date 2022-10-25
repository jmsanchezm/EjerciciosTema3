package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Declaramos variables.
		int num;//Se guardará el número introducido por el usuario.
		int recuento=0;//Se guardará el recuento de los números introducidos.
		//Creamos el Scanner.
		Scanner read = new Scanner (System.in);
		/*Solicitamos al usuario un número positivo, con la posibilidad de que si quiere finalizar 
		el bucle, introduzca un número negativo*/
		System.out.println("Introduzca un número entero. En caso de querer salir, introduzca un número negativo. ");
		//Ordenamos al Scanner leer el teclado.
		num =read.nextInt();
		//Mediante un while, ponemos la condición de si el número es mayor o igual a 0.
		while (num>=0) {
			//En el caso de que se cumpliese, se suma uno al recuento.
			recuento++;
			//Ordenamos a que lea de nuevo el teclado.
			num=read.nextInt();
		}
		//En caso de que se incumpla la condición anterior, se nos mostrará el siguiente mensaje.
		System.out.println("La cantidad de números introducidos es de " + recuento);
	}

}
