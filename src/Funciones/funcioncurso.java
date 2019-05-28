
package Funciones;

import aplicacion.cursos;
import aplicacion.estudiantes;
import baseDatos.conexionMYSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import static aplicacion.cursos.cur1;
public class funcioncurso {
        
    public void cursos(String c){
        if(c.equals("N01")){
        cur1=c;
        estudiantes e2=new estudiantes();
        e2.setVisible(true);
            
        }
        else if(c.equals("N02")){
        cur1=c;
        estudiantes e2=new estudiantes();
        e2.setVisible(true);
        }
        else if(c.equals("N03")){
        cur1=c;
        estudiantes e2=new estudiantes();
        e2.setVisible(true);
        
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Por favor seleccione un curso");
        }
    }
    
}
