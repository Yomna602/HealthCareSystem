
package healthCareSystem;

import java.util.ArrayList;

public class HC {
        static ArrayList<Doctor> arrDoctor = new ArrayList<>();
        static ArrayList<EPatient> arrEmergency = new ArrayList<>();
        static ArrayList<NPatient> arrNormal = new ArrayList<>();
        

        static void addDoctor( String name,String phoneNo, String address,Speciality speciality, ArrayList<String> appointment){
                arrDoctor.add(new Doctor( name, phoneNo, address, speciality,appointment));
        }
        static void addNPatient( String name,String phoneNo, String address,String gender, String paymentMethod, String symptoms,String diagnosis ){
                arrNormal.add(new NPatient( name, phoneNo, address, gender, paymentMethod, symptoms, diagnosis));
        }
        static void addEPatient( String name,String phoneNo, String address,String gender, String paymentMethod, String symptoms,String diagnosis, String roomNo ){
                arrEmergency.add(new EPatient( name, phoneNo, address, gender, paymentMethod, symptoms, diagnosis, roomNo));
        }
        static void editDoctor(String id, String name,String phoneNo, String address,Speciality speciality){
                //Note that ID can never change it's the means to recognize the object
                for (Doctor d : arrDoctor) {
                        if( id.compareTo(d.id) == 0){
                                d.name = name;
                                d.phoneNo = phoneNo;
                                d.address = address;
                                d.speciality = speciality;
                                break;
                        }
                }

        }
        static void addAppointment(String id , String appointment){
                for (Doctor d : arrDoctor) {
                        if( id.compareTo(d.id) == 0){
                                d.appointment.add(appointment);
                                break;
                        }
                }
        }
        static void editNPatient(String id, String name,String phoneNo, String address,String gender, String paymentMethod, String symptoms,String diagnosis ){
               //Note that ID can never change it's the means to recognize the object
                for (NPatient n : arrNormal) {
                        if( id.compareTo(n.id) == 0){
                                n.name = name;
                                n.phoneNo = phoneNo;
                                n.address = address;
                                n.gender = gender;
                                n.paymentMethod = paymentMethod;
                                n.symptoms = symptoms;
                                n.diagnosis = diagnosis;
                                break;
                        }
                }

        }
        static void editEPatient(String id, String name,String phoneNo, String address,String gender, String paymentMethod, String symptoms,String diagnosis,String roomNo ){
               //Note that ID can never change it's the means to recognize the object
                for (EPatient e : arrEmergency) {
                        if( id.compareTo(e.id) == 0){
                                e.name = name;
                                e.phoneNo = phoneNo;
                                e.address = address;
                                e.gender = gender;
                                e.paymentMethod = paymentMethod;
                                e.symptoms = symptoms;
                                e.diagnosis = diagnosis;
                                e.roomNo = roomNo;
                                break;
                        }
                }

        }
        static void displayDoctor(){
                if(arrDoctor.size() != 0){
                        for (Doctor d :arrDoctor) {
                        System.out.println("------------------------------Doctor ----------------------------");
                        System.out.println("My id: " + d.getId());
                        System.out.println("My name: " + d.getName());
                        System.out.println("My phoneNo: " + d.getPhoneNo());
                        System.out.println("My address: " + d.getAddress());
                        System.out.println("My speciality: " + d.getSpeciality());
                        int sz = d.appointment.size();
                                for (int i = 0; i < sz ; i++) {
                                        System.out.println("Appointment " + (i + 1) + " : " + d.appointment.get(i));
                                }
                }
                }
                else{
                        System.out.println("Doctors' Array is Empty!");
                }

        }
        static void displayNPatient(){
                if(arrNormal.size() != 0){
                        for (NPatient n :arrNormal) {
                        System.out.println("--------------------------Normal Patient ----------------------------");
                        System.out.println("My id: " + n.getId());
                        System.out.println("My name: " + n.getName());
                        System.out.println("My phoneNo: " + n.getPhoneNo());
                        System.out.println("My address: " + n.getAddress());
                        System.out.println("My gender: " + n.getGender());
                        System.out.println("My payment method: " + n.getPaymentMethod());
                        System.out.println("My symptoms: "+ n.getSymptoms());
                        System.out.println("My diagnosis: "+ n.getDiagnosis());
                }
                }
                else{
                        System.out.println("Normal Patients' Array is Empty!");
                }

        }
        static void displayEPatient(){
                if(arrEmergency.size() != 0){
                        for (EPatient e :arrEmergency) {
                        System.out.println("--------------------------Emergency Patient ----------------------------");
                        System.out.println("My id: " + e.getId());
                        System.out.println("My name: " + e.getName());
                        System.out.println("My phoneNo: " + e.getPhoneNo());
                        System.out.println("My address: " + e.getAddress());
                        System.out.println("My gender: " + e.getGender());
                        System.out.println("My payment method: " + e.getPaymentMethod());
                        System.out.println("My symptoms: "+ e.getSymptoms());
                        System.out.println("My diagnosis: "+ e.getDiagnosis());
                        System.out.println("My room number: " + e.roomNo);
                }
                }
                else{
                        System.out.println("Normal Patients' Array is Empty!");
                }

        }



}
