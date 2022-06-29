
package ClasesAbstractas;


public class Circulo extends FiguraGeometrica{

    public Circulo(String tipoFigura) {
        super(tipoFigura);
    }

    //La clase hijo DEBE implementar todos los métodos abstractos del padre
    @Override
    public void dibujarFigura() {
        System.out.println("Aquí estamos dibujando un circulo.");
    }
    
}
