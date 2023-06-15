public class OrientadoAObjetos {

    public static void main(String[] args) {

        // Crear una instancia de Persona
        Persona persona = new Persona("Juan", 25, "Programador");
        Persona persona2 = new Persona("Ana", 15, "Estudiante");

        // Crear una instancia de Auto
        Auto auto1 = new Auto("Peugeot", "206", 2002);
        Auto auto2 = new Auto("Peugeot", "208", 2020);

        // Llamar al método "saludar" y mostrar el resultado
        String saludo = persona.saludar();
        System.out.println(saludo);
        saludo = persona2.saludar();
        System.out.println(saludo);

        // Llamar al método "comiendo" y mostrar el resultado
        String comiendo = persona.comiendo();
        System.out.println(comiendo);
        comiendo = persona2.comiendo();
        System.out.println(comiendo);

        // Llamar al método "conducir" y mostrar el resultado
        String mensajeConducirAuto1 = auto1.conducir(persona); // Con el nombre de la persona1
        System.out.println(mensajeConducirAuto1);

        // Llamar al método "conducir" y mostrar el resultado
        String mensajeConducirAuto2 = auto2.conducir(persona2); // Con el nombre de la persona2
        System.out.println(mensajeConducirAuto2);

        // Llamar al metodo "frenar" y mostramos el resultado
        String mensajeFrenarAuto1 = auto1.frenar();
        System.out.println(mensajeFrenarAuto1);

        // Llamar al metodo "frenar" y mostramos el resultado
        String mensajeFrenarAuto2 = auto2.frenar();
        System.out.println(mensajeFrenarAuto2);


        // Llamar al metodo "estacionar" y mostramos el resultado
        String mensajeEstacionarAuto1 = auto1.estacionar();
        System.out.println(mensajeEstacionarAuto1);

        // Llamar al metodo "estacionar" y mostramos el resultado
        String mensajeEstacionar2 = auto2.estacionar();
        System.out.println(mensajeEstacionar2);
    }
}
