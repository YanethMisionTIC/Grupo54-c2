package Agregacion_E2;


public class Animal {
    public int idAnimal;
    public String tipoAnimal;
    public String nombreAnimal;
    public static int contadorAnimales;

    public Animal() {
    }

    public Animal(String tipoAnimal, String nombreAnimal) {
        this.tipoAnimal = tipoAnimal;
        this.nombreAnimal = nombreAnimal;
        this.idAnimal = ++Animal.contadorAnimales;
    }
}
