/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.modelo.dao;

import Proyecto.modelo.dt.PreguntasDT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luis
 */
public class PreguntasDAO extends ConexionBD{
    private final static String SQL_INSERT="insert into Preguntas(enunciado,idRespuestas,idExamenes)values(?,?,?)";
    private final static String SQL_UPDATE="update Preguntas set enunciado=?,idRespuestas=?,idExamenes=? where idPreguntas=?";
    private final static String SQL_DELETE="delete from Preguntas where idPreguntas=?";
    private final static String SQL_SELECT="select * from Preguntas where enunciado=? and idRespuestas =?";
    private final static String SQL_SELECTALL="select * from Preguntas";

     public void create(PreguntasDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_INSERT);
        ps.setString(1, dt.getEnunciado());
        ps.setInt(2, dt.getIdRespuestas());
        ps.setInt(3, dt.getIdExamenes());
        ps.executeUpdate();
        cerrar(ps);
         }
     public void update(PreguntasDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_UPDATE);
        ps.setString(1, dt.getEnunciado());
        ps.setInt(2, dt.getIdRespuestas());
        ps.setInt(3, dt.getIdExamenes());
        ps.setInt(4, dt.getIdPreguntas());
        ps.executeUpdate();
        cerrar(ps);
    }
     public void delete(PreguntasDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_DELETE);
        ps.setInt(1, dt.getIdPreguntas());
        ps.executeUpdate();
        cerrar(ps);
    }
     public PreguntasDT select(PreguntasDT dt)throws Exception{
        PreparedStatement ps=null;
        ResultSet rs=null;
        ps= conn.prepareStatement(SQL_SELECT);
        ps.setString(1, dt.getEnunciado());
        ps.setInt(2, dt.getIdRespuestas());
        rs=ps.executeQuery();
        
        if (rs.next()) {
            dt.setIdPreguntas(rs.getInt("idPreguntas"));
            dt.setEnunciado(rs.getString("enunciado"));
            dt.setIdRespuestas(rs.getInt("idRespuestas"));
            dt.setIdExamenes(rs.getInt("idExamenes"));
             }
        
         else
            return null;
        return dt;
    }
    public List selectall() throws Exception{
        List lista = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        PreguntasDT dt;
        ps = conn.prepareStatement(SQL_SELECTALL);
        
        rs = ps.executeQuery();
        while(rs.next()){
            dt = new PreguntasDT();
            dt.setIdPreguntas(rs.getInt("idPreguntas"));
            dt.setEnunciado(rs.getString("enunciado"));
            dt.setIdRespuestas(rs.getInt("idRespuestas"));
            dt.setIdExamenes(rs.getInt("idExamenes"));
             lista.add(dt);
      }
        return lista;
    
        
    }
}

    
            
    