package co.com.ps.b5;

import java.util.Scanner;

public class Actividad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        double numero = scanner.nextDouble();

        // Validar si el número es positivo, negativo o igual a cero
        if (numero > 0) {
            System.out.println("El número ingresado es positivo.");
        } else if (numero < 0) {
            System.out.println("El número ingresado es negativo.");
        } else {
            System.out.println("El número ingresado es igual a cero.");
        }

        scanner.close();
    }
}
