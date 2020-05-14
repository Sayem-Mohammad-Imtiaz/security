/* 
 * This software was developed at the National Institute of Standards and
 * Technology by employees of the Federal Government in the course of their
 * official duties. Pursuant to title 17 Section 105 of the United States
 * Code this software is not subject to copyright protection and is in the
 * public domain. NIST assumes no responsibility whatsoever for its use by
 * other parties, and makes no guarantees, expressed or implied, about its
 * quality, reliability, or any other characteristic.
 *
 * This reference program was developed in June 2009 as part of the Software
 * Assurance Metrics And Tool Evaluation (SAMATE) project.
 * We would appreciate acknowledgment if the software is used.
 * The SAMATE project website is: http://samate.nist.gov
 */

/*
 * This code has a Resource Injection CWE-99 vulnerability. http://cwe.mitre.org
 * It creates a file with the data read without filtering, which would allow, for
 * instance "/etc/passwd"!
 */


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

// end of ResourceInjection_099.java