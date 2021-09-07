import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

    private String speciality;


    Doctor (String name, String email){
        super(name, email);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    ArrayList<AvailableAppointment> availableAppointmets = new ArrayList<>();
    public void addAvailableAppointment (Date date, String time){
        availableAppointmets.add(new AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointmets() {
        return availableAppointmets;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: "+ speciality + "\nAvailable: " + availableAppointmets.toString();
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

        @Override
        public String toString() {
            return " AvailableAppointment \ndate=" + date +
                    ", \ntime='" + time + '\'' +
                    '}';
        }
    }

}
