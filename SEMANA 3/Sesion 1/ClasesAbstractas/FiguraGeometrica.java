package ClasesAbstractas;

//Cuando ya existe un método abstracto en la clase se debe añadir la palabra
//reservada abstract en la definición de la clase
public abstract class FiguraGeometrica {
    protected String tipoFigura;

    public FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    //No se puede generalizar las instrucciones del siguiente método:
    //Esto va en el hijo: public void dibujarFigura(){/*Qué hacer */}
    public abstract void dibujarFigura();

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
}
