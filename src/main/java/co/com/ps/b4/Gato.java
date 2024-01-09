package co.com.ps.b4;

public class Gato {
    // Atributos del gato
    private String nombre;
    private int edad;
    private boolean estaEsterilizado;
    private double peso;
    private String pelaje;
    private String raza;

    // Constructor
    public Gato(String nombre, int edad, boolean estaEsterilizado, double peso, String pelaje, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.estaEsterilizado = estaEsterilizado;
        this.peso = peso;
        this.pelaje = pelaje;
        this.raza = raza;
    }

    // Métodos para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean estaEsterilizado() {
        return estaEsterilizado;
    }

    public double getPeso() {
        return peso;
    }

    public String getPelaje() {
        return pelaje;
    }

    public String getRaza() {
        return raza;
    }
}
