

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
	public void false2()
	{
	   try{

	   CustomAdd c=new CustomAdd();
	   c.CustomAdd_1();
		}
		catch(Exception ex)
		{
			StringWriter errors = new StringWriter();
			PrintWriter pw=new PrintWriter(errors);
			ex.printStackTrace(pw);
		}
	}
	public void false3()
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
	public void true2()
	{
	   try{

	   CustomAdd c=new CustomAdd();
	   c.CustomAdd_1();
		}
		catch(Exception ex)
		{
			StringWriter errors = new StringWriter();
			PrintWriter pw=new PrintWriter(errors);
			ex.printStackTrace(pw);
			System.err.println(errors.toString());
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
			StringWriter errors = new StringWriter();
			PrintStream pw=new PrintStream(errors);
			ex.printStackTrace(pw);
			String s=errors.toString();
			System.err.println(s);
		}
		}
	public void true5()
	{
	   try{

	   CustomAdd c=new CustomAdd();
	   c.CustomAdd_1();
		}
		catch(Exception ex)
		{
			StringWriter errors = new StringWriter();
			PrintStream pw=new PrintStream(errors);
			ex.printStackTrace(pw);
			String s=errors.toString();
			String p;
			p=s;
			System.err.print(p);
		}
		}
	public void true4()
	{
	   try{

	   CustomAdd c=new CustomAdd();
	   c.CustomAdd_1();
		}
		catch(Exception ex)
		{
			StringWriter errors = new StringWriter();
			PrintWriter pw=new PrintWriter(errors);
			ex.printStackTrace();
			System.err.println(errors.toString());
		}
		}
}

