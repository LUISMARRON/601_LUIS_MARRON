
package funciones;
 
public class funcionMultiplo {
    public String retornaMultiplo(int num){
        
        if(num % 3 == 0 && num % 5 == 0){
         return "TRIIFIV";
    } else if (num % 3 ==0){
         return "TRI";
    } else if (num % 5 ==0){
        return "FIV";
    }
        return "NINGUN VALOR";
                }
                    
        }
    
    

