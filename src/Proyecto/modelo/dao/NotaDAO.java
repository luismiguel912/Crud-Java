/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.modelo.dao;

import Proyecto.modelo.dt.NotaDT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luis
 */
public class NotaDAO extends ConexionBD{
    private final static String SQL_INSERT="insert into Nota(notas,idAlumnos,idExamenes)values(?,?,?)";
    private final static String SQL_UPDATE="update Nota set notas=?,idAlumnos=?,idExamenes=? where idNota=?";
    private final static String SQL_DELETE="delete from Nota where idNota=?";
    private final static String SQL_SELECT="select * from Nota where notas=? and idAlumnos=?";
    private final static String SQL_SELECTALL="select * from Nota";
    
    public void create(NotaDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_INSERT);
        ps.setInt(1, dt.getNotas());
        ps.setInt(2, dt.getIdAlumnos());
        ps.setInt(3, dt.getIdExamenes());
        ps.executeUpdate();
        cerrar(ps);
    }
    public void update(NotaDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_UPDATE);
        ps.setInt(1, dt.getNotas());
        ps.setInt(2, dt.getIdAlumnos());
        ps.setInt(3, dt.getIdExamenes());
        ps.setInt(4, dt.getIdNota());
        ps.executeUpdate();
        cerrar(ps);
    }
    
     public void delete(NotaDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_DELETE);
        ps.setInt(1, dt.getIdNota());
        ps.executeUpdate();
        cerrar(ps);
    }
     
     public NotaDT select(NotaDT dt)throws Exception{
        PreparedStatement ps=null;
        ResultSet rs=null;
        ps= conn.prepareStatement(SQL_SELECT);
        ps.setInt(1, dt.getNotas());
        ps.setInt(2, dt.getIdAlumnos());
        rs=ps.executeQuery();
        
        if (rs.next()) {
            dt.setIdNota(rs.getInt("idNota"));
            dt.setNotas(rs.getInt("Notas"));
            dt.setIdAlumnos(rs.getInt("idAlumnos"));
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
        NotaDT dt;
        ps = conn.prepareStatement(SQL_SELECTALL);
        
        rs = ps.executeQuery();
        while(rs.next()){
            dt = new NotaDT();
            dt.setIdNota(rs.getInt("idNota"));
            dt.setNotas(rs.getInt("Notas"));
            dt.setIdAlumnos(rs.getInt("idAlumnos"));
            dt.setIdExamenes(rs.getInt("idExamenes"));
             lista.add(dt);
      }
        return lista;
    
        
    }
}
