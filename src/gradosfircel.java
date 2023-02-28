import java.util.Scanner;

public class gradosfircel {
    public static void main(String[] args) {
        int x = 0;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("1: De grados Fahrenheit a Grados Centrigrados\n 2: De Grados Centigrados a Fahrenheit");
            int gr = leer.nextInt();
            switch (gr) {
                case 1:
                    System.out.println("Ingresa Grados Fahrenheit");
                    Float f = leer.nextFloat();
                    float r = (f - 32) * 5 / 9 % .2f;
                    System.out.println("Los Grados Centigrados Son:" + r);
                    break;
                case 2:
                    System.out.println("Ingresa Grados Centigrados");
                    Float c = leer.nextFloat();
                    float r1 = (c * 9 / 5) + 32 % .2f;
                    System.out.println("Los Grados Centigrados Son:" + r1);
                    break;
            }
            System.out.println("Para Regresar ingresas el numero 3");
            x = leer.nextInt();
        } while (x == 3);

    }

}
