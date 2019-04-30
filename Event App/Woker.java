package com.hinduja.asterix.project2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EventApp
{
	public static void main(String[] args)
	{
		public static String addEvent(Event c)
		{
			String result="";
			try
			{
				String query="Insert into event(eventName,id,coordinator,entryFee,date,eventAbstractId) values (?,?,?,?,?,?,);";
				PreparedStatement pstmt=DatabaseConnector.getPreparedStatement(query);
				pstmt.setString(1,c.geteventName());
				pstmt.setString(2,c.getid());
			    pstmt.setString(3,c.getcoordinator());
				pstmt.setString(4,c.getentryFee());
				pstmt.setString(5,c.getdate());
				pstmt.setString(6,c.geteventAbstractId());
                
                 
				 int i=pstmt.executeUpdate

            }
			                    if(i==1)
                {
                    result=Results.SUCCESS;
                }
                else
                {
                    result=Results.FAIL;
                }


        }
        catch (Exception e)
        {
            result=Results.PROBLEM;
            e.printStackTrace();
        }

        return result;
           
       
    }
   
   
    public static String updateEvent(Event c)
    {
       
                String result="";
                try
                {
                    String query="Update event set eventName=?,id=?,=?,coordinator=?,entryFee=?,date=?,eventAbstractId=?, where id=?;";
                   
                    PreparedStatement pstmt=DatabaseConnector.getPreparedStatement(query);
                    pstmt.setString(1,c.geteventName());
					pstmt.setString(2,c.getid());
                    pstmt.setString(3,c.getcoordinator());
                    pstmt.setString(4,c.getentryFee());
					pstmt.setString(5,c.getdate());
                    pstmt.setString(6,c.geteventAbstractId());
                    pstmt.setInt(7,c.getid());
                   
                        int i=pstmt.executeUpdate();

               
                    if(i==1)
                {
                    result=Results.SUCCESS;
                }
                else
                {
                    result=Results.FAIL;
                }


        }
        catch (Exception e)
        {
            result=Results.PROBLEM;
            e.printStackTrace();
        }

        return result;
           
    }
   
    public static String deleteEvent(int id)
    {
            String result="";
                try
                {
                    String query="Delete from Event where id=?;";
                   
                    PreparedStatement pstmt=DatabaseConnector.getPreparedStatement(query);
                     pstmt.setInt(1,id);
                   
                        int i=pstmt.executeUpdate();

               
                    if(i==1)
                {
                    result=Results.SUCCESS;
                }
                else
                {
                    result=Results.FAIL;
                }


        }
        catch (Exception e)
        {
            result=Results.PROBLEM;
            e.printStackTrace();
        }

        return result;
    }
   
      public static String checkLogin(String user,String password)
    {
        String result="";
        String dbUser="",dbPass="";
        try {
            Statement st=DatabaseConnector.getStatement();
            String query="Select email from event where email like '"+user+"' and password like '"+password+"'; " ;
           ResultSet rs=st.executeQuery(query);
        if( rs.next())
        {
   
            result=Results.SUCCESS;
        }
        else
        {
            result=Results.FAIL;
        }
        }
        catch (Exception e)
        {

            result=Results.PROBLEM;
            e.printStackTrace();
        }
       
        return result;
    }
   
}
 