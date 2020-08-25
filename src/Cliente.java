public class Cliente {
    String nombre;
    int identificacion;
    Cuenta tipoCuenta;
    String documento;

    public Cliente(String nombre, int identificacion, Cuenta tipoCuenta, String documento) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.tipoCuenta = tipoCuenta;
        this.documento = documento;
    }

    public double retirar(double cantidad){
        return 0;
    }

}
