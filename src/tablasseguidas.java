import java.util.Scanner;

public class tablasseguidas {

    public static void main(String[] args) {
        for (int tabla = 1; tabla <= 10; tabla++) {
            System.out.println("\n Tabla del " + tabla);
            System.out.println("-------------");
            for (int i = 1; i <= 10; i++) {
                System.out.println(tabla + " x " + i + " = " + (tabla * i));
            }
        }
    }
}
