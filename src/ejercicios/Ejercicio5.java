package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int num;
		int suma=0;
		int recuento=0;
		int media=0;
		int sumaMedia=0;
		int recuentonum=0;
		Scanner read= new Scanner (System.in);
		System.out.println("Introduzca 10 números (positivos, negativos o ceros): ");
		num = read.nextInt();
		while (num>0 && num==0 && num<0) {
			if(num>0) {
			suma+=num;
		}else if (num==0) {
			recuento++;
		}else if (num<0) {
			media++;
			sumaMedia+=num;
		}
			num=read.nextInt();
		}
		System.out.println("La suma de todos los números enteros es "+suma);
		System.out.println("La cantidad de números introducidos es de "+ recuento);
		System.out.println("La media de los números negativos es de " + (double)(sumaMedia/media));
		read.close();
		}
	}


