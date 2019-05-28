/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import aplicacion.cursos;
import aplicacion.registrarse;
import baseDatos.conexionMYSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static aplicacion.logueo.texto;

public class Funciones {
    
    public void Logguearse(String nom, String pass){
        
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
        
        try
        {
        Statement b =  cn.createStatement();
        ResultSet busqusua = b.executeQuery("SELECT * FROM registro WHERE ID_nit and usuario='"+nom+"' and clave='"+pass+"'");
        boolean found = false;
        int user_id = 0;
        while(busqusua.next()){found=true; user_id = busqusua.getInt("ID_nit");}
        if(found)
        {
            JOptionPane.showMessageDialog(null, "Acceso concedido...","Ingresando",JOptionPane.INFORMATION_MESSAGE);
            texto=nom;
            cursos e2=new cursos();
            e2.setVisible(true);
            
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Usuario incorrecto...","Incorrecto",JOptionPane.ERROR_MESSAGE);
        }
        }
        catch(SQLException ex)
        {
        JOptionPane.showMessageDialog(null,ex, "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    
}   
    
       
        public void ventanaregistro(){
        registrarse e2=new registrarse();
        e2.setVisible(true);
}
        
}
