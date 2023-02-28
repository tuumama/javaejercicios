import java.util.Scanner;

public class tablasindividual {

    public static void main(String[] args) {
        int i;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa num tabla: ");
        int tabla = teclado.nextInt();
        for (i = 0; i <= 10; i++) {
            System.out.println(tabla + "x" + i + "=" + (tabla * i));
        }
    }
}
