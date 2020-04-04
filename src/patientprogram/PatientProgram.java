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
public class PatientProgram 
{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws Exception 
    {
        Statement stmt = null;
        Connection con = null;
        try
        {
            JFrame c = null;
            String host = "jdbc:derby://localhost:1527/contact";
            String uName = "nbuser";
            String uPass = "nbuser";
            
            con = DriverManager.getConnection(host, uName, uPass);
            
            
            
            
            Scanner in = new Scanner(System.in);
            boolean on = true;
        
            while(on)
            {
                String selection = JOptionPane.showInputDialog("########Welcome to the Patient Tracking System########\n"
                + "Type 1 to add a patient\n"
                + "Type 2 to remove a patient\n"
                + "Type 3 to end program\n");

                if(selection.equals("1"))
                {
                    
                    String patientFirst = JOptionPane.showInputDialog("####Enter New Patient Information####\n"
                    + "Enter Patient First Name: ");
                    String patientLast = JOptionPane.showInputDialog("Enter Patient Last Name: ");
                    String patientAge = JOptionPane.showInputDialog("Enter Patient Age: ");
                    String patientPhone = JOptionPane.showInputDialog("Enter Patient Phone (format xxx-xxx-xxxx): ");
                    while(patientPhone.length()!= 12)
                    {
                        String temp = JOptionPane.showInputDialog("Sorry, improper format, please re-enter below");
                        patientPhone = temp;
                        
                    }
                    
                    String patientAddress = JOptionPane.showInputDialog("Enter Patient Address: ");
                    
                    int age = Integer.parseInt(patientAge);
                    AddPatient addPatient = new AddPatient();
                    addPatient.patientAdd(patientFirst, patientLast, age, patientPhone, patientAddress);
                    String verify = JOptionPane.showInputDialog("Is the following information correct?\n"
                    + "Patient Name: " + addPatient.patientFirst + " " + addPatient.patientLast + "\n"
                    + "Patient Age: " + addPatient.patientAge + "\n"
                    + "Patient Phone: " + addPatient.patientPhone + "\n"
                    + "Patient Address: \n" + addPatient.patientAddress
                    + "Yes/No");  
                    
                    
                                     
                    if(verify.equalsIgnoreCase("Yes"))
                    {
                        JFrame f = null;

                            JOptionPane.showMessageDialog(f, "Patient Added");
                              
                    }



                }
                
                if(selection.equals("2"))
                {
                    
                    String patientFirst = JOptionPane.showInputDialog("####Enter New Patient Information####\n"
                    + "Enter Patient First Name: ");
                    String patientLast = JOptionPane.showInputDialog("Enter Patient Last Name: ");                 
               
                    AddPatient removePatient = new AddPatient();
                    removePatient.patientRemove(patientFirst, patientLast);
                    String verify = JOptionPane.showInputDialog("Is the following information correct (Yes/No)?\n"
                    + "Patient Name: " + removePatient.patientFirst + " " + removePatient.patientLast + "\n");
                    
                    
                    
                                     
                    if(verify.equalsIgnoreCase("Yes"))
                    {
                        JFrame f = null;

                            JOptionPane.showMessageDialog(f, "Patient Removed");
                                
                    }
                }
                
                if(selection.equals("3"))
                {
                    on = false;
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
