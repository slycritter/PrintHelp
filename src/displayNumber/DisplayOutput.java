package displayNumber; 

import javax.swing.JOptionPane;


public class DisplayOutput 
{
	public DisplayOutput()
	{
		NumericValidation nV = new NumericValidation();
		String message = "input an integer and i will count down";
		String word = "integer";
		int number;
		int numOnLine;
		String Output = "";
		
		number = Integer.parseInt(nV.validUnsignedInt(message, word));
		
		numOnLine = 0;
		
		
		for(int n = number; n > - 1 ;n--, numOnLine++)
		{
			//numOnLine++;
			System.out.print(n + "  ");
			
			Output += n + " ";
			if(15 == numOnLine)
			{
				numOnLine = -1;
				System.out.print(n + " ");
				Output += n + " \n ";
			}
		}
		JOptionPane.showMessageDialog(null, Output);
	}

}
