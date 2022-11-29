package es.uca.mps.devops.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import es.uca.mps.devops.cli.App.DivideByZeroException;

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
    public void checkDividir() {
    	try
    	{
    		assertEquals(c.dividir(),1);
    	}catch(DivideByZeroException ex)
    	{
    		assertEquals(ex.getMessage(),"No se puede dividir entre 0");
    	}
    }
    
    @Test
    public void checkDividir0() {
    	try
    	{
    		d.dividir();
    	}catch(DivideByZeroException ex)
    	{
    		assertEquals(ex.getMessage(),"No se puede dividir entre 0");
    	}
    }
    
    
    @Test
    public void checkModulo() {
    	try
    	{
    		assertEquals(c.modulo(),2);
    	}catch(DivideByZeroException ex2)
    	{
    		assertEquals(ex2.getMessage(),"No se puede hacer el modulo entre 0");
    	}
    }
    
    @Test
    public void checkModulo0() {
    	try
    	{
    		d.modulo();
    	}catch(DivideByZeroException ex2)
    	{
    		assertEquals(ex2.getMessage(),"No se puede hacer el modulo entre 0");
    	}
    }
    
    @Test
    public void checkPotencia() {
    	assertEquals(c.potencia(),16807);
    	assertEquals(d.potencia(),1);
    }
}
