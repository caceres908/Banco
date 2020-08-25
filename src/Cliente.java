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
        if(cantidad <= this.tipoCuenta.Saldo){
            this.tipoCuenta.Saldo = this.tipoCuenta.Saldo - cantidad;
            System.out.println("Transación exitosa, su nuevo saldo es $ "+this.tipoCuenta.Saldo);
            return this.tipoCuenta.Saldo;
        }else{
            System.err.println("Saldo insuficiente su saldo actual es de $ "+this.tipoCuenta.Saldo+" Y usted deseea retirar $ "+cantidad);
            return this.tipoCuenta.Saldo;
        }
    }
    public double consultarSaldo(){
        System.out.println("su saldo es de $ "+this.tipoCuenta.Saldo);
        return this.tipoCuenta.Saldo;
    }

}
