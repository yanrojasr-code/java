import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su carrera");
        String carrera = scanner.nextLine();

        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();

        Estudiante estudiante = new Estudiante(nombre, carrera, edad);
        estudiante.mostrarInformacion();

        if (edad >= 18) {
            System.out.println("acceso autorizado");
        } else {
            System.out.println("Acceso restringido ");
        }
        estudiante.mostrarInformacion();
    }
}