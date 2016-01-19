/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

/**
 *
 * @author FTECARE
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class Listener 
{
    // public  Connection Con;
        public static Connection OpenConnection(String dbPath)
        {
            try
            {
                       Class.forName("org.sqlite.JDBC");
                      Connection Con = DriverManager.getConnection("jdbc:sqlite:\\" + dbPath);
                  
                       return Con;
            }

            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Sorry we can't connect to the database right now. Please check your connection.");
            }
            return null;  
        }

    
   
}

    

