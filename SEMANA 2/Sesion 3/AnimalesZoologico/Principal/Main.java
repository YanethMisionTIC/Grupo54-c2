package Principal;

import Agregacion_E1.Auto;
import Agregacion_E1.Empleado;
import Agregacion_E1.Bicicleta;
import Agregacion_E2.Animal;
import Agregacion_E2.Zoologico;

public class Main {

    public static void main(String[] args) {
        //Definimos el tamaño de la colección de animales
        Animal[] animales = new Animal[3];
        /* 
            Creamos 3 animales, donde cada posición del array contiene una instancia
            de la clase Animal, con la estructura de tipoAnimal, nombre
        */
        animales[0] = new Animal("Hipopotamo", "Vanessa");
        animales[1] = new Animal("León", "Luis");
        animales[2] = new Animal("Zebra", "Raya");
        
        Zoologico zoo = new Zoologico("Hacienda Napoles", "Medellín", animales);
        System.out.println(zoo.toString());
    }

}
