package patientprogram;

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
        this.patientFirst = patientFirst;
        this.patientLast = patientLast;
        this.patientAge = patientAge;
        this.patientPhone = patientPhone;
        this.patientAddress = patientAddress;
    }
}
