public class Persona {
    String nombre;
    int edad;
    Direccion direccion;

    public Persona(String nombre, int edad, Direccion direccion){
        this.direccion = direccion;
        this.edad = edad;
        this.nombre = nombre;
    }
}
