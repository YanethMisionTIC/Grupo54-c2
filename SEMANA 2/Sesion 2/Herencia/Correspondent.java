/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author YanethM
 */
public class Correspondent extends Employee {

    private int idCorrespondent;
    private static int correspondentCounter;
    private String vehicleType;

    public Correspondent(String vehicleType, double salary, String positionJob, boolean socialSecurity, String personName, String lastname, String documentType, String document, String email, String cityResidence) {
        super(salary, positionJob, socialSecurity, personName, lastname, documentType, document, email, cityResidence);
        this.vehicleType = vehicleType;
        this.idCorrespondent = ++Correspondent.correspondentCounter;
    }

    @Override
    public String toString() {
        //Bloque condicional donde se validará si el usuario se encuentra o no afiliado a la ARL
        String socialSecurityVerified = "";
        if (socialSecurity == true) {
            socialSecurityVerified = "Positiva";
        } else {
            socialSecurityVerified = "No se encuentra afiliado a una ARL";
        }
        return "      {" + "\n                N° empleado: " + idEmployee
                + "\n                Corresponsal N°: " + idCorrespondent
                + ",\n                Tipo de vehiculo=" + vehicleType
                + "\n                Nombre completo: " + personName + " " + lastname
                + "\n                Documento: " + documentType + " "
                + document + ",\n                Ciudad: " + cityResidence
                + ",\n                Salario: " + salary + ",\n                Cargo: "
                + positionJob + ",\n                Contacto: " + email + ",\n              ARL: "
                + socialSecurityVerified + "\n      }";
    }

}
