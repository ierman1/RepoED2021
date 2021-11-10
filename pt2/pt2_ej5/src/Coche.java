public class Coche implements Comparable {

    private String matricula;

    public Coche(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public int compareTo(Object o) {
        return ((Coche) o).matricula.compareTo(this.matricula);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                '}';
    }

}
