package Sobrecarga;

public class EmpleadoS {
    //1. Declaración de los atributos de la clase
    protected String nombre;
    protected double salario;
    protected double bonificacion;
    protected boolean afiliadoARL;
    
    //2. Declarar varios tipos de constructores de la clase
    public EmpleadoS() {} //Todos los args quedarian con valor Null o 0

    public EmpleadoS(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    } //nombre: "Yaneth", salario: 1000000, bonificacion: 0.0, afiliadoARL: false

    public EmpleadoS(String nombre, double salario, double bonificacion, boolean afiliadoARL) {
        this.nombre = nombre;
        this.salario = salario;
        this.bonificacion = bonificacion;
        this.afiliadoARL = afiliadoARL;
    }//nombre: "Yaneth", salario: 1000000, bonificacion: 0.2, afiliadoARL: true

    @Override
    public String toString() {
        return "        EmpleadoS{" + "nombre: " + nombre 
                + ", salario: " + salario + ", bonificacion: " + bonificacion 
                + ", afiliadoARL: " + afiliadoARL + '}';
    }
    
    public double bonoAnual(){
        this.bonificacion *= this.salario;
        //Calculamos el valor del salario total
        double salarioTotal = this.salario + this.bonificacion;
        return salarioTotal;
    }
    
    public double bonoAnual(double bonoHorasExtra){
        this.bonificacion *= this.salario;
        //Calculamos el valor del salario total
        double salarioTotal = this.salario + this.bonificacion + bonoHorasExtra;
        return salarioTotal;
    }
  
    public double bonoAnual(double bonoHorasExtra, boolean dotacion){
        double valorDotacion;
        if(dotacion == true)
            valorDotacion = 1000000;
        else
            valorDotacion = 0;
        this.bonificacion *= this.salario;
        //Calculamos el valor del salario total
        double salarioTotal = this.salario + this.bonificacion + bonoHorasExtra + valorDotacion;
        return salarioTotal;
    }
}
