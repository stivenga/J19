package co.com.ps.b4;

public class Actividad2 {
    public static void main(String[] args) {
        mostrarSeparador();
        System.out.println("Contenido principal");
        mostrarSeparador();
        // Crear una instancia de Mascota
        Mascota miMascota = new Mascota("Max", "Perro", 3, true, 8.5, "Café");

        // Acceder a los atributos y mostrarlos en pantalla
        System.out.println("Nombre: " + miMascota.getNombre());
        System.out.println("Tipo: " + miMascota.getTipo());
        System.out.println("Edad: " + miMascota.getEdad() + " años");
        System.out.println("¿Tiene vacunas? " + (miMascota.tieneVacunas() ? "Sí" : "No"));
        System.out.println("Peso: " + miMascota.getPeso() + " kg");
        System.out.println("Color: " + miMascota.getColor());


    }

    // Método para mostrar el separador
    public static void mostrarSeparador() {
        System.out.println("*************************");



        Gato miGato = new Gato("Mittens", 2, false, 4.5, "Blanco y negro", "Doméstico");

        // Acceder a los atributos y mostrarlos en pantalla
        System.out.println("Nombre: " + miGato.getNombre());
        System.out.println("Edad: " + miGato.getEdad() + " años");
        System.out.println("¿Está esterilizado? " + (miGato.estaEsterilizado() ? "Sí" : "No"));
        System.out.println("Peso: " + miGato.getPeso() + " kg");
        System.out.println("Pelaje: " + miGato.getPelaje());
        System.out.println("Raza: " + miGato.getRaza());

    }



}

