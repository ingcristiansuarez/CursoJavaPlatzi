import java.util.Arrays;
import java.util.Date;

import static UI.UIMenu.*;

public class Main {
    public static void  main (String[] args){
       /* Doctor myDoctor = new Doctor("Doctor Hiber");
        myDoctor.name = "Dcotor Hiber";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        //Doctor.id++;
        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.showId();
        System.out.println(Doctor.id);
*/
        //showMenu();

        Doctor myDoctor = new Doctor("Doctor Hiber","Cardiologia");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "6pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for(Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointmets()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        //Patient patient = new Patient("Cosme Fulanito", "cosme@gmail.com");



    }



}

