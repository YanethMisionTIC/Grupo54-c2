package Agregacion;
/*
    Ejemplo de agregación: Al empleado se le agrega carro o bicileta
*/
public class Empleado {
    private int idEmp;
    private String nombreEmp;
    //Hacemos referencia a las clases que estan contenidas en empleado
    public Auto auto;
    public Bicicleta bicicleta;
    private static int contadorEmpleados;

    public Empleado(String nombreEmp, Auto auto, Bicicleta bicicleta) {
        this.nombreEmp = nombreEmp;
        this.auto = auto;
        this.bicicleta = bicicleta;
        this.idEmp = ++Empleado.contadorEmpleados;
    }

    @Override
    public String toString() {
        return "    {\n" +"         Emp: " + idEmp 
                + ",\n         Nombre: " + nombreEmp 
                + ",\n         Placa vehiculo: " + auto.placa 
                + ",\n         Color: " + auto.color
                + ",\n         Modelo: " + auto.modelo
                + ",\n         bicicleta: " + bicicleta.marcaBicicleta + "\n    },";
    }
    
    
}
