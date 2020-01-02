/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.modelo.dao;

import Proyecto.modelo.dt.ProfesoresDT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luis
 */
public class ProfesoresDAO extends ConexionBD{
    private final static String SQL_INSERT="insert into Profesores(nombre,aPaterno,aMaterno,direccion,telefono,email,sexo,titulo,cedula)values(?,?,?,?,?,?,?,?,?)";
    private final static String SQL_UPDATE="update Profesores set nombre=?,aPaterno=?,aMaterno=?,direccion=?,telefono=?,email=?,sexo=?,titulo=?,cedula=? where idProfesores=?";
    private final static String SQL_DELETE="delete from Profesores where idProfesores=?";
    private final static String SQL_SELECT="select * from Profesores where nombre=? and aPaterno=?";
    private final static String SQL_SELECTALL="select * from Profesores";

     public void create(ProfesoresDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_INSERT);
        ps.setString(1, dt.getNombre());
        ps.setString(2, dt.getaPaterno());
        ps.setString(3, dt.getaMaterno());
        ps.setString(4, dt.getDireccion());
        ps.setInt(5, dt.getTelefono());
        ps.setString(6, dt.getEmail());
        ps.setString(7, dt.getSexo());
        ps.setString(8, dt.getTitulo());
        ps.setInt(9, dt.getCedula());
        ps.executeUpdate();
        cerrar(ps);
    }
     
     public void update(ProfesoresDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_UPDATE);
         ps.setString(1, dt.getNombre());
        ps.setString(2, dt.getaPaterno());
        ps.setString(3, dt.getaMaterno());
        ps.setString(4, dt.getDireccion());
        ps.setInt(5, dt.getTelefono());
        ps.setString(6, dt.getEmail());
        ps.setString(7, dt.getSexo());
        ps.setString(8, dt.getTitulo());
        ps.setInt(9, dt.getCedula());
        ps.setInt(10, dt.getIdProfesores());
        ps.executeUpdate();
        cerrar(ps);
    }
     public void delete(ProfesoresDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_DELETE);
        ps.setInt(1, dt.getIdProfesores());
        ps.executeUpdate();
        cerrar(ps);
    }
     
     public ProfesoresDT select(ProfesoresDT dt)throws Exception{
        PreparedStatement ps=null;
        ResultSet rs=null;
        ps= conn.prepareStatement(SQL_SELECT);
        ps.setString(1, dt.getNombre());
        ps.setString(2, dt.getaPaterno());
        rs=ps.executeQuery();
        
        if (rs.next()) {
            dt.setIdProfesores(rs.getInt("idProfesores"));
            dt.setNombre(rs.getString("nombre"));
            dt.setaPaterno(rs.getString("aPaterno"));
            dt.setaMaterno(rs.getString("aMaterno"));
            dt.setDireccion(rs.getString("direccion"));
            dt.setTelefono(rs.getInt("telefono"));
            dt.setEmail(rs.getString("email"));
            dt.setSexo(rs.getString("sexo"));
            dt.setTitulo(rs.getString("titulo"));
            dt.setCedula(rs.getInt("cedula"));
            
             }
        else
            return null;
        return dt;
    }
     
     public List selectall() throws Exception{
        List lista = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        ProfesoresDT dt;
        ps = conn.prepareStatement(SQL_SELECTALL);
        
        rs = ps.executeQuery();
        while(rs.next()){
            dt = new ProfesoresDT();
             dt.setIdProfesores(rs.getInt("idProfesores"));
            dt.setNombre(rs.getString("nombre"));
            dt.setaPaterno(rs.getString("aPaterno"));
            dt.setaMaterno(rs.getString("aMaterno"));
            dt.setDireccion(rs.getString("direccion"));
            dt.setTelefono(rs.getInt("telefono"));
            dt.setEmail(rs.getString("email"));
            dt.setSexo(rs.getString("sexo"));
            dt.setTitulo(rs.getString("titulo"));
            dt.setCedula(rs.getInt("cedula"));
             lista.add(dt);
      }
        return lista;
    
        
    }
}

