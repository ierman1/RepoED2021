

class Circunferencia extends Figura{

    double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculArea() {
        double pi = 3.1415d;
        return pi *radio*radio;
    }
}