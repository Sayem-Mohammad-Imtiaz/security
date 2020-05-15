

import java.io.*;
import java.util.logging.Logger;


public class TestAst
{
	//just new method call taint
	public void true1(int a)
	{
		a=a+2;
		int i;
		for(i=0;i<10;i++)
		{
			if(i==0)
				continue;
		    System.out.print("ghgh");
		}
	   try{

	   CustomAdd c=new CustomAdd();
	   c.CustomAdd_1();
		}
		catch(Exception ex)
		{
			StringWriter errors = new StringWriter();
			ex.printStackTrace(new PrintWriter(errors));
		}
	}
	
}

