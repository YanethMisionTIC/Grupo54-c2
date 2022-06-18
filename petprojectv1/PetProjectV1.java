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

    //Crear el método de la clase
    public static void ShowPetInformation() {
        //Atajo rápido: sout + tab
        System.out.println(petName + ", es un " + breed + " de " + height + " y color "
                + color + ".\nTiene " + age + " años, es un " + petSex + " y su estado de salud reporta que "
                + healthStatus + "y el examen pedigree dio como resultado " + pedigree);
    }

    public static void main(String[] args) {
        ShowPetInformation();
    }
}
