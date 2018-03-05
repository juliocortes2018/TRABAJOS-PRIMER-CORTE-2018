/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todas.las.operaciones;

/**
 *
 * @author ANDRESYANDREA
 */
public class TODASLASOPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mi_primera_variable;
       mi_primera_variable = "Hola mundo";
       
    System.out.println(mi_primera_variable);
    
    
    int num1=0 , num2=0 ; 
    
    num1 +=4;
    num2 -=6;    
    
         System.out.println(num1);
       
     int cont =0;
               System.out.println(cont); 
               cont++;
               
System.out.println(cont); 
               cont--;
               System.out.println(cont); 
               cont++;
System.out.println(cont); 
suma(2,3);
resta(5,3);
divicion(15,3);
multiplicacion(10,5);
Hola();

System.out.println(metodoR());

}
public static void suma(int num1 ,int num2)

        {num1 += num2 ;

         System.out.println(num1);

    }
public static void resta(int num1 ,int num2)

        {num1 -= num2 ;

         System.out.println(num1);

    }
public static void divicion(int num1 ,int num2)

        {num1 /= num2 ;

         System.out.println(num1);

    }
public static void multiplicacion(int num1 ,int num2)

        {num1 *= num2 ;

         System.out.println(num1);

    }
public static void Hola()

        {
     

         System.out.println("Hola");

    }
public static String metodoR()

        {
     

       return  "HOLA CLASE; COMO ESTAN?" ;
       
       
    }
        
}   