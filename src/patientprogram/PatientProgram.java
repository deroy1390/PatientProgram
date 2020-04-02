package patientprogram;
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
public class PatientProgram 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try
        {
            String host = "jdbc:derby://localhost:1527/contact";
            String uName = "nbuser";
            String uPass = "nbuser";
            
            Connection con = DriverManager.getConnection(host, uName, uPass);
            
            Scanner in = new Scanner(System.in);
            boolean on = true;
        
            while(on)
            {
                String selection = JOptionPane.showInputDialog("########Welcome to the Patient Tracking System########\n"
           + "Select 1 to add a patient\n");

                if(selection.equals("1"))
                {
                    String patientFirst = JOptionPane.showInputDialog("####Enter New Patient Information####\n"
                    + "Enter Patient First Name: ");
                    String patientLast = JOptionPane.showInputDialog("Enter Patient Last Name: ");
                    String patientAge = JOptionPane.showInputDialog("Enter Patient Age: ");
                    String patientPhone = JOptionPane.showInputDialog("Enter Patient Phone: ");
                    String patientAddress = JOptionPane.showInputDialog("Enter Patient Address: ");

                    AddPatient addPatient = new AddPatient();
                    addPatient.patientAdd(patientFirst, patientLast, patientAge, patientPhone, patientAddress);
                    String verify = JOptionPane.showInputDialog("Is the following information correct?\n"
                    + "Patient Name: " + addPatient.patientFirst + " " + addPatient.patientLast + "\n"
                    + "Patient Age: " + addPatient.patientAge + "\n"
                    + "Patient Phone: " + addPatient.patientPhone + "\n"
                    + "Patient Address: " + addPatient.patientAddress
                    + "Yes/No");


                    if(verify.equalsIgnoreCase("Yes"))
                    {
                        JFrame f = null;

                            JOptionPane.showMessageDialog(f, "Patient Added");
                             on = false;   
                    }



                }

            }



            }
        
        catch(SQLException err)
        {
            JFrame z = null;
            JOptionPane.showMessageDialog(z,err.getMessage());
        }
        
        
        
        
    }
    
}
