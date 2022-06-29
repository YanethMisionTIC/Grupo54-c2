package Sobreescritura;

public class Empleado {

    //1. Declaración de los atributos de la clase
    protected String nombre;
    protected double salario;
    protected double bonificacion;

    //2. Añadir el constructor de la clase con TODOS los args
    public Empleado(String nombre, double salario, double bonificacion) {
        this.nombre = nombre;
        this.salario = salario;
        this.bonificacion = bonificacion;
    }
    
    //3. Crear función que retorna la informaición del empleado
    public String obtenerDetallesF(){
        return "        Nombre: " + this.nombre +", salario: " + this.salario 
                + ", bonificación: " + this.bonificacion;
    } 
    
    //4. Crear método que imprime la información del empleado
    public void obtenerDetallesM(){
        System.out.println("        Nombre: " + this.nombre +", salario: " + this.salario 
                + ", bonificación: " + this.bonificacion);
    }
    
    //5. Crear función que calcula el salario con bonificación del empleado
    public double calcularSalarioConBono(){
        this.bonificacion *= this.salario;
        //Calculamos el valor del salario total
        double salarioTotal = this.salario + this.bonificacion;
        return salarioTotal;
    }
}
