
package healthCareSystem;

import java.util.ArrayList;

public class Doctor extends Person {

   //static variable for generating id's automatically
    static int noOfDoctors = 1000;
    protected Speciality speciality;
    ArrayList<String> appointment ;

    Doctor( String name,String phoneNo, String address,Speciality speciality, ArrayList<String> appointment ){
        noOfDoctors ++ ;
        this.id = String.valueOf(noOfDoctors);
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
        this.speciality = speciality;
        this.appointment = appointment;

    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }
}
