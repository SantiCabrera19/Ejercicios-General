public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector multiplicar(double nro){
        Vector nuevoVector = new Vector(x*nro, y*nro, z*nro);
        return nuevoVector;
    }

    public Vector sumar(Vector v){
        if((v.x ==0 && this.x ==0) && (v.y ==0 && this.y ==0) && (v.z==0&&this.z==0)){
            return new Vector(this.x+v.x, this.y+v.y,this.z+v.z);
        }else{
            System.out.println("error los vectores no tienen la misma cantidad de elementos");
            return v;
        }

    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + ", " + z + ']';
    }
}
