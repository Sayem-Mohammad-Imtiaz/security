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

package testcases.CWE89_SQL_Injection.s04;
import testcasesupport.*;

import javax.servlet.http.*;

import java.sql.*;

import java.util.logging.Level;
import java.io.*;


class sampleClass
{
    int field;

    public int getField()
    {
        return field;
    }
}

public class spotBug1
{
    public void objectField(sampleClass data)
    {

        Connection dbConnection = null;
        PreparedStatement sqlStatement = null;

        try
        {
            dbConnection = IO.getDBConnection();
            sqlStatement = dbConnection.prepareStatement("insert into users (status) values ('updated') where name='"+data.field+"'");

            Boolean result = sqlStatement.execute();
        }
        catch (SQLException exceptSql)
        {
            IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
        }

    }

    public void objectMethod(sampleClass data)
    {

        Connection dbConnection = null;
        PreparedStatement sqlStatement = null;

        try
        {
            dbConnection = IO.getDBConnection();
            sqlStatement = dbConnection.prepareStatement("insert into users (status) values ('updated') where name='"+data.getField()+"'");

            Boolean result = sqlStatement.execute();
        }
        catch (SQLException exceptSql)
        {
            IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
        }

    }

    public void objectBufferedReader() throws IOException
    {
        BufferedReader r=new BufferedReader(new FileReader("as.sql"));
        String data=r.readLine();

        Connection dbConnection = null;
        PreparedStatement sqlStatement = null;

        try
        {
            dbConnection = IO.getDBConnection();
            sqlStatement = dbConnection.prepareStatement("insert into users (status) values ('updated') where name='"+data+"'");

            Boolean result = sqlStatement.execute();
        }
        catch (SQLException exceptSql)
        {
            IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
        }

    }

    public void objectExecuteQuery()
    {

        Connection dbConnection = null
        PreparedStatement sqlStatement = null;

        try
        {
            dbConnection = IO.getDBConnection();
            sqlStatement = dbConnection.prepareStatement("insert into users (status) values ('updated')");

            Boolean result = sqlStatement.execute();
            sqlStatement.executeQuery("select * from table1 where r="+result);
        }
        catch (SQLException exceptSql)
        {
            IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
        }

    }

     public void objectHttpRequest(Servelet Request)
    {
        String data=request.getParameter("hey");

        Connection dbConnection = null;
        PreparedStatement sqlStatement = null;

        try
        {
            dbConnection = IO.getDBConnection();
            sqlStatement = dbConnection.prepareStatement("insert into users (status) values ('updated')"+data);

            Boolean result = sqlStatement.execute();
            sqlStatement.executeQuery("select * from table1 where");
        }
        catch (SQLException exceptSql)
        {
            IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
        }

    }
    
}
