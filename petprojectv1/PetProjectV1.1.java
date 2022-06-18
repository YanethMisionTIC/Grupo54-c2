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
public class PetProjectV1 {

    //Declaramos los atributos de la clase mascota
    private static String petName = "Dante";
    private static char petSex = 'M';
    private static int age = 3;
    private static String healthStatus = "Todo esta bien.";
    private static String breed = "Cocker Spaniel";
    private static boolean pedigree = false;
    private static String color = "Cafe";
    private static String height = "Raza mediana";

    public static String getPetName() {
        return petName;
    }

    public static char getPetSex() {
        return petSex;
    }

    public static int getAge() {
        return age;
    }

    public static String getHealthStatus() {
        return healthStatus;
    }

    public static String getBreed() {
        return breed;
    }

    public static boolean isPedigree() {
        return pedigree;
    }

    public static String getColor() {
        return color;
    }

    public static String getHeight() {
        return height;
    }
    
    
    //Crear el método de la clase
    public static void ShowPetInformation() {
        //Atajo rápido: sout + tab
        System.out.println(getPetName() + ", es un " + getBreed() + " de " + getHeight() + " y color "
                + getColor() + ".\nTiene " + getAge() + " años, es un " + getPetSex() + " y su estado de salud reporta que "
                + getHealthStatus() + "y el examen pedigree dio como resultado " + isPedigree());
    }

    public static void main(String[] args) {
        ShowPetInformation();
    }
}
