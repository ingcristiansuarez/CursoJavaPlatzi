import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void  main (String[] args){
       /* model.Doctor myDoctor = new model.Doctor("model.Doctor Hiber");
        myDoctor.name = "Dcotor Hiber";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(model.Doctor.id);

        //model.Doctor.id++;
        model.Doctor myDoctorAnn = new model.Doctor();
        myDoctorAnn.showId();
        System.out.println(model.Doctor.id);
*/
        //showMenu();

        Doctor myDoctor = new Doctor("model.Doctor Hiber","dochiber@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "6pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        /*
        for(model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointmets()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
*/
        //model.Patient patient = new model.Patient("Cosme Fulanito", "cosme@gmail.com");

        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient);



    }



}

