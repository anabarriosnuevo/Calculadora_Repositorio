
package co.edu.unbosque.calculadora.test;

import co.edu.unbosque.calculadora.operaciones.OperacionesCalculadora;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ana Maria
 */
public class CalculadoraTest {
    
    @Test
    public void operacionBinaria() {
        OperacionesCalculadora calculadora = new OperacionesCalculadora();
        double ope1 = 12;
        double ope2 = 30;
        double result = calculadora.operacionB(ope1, ope2);
        Assert.assertEquals(result, ope2, result, null);
    }
    
}

