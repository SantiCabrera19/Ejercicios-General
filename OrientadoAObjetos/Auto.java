public class Auto {
    // Atributos
    private String marca;
    private String modelo;
    private int anio;

    // Constructor
    public Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // METODOS

    public String conducir(Persona persona) {
        return persona.getNombre() + " está conduciendo el auto " + marca + " " + modelo;
    }

    public String frenar() {
        return "El auto " + marca + " " + modelo + " ha frenado.";
    }

    public String estacionar() {
        return "El auto " + marca + " " + modelo + " se ha estacionado.";
    }

}
