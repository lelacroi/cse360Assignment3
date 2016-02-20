package cse360assign3;

/**
 * @author Leo
 *
 */
public class Calculator 
{
	
	private int total;
	
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
		
	}

	
	/**
	 * @param value
	 */
	
	public void subtract (int value) 
	{
		total = total - value;
		
	}
	
	
	/**
	 * @param value
	 */
	
	public void multiply (int value) 
	{
		total = total * value;
		
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
	}
	
	
	/**
	 * @return
	 */
	
	public String getHistory () 
	{
		
		return "";
	}

}
