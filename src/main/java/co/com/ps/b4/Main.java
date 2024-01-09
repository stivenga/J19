package co.com.ps.b4;

public class Main { public static void main(String[] args) {
    PersonaMejorada personaMejorada = new PersonaMejorada("stiven", "o+");
    personaMejorada.setNombre("juan");
    guardarEnBaseDeDatos(personaMejorada);
    System.out.println(personaMejorada.getNombre());
    System.out.println(personaMejorada.getTipoDeSangre());
}

    public static boolean guardarEnBaseDeDatos(PersonaMejorada pm){

        return true;

    }
}

