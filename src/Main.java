import java.util.Arrays;

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
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Cosme Fulanito", "cosme@gmail.com");



    }



}

