
package listener;

import java.sql.*;
import javax.swing.JOptionPane;

public class Listener 
{
  
        public static Connection OpenConnection(/*String dbPath*/)
        {
            try
            {
                      
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        Connection Con = DriverManager.getConnection("jdbc:sqlserver://FTECARE-PC\\SQLEXPRESS;Namedatabase =gamadev;","sa","2016");
                        JOptionPane.showMessageDialog(null,"good");
                      
                       return Con;
            }

            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
            return null;  
        }
         

}


   
    

