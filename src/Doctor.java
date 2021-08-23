import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id = 0;  //Autoincrement
    private String name;
    private String speciality;

    Doctor(){
        //System.out.println("Contruyendo el objeto Doctor");
        //id++;
    }

    Doctor (String name, String speciality){
        System.out.println("El nombre del doctor es "+name);
        this.name = name;
        this.speciality = speciality;
        id++;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

    ArrayList<AvailableAppointment> availableAppointmets = new ArrayList<>();
    public void addAvailableAppointment (Date date, String time){
        availableAppointmets.add(new AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointmets() {
        return availableAppointmets;
    }

    public static  class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

}
