package co.com.ps.b6;

// adivina el numero

import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAdivinar = (int) (Math.random() * 100) + 1;
        int intentosRestantes = 10;

        System.out.println("Bienvenido al juego de adivinanza. Adivina un número entre 1 y 100.");

        while (intentosRestantes > 0) {
            System.out.println("Intentos restantes: " + intentosRestantes);
            System.out.print("Ingresa tu número: ");
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario < numeroAdivinar) {
                System.out.println("Tu número está por debajo del número a adivinar.");
            } else if (numeroUsuario > numeroAdivinar) {
                System.out.println("Tu número es mayor al número a adivinar.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número es el: " + numeroAdivinar);
                return;
            }

            intentosRestantes--;
        }

        System.out.println("Perdiste. El número a adivinar era: " + numeroAdivinar);
    }
}
