import java.util.*;

public class arrayejem {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int c = 0;
        int a;
        float m = 0;
        System.out.println("Cantidad");
        c = teclado.nextInt();
        String alumno[] = new String[c];
        float calificacion[] = new float[c];
        for (a = 0; a < c; a++) {
            System.out.println("Alumno");
            alumno[a] = teclado.next();
            System.out.println("Calificacion");
            calificacion[a] = teclado.nextFloat();
        }
        for (int i = 0; i < calificacion.length; i++) {
            if (m > calificacion[i]) {
                m = calificacion[i];
            } else {
                m = calificacion[i];
                System.out.println("Mayor calificacion: " + m);
            }
        }
    }
}
