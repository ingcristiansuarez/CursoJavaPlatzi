public class Doctor {
    static int id = 0;  //Autoincrement
    String name;
    String speciality;

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
}
