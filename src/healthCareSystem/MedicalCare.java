
package healthCareSystem;

public class MedicalCare {

   
    public static void main(String[] args) {
         FileReader.openFile();
        FileReader.readFile();
        FileReader.closeFile();
        //HC.editDoctor("1001","name","phone no", "address",Speciality.Dentist);
        //HC.editEPatient("551","name","phoneNo","address","gender", "paymentMethod","symptoms", "diagnosis","roomNo");
        //HC.editNPatient("201","name","phoneNo","address","gender", "paymentMethod","symptoms", "diagnosis");
        //HC.addAppointment("1001", "3:00pm_June_15,2020");
        HC.displayDoctor();
        HC.displayNPatient();
        HC.displayEPatient();
    }
    
}
