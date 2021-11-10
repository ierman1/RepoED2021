public class Lector extends Profesor {

    private String grupoInv;

    public Lector(String nombre, String dni, String grupoInv) {
        super(nombre, dni);
        this.setGrupoInv(grupoInv);
    }

    public String getGrupoInv() {
        return grupoInv;
    }

    public void setGrupoInv(String grupoInv) {
        this.grupoInv = grupoInv;
    }

    @Override
    public String toString() {
        return super.toString() + ", Grupo de investigación = '" + grupoInv + "'";
    }

}
