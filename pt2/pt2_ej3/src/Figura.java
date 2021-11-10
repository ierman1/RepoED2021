
public abstract class Figura{
    private String color;
    private Double area;

    public abstract double calculArea();

    public String getColor() {
        return color;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}
