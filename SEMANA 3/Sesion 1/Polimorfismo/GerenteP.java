package Polimorfismo;

public class GerenteP extends EmpleadoP{
    private String departamento;
    private int cantSubordinados;

    public GerenteP(String nombre, double salario, boolean afiliadoARL,String departamento, int cantSubordinados) {
        super(nombre, salario, afiliadoARL);
        this.departamento = departamento;
        this.cantSubordinados = cantSubordinados;
    }

    //Para aplicar POLIMORFISMO necesitamos de la SOBREESCRITURA
    @Override
    public String obtenerDetallesF() {
        String detalleAfiliadoARL;
        
        if(this.afiliadoARL == true)
            detalleAfiliadoARL = "afiliado a la ARL Sura";
        else
            detalleAfiliadoARL = "no se encuentra afiliado a la ARL.";
        
        return super.obtenerDetallesF() + ", departamento: " 
                + this.departamento
                + ", personas a cargo: " + this.cantSubordinados;
        }
   
}
