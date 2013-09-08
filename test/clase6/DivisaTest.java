/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

import clase6.pruebas.Divisa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PFR
 */
public class DivisaTest {
    
    public DivisaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testSumar() throws Exception {
        System.out.println("sumar");
        Divisa d = new Divisa(10, "Soles");
        Divisa divisaJose = new Divisa(20, "Soles");
        Divisa divisaSilvia = new Divisa(30, "Soles");
        Divisa resultado = divisaJose.sumar(d);
        assertEquals(divisaSilvia, resultado);
    }

}