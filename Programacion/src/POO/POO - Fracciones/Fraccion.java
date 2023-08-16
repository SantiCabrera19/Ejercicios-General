public class Fraccion {
    private int dividendo;
    private int divisor;

    // Constructor Fraccion (evitar dividir por 0)
    public Fraccion(int dividendo, int divisor) { // numerador y denominador respectivamente
        this.dividendo = dividendo; //asignamos el valor del parametro al atributo
        if (divisor != 0) {
            this.divisor = divisor; // sino es 0 asignamos el valor del parametro al atributo
        } else {
            this.divisor = 1; // Por defecto, evitamos el divisor cero
        }
    }

    // Método para sumar dos fracciones
    public Fraccion sumar(Fraccion otra) {
        int nuevoDividendo = this.dividendo * otra.divisor + this.divisor * otra.dividendo;
        int nuevoDivisor = this.divisor * otra.divisor;
        return new Fraccion(nuevoDividendo, nuevoDivisor);
    }

    // Método para multiplicar dos fracciones
    public Fraccion multiplicar(Fraccion otra) {
        int nuevoDividendo = this.dividendo * otra.dividendo;
        int nuevoDivisor = this.divisor * otra.divisor;
        return new Fraccion(nuevoDividendo, nuevoDivisor);
    }

    // Método toString para mostrar la fracción en formato X/Y
    public String toString() {
        return dividendo + "/" + divisor;
    }

}
