/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Proyecto.modelo.facade;

import Proyecto.modelo.dao.AlumnosDAO;
import Proyecto.modelo.dao.AsignaturasDAO;
import Proyecto.modelo.dao.CursosDAO;
import Proyecto.modelo.dao.ExamenesDAO;
import Proyecto.modelo.dao.NotaDAO;
import Proyecto.modelo.dao.PreguntasDAO;
import Proyecto.modelo.dao.ProfesoresDAO;

import Proyecto.modelo.dao.RespuestasDAO;
import Proyecto.modelo.dt.AlumnosDT;
import Proyecto.modelo.dt.AsignaturasDT;
import Proyecto.modelo.dt.CursosDT;
import Proyecto.modelo.dt.ExamenesDT;
import Proyecto.modelo.dt.HacenDT;
import Proyecto.modelo.dt.NotaDT;
import Proyecto.modelo.dt.PreguntasDT;
import Proyecto.modelo.dt.ProfesoresDT;

import Proyecto.modelo.dt.RespuestasDT;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class sistemaFacade {
     public void nuevoAlumnos(AlumnosDT dt)throws Exception{
        AlumnosDAO dao = new AlumnosDAO();
        dao.create(dt);
    }
    
    public void actualizaAlumnos(AlumnosDT dt)throws Exception{
        AlumnosDAO dao = new AlumnosDAO();
        dao.update(dt);
    }
    
    public void eliminarAlumnos (AlumnosDT dt)throws Exception{
        AlumnosDAO dao = new AlumnosDAO();
        dao.delete(dt);
    }
    
    public AlumnosDT buscaAlumnosDT(AlumnosDT dt) throws Exception{
        AlumnosDAO dao = new AlumnosDAO();
        return dao.select(dt);
    }
    
    public List  listaAlumnos()throws Exception{
        AlumnosDAO dao = new AlumnosDAO();
        return dao.selectall();
    }
    
    /**-------------------**/
    public void nuevoAsignaturas(AsignaturasDT dt)throws Exception{
        AsignaturasDAO dao = new AsignaturasDAO();
        dao.create(dt);
    }
    
    public void actualizaAsignaturas(AsignaturasDT dt)throws Exception{
        AsignaturasDAO dao = new AsignaturasDAO();
        dao.update(dt);
    }
    
    public void eliminarAsignaturas (AsignaturasDT dt)throws Exception{
        AsignaturasDAO dao = new AsignaturasDAO();
        dao.delete(dt);
    }
    
    public AsignaturasDT buscaAsignaturasDT(AsignaturasDT dt) throws Exception{
        AsignaturasDAO dao = new AsignaturasDAO();
        return dao.select(dt);
    }
    
    public List  listaAsignaturas()throws Exception{
        AsignaturasDAO dao = new AsignaturasDAO();
        return dao.selectall();
    }
     /**-------------------**/
    public void nuevoCursos(CursosDT dt)throws Exception{
        CursosDAO dao = new CursosDAO();
        dao.create(dt);
    }
    
    public void actualizaCursos(CursosDT dt)throws Exception{
        CursosDAO dao = new CursosDAO();
        dao.update(dt);
    }
    
    public void eliminarCursos (CursosDT dt)throws Exception{
        CursosDAO dao = new CursosDAO();
        dao.delete(dt);
    }
    
    public CursosDT buscaCursosDT(CursosDT dt) throws Exception{
        CursosDAO dao = new CursosDAO();
        return dao.select(dt);
    }
    
    public List  listaCursos()throws Exception{
        CursosDAO dao = new CursosDAO();
        return dao.selectall();
    }
    
    
    
     /**-------------------**/
    
     public void nuevoProfesores(ProfesoresDT dt)throws Exception{
        ProfesoresDAO dao = new ProfesoresDAO();
        dao.create(dt);
    }
    
    public void actualizaProfesores(ProfesoresDT dt)throws Exception{
        ProfesoresDAO dao = new ProfesoresDAO();
        dao.update(dt);
    }
    
    public void eliminarProfesores (ProfesoresDT dt)throws Exception{
        ProfesoresDAO dao = new ProfesoresDAO();
        dao.delete(dt);
    }
    
    public ProfesoresDT buscaProfesores(ProfesoresDT dt) throws Exception{
        ProfesoresDAO dao = new ProfesoresDAO();
        return dao.select(dt);
    }
    
    public List  listaProfesores()throws Exception{
        ProfesoresDAO dao = new ProfesoresDAO();
        return dao.selectall();
    }
    
    
     /**-------------------**/
     public void nuevoRespuestas(RespuestasDT dt)throws Exception{
        RespuestasDAO dao = new RespuestasDAO();
        dao.create(dt);
    }
    
    public void actualizaRespuestas(RespuestasDT dt)throws Exception{
        RespuestasDAO dao = new RespuestasDAO();
        dao.update(dt);
    }
    
    public void eliminarRespuestas (RespuestasDT dt)throws Exception{
        RespuestasDAO dao = new RespuestasDAO();
        dao.delete(dt);
    }
    
    public RespuestasDT buscaRespuestasDT(RespuestasDT dt) throws Exception{
        RespuestasDAO dao = new RespuestasDAO();
        return dao.select(dt);
    }
    
    public List  listaRespuestas()throws Exception{
        RespuestasDAO dao = new RespuestasDAO();
        return dao.selectall();
    }
    
    
      /**-------------------**/
     public void nuevoPreguntas(PreguntasDT dt)throws Exception{
        PreguntasDAO dao = new PreguntasDAO();
        dao.create(dt);
    }
    
    public void actualizaPreguntas(PreguntasDT dt)throws Exception{
        PreguntasDAO dao = new PreguntasDAO();
        dao.update(dt);
    }
    
    public void eliminarPreguntas (PreguntasDT dt)throws Exception{
        PreguntasDAO dao = new PreguntasDAO();
        dao.delete(dt);
    }
    
    public PreguntasDT buscaPreguntasDT(PreguntasDT dt) throws Exception{
        PreguntasDAO dao = new PreguntasDAO();
        return dao.select(dt);
    }
    
    public List  listaPreguntas()throws Exception{
        PreguntasDAO dao = new PreguntasDAO();
        return dao.selectall();
    }
    
    
     /**-------------------**/
     public void nuevoExamenes(ExamenesDT dt)throws Exception{
        ExamenesDAO dao = new ExamenesDAO();
        dao.create(dt);
    }
    
    public void actualizaExamenes(ExamenesDT dt)throws Exception{
        ExamenesDAO dao = new ExamenesDAO();
        dao.update(dt);
    }
    
    public void eliminarExamenes (ExamenesDT dt)throws Exception{
        ExamenesDAO dao = new ExamenesDAO();
        dao.delete(dt);
    }
    
    public ExamenesDT buscaExamenesDT(ExamenesDT dt) throws Exception{
        ExamenesDAO dao = new ExamenesDAO();
        return dao.select(dt);
    }
    
    public List  listaExamenes()throws Exception{
        ExamenesDAO dao = new ExamenesDAO();
        return dao.selectall();
    }
    
      /**-------------------**/
   
   
    
      /**-------------------**/
    
    
    public void nuevoNota(NotaDT dt)throws Exception{
        NotaDAO dao = new NotaDAO();
        dao.create(dt);
    }
    
    public void actualizaNota(NotaDT dt)throws Exception{
        NotaDAO dao = new NotaDAO();
        dao.update(dt);
    }
    
    public void eliminarNota (NotaDT dt)throws Exception{
        NotaDAO dao = new NotaDAO();
        dao.delete(dt);
    }
    
    public NotaDT buscaNotaDT(NotaDT dt) throws Exception{
        NotaDAO dao = new NotaDAO();
        return dao.select(dt);
    }
    
    public List  listaNota()throws Exception{
        NotaDAO dao = new NotaDAO();
        return dao.selectall();
    }
    
      /**-------------------**/
    
    
    
    
    
    public Object[] numeros (int inicio,int fin){
        Object[] num = new Object[(fin-inicio+1)];
        int y=0;
        for(int x = inicio; x<=fin; x++){
            num[y]=x;
            y++;
            
        }
        return num;
   }
    
}
