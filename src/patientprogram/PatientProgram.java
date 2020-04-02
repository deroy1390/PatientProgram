package patientprogram;
import java.util.*;
import javax.swing.JOptionPane;

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
        Scanner in = new Scanner(System.in);
        boolean on = true;
        
        while(on)
        {
            String selection = JOptionPane.showInputDialog("########Welcome to the Patient Tracking System########\n"
       + "Select 1 to add a patient\n"
                + "Select 2 to lookup a patient"
                + "Select 3 to add patient insurance");
            
            if(selection.equals("1"))
            {
                String patientFirst = JOptionPane.showInputDialog("####Enter New Patient Information####"
                + "Enter Patient First Name: ");
                String patientLast = JOptionPane.showInputDialog("Enter Patient Last Name: ");
            }
            
        }
        
        
        
    }
    
}
