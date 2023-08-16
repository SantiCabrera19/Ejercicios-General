public class Cuenta {

    private String titular;
    private double saldo;

    public static final double SALDO_DEFECTO = 100000;

    public Cuenta(String nombre){
        titular = nombre;
        saldo= SALDO_DEFECTO;
    }

    public Cuenta(String nombre, double monto){
        titular = nombre;
        saldo = monto;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double ingresar(double monto){
        if(monto>0){
            saldo += monto;
        }
        return saldo;
    }

    public double retirar(double monto){
        if(monto > saldo){
            saldo = 0;
        }else{
            saldo-= monto;
        }
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }


}
