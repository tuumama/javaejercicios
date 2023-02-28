import java.util.InputMismatchException;
import java.util.Scanner;

public class gradosfircel {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int cel;
        int far;

        while (!salir) {

            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("4. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (cel) {
                    case 1:
                        System.out.println("Grados cel");
                        break;
                    case 2:
                        System.out.println("Grados far");
                        break;

                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar número");
                sn.next();
            }
        }

    }

}
