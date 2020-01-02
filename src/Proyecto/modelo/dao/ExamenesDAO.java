/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.modelo.dao;

import Proyecto.modelo.dt.ExamenesDT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luis
 */
public class ExamenesDAO extends ConexionBD{
    private final static String SQL_INSERT="insert into Examenes(fecha,numPreguntas,nombreExamen,idProfesores,idAsignaturas,idCursos)values(?,?,?,?,?,?)";
    private final static String SQL_UPDATE="update Examenes set fecha=?,numPreguntas=?,nombreExamen=?,idProfesores=?,idAsignaturas=?,idCursos=? where idExamenes=?";
    private final static String SQL_DELETE="delete from Examenes where idExamenes=?";
    private final static String SQL_SELECT="select * from Examenes where numPreguntas=? and nombreExamen =?";
    private final static String SQL_SELECTALL="select * from Examenes";
    
    public void create(ExamenesDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_INSERT);
        ps.setDate(1, dt.getFecha());
        ps.setInt(2, dt.getNumPreguntas());
        ps.setString(3, dt.getNombreExamen());
        ps.setInt(4, dt.getIdProfesores());
        ps.setInt(5, dt.getIdAsignaturas());
        ps.setInt(6, dt.getIdCursos());
        ps.executeUpdate();
        cerrar(ps);
    }
    public void update(ExamenesDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_UPDATE);
        ps.setDate(1, dt.getFecha());
        ps.setInt(2, dt.getNumPreguntas());
        ps.setString(3, dt.getNombreExamen());
        ps.setInt(4, dt.getIdProfesores());
        ps.setInt(5, dt.getIdAsignaturas());
        ps.setInt(6, dt.getIdCursos());
        ps.setInt(7, dt.getIdExamenes());
        ps.executeUpdate();
        cerrar(ps);
    }
    
     public void delete(ExamenesDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_DELETE);
        ps.setInt(1, dt.getIdExamenes());
        ps.executeUpdate();
        cerrar(ps);
    }
      public ExamenesDT select(ExamenesDT dt)throws Exception{
        PreparedStatement ps=null;
        ResultSet rs=null;
        ps= conn.prepareStatement(SQL_SELECT);
        ps.setInt(1, dt.getNumPreguntas());
        ps.setString(2, dt.getNombreExamen());
        rs=ps.executeQuery();
        
        if (rs.next()) {
            dt.setIdExamenes(rs.getInt("idExamenes"));
            dt.setFecha(rs.getDate("fecha"));        
            dt.setNumPreguntas(rs.getInt("numPreguntas"));
            dt.setNombreExamen(rs.getString("nombreExamen"));
            dt.setIdProfesores(rs.getInt("idProfesores"));
            dt.setIdAsignaturas(rs.getInt("idAsignaturas"));
            dt.setIdCursos(rs.getInt("idCursos"));
        }
        
         else
            return null;
        return dt;
    }
    public List selectall() throws Exception{
        List lista = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        ExamenesDT dt;
        ps = conn.prepareStatement(SQL_SELECTALL);
        
        rs = ps.executeQuery();
        while(rs.next()){
            dt = new ExamenesDT();
            dt.setIdExamenes(rs.getInt("idExamenes"));
            dt.setFecha(rs.getDate("fecha"));        
            dt.setNumPreguntas(rs.getInt("numPreguntas"));
            dt.setNombreExamen(rs.getString("nombreExamen"));
            dt.setIdProfesores(rs.getInt("idProfesores"));
            dt.setIdAsignaturas(rs.getInt("idAsignaturas"));
            dt.setIdCursos(rs.getInt("idCursos"));
             lista.add(dt);
      }
        return lista;
    
        
    }
}

    

    