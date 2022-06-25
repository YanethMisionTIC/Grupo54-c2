package Agregacion_E2;

public class Zoologico {

    private String nombreZoo;
    private String ciudad;
    //Un zoologico tiene muchos animales
    private Animal[] animales; //Array

    public Zoologico(String nombreZoo, String ciudad, Animal[] animales) {
        this.nombreZoo = nombreZoo;
        this.ciudad = ciudad;
        this.animales = animales;
    }

    @Override
    public String toString() {

        String contenidoArray = "";
        //Recorremos el array de animales
        //La propiedad .length indica la cantidad de elementos que tiene el array
        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i].idAnimal + " "
                    + animales[i].nombreAnimal + " " + animales[i].tipoAnimal);
        }
        return "Zoologico\n {" + "\n        nombreZoo: " + nombreZoo 
                + ",\n        ciudad: " + ciudad + "\n }";
    }

}
