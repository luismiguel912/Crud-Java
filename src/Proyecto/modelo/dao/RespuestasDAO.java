/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.modelo.dao;

import Proyecto.modelo.dt.RespuestasDT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luis
 */
public class RespuestasDAO extends ConexionBD{
    private final static String SQL_INSERT="insert into Respuestas(respuestaA,respuestaB,respuestaC)values(?,?,?)";
    private final static String SQL_UPDATE="update Respuestas set respuestaA=?,respuestaB=?,respuestaC=? where idRespuestas=?";
    private final static String SQL_DELETE="delete from Respuestas where idRespuestas=?";
    private final static String SQL_SELECT="select * from Respuestas where respuestaA=? and respuestaB=?";
    private final static String SQL_SELECTALL="select * from Respuestas";
    
    public void create(RespuestasDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_INSERT);
        ps.setString(1, dt.getRespuestaA());
        ps.setString(2, dt.getRespuestaB());
        ps.setString(3, dt.getRespuestaC());

        ps.executeUpdate();
        cerrar(ps);
        }
     public void update(RespuestasDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_UPDATE);
        ps.setString(1, dt.getRespuestaA());
        ps.setString(2, dt.getRespuestaB());
        ps.setString(3, dt.getRespuestaC());
        ps.setInt(4, dt.getIdRespuestas());
        ps.executeUpdate();
        cerrar(ps);
    }
      public void delete(RespuestasDT dt)throws Exception{
        PreparedStatement ps=null;
        ps= conn.prepareStatement(SQL_DELETE);
        ps.setInt(1, dt.getIdRespuestas());
        ps.executeUpdate();
        cerrar(ps);
    }
      public RespuestasDT select(RespuestasDT dt)throws Exception{
        PreparedStatement ps=null;
        ResultSet rs=null;
        ps= conn.prepareStatement(SQL_SELECT);
        ps.setString(1, dt.getRespuestaA());
        ps.setString(2, dt.getRespuestaB());
        rs = ps.executeQuery();
        if (rs.next()) {
            dt.setIdRespuestas(rs.getInt("idRespuestas"));
            dt.setRespuestaA(rs.getString("RespuestaA"));
            dt.setRespuestaB(rs.getString("RespuestaB"));
            dt.setRespuestaC(rs.getString("RespuestaC"));

        }
        else
            return null;
        return dt;
    }
      
       public List selectall() throws Exception{
        List lista = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        RespuestasDT dt;
        ps = conn.prepareStatement(SQL_SELECTALL);
        
        rs = ps.executeQuery();
        while(rs.next()){
            dt = new RespuestasDT();
            dt.setIdRespuestas(rs.getInt("idRespuestas"));
            dt.setRespuestaA(rs.getString("RespuestaA"));
            dt.setRespuestaB(rs.getString("RespuestaB"));
            dt.setRespuestaC(rs.getString("RespuestaC"));
             lista.add(dt);
        }
        return lista;
    
        
    }
}