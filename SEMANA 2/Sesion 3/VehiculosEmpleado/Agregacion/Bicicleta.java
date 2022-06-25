package Agregacion;


public class Bicicleta {
    public int idBicicleta;
    public String marcaBicicleta;
    private static int contadorBicicletas;

    public Bicicleta(String marcaBicicleta) {
        this.marcaBicicleta = marcaBicicleta;
        this.idBicicleta = ++Bicicleta.contadorBicicletas;
    }
}
