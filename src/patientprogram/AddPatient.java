package patientprogram;

import java.sql.Statement;
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
                stmt.executeUpdate("INSERT INTO PATIENT(PFName,PLName, PAge, PPhone, PAddress) VALUE( '"+patientFirst+"','"+patientLast+"',"+patientAge+",'"+patientPhone+"', '"+patientAddress+"'");
                stmt.close();
                
                
        }
        
        catch(SQLException err)
        {
            JFrame z = null;
            JOptionPane.showMessageDialog(z,err.getMessage());
        }
    }
}
