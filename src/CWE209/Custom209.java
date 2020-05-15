

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
	public void false4()
	{
	   try{

	   CustomAdd c=new CustomAdd();
	   c.CustomAdd_1();
		}
		catch(Exception ex)
		{
			StringWriter errors = new StringWriter();
			p.printStackTrace(new PrintWriter(errors));
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
	public void true4()
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
			log.error(ex.printStackTrace(pw));
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

	public void true5(Throwable t)
	{
	   if(t!=null)
	   {
	   	 t.printStackTrace(System.err);
	   }
	}
	public void true6(Throwable t)
	{
	   if(t!=null)
	   {
	   	 t.printStackTrace(System.out);
	   }
	}
	public void true9(IOException t)
	{
	   if(t!=null)
	   {
	   	 t.printStackTrace(System.out);
	   }
	}
	public void false3(Hello t)
	{
	   if(t!=null)
	   {
	   	 t.printStackTrace(System.out);
	   }
	}
	public void true7(PrintWriter s)
	{
	   for(Throwable kam: list)
	   {
	   	 kam.printStackTrace(s);
	   }
	}
	public void true10()
	{
	   if(t!=null)
	   {
	   	 new Exception(t).printStackTrace(System.out);
	   }
	}
	public void true11(IOException[] t)
	{
	   	 t[0].printStackTrace(System.out);
	}

	public void true8()
	{
		return new SSS() {
				public Object truth8()
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
		};
	   
	}

}

