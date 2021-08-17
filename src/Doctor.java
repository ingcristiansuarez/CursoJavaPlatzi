public class Doctor {
    static int id = 0;  //Autoincrement
    String name;
    String speciality;

    Doctor(){
        System.out.println("Contruyendo el objeto Doctor");
        id++;
    }

    Doctor (String name){
        System.out.println("El nombre del doctor es "+name);
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
