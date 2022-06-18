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
    
    //Declaramos los atributos de la clase mascota
    private String petName = "Dante";
    private char petSex = 'M';
    private int age = 3;
    private String healthStatus = "Todo esta bien.";
    private String breed = "Cocker Spaniel";
    private boolean pedigree = false;
    private String color = "Cafe";
    private String height = "Raza mediana";

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
