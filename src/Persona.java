public class Persona {
    String nombre;
    int edad;
    Direccion direccion;

    public Persona(String nombre, int edad, Direccion direccion){
        this.direccion = direccion;
        this.edad = edad;
        this.nombre = nombre;
    }
    public void mostrarDatos(){
        //imprimir datos de la clase
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        //imprimir datos de la clase direccion
    }
}
