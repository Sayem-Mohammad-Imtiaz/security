/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE89_SQL_Injection__URLConnection_prepareStatement_81_goodG2B.java
Label Definition File: CWE89_SQL_Injection.label.xml
Template File: sources-sinks-81_goodG2B.tmpl.java
*/
/*
 * @description
 * CWE: 89 SQL Injection
 * BadSource: URLConnection Read data from a web server with URLConnection
 * GoodSource: A hardcoded string
 * Sinks: prepareStatement
 *    GoodSink: Use prepared statement and execute (properly)
 *    BadSink : data concatenated into SQL statement used in prepareStatement() call, which could result in SQL Injection
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */


public class arektaclass 
{

    public void fun( ) throws Throwable
    {

        fun2();

    }

     public void fun2( ) throws Throwable
    {

        java.io.BufferedReader r=new java.io.BufferedReader();
        r.readChar();
    }
    
}
