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
public class INFORMACIONMATERIA extends DATOSPERSONALES {
    
    String materia;
    String colegio;
    String nombre_rector;
    String grado;
    String direccion_colegio;
    int cantidad_alunmos;
    int horas_semanales;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getNombre_rector() {
        return nombre_rector;
    }

    public void setNombre_rector(String nombre_rector) {
        this.nombre_rector = nombre_rector;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getDireccion_colegio() {
        return direccion_colegio;
    }

    public void setDireccion_colegio(String direccion_colegio) {
        this.direccion_colegio = direccion_colegio;
    }

    public int getCantidad_alunmos() {
        return cantidad_alunmos;
    }

    public void setCantidad_alunmos(int cantidad_alunmos) {
        this.cantidad_alunmos = cantidad_alunmos;
    }

    public int getHoras_semanales() {
        return horas_semanales;
    }

    public void setHoras_semanales(int horas_semanales) {
        this.horas_semanales = horas_semanales;
    }
    
    
    
}
