
package healthCareSystem;

public class NPatient extends Patient {
    //static variable for generating id's automatically
    static int noOfNPatients = 200;

    NPatient( String name,String phoneNo, String address,String gender, String paymentMethod, String symptoms,String diagnosis ){
        noOfNPatients ++;
        this.id = String.valueOf(noOfNPatients);
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
        this.gender = gender;
        this.paymentMethod = paymentMethod;
        this.symptoms = symptoms;
        this.diagnosis =  diagnosis;
    }
}
