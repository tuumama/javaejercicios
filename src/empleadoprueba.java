public class empleadoprueba {
    public static void main(String[] args) {
        empleado emp1 = new empleado();
        empleado emp2 = new empleado(1, "12-x", "ronald", 4500);
        emp2.incresalario(500);
        System.out.println(emp1.imprimirDatos());
        System.out.println(emp2.imprimirDatos());

    }

}
