/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.modelo.dt;

import java.sql.Date;

/**
 *
 * @author luis
 */
public class ExamenesDT {
    private int idExamenes;
    private Date fecha;
    private int numPreguntas;
    private String nombreExamen;
    private int idProfesores;
    private int idAsignaturas;
    private int idCursos;

    /**
     * @return the idExamenes
     */
    public int getIdExamenes() {
        return idExamenes;
    }

    /**
     * @param idExamenes the idExamenes to set
     */
    public void setIdExamenes(int idExamenes) {
        this.idExamenes = idExamenes;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the numPreguntas
     */
    public int getNumPreguntas() {
        return numPreguntas;
    }

    /**
     * @param numPreguntas the numPreguntas to set
     */
    public void setNumPreguntas(int numPreguntas) {
        this.numPreguntas = numPreguntas;
    }

    /**
     * @return the nombreExamen
     */
    public String getNombreExamen() {
        return nombreExamen;
    }

    /**
     * @param nombreExamen the nombreExamen to set
     */
    public void setNombreExamen(String nombreExamen) {
        this.nombreExamen = nombreExamen;
    }

    /**
     * @return the idProfesores
     */
    public int getIdProfesores() {
        return idProfesores;
    }

    /**
     * @param idProfesores the idProfesores to set
     */
    public void setIdProfesores(int idProfesores) {
        this.idProfesores = idProfesores;
    }

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

}