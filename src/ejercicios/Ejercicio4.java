package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Declaramos las variables
		int num; //Se guardará el número introducido por el usuario.
		int resto;//Se guardará el resto calculado en el módulo de num entre 2.
		//Creamos el Scanner.
		Scanner read= new Scanner (System.in);
		//Solicitamos al usuario números.
		System.out.print("Introduzca números para saber si son pares o impares.");
		//Ordenamos al Scanner leer el teclado.
		num=read.nextInt();
		//Utilizamos un while, para poner que número debe ser distinto a cero.
		while (num!=0) {
			//En caso de que se cumpla, me calculará el módulo de num
			resto= num%2;
			//Utilizamos un if para que en el caso en el que resto=0, muestre que es par.
			if (resto ==0) {
				System.out.println("El número es par.");
			}else {//En caso contrario, se mostrará que es impar.
				System.out.println("El número es impar.");
			}
			//Ordenamos al Scanner a que lea el teclado de nuevo.
			num=read.nextInt();
		}
			//En caso de que el usuario introduzca num=0, se saldrá del bucle y mostrará lo siguiente.
			System.out.println("Introduzca un número distinto a cero.");
		//Finalmente, cerramos el Scanner.
		read.close();
	}

}
