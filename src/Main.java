//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion("Suba", "Bogota");
        Persona p1 = new Persona("Felipe",23, direccion1);
        p1.mostrarDatos();

        System.out.println("---------------------------------------------------------");

        Direccion direccion2 = new Direccion("Laureles", "Medellin");
        Persona p2 = new Persona("Juan",30,direccion2);
        p2.mostrarDatos();
    }
}