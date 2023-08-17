public class Docente extends Persona {
    private String cargo;
    private double hstrabajadas;

    public Docente(String nombre, String apellido, String domicilio, String cargo, double hstrabajadas) {
        super(nombre, apellido, domicilio);
        this.cargo = cargo;
        this.hstrabajadas = hstrabajadas;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getHstrabajadas() {
        return hstrabajadas;
    }

    public void setHstrabajadas(double hstrabajadas) {
        this.hstrabajadas = hstrabajadas;
    }
}
