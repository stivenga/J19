package co.com.ps.b4;

public class Mascota {
    // Atributos de la mascota
    private String nombre;
    private String tipo;
    private int edad;
    private boolean tieneVacunas;
    private double peso;
    private String color;

    // Constructor
    public Mascota(String nombre, String tipo, int edad, boolean tieneVacunas, double peso, String color) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.tieneVacunas = tieneVacunas;
        this.peso = peso;
        this.color = color;
    }

    // Métodos para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }

    public boolean tieneVacunas() {
        return tieneVacunas;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

}
