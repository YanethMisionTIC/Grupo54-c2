package Herencia;

public class Manager extends Employee{
    private int idManager;
    private String companyArea;
    private static int managerCounter;
    

    public Manager(String companyArea, double salary, String positionJob, boolean socialSecurity, String personName, String lastname, String documentType, String document, String email, String cityResidence) {
        super(salary, positionJob, socialSecurity, personName, lastname, documentType, document, email, cityResidence);
        this.companyArea = companyArea;
        this.idManager = ++Manager.managerCounter;
    }

    @Override
    public String toString() {
        //Bloque condicional donde se validará si el usuario se encuentra o no afiliado a la ARL
        String socialSecurityVerified = "";
        if(socialSecurity == true){
            socialSecurityVerified = "Positiva";
        }else{
            socialSecurityVerified = "No se encuentra afiliado a una ARL";
        }
        return "Empleado gerente\n{" + "\n            N° empleado: " + idEmployee
                + "\n            Código gerente: " + idManager + ",\n            Dependencia: " + companyArea 
                + "\n            Nombre completo: " + personName + " " + lastname
                + "\n            Documento: " + documentType + " "
                + document + ",\n            Ciudad: " + cityResidence
                + ",\n            Salario: " + salary + ",\n            Cargo: "
                + positionJob + ",\n            Contacto: " + email + ",\n            ARL: "
                + socialSecurityVerified + "\n}";
    }
}
