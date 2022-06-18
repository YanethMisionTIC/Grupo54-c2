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

    public static void main(String[] args) {
        //1. Llamar la clase creando una instancia de ella
        PetClass instancia_clase = new PetClass();
        
        //2.Mediante la instancia llamamos el método que imprime la info
        instancia_clase.ShowPetInformation();
    }
}
