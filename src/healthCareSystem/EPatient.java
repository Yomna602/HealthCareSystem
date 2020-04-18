
package healthCareSystem;
        
public class EPatient extends Patient {
    protected String roomNo;

   //static variable for generating id's automatically
    static int noOfEPatients = 550;

    EPatient( String name,String phoneNo, String address,String gender, String paymentMethod, String symptoms,String diagnosis, String roomNo ){
        noOfEPatients ++;
        this.id = String.valueOf(noOfEPatients);
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
        this.gender = gender;
        this.paymentMethod = paymentMethod;
        this.symptoms = symptoms;
        this.diagnosis =  diagnosis;
        this.roomNo = roomNo;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }
}
