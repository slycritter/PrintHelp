package displayNumber;

import javax.swing.JOptionPane;


public class NumericValidation
{

	public NumericValidation()
	{
		// TODO Auto-generated constructor stub
	}

	public String validUnsignedInt(String msg, String word)
	{
		String temp;
		String message = msg;
		boolean goodInt;
		
		do
		{
			goodInt = true;
			
			temp = JOptionPane.showInputDialog(message);
			if(temp == null || temp.length() == 0)
				temp = "x";
			
			if (!allNumbers(temp))
			{
				message = "you have entered a bad value for ";
				message += word + "\n";
				message += "you must enter only digits\n\n";
				goodInt = false;
			}
	
		}while(!goodInt);

		return temp;
}
	
	public String validInt(String msg, String word)
	{
		String temp;
		String t = "";
		char c[];
		int begin;
		String message = msg;
		boolean goodInt;
		
		do
		{
			goodInt = true;
			begin = 0;
			t = "";
			
			temp = JOptionPane.showInputDialog(message);
			if(temp == null || temp.length() == 0)
				temp = "x";
			
			c = temp.toCharArray();
			if ('+' == c[0] || '-' == c[0])
				begin = 1;
	System.out.println("c = " + c);		
			for(int n = begin; n < c.length; n++)
				t += c[n];
			
			if('+' == c[0])
				temp = t;
	System.out.println("t = " + t);		
			if (!allNumbers(t))
			{
				message = "you have entered a bad value for ";
				message += word + "\n";
				message += "you must enter only digits\n\n";
				goodInt = false;
			}
	
		}while(!goodInt);

		return temp;
}
	
	public String validDouble(String msg, String word)
	{
		String temp;
		String t = "";
		char c[];
		int begin;
		String message = msg;
		boolean goodDouble;
		
		do
		{
			goodDouble = true;
			begin = 0;
			t = "";
			
			temp = JOptionPane.showInputDialog(message);
			if(temp == null || temp.length() == 0)
				temp = "x";
			
			c = temp.toCharArray();
			if ('+' == c[0] || '-' == c[0])
				begin = 1;
			
			boolean dp = false;
			
			for(int n = begin; n < c.length; n++)
			{
System.out.println("in valid double in for loop c[" + n + "] = " + c[n]);
				
				if('.' == c[n] && !dp)
				{
System.out.println("if is true");
					dp = true;
					continue;
				}
				
				t += c[n];
			}
			
			if('+' == c[0])
				temp = t;
			
			if (!allNumbers(t))
			{
				message = "you have entered a bad value for ";
				message += word + "\n";
				message += "you must enter only digits"
					+ " and up to one decimal point\n\n";
				goodDouble = false;
			}
	
		}while(!goodDouble);

		return temp;
}

	private boolean allNumbers(String temp)
	{
		char c[] = temp.toCharArray();
		
		for(int n = 0; n < c.length; n++)
		{
			if(c[n] > '9' || c[n] < '0')
				return false;
		}
		return true;
	}
}
