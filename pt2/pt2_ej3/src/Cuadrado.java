
public class Cuadrado extends Figura{
    double costado;

    public void setCostado(double costado) {
        this.costado = costado;
    }

    public double getCostado() {
        return costado;
    }

    @Override
    public double calculArea() {
        return costado * costado;
    }
}