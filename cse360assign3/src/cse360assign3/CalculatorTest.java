package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() 
	{
		Calculator myCalc = new Calculator();
		
		assertEquals(0, myCalc.getTotal());
	}

	@Test
	public void testGetTotal() 
	{
		Calculator myCalc = new Calculator();
		
		
		assertEquals(0, myCalc.getTotal());
		
	}

	@Test
	public void testAdd() 
	{
		Calculator myCalc = new Calculator();
		
		myCalc.add(5);
		myCalc.add(1);
		myCalc.add(2);
		
		assertEquals(8, myCalc.getTotal());
		
	}

	@Test
	public void testSubtract() 
	{
		Calculator myCalc = new Calculator();
		
		myCalc.add(8);
		myCalc.subtract(4);
		myCalc.subtract(2);
		myCalc.subtract(0);
		
		assertEquals(2, myCalc.getTotal());
	}

	@Test
	public void testMultiply() 
	{
		Calculator myCalc = new Calculator();
		
		myCalc.add(5);
		myCalc.multiply(11);
		
		assertEquals(55, myCalc.getTotal());
	}

	@Test
	public void testDivide() 
	{
		Calculator myCalc = new Calculator();
		
		myCalc.add(5);
		myCalc.add(1);
		myCalc.divide(6);
		
		assertEquals(1, myCalc.getTotal());
		
		myCalc.add(25);
		myCalc.divide(4);
		
		assertEquals(6, myCalc.getTotal());
	}

	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}

}
