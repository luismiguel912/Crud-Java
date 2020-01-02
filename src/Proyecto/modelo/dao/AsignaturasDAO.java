/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Proyecto.modelo.dao;

import Proyecto.modelo.dt.AsignaturasDT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class AsignaturasDAO extends ConexionBD{
    private final static String SQL_INSERT="insert into Asignaturas(nombre,descripcion)values(?,?)";
    private final static String SQL_UPDATE="update Asignaturas set nombre=?,descripcion=? where idAsignaturas=?";
    private final static String SQL_DELETE="delete from Asignaturas where idAsignaturas=?";
    private final static String SQL_SELECT="select * from Asignaturas where nombre=? and descripcion=?";
    private final static String SQL_SELECTALL="select * from Asignaturas";
    
     public void create(AsignaturasDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_INSERT);
        ps.setString(1, dt.getNombre());
        ps.setString(2, dt.getDescripcion());
        ps.executeUpdate();
        cerrar(ps);
        }
    public void update(AsignaturasDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_UPDATE);
        ps.setString(1, dt.getNombre());
        ps.setString(2, dt.getDescripcion());
        ps.setInt(3, dt.getIdAsignaturas());
        ps.executeUpdate();
        cerrar(ps);
    }
    public void delete(AsignaturasDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_DELETE);
        ps.setInt(1, dt.getIdAsignaturas());
        ps.executeUpdate();
        cerrar(ps);
    }
     public AsignaturasDT select(AsignaturasDT dt)throws Exception{
        PreparedStatement ps=null;
        ResultSet rs=null;
        ps= conn.prepareStatement(SQL_SELECT);
        ps.setString(1, dt.getNombre());
        ps.setString(2, dt.getDescripcion());
        rs = ps.executeQuery();
        if (rs.next()) {
            dt.setIdAsignaturas(rs.getInt("idAsignaturas"));
            dt.setNombre(rs.getString("Nombre"));
            dt.setDescripcion(rs.getString("Descripcion"));
        }
        else
            return null;
        return dt;
    }
      public List selectall() throws Exception{
        List lista = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        AsignaturasDT dt;
        ps = conn.prepareStatement(SQL_SELECTALL);
        
        rs = ps.executeQuery();
        while(rs.next()){
            dt = new AsignaturasDT();
             dt.setIdAsignaturas(rs.getInt("idAsignaturas"));
            dt.setNombre(rs.getString("Nombre"));
            dt.setDescripcion(rs.getString("Descripcion"));
            lista.add(dt);
        }
        return lista;
    
        
    }
}

  