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
import java.lang.annotation.*;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.util.*; 

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
 @interface Test {
}


public class CustomAdd
{
	public void CustomAdd_1()
	{
		byte inputBuffer[] = new byte[ 128 ];
		
		// Data to write
		byte data[] = { 1,0,1,1,1,1,1,1,0,0,0,0 };

		try
		{
			// Read data from the standard input
			int byteCount = System.in.read( inputBuffer );
			
			// Check whether data has been read or not
			if( byteCount <= 0 )
			{
				return;
			}
	
			// Turn data into a String
			String s = new String( inputBuffer );
			s = s.substring( 0, byteCount-2 );
			
			// Create a file from the inputBuffer, but
			// there is no filtering!
			// BUG
			FileOutputStream f;
			f = new FileOutputStream( s );

			try
			{
				// Try to write data in the file
				f.write( data );
			}
			catch( IOException e )
			{
				final Logger logger = Logger.getAnonymousLogger();
				String exception = "Exception " + e;
				logger.warning( exception );
			}

			f.close();
		}
		catch( IOException e )
		{
			final Logger logger = Logger.getAnonymousLogger();
			String exception = "Exception " + e;
			logger.warning( exception );
		}
	}

	public void custom4()
	{
		byte data[] = { 1,0,1,1,1,1,1,1,0,0,0,0 };
		try
		{
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String input = br.readLine();
			
			// Create a file from the inputBuffer, but
			// there is no filtering!
			// BUG
			String s;
			String t="dffh";
			s=t+input;
			int a,b=2,c=2,d=4;
			a=b+c-d;
			FileOutputStream f;
			f = new FileOutputStream( s );

			try
			{
				// Try to write data in the file
				f.write( data );
			}
			catch( IOException e )
			{
				final Logger logger = Logger.getAnonymousLogger();
				String exception = "Exception " + e;
				logger.warning( exception );
			}

			f.close();
		}
		catch( IOException e )
		{
			final Logger logger = Logger.getAnonymousLogger();
			String exception = "Exception " + e;
			logger.warning( exception );
		}	
	}

	@Test
	public void custom5()
	{
	   try
		{
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String input = br.readLine();
			
			String s;
			int a,b=2,c=3,d=4;
			s=(b+c-d)+input+b;
			FileOutputStream f;
			f = new FileOutputStream( s );
		}
		catch( IOException e )
		{
			final Logger logger = Logger.getAnonymousLogger();
			String exception = "Exception " + e;
			logger.warning( exception );
		}
	}
	public void custom6()
	{
	    try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String input;
		    input = br.readLine();
			
			String s;
			s=new String(input);
			FileOutputStream f=new FileOutputStream( s );
	    }
		catch( IOException e )
		{
			final Logger logger = Logger.getAnonymousLogger();
			String exception = "Exception " + e;
			logger.warning( exception );
		}
	}
	public void custom7()
	{
	   try
		{
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String input;
		    input= br.readLine();
			
			String s;
			int a,b=2,c=3,d=4;
			s=(b+c-d)+b+"ghgh";
			FileOutputStream f;
			f = new FileOutputStream( s );
		}
		catch( IOException e )
		{
			final Logger logger = Logger.getAnonymousLogger();
			String exception = "Exception " + e;
			logger.warning( exception );
		}
	}
	//init taint
	public void custom8()
	{
	   try
		{
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String input = br.readLine();
			
			int a,b=2,c=3,d=4;
			String s=(b+c-d)+input+b;
			FileOutputStream f;
			f = new FileOutputStream( s );
		}
		catch( IOException e )
		{
			final Logger logger = Logger.getAnonymousLogger();
			String exception = "Exception " + e;
			logger.warning( exception );
		}
	}
	//init taint with new
	public void custom9()
	{
	    try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String input;
		    input = br.readLine();
			
			String s=new String(input);
			FileOutputStream f=new FileOutputStream( s );
	    }
		catch( IOException e )
		{
			final Logger logger = Logger.getAnonymousLogger();
			String exception = "Exception " + e;
			logger.warning( exception );
		}
	}
	//init non-taint
	public void custom10()
	{
	   try
		{
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String input;
		    input= br.readLine();
			
			int a,b=2,c=3,d=4;
			String s=(b+c-d)+b+"ghgh";
			FileOutputStream f;
			f = new FileOutputStream( s );
		}
		catch( IOException e )
		{
			final Logger logger = Logger.getAnonymousLogger();
			String exception = "Exception " + e;
			logger.warning( exception );
		}
	}
	//just new method call taint
	public void custom11Test()
	{
	    try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String input;
		    input = br.readLine();
			
			String s=new String(input);
			new FileOutputStream( s );
	    }
		catch( IOException e )
		{
			final Logger logger = Logger.getAnonymousLogger();
			String exception = "Exception " + e;
			logger.warning( exception );
		}
	}
	//init taint
	public void custom12()
	{
	   try
		{
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String input = br.readLine();
			
			HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
			hash_map.put(1,input);
			FileOutputStream f;
			f = new FileOutputStream( hash_map.get(1) );
		}
		catch( IOException e )
		{
			final Logger logger = Logger.getAnonymousLogger();
			String exception = "Exception " + e;
			logger.warning( exception );
		}
	}

	public static void main( String[] argv )
	{
		// new CustomAdd().CustomAdd_1();
	}
}

// end of ResourceInjection_099.java