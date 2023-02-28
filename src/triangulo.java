import java.util.*;

class Triangulo {
    public static void main(String[] args) {

        double base, altura, resultado;
        Scanner obj = new Scanner(System.in);

        System.out.print("Ingrese base:\t");
        base = obj.nextDouble();

        System.out.print("Ingrese altura:\t");
        altura = obj.nextDouble();

        resultado = ((base * altura) / 2);

        System.out.print("El area del Triangulo es:\t" + resultado);
    }
}