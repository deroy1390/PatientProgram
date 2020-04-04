package patientprogram;

import java.sql.PreparedStatement;
import java.sql.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ethan DeRoy
 */
public class AddPatient 
{
    String patientFirst;
    String patientLast;
    int patientAge;
    String patientPhone;
    String patientAddress;
    
    public void patientAdd(String patientFirst, String patientLast, int patientAge, String patientPhone, String patientAddress)
    {
        Connection con = null;
        Statement stmt = null;
               
        try
        {
                this.patientFirst = patientFirst;
                this.patientLast = patientLast;
                this.patientAge = patientAge;
                this.patientPhone = patientPhone;
                this.patientAddress = patientAddress;
                
                String host = "jdbc:derby://localhost:1527/contact";
                String uName = "nbuser";
                String uPass = "nbuser";
                
                
                con = DriverManager.getConnection(host, uName, uPass);
                stmt = con.createStatement();
                String SQL = ("INSERT INTO Patient VALUES ('"+patientFirst+"', '"+patientLast+"',"+patientAge+",'"+patientPhone+"', '"+patientAddress+"')");
                stmt.executeUpdate(SQL);
                
                patientFirst = ("");
                patientLast = ("");
                patientAge = 0;
                patientPhone = ("");
                patientAddress = ("");
                con.close();
                stmt.close();
                
                
                
                
                
                
        }
        
        catch(SQLException err)
        {
            JFrame z = null;
            JOptionPane.showMessageDialog(z,err.getMessage());
        }
    }
    
    public void patientRemove(String patientFirst, String patientLast)
    {
        Connection con = null;
        Statement stmt = null;
               
        try
        {
                this.patientFirst = patientFirst;
                this.patientLast = patientLast;
                
                
                String host = "jdbc:derby://localhost:1527/contact";
                String uName = "nbuser";
                String uPass = "nbuser";
                
                
                con = DriverManager.getConnection(host, uName, uPass);
                stmt = con.createStatement();
                String SQL = ("DELETE FROM Patient WHERE PFNAME = ('"+patientFirst+"') AND PLNAME = ('"+patientLast+"')");
                stmt.executeUpdate(SQL);
                
                
                
                
                
                
        }
        
        catch(SQLException err)
        {
            JFrame z = null;
            JOptionPane.showMessageDialog(z,err.getMessage());
        }
    }
}
