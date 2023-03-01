import java.util.Scanner;

public class no {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros: ");
        int elementos = teclado.nextInt();
        int[] n = new int[elementos];
        System.out.println("Ingrese números a ordenar: ");
        for (int a = 0; a < n.length; a++) {
            n[a] = teclado.nextInt();
        }
        int orden = 0;
        for (int b = 1; b < n.length; b++) {
            for (int c = 0; c < n.length - b; c++) {
                if (n[c] > n[c + 1]) {
                    orden = n[c];
                    n[c] = n[c + 1];
                    n[c + 1] = orden;
                }
            }
        }
        System.out.println("Aqui se ven los numeros ordenados");
        for (int i = 0; i < n.length; i++) {
            System.out.print("---");
            System.out.print(n[i] + " ");
        }
    }
}
