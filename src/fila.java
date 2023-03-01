import java.util.*;

public class fila {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int c = 0;
        System.out.println("Escriba una palabra");
        String palabra = teclado.nextLine();
        char caracteres[] = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            c = c + 1;
            caracteres[i] = palabra.charAt(i);
            System.out.println(caracteres[i]);
        }
        System.out.println("La cantidad de caracteres es: " + c);
    }
}
