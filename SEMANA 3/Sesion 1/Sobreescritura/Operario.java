package Sobreescritura;

public class Operario extends Empleado {

    private boolean manejoMaquinaPesada;

    public Operario(String nombre, double salario, double bonificacion, boolean manejoMaquinaPesada) {
        super(nombre, salario, bonificacion);
        this.manejoMaquinaPesada = manejoMaquinaPesada;
    }

    @Override
    public String obtenerDetallesF() {
        //Almacena el texto que resulta del condicional
        String manejoMaq = "";
        if (this.manejoMaquinaPesada == true) {
            manejoMaq = "si maneja maquinaria pesada.";
        } else {
            manejoMaq = "no maneja maquinaria pesada.";
        }

        return "        Nombre: " + this.nombre + ", salario: " + this.salario
                + ", bonificación: " + this.bonificacion
                + ", " + manejoMaq;
    }

    @Override
    public double calcularSalarioConBono() {
        return super.calcularSalarioConBono(); //To change body of generated methods, choose Tools | Templates.
    }
}
