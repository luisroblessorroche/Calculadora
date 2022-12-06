package es.uca.mps.devops.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	App c = new App(7,5);
	App d = new App(12,0);
    /**
     * Rigorous Test :-)
     */
    @Test
    public void checkConstructor()
    {
        assertEquals(c.getX(),7);
        assertEquals(c.getY(),5);
        assertEquals(d.getX(),12);
        assertEquals(d.getY(),0);
    }
    
    @Test
    public void checkSuma() {
    	assertEquals(c.suma(),12);
    	assertEquals(d.suma(),12);
    }
    
    @Test
    public void checkResta() {
    	assertEquals(c.resta(),2);
    	assertEquals(d.resta(),12);
    }
    
    @Test
    public void checkMultiplicar() {
    	assertEquals(c.multiplicar(),35);
    	assertEquals(d.multiplicar(),0);
    }
    
    @Test
    public void checkPotencia() {
    	assertEquals(c.potencia(),16807);
    	assertEquals(d.potencia(),1);
    }
}
