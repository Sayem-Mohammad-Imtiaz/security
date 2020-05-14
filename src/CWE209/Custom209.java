

import java.io.*;
import java.util.logging.Logger;


public class Custom209
{
	//just new method call taint
	public void false1()
	{
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
	public void true1()
	{
	   try{

	   CustomAdd c=new CustomAdd();
	   c.CustomAdd_1();
		}
		catch(Exception ex)
		{
			StringWriter errors = new StringWriter();
			ex.printStackTrace(new PrintWriter(errors));
			System.out.println(errors.toString());
		}
	}
}
