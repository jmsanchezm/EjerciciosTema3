package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Declaramos las variables
		int num;
		int resto;
		Scanner read= new Scanner (System.in);
		System.out.print("Introduzca números para saber si son pares o impares.");
		num=read.nextInt();
		while (num!=0) {
			resto= num%2;
			if (resto ==0) {
				System.out.println("El número es par.");
			}else {
				System.out.println("El número es impar.");
			}
			num=read.nextInt();
		}
			System.out.println("Introduzca un número distinto a cero.");
		read.close();
	}

}
