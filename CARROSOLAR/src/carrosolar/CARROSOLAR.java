/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrosolar;

/**
 *
 * @author ANDRESYANDREA
 */
public class CARROSOLAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ECONOMIA economia=new ECONOMIA ();
        economia.setRendimiento("rendimiento de bateria: ocho horas");
        
        
        PARTESNOVEDOSAS partes=new PARTESNOVEDOSAS ();
        partes.setFotoceldas_tecnologia2018("tecnologia de fotoceldas 2018");
        
        DATOSTECNICOS datos=new DATOSTECNICOS ();
        datos.setEdicion("modelo auto 2019");
        
        System.out.println(economia.getRendimiento());
        System.out.println(partes.getFotoceldas_tecnologia2018());
        System.out.println(datos.getEdicion());
    }
    }
    
}
