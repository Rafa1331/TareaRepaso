package ProyectoRepaso;

public class Mascota {
    private String nombre;
    private int edad;
    private String tipoAnimal;
    public  Mascota(String nombre, int edad, String tipoAnimal){
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAnimal = tipoAnimal;
    }

    public String getNombre() {
        return nombre;
    }
}
