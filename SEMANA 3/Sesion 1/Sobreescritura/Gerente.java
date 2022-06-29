package Sobreescritura;

public class Gerente extends Empleado {

    private String departamento;
    private int cantSubordinados;

    public Gerente(String nombre, double salario, double bonificacion, String departamento, int cantSubordinados) {
        super(nombre, salario, bonificacion);
        this.departamento = departamento;
        this.cantSubordinados = cantSubordinados;
    }

    @Override
    public String obtenerDetallesF() {
        return "Nombre: " + this.nombre + ", salario: " + this.salario
                + ", bonificación: " + this.bonificacion
                + ", departamento: " + this.departamento
                + ", personas a cargo: " + this.cantSubordinados;
    }

    @Override
    public double calcularSalarioConBono() {
        //La bonificación general es del 20%
        this.bonificacion *= this.salario;
        double bonoGerente = this.salario * 0.15;
        //Calculamos el valor del salario total
        double salarioTotal = this.salario + this.bonificacion + bonoGerente;
        return salarioTotal;
    }
}
