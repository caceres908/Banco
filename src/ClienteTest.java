import org.junit.Test;

import static org.junit.Assert.*;

public class ClienteTest {
    @Test
    public void retirar(){
        Cliente juan = new Cliente("Juan",115456972,new Cuenta(127856,50),"Cedula");
        double p = juan.retirar(20.25);
        assertEquals(29.25,p,0.01);
    }
}