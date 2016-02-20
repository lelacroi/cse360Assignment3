package cse360assign3;

/**
 * @author Leo Lacroix
 * Date: 2/19/2016
 * CSE 360 Assignment 3
 *
 */
public class Calculator 
{
	
	private int total;
	
	private String history = "" + total;
	
	/**
	 * 
	 */
	
	public Calculator () 
	{
		
		total = 0;  // not needed - included for clarity
	}
	
	
	/**
	 * @return
	 */
	
	public int getTotal () 
	{
		
		return total;
	}
	
	
	/**
	 * @param value
	 */
	public void add (int value) 
	{
		
		total = total + value;
		
		history = history + " + " + value;
		
	}

	
	/**
	 * @param value
	 */
	
	public void subtract (int value) 
	{
		total = total - value;
		
		history = history + " - " + value;
	}
	
	
	/**
	 * @param value
	 */
	
	public void multiply (int value) 
	{
		total = total * value;
		
		history = history + " * " + value;
	}
	
	
	/**
	 * @param value
	 */
	
	public void divide (int value) 
	{
		if (value == 0)
		{
			total = 0;
		}
		
		total = (int) total / value;
		
		history = history + " / " + value;
		
	}
	
	
	/**
	 * @return
	 */
	
	public String getHistory () 
	{
		
		return history;
	}

}
