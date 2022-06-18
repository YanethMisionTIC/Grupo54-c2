/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petprojectv1;

/**
 *
 * @author YanethM
 */
public class PetClass {
    
    //1. Declaramos los atributos de la clase mascota
    private String petName;
    private char petSex;
    private int age;
    private String healthStatus;
    private String breed;
    private boolean pedigree;
    private String color;
    private String height;

    //3. Creación del constructor de la clase
    //Clic secundario / insert code / constructor 
    public PetClass(String petName, char petSex, int age, String healthStatus, String breed, boolean pedigree, String color, String height) {
        this.petName = petName;
        this.petSex = petSex;
        this.age = age;
        this.healthStatus = healthStatus;
        this.breed = breed;
        this.pedigree = pedigree;
        this.color = color;
        this.height = height;
    }

    //3. Implementar los GETTER de los atributos de la clase
    //Clic secundario / insert code / Getter
    public String getPetName() {
        return petName;
    }

    public char getPetSex() {
        return petSex;
    }

    public int getAge() {
        return age;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isPedigree() {
        return pedigree;
    }

    public String getColor() {
        return color;
    }

    public String getHeight() {
        return height;
    }
    
    //Crear el método de la clase
    public  void ShowPetInformation() {
        //Atajo rápido: sout + tab
        System.out.println(getPetName() + ", es un " + getBreed() + " de " + getHeight() + " y color "
                + getColor() + ".\nTiene " + getAge() + " años, es un " + getPetSex() + " y su estado de salud reporta que "
                + getHealthStatus() + "y el examen pedigree dio como resultado " + isPedigree());
    }
}
