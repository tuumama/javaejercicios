import java.util.*;

public class calculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char opcion;
        int opc, resu;
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("\tMENU\n  1. Suma\n  2. Resta\n  3. Multiplicación\n  4. División\n  ");
            do {
                System.out.println("Selecciona una opción: ");
                opc = teclado.nextInt();
            } while (opc < 1 || opc > 4);

            switch (opc) {
                case 1:
                    System.out.println("\33[0;1m");
                    System.out.println("\nSuma");
                    System.out.println("Ingresa primer valor");
                    int num1 = teclado.nextInt();
                    System.out.println("Ingresa segundo valor");
                    int num2 = teclado.nextInt();
                    resu = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resu);
                    break;
                case 2:
                    System.out.println("\33[0;1m");
                    System.out.println("\nResta");
                    System.out.println("Ingresa primer valor");
                    num1 = teclado.nextInt();
                    System.out.println("Ingresa segundo valor");
                    num2 = teclado.nextInt();
                    resu = num1 - num2;
                    System.out.println("El resultado de la suma es: " + resu);
                    break;
                case 3:
                    System.out.println("\33[0;1m");
                    System.out.println("\nMultiplicación");
                    System.out.println("Ingresa primer valor");
                    num1 = teclado.nextInt();
                    System.out.println("Ingresa segundo valor");
                    num2 = teclado.nextInt();
                    resu = num1 * num2;
                    System.out.println("El resultado de la suma es: " + resu);
                    break;
                case 4:
                    System.out.println("\33[0;1m");
                    System.out.println("\nDivisión");
                    System.out.println("Ingresa primer valor");
                    num1 = teclado.nextInt();
                    System.out.println("Ingresa segundo valor");
                    num2 = teclado.nextInt();
                    resu = num1 / num2;
                    System.out.println("El resultado de la suma es: " + resu);
                    break;
            }
            System.out.println("Desea realizar otra operacion?(s/n)");
            opcion = teclado.next().charAt(0);
        } while (opcion == 's' || opcion == 'S');
    }
}
