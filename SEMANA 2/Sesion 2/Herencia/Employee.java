package Herencia;

public class Employee extends Person {

    protected int idEmployee;
    protected double salary;
    protected String positionJob;
    public boolean socialSecurity;
    //Atributo único de esta clase independiente del tipo de visibilidad
    protected static int employeeCounter;

    //Caracteristicas del constructor;
    public Employee(double salary, String positionJob, boolean socialSecurity, String personName, String lastname, String documentType, String document, String email, String cityResidence) {
        super(personName, lastname, documentType, document, email, cityResidence);
        this.salary = salary;
        this.positionJob = positionJob;
        this.socialSecurity = socialSecurity;
        //Creamos variable que será el contador de empleados
        //Cada vez que se cree una instancia de la clase Employee se incrementa en 1 el idEmployee
        this.idEmployee = ++Employee.employeeCounter;
    }

    //Clic secundario > insert code > toString()
    @Override
    public String toString() {
        return "Empleado\n{" + "\n            idEmployee: " + idEmployee
                + "\n            Nombre completo: " + personName + " " + lastname
                + "\n            Documento: " + documentType + " "
                + document + ",\n            Ciudad=" + cityResidence
                + ",\n            Salario: " + salary + ",\n            Cargo: "
                + positionJob + ",\n            Contacto: " + email + ",\n            ARL:"
                + socialSecurity + "\n}";
    }

}
