package Agregacion;

public class Auto {

    public int idAuto;
    public String modelo;
    public String color;
    public String placa;
    private static int contadorAutos;

    public Auto() {
    }

    public Auto(String modelo, String color, String placa) {
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.idAuto = ++Auto.contadorAutos;
    }
}
