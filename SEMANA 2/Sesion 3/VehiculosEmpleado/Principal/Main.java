package Principal;
import Agregacion.*;

public class Main {

    
    public static void main(String[] args) {
        //Creamos la instancia de auto y de bicicleta
        Auto auto = new Auto("Corolla", "Gris plata", "UET888");
        Bicicleta bicicleta = new Bicicleta("Specialized");
        
        //Creamos la instancia de la clase empleado, la cual contiene Auto y Bicicleta
        Empleado emp = new Empleado("Javier", auto, bicicleta);
        System.out.println("___________________Detalles empleado___________________");
        System.out.println(emp.toString());
    }
    
}
