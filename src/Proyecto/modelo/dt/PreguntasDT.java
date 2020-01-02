/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.modelo.dt;

/**
 *
 * @author luis
 */
public class PreguntasDT {
    private int idPreguntas;
    private String enunciado;
    private int idRespuestas;
    private int idExamenes;

    /**
     * @return the idPreguntas
     */
    public int getIdPreguntas() {
        return idPreguntas;
    }

    /**
     * @param idPreguntas the idPreguntas to set
     */
    public void setIdPreguntas(int idPreguntas) {
        this.idPreguntas = idPreguntas;
    }

    /**
     * @return the enunciado
     */
    public String getEnunciado() {
        return enunciado;
    }

    /**
     * @param enunciado the enunciado to set
     */
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    /**
     * @return the idRespuestas
     */
    public int getIdRespuestas() {
        return idRespuestas;
    }

    /**
     * @param idRespuestas the idRespuestas to set
     */
    public void setIdRespuestas(int idRespuestas) {
        this.idRespuestas = idRespuestas;
    }

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
    
}
