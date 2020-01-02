/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Proyecto.modelo.dao;
import Proyecto.modelo.dt.CursosDT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class CursosDAO extends ConexionBD{
    private final static String SQL_INSERT="insert into Cursos(nombres,descripcion)values(?,?)";
    private final static String SQL_UPDATE="update Cursos set nombres=?,descripcion=? where idCursos=?";
    private final static String SQL_DELETE="delete from Cursos where idCursos=?";
    private final static String SQL_SELECT="select * from Cursos where nombres=? and descripcion=?";
    private final static String SQL_SELECTALL="select * from Cursos";
    
    public void create(CursosDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_INSERT);
        ps.setString(1, dt.getNombres());
        ps.setString(2, dt.getDescripcion());
        ps.executeUpdate();
        cerrar(ps);
        }
    public void update(CursosDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_UPDATE);
        ps.setString(1, dt.getNombres());
        ps.setString(2, dt.getDescripcion());
        ps.setInt(3, dt.getIdCursos());
        ps.executeUpdate();
        cerrar(ps);
    }
    public void delete(CursosDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_DELETE);
        ps.setInt(1, dt.getIdCursos());
        ps.executeUpdate();
        cerrar(ps);
    }
     public CursosDT select(CursosDT dt)throws Exception{
        PreparedStatement ps=null;
        ResultSet rs=null;
        ps= conn.prepareStatement(SQL_SELECT);
        ps.setString(1, dt.getNombres());
        ps.setString(2, dt.getDescripcion());
        rs = ps.executeQuery();
        if (rs.next()) {
            dt.setIdCursos(rs.getInt("idCursos"));
            dt.setNombres(rs.getString("Nombres"));
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
        CursosDT dt;
        ps = conn.prepareStatement(SQL_SELECTALL);
        
        rs = ps.executeQuery();
        while(rs.next()){
            dt = new CursosDT();
            dt.setIdCursos(rs.getInt("idCursos"));
            dt.setNombres(rs.getString("Nombres"));
            dt.setDescripcion(rs.getString("Descripcion"));
            lista.add(dt);
        }
        return lista;
    }
}

  