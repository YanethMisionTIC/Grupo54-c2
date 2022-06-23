package Principal;

import Herencia.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputDataUser = new Scanner(System.in);
        /*
        =============================================================================
        ===================================Manager==================================
        =============================================================================
         */
        Manager managerInst = new Manager("Sistemas",4500000, "Contador público", false, "Marco", "de la Puerta", "C.C.", "805310888", "marco@gmail.com", "Bucaramanga");
        System.out.println(managerInst.toString());
    }
}
