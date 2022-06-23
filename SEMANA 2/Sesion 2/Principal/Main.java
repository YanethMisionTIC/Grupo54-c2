package Principal;

import Herencia.*;

public class Main {

    public static void main(String[] args) {
        /*
        =============================================================================
        ===================================Manager==================================
        =============================================================================
         */
        Manager managerInst = new Manager("Sistemas", 4500000, "Contador público", false, "Marco", "de la Puerta", "C.C.", "805310888", "marco@gmail.com", "Bucaramanga");
        System.out.println(managerInst.toString());
        /*
        =============================================================================
        ===================================Operator==================================
        =============================================================================
         */
        Operator operatorInst = new Operator(5, "31/12/2022", 1700000, "Operario de máquina", true, "Hamilton", "Ruiz", "P.E.P.", "716354", "hamilton@gmail.com", "Medellín");
        System.out.println(operatorInst.toString());

        /*
        =============================================================================
        ===================================Correspondent==================================
        =============================================================================
         */
        Correspondent correspondentInst1 = new Correspondent("Moto", 4, "Personal Shopper", true, "Lola", "Mento", "C.C.", "1053888888", "lolamento@gmail.com", "Bogotá");
        Correspondent correspondentInst2 = new Correspondent("Moto", 4, "Personal Shopper", true, "Alejandro", "Diaz", "C.C.", "1053777777", "alejo@gmail.com", "Bogotá");
        System.out.println("Corresponsales:\n   [\n" + correspondentInst1.toString() + "\n" + correspondentInst2.toString()+"\n ]");
    }
}
