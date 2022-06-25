package Principal;

import Agregacion_E3.*;

public class Main {

    public static void main(String[] args) {
        Veterinaria vet = new Veterinaria();
        //Crearemos 3 mascotas
        vet.mascotas = new Mascota[3];
        vet.mascotas[0]= new Mascota("Dante", "Coocker");
        vet.mascotas[1]= new Mascota("Homero", "Persa");
        vet.mascotas[2]= new Mascota("Campo Elias", "Persa");
        
        Veterinaria vet2 = new Veterinaria("San Miguel", "999999-0", vet.mascotas);
        System.out.println(vet2.toString());
    }

}
