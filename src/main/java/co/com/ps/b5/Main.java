package co.com.ps.b5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombre= "";
        String apellido= "Guerrero";

        int edad = 10;
        if (nombre == null || apellido == null) {
            System.out.println("el nombre esta vacio");

        }

        if (edad == 0){

        }

        if (nombre.equals("") && apellido.equals("")) {
            System.out.println("el nombre esta vacio");

        }else{
            System.out.println("Nombre ingresado correctaente");

        }

        for (int i = 0; i <=6 ; i++) {
            System.out.println("Numero " + i);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        System.out.println("Numero " + numero);


      }

    }