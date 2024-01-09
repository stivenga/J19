package co.com.ps.b3;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class TiposDeDatos {
    public static void main(String[] args) {
        //tipos de datos primitivos

    //para numeros
        int val1=10;
        long val3=9223372036854775807L;
    //para decimales
        float val7=3.14159f;
        double val2=123.456;
    //caracteres
        char val4 ='S';
    //byte
        byte val5= 42;

        short val6=10799;
    //sistema de decision true or false
        boolean val8= true;

    //Wrapers
    Integer w1=11;
    Long w2= 123456789L;
    Float w3= 123.45f;
    Double w4=123.456;
    Character w5='C';
    Byte w6= 64;
    Short w7=2000;
    Boolean w8= false;
    String w9= "hola mundo";

    String telefono=w1.toString();

    // Objetos utiles
        Date fecha = new Date(2007, 10, 31 );
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2007);
        cal.set(Calendar.MONTH, Calendar.OCTOBER);
        cal.set(Calendar.DAY_OF_MONTH, 31);
        Date dateRepresentation = cal.getTime();
        System.out.println(dateRepresentation);


        BigDecimal moneda = new BigDecimal(10);
    }
}
