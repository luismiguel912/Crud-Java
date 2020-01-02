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
public class CursosDT {
     private int idCursos;
     private String nombres;
     private String descripcion;

    /**
     * @return the idCursos
     */
    public int getIdCursos() {
        return idCursos;
    }

    /**
     * @param idCursos the idCursos to set
     */
    public void setIdCursos(int idCursos) {
        this.idCursos = idCursos;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
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