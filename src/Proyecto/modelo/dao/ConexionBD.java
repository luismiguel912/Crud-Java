/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Proyecto.modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class ConexionBD {
  protected Connection conn;
    protected void cerrar(PreparedStatement stm)throws Exception{
        stm.close();
    }
    protected void cerrar(ResultSet rst)throws Exception{
        rst.close();
    }
    
    //Se crea una instancia de conexión
    public ConexionBD() {
        String driver="org.gjt.mm.mysql.Driver";
        String user="root";
        String pwd="root";
        String basedatos;
        basedatos = "practica5";
        String server="jdbc:mysql://localhost/"+basedatos;
        try {
            Class.forName(driver);
            conn=DriverManager.getConnection(server,user,pwd);
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}