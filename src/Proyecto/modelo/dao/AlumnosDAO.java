/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Proyecto.modelo.dao;

import Proyecto.modelo.dt.AlumnosDT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class AlumnosDAO extends ConexionBD{
    private final static String SQL_INSERT="insert into Alumnos(matricula,grupo,nombre,aPaterno,aMaterno,direccion,telefono,email,fechaNacimiento,sexo)values(?,?,?,?,?,?,?,?,?,?)";
    private final static String SQL_UPDATE="update Alumnos set matricula=?,grupo=?,nombre=?,aPaterno=?,aMaterno=?,direccion=?,telefono=?,email=?,fechaNacimiento=?,sexo=? where idAlumnos=?";
    private final static String SQL_DELETE="delete from Alumnos where idAlumnos=?";
    private final static String SQL_SELECT="select * from Alumnos where nombre=? and aPaterno =?";
    private final static String SQL_SELECTALL="select * from Alumnos";
    
     public void create(AlumnosDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_INSERT);
        ps.setString(1, dt.getMatricula());
        ps.setString(2, dt.getGrupo());
        ps.setString(3, dt.getNombre());
        ps.setString(4, dt.getaPaterno());
        ps.setString(5, dt.getaMaterno());
        ps.setString(6, dt.getDireccion());
        ps.setInt(7, dt.getTelefono());
        ps.setString(8, dt.getEmail());
        ps.setDate(9, dt.getFechaNacimiento());
        ps.setString(10, dt.getSexo());
        ps.executeUpdate();
        cerrar(ps);
    }
     public void update(AlumnosDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_UPDATE);
         ps.setString(1, dt.getMatricula());
        ps.setString(2, dt.getGrupo());
        ps.setString(3, dt.getNombre());
        ps.setString(4, dt.getaPaterno());
        ps.setString(5, dt.getaMaterno());
        ps.setString(6, dt.getDireccion());
        ps.setInt(7, dt.getTelefono());
        ps.setString(8, dt.getEmail());
        ps.setDate(9, dt.getFechaNacimiento());
        ps.setString(10, dt.getSexo());
        ps.setInt(11, dt.getIdAlumnos());
        ps.executeUpdate();
        cerrar(ps);
    }
    
    public void delete(AlumnosDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_DELETE);
        ps.setInt(1, dt.getIdAlumnos());
        ps.executeUpdate();
        cerrar(ps);
    }
    public AlumnosDT select(AlumnosDT dt)throws Exception{
        PreparedStatement ps=null;
        ResultSet rs=null;
        ps= conn.prepareStatement(SQL_SELECT);
        ps.setString(1, dt.getNombre());
        ps.setString(2, dt.getaPaterno());
        rs=ps.executeQuery();
        
        if (rs.next()) {
            dt.setIdAlumnos(rs.getInt("idAlumnos"));
            dt.setMatricula(rs.getString("matricula"));
            dt.setGrupo(rs.getString("grupo"));
            dt.setNombre(rs.getString("nombre"));
            dt.setaPaterno(rs.getString("aPaterno"));
            dt.setaMaterno(rs.getString("aMaterno"));
            dt.setDireccion(rs.getString("direccion"));
            dt.setTelefono(rs.getInt("telefono"));
            dt.setEmail(rs.getString("email"));
            dt.setFechaNacimiento(rs.getDate("fechaNacimiento"));        
            dt.setSexo(rs.getString("sexo"));
        }
        else
            return null;
        return dt;
    }
    public List selectall() throws Exception{
        List lista = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        AlumnosDT dt;
        ps = conn.prepareStatement(SQL_SELECTALL);
        
        rs = ps.executeQuery();
        while(rs.next()){
            dt = new AlumnosDT();
            dt.setIdAlumnos(rs.getInt("idAlumnos"));
            dt.setMatricula(rs.getString("matricula"));
            dt.setGrupo(rs.getString("grupo"));
            dt.setNombre(rs.getString("nombre"));
            dt.setaPaterno(rs.getString("aPaterno"));
            dt.setaMaterno(rs.getString("aMaterno"));
            dt.setDireccion(rs.getString("direccion"));
            dt.setTelefono(rs.getInt("telefono"));
            dt.setEmail(rs.getString("email"));
            dt.setFechaNacimiento(rs.getDate("fechaNacimiento"));        
            dt.setSexo(rs.getString("sexo"));
            lista.add(dt);
      }
        return lista;
    
        
    }
}

    
