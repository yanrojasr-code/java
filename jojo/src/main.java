//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.InputMismatchException;
public class  main {
public static  void maind (String[] args) {
    Scanner scanner = new Scanner(System.in);


    try {
        System.out.println("ingrese su edad");
        int edad = scanner.nextInt();
        System.out.println("edad registrada " + edad);


        System.out.println(" ingrese su nombre ");
        String nombre = scanner.nextLine();

        if (edad >= 18) {
            System.out.println("acceso autorizado");
        } else {
            System.out.println("acceso restringido");
        }
    }

       catch(InputMismatchException e){
            System.out.println("Error: debes ingresar un numero. ");
    }


  }
}