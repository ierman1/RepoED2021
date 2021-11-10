public class Profesor extends Persona {

    private String despacho;

    public Profesor(String nombre, String dni, String despacho) {
        super(nombre, dni);
        this.setDespacho(despacho);
    }

    public Profesor(String nombre, String dni) {
        super(nombre, dni);
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    @Override
    public String toString() {
        return super.toString() + (despacho == null ? "" : ", Despacho = '" + despacho + "'");
    }

}
