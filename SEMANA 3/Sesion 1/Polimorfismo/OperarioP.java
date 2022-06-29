package Polimorfismo;


public class OperarioP extends EmpleadoP{
    private boolean manejoMaqPesada;

    public OperarioP(String nombre, double salario, boolean afiliadoARL,boolean manejoMaqPesada) {
        super(nombre, salario, afiliadoARL);
        this.manejoMaqPesada = manejoMaqPesada;
    }

    @Override
    public String obtenerDetallesF() {
        //Almacena el texto que resulta del condicional
        String manejoMaq = "";
        if (this.manejoMaqPesada == true) {
            manejoMaq = " si maneja maquinaria pesada.";
        } else {
            manejoMaq = " no maneja maquinaria pesada.";
        }
        
        return super.obtenerDetallesF() + manejoMaq; //To change body of generated methods, choose Tools | Templates.
    }
}
