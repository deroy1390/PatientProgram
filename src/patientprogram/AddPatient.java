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
    String patientAge;
    String patientPhone;
    String patientAddress;
    
    public void patientAdd(String patientFirst, String patientLast, String patientAge, String patientPhone, String patientAddress)
    {
               
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
            
            Connection con = DriverManager.getConnection(host, uName, uPass);
        }
        
        catch(SQLException err)
        {
            JFrame z = null;
            JOptionPane.showMessageDialog(z,err.getMessage());
        }
    }
}
