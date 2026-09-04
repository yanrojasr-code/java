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

        if (edad < 18) {
            System.out.println("menor de edad");
        } else if (edad <25){
            System.out.println("Estudiante joven ");
        } else {
            System.out.println("estudiante adulto");
        }
        for (int i=1; i <= 5; i++){
        System.out.println("Procesando estudiante" + i);}

        int opcion = -1;
        while (opcion != 0){

            System.out.println("=== SISTEMA DUOC ===");
            System.out.println("1. Mostrar estado");
            System.out.println("2. Procesar operación");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Sistema operativo.");
            } else if (opcion == 2) {
                System.out.println("Procesando operación...");
            } else if (opcion == 0) {
                System.out.println("Cerrando sistema...");
            }
        }

    }
}