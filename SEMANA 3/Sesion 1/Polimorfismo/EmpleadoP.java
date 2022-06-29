package Polimorfismo;

public class EmpleadoP {
    //1. Definir atributos de la clase
    protected String nombre;
    protected double salario;
    protected boolean afiliadoARL;

    //2. Constructor con todos los args
    public EmpleadoP(String nombre, double salario, boolean afiliadoARL) {
        this.nombre = nombre;
        this.salario = salario;
        this.afiliadoARL = afiliadoARL;
    }
    
    //3. Crear función que retorna la informaición del empleado
    public String obtenerDetallesF(){
        String detalleAfiliadoARL;
        
        if(this.afiliadoARL == true)
            detalleAfiliadoARL = " afiliado a la ARL Sura";
        else
            detalleAfiliadoARL = " no se encuentra afiliado a la ARL.";
        
        return "        Nombre: " + this.nombre +", salario: " + this.salario 
                + detalleAfiliadoARL;
    }
    
}
