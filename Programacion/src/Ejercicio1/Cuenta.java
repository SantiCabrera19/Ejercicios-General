package Ejercicio1;

public class Cuenta {
    private String titular; // Atributo que representa el titular de la cuenta
    private double cantidad; // Atributo que representa el saldo de la cuenta

    public Cuenta(String titular, double cantidad) {
        this.titular = titular; // Asigna el titular recibido al atributo titular de la cuenta
        this.cantidad = cantidad; // Asigna la cantidad recibida al atributo cantidad de la cuenta
    }

    public String getTitular() {
        return titular; // Devuelve el titular de la cuenta
    }

    public void setTitular(String titular) {
        this.titular = titular; // Establece un nuevo titular para la cuenta
    }

    public double getCantidad() {
        return cantidad; // Devuelve la cantidad (saldo) de la cuenta
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad; // Establece una nueva cantidad (saldo) para la cuenta
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad; // Si la cantidad es positiva, se suma a la cantidad actual de la cuenta
        }
    }

    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0; // Si la cantidad a retirar es mayor al saldo actual, se establece el saldo en cero
        } else {
            this.cantidad -= cantidad; // Si no, se resta la cantidad del saldo actual
        }
    }
}
