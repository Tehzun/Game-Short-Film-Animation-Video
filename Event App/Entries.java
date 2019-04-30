package com.hinduja.asterix.project2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Entries
{
    public static String addEvent(Event c)
            {
                String result="";
                try
                {
                    String query="Insert into Entries(id,eventAbstractId,name,contact,email,collegeId,streamId) values (?,?,?,?,?,?,?,);";
                    PreparedStatement pstmt=DatabaseConnector.getPreparedStatement(query);
                    pstmt.setString(1,c.getId());
                    pstmt.setString(2,c.getEventAbstractId());
                    pstmt.setString(3,c.getName());
                    pstmt.setString(4,c.getContact());
                    pstmt.setString(5,c.getEmail());
                    pstmt.setString(6,c.getCollegeId());
                    pstmt.setString(7,c.getStreamId());
					
                    
                   
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
                    String query="Update event set id=?,eAid=?,name=?,contact=?,email=?,collegeid=?,streamid=? where id=?;";
                   
                    PreparedStatement pstmt=DatabaseConnector.getPreparedStatement(query);
                    pstmt.setString(1,c.getId());
                    pstmt.setString(2,c.getEAid());
                    pstmt.setString(3,c.getName());
                    pstmt.setString(4,c.getContact());
                    pstmt.setString(5,c.getEmail());
                    pstmt.setString(6,c.getCollegeid());
                    pstmt.setString(7,c.getStreamid());
					pstmt.setInt(8,c.getId());
                   
                  
                   
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
                    String query="Delete from Entries where id=?;";
                   
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