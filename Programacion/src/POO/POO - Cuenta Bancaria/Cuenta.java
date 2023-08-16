public class Cuenta {
    private String titular;
    private double cantidad;

    // Constructor que recibe el titular y la cantidad
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }


    // Métodos getter y setter para titular
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Métodos getter y setter para cantidad
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
            System.out.println("Se ha depositado $" + cantidad);
        } else {
            System.out.println("La cantidad debe ser mayor que 0 para depositar.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= this.cantidad) {
            this.cantidad -= cantidad;
            System.out.println("Se ha retirado $" + cantidad);
        } else {
            System.out.println("Cantidad insuficiente o valor inválido para retirar.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Cantidad: $" + cantidad);
    }
}
