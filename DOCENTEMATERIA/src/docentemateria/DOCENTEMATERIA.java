/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docentemateria;

/**
 *
 * @author ANDRESYANDREA
 */
public class DOCENTEMATERIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        INFORMACIONMATERIA profesor=new INFORMACIONMATERIA ();
        
        profesor.setPrimer_nombre("Julio");
        profesor.setSegundo_nombre("Andres");
        profesor.setPrimer_apellido("Cortes");
        profesor.setSegundo_apellido("Borray");
        profesor.setDireccion("calle 10 # 19 - 142");
        profesor.setNum_cedula(795845216);
        profesor.setNum_celular(31571991);
        profesor.setMateria("matematicas");
        profesor.setColegio("cun sede Bosa");
        profesor.setNombre_rector("Luis Castañeda");
        profesor.setGrado("programacion orientada a objetos");
        profesor.setDireccion_colegio("calle 61 # 81b 33 sur");
        profesor.setCantidad_alunmos(35);
        profesor.setHoras_semanales(2);
        
        System.out.println(profesor.getPrimer_nombre());
        System.out.println(profesor.getSegundo_nombre());
        System.out.println(profesor.getPrimer_apellido());
        System.out.println(profesor.getSegundo_apellido());
        System.out.println(profesor.getDireccion());
        System.out.println(profesor.getNum_cedula());
        System.out.println(profesor.getNum_celular());
        System.out.println(profesor.getMateria());
        System.out.println(profesor.getColegio());
        System.out.println(profesor.getNombre_rector());
        System.out.println(profesor.getGrado());
        System.out.println(profesor.getDireccion_colegio());
        System.out.println(profesor.getCantidad_alunmos());
        System.out.println(profesor.getHoras_semanales());
        
    }
    
}
