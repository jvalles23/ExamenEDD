package repaso;

import java.util.Scanner;

public class Ejercicio02 {
	public static String concatenar() {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce una palabra: ");
		String palabra = entrada.nextLine();
		System.out.print("Introduce otra palabra: ");
		String palabra2 = entrada.nextLine();
		String palabra3 = palabra + palabra2;
		
		return palabra3;
	}
	public static void main(String[]args) {
		System.out.print(concatenar());
		}
}
