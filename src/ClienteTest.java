import org.junit.Test;

import static org.junit.Assert.*;

public class ClienteTest {
    @Test
    public void retirar(){
        Cliente juan = new Cliente("Juan",115456972,new Cuenta(127856,50),"Cedula");
        double p = juan.retirar(20.25);
        double k = juan.retirar(0.75);
        assertEquals(29.75,p,0.01);
        assertEquals(29,k,0.01);
        double f = juan.consultarSaldo();
        assertEquals(29,f,0.01);
    }
    @Test
    public void consultarSaldo(){
        Cliente juan = new Cliente("Juan",115456972,new Cuenta(127856,50),"Cedula");
        double p = juan.consultarSaldo();
      assertEquals(50,p,0.01);
    }
}