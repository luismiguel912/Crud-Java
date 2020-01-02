/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Proyecto.modelo.dt;

/**
 *
 * @author USUARIO
 */
public class AsignaturasDT {
     private int idAsignaturas;
     private String nombre;
     private String descripcion;

    /**
     * @return the idAsignaturas
     */
    public int getIdAsignaturas() {
        return idAsignaturas;
    }

    /**
     * @param idAsignaturas the idAsignaturas to set
     */
    public void setIdAsignaturas(int idAsignaturas) {
        this.idAsignaturas = idAsignaturas;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
