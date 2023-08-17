public class Administrativo extends Persona {
    private String area;

    public Administrativo(String nombre, String apellido, String domicilio, String area) {
        super(nombre, apellido, domicilio);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
