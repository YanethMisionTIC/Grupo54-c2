package Herencia;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Operator extends Employee {

    private int socialSecurityLevel;
    private String contractEndDate;
    private int idOperator;
    private static int operatorCounter;

    public Operator(int socialSecurityLevel, String contractEndDate, double salary, String positionJob, boolean socialSecurity, String personName, String lastname, String documentType, String document, String email, String cityResidence) {
        super(salary, positionJob, socialSecurity, personName, lastname, documentType, document, email, cityResidence);
        this.socialSecurityLevel = socialSecurityLevel;
        this.contractEndDate = contractEndDate;
        this.idEmployee = ++Operator.operatorCounter;
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

        //  YYYY/MM/DD -> 2022/12/31
        //  DD/MM/YYYY -> 31/12/2022
        //  DD/MM/YY -> 31/12/22
        //  DD-MM-YYYY -> 31-12-2022
        //1. Definimos el formato de la fecha
        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        //2. Convertimos el string con la fecha en formato Date
        String fechaFinContratoFormateada ="";
        //validar si ocurre una excepción o error al momento de recibir la fecha
        try {
            //Verificamos si la fehca ingresada por el usuario cumple con el formato establecido
            Date fecha = formatoFecha.parse(contractEndDate);
            //Creamos un calendario
            Calendar calendario = new GregorianCalendar();
            //Hacemos cálculo de fecha sobre el calendario
            //Qué sería 31 de diciembre del 2022
            calendario.setTime(fecha);
            fechaFinContratoFormateada = formatoFecha.format(calendario.getTime());
            //System.out.println(fechaFinContratoFormateada);
            
        } catch (Exception e) {
            // De esta forma imprimimos el error 
            // Por qué no se logro convertir el String en formato Date
            e.printStackTrace();
        }

        return "Empleado gerente\n{" + "\n            N° empleado: " + idEmployee
                + "\n            Código operador: " + idOperator
                + "\n            Nombre completo: " + personName + " " + lastname
                + "\n            Documento: " + documentType + " "
                + document + ",\n            Ciudad: " + cityResidence
                + ",\n            Salario: " + salary + ",\n            Cargo: "
                + positionJob + ",\n            Contacto: " + email + ",\n            ARL: "
                + socialSecurityVerified + "\n            Nivel de riesgo ARL: "
                + socialSecurityLevel + ",\n            Fecha fin contrato: " + fechaFinContratoFormateada + "\n}";
    }
}
