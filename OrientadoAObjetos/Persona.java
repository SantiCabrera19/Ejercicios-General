public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private String ocupacion;
    private String comer;

    // Constructor
    public Persona(String nombre, int edad, String ocupacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
    }

    public String getNombre() {
        return nombre;
    }

    // Método "saludar"
    public String saludar() {
        return "Hola, soy " + nombre + ". Tengo " + edad + " años y soy " + ocupacion + ".";
    }

    // Metodo "comiendo"
    public String comiendo() {
        return nombre + " está comiendo.";
    }

}