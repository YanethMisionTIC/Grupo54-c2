package Principal;
import Agregacion.*;

public class Main {

    
    public static void main(String[] args) {
        //Creamos la instancia de auto y de bicicleta
        Auto auto = new Auto("Corolla", "Gris plata", "UET888");
        Auto auto2 = new Auto("Chevrolet", "Rojo", "EPN323");
        Auto auto3 = new Auto();
        Bicicleta bicicleta = new Bicicleta("Specialized");
        Bicicleta bicicleta2 = new Bicicleta();
        Bicicleta bicicleta3 = new Bicicleta("Trek");
        //Creamos la instancia de la clase empleado, la cual contiene Auto y Bicicleta
        //Ejemplo de empleado que tiene vehiculo y bicicleta
        Empleado emp = new Empleado("Javier", auto, bicicleta);
        
        //Ejemplo de empleado que tiene vehiculo pero no bicicleta
        Empleado emp2 = new Empleado("Jacinto", auto2, bicicleta2);
        
        //Ejemplo de empleado que tiene bicicleta pero no tiene vehiculo
        Empleado emp3 = new Empleado("Esneyder", auto3, bicicleta3);
        
        System.out.println("___________________Detalles empleado___________________");
        System.out.println("[\n" + emp.toString()+ "\n" 
                + emp2.toString()+ "\n" 
                + emp3.toString()+"\n]");
    }
    
}
