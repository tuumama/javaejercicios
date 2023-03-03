
public class empleado {
    // atributos
    private int id;
    private String dns;
    private String nombre;
    private double salario;

    // método
    public void incresalario(double incremento) {
        // me salia error por el public con la P mayúscula
        salario = salario + incremento;
    }

    // esto es una clase llena y si va entre() si hay que asignar
    public empleado(int id, String dns, String nombre, double salario) {
        // me salio error en string por la S mayúscula
        this.id = id;
        this.dns = dns;
        this.nombre = nombre;
        this.salario = salario;
    }

    public empleado() {
    }

    public String imprimirDatos() {
        return this.id + "," + this.dns + "," + this.nombre + "," + this.salario;

    }
}
