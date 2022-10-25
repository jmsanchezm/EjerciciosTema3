package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Declaramos variables.
		int suma = 0 ;//Se guardará el resultado de la suma de los números positivos
		int num ;//Se guardará el número que introduzca el usuario.
		int media=0;
		//Creamos el Scanner.
		Scanner read = new Scanner (System.in);
		//Solicitamos al usuario un número positivo, en caso de que quiera salir, debe introducir un número negativo
		System.out.print("Introduzca un número entero. En caso de querer salir, introduzca un número negativo. ");
		//Ordenamos al Scanner, leer el teclado.
		num = read.nextInt();
				//Mediante un while, ponemos la condición de que si num es un número positivo 
		while (num>=0) {
			//En caso de que el número cummpla la condición, se irá sumando con los números que introducirá el usuario posteriormente.
			suma+=num;
			media++;
			//Ordenamos que lea de nuevo lo que introduzca el usuario en el teclado.
			num = read.nextInt();
		}
		/*Una vez haya salido del bucle, debido a que el usuario introdujera un número negativo, se le mostrará lo siguiente en 
		pantalla. El resultado en este caso se divirá entre dos para calcular la nota media.*/
		System.out.print("El resultado de la suma de los números enteros es: " + suma/media);
		//Finalmente, cerramos el Scanner.
		read.close();
		

	}

}
