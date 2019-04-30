package com.hinduja.asterix.project2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EventplaylogWorker 
{
    public static String addEvent(Event c)
            {
                String result="";
                try
                {
                    String query="Insert into customer(id,eid,eAid,eventid,amount) values (?,?,?,?,?,);";
                    PreparedStatement pstmt=DatabaseConnector.getPreparedStatement(query);
                    pstmt.setString(1,c.getid());
                    pstmt.setString(2,c.geteid());
                    pstmt.setString(3,c.geteAid());
                    pstmt.setString(4,c.geteventid());
                    pstmt.setString(5,c.getamount());
                            
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
    
    
    public static String updateEvent(Event c)
    {
        
                String result="";
                try
                {
                    String query="Update customer set id=?,eid=?,eAid=?,eventid=?,amount=?, where id=?;";
                    
                    PreparedStatement pstmt=DatabaseConnector.getPreparedStatement(query);
                    pstmt.setString(1,c.getid());
                    pstmt.setString(2,c.geteid());
                    pstmt.setString(3,c.geteAid());
                    pstmt.setString(4,c.geteventid());
                    pstmt.setString(5,c.getamount());
                    
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
            String query="Select email from customer where email like '"+user+"' and password like '"+password+"'; " ;
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