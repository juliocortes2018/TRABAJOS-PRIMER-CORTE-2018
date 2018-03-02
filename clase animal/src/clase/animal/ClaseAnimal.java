/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.animal;

/**
 *
 * @author sala104
 */
public class ClaseAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        mascota obj=new mascota ();
        obj.setNombre("troski");
        obj.setEdad(2);
        obj.setClase("pastor aleman");
        obj.setNum_patas(4);
        System.out.println(obj.getNombre());
        System.out.println(obj.getEdad());
        System.out.println(obj.getClase());
        System.out.println(obj.getNum_patas());
               
                
    }
    
}
