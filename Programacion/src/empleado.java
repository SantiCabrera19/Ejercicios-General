public class empleado {

    // Atributos
    private String nombre;
    private String direccion;
    private int edad;
    private int DNI;

    // constructores
    public empleado(String nombre, String direccion, int edad, int DNI){
        this.nombre = nombre;
        this.direccion = direccion;
        this.DNI = DNI;
        this.edad = edad;
    }

    // metodos
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public int obtenerEdad() {
        return edad;
    }

    public int obtenerDNI() {
        return DNI;
    }

}
