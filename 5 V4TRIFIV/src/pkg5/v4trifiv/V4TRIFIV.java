
package pkg5.v4trifiv;

import funciones.funcionMultiplo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V4TRIFIV {

    public static void main(String[] args) throws IOException {
        //DECLARACION DE VARIABLES
         BufferedReader bufEntrada= new BufferedReader (new InputStreamReader (System.in));
        int numero;
        //CREO OBJETO
        funcionMultiplo mult = new funcionMultiplo();
        //ENTRADA DATOS
        System.out.println("DAME NUMERO");
        numero = Integer.parseInt(bufEntrada.readLine());
        //SALIDA DATOS
        System.out.println(mult.retornaMultiplo(numero));
        
        
        
    }
    
}
