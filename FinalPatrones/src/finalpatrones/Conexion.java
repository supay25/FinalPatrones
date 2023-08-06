package finalpatrones;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static String DRIVER ="com.mysql.jdbc.Driver";
    private static String USUARIO="root";
    private static String PASSWORD="oirflame";
    private static String URL="jdbc:mysql://localhost:3306/FinalPatrones";
    
    static{
        
        try{
           
            Class.forName(DRIVER);      
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en el driver: "+e );
        } 
    }
    public Connection getConnection(){
        Connection con = null;
         try{
             con=DriverManager.getConnection(URL,USUARIO,PASSWORD);
             JOptionPane.showMessageDialog(null, "Conexion exitosa");

         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error en la conexion: "+e);
         }
         return con;
    }
}

