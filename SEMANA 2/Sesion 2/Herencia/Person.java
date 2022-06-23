package Herencia;

public class Person {
    //Como es la clase padre todos sus atributos deben ser protegidos
    //1. Declaración de atributos
    protected String personName;
    protected String lastname;
    protected String documentType;
    protected String document;
    protected String email;
    protected String cityResidence;
    
    //2. Insertar constructor vacío de la clase
    //public Person() {}
    
    //3. Insertar constructor con dos atributos de la clase
    public Person(String personName, String lastname) {
        this.personName = personName;
        this.lastname = lastname;
    }
    
    //4. Insertar constructor con todos los atributos de la clase
    public Person(String personName, String lastname, String documentType, String document, String email, String cityResidence) {
        this.personName = personName;
        this.lastname = lastname;
        this.documentType = documentType;
        this.document = document;
        this.email = email;
        this.cityResidence = cityResidence;
    }
    //5. Insertar Getter y Setter

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCityResidence() {
        return cityResidence;
    }

    public void setCityResidence(String cityResidence) {
        this.cityResidence = cityResidence;
    }

    // 6. Mostrar como un objeto de Strings la información de los atributos
    // Clic secundario > Insert code > toString()
    @Override
    public String toString() {
        return "Person{" + "personName=" + personName + ", lastname=" + lastname + ", documentType=" + documentType + ", document=" + document + ", email=" + email + ", cityResidence=" + cityResidence + '}';
    }
    
 
}
