package mayoredad;
import java.util.Scanner;

public class MayorEdad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte edad;
        
        System.out.println("Ingresa tu edad: ");
        edad = entrada.nextByte();
        
        System.out.println(regresaMayorEdad(edad));
    }
    
    public static String regresaMayorEdad(byte num){
        if(num >= 18){
            return "mayor de edad";
        }else {
            return "mayor edad";
        }
    }
        

        }
    







    
    

