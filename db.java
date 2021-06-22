/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RAC;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author onura
 */
public class db {
    Connection conn=null;
    
    public static Connection connect_db()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:D:\\NetBeansProjects\\RAC\\rac_db.sqlite");
            return conn;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    
}

    