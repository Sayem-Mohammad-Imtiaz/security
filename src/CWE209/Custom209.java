

import java.io.*;
import java.util.logging.Logger;


public class Custom209
{
	//just new method call taint
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
		}
	}
	public void false1()
	{
	   try{

	   CustomAdd c=new CustomAdd();
	   c.CustomAdd_1();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void false2()
	{
	   try{

	   CustomAdd c=new CustomAdd();
	   c.CustomAdd_1();
		}
		catch(Exception ex)
		{
			log.warn(ex.getMessage());
		}
	}
	public void true2()
	{
	   try{

	   CustomAdd c=new CustomAdd();
	   c.CustomAdd_1();
		}
		catch(Exception ex)
		{
			StringWriter errors = new StringWriter();
			PrintWriter pw;
			pw=new PrintWriter(errors);
			ex.printStackTrace(pw);
		}
	}

	public void true3()
	{
	   try{

	   CustomAdd c=new CustomAdd();
	   c.CustomAdd_1();
		}
		catch(Exception ex)
		{
			File errors = new File();
			PrintStream pw;
			pw=new PrintStream(errors);
			ex.printStackTrace(pw);
		}
	}

}
