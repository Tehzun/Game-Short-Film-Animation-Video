package com.hinduja.asterix.project2;
import java.sql.*;


public class EntryfeeData 
{
    public static String addEntryfeeData(EntryfeeData e)
            {
                String result="";
                try
                {
                    String query="Insert into FeeData(fname,mname,lname,contact,email,profile,date) values (?,?,?,?,?,?,?);";
                    PreparedStatement pstmt=DatabaseConnector.getPreparedStatement(query);
                 
                    pstmt.setString(1,e.getFname());
                     pstmt.setString(2,e.getMname());
                      pstmt.setString(3,e.getLname());
                      pstmt.setString(4,e.getContact());
                      pstmt.setString(5,e.getEmail());
                      pstmt.setString(6,e.getProfile());
                      pstmt.setString(7,e.getDate());
                                            

                   
                   
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
    
    
    public static String updateEntryfeeData(EntryfeeData e)
    {
        
                String result="";
                try
                {
                    String query="Update FeeData set name=?, location=? where id=?;";
                    
                    PreparedStatement pstmt=DatabaseConnector.getPreparedStatement(query);
                   
                    pstmt.setString(1,e.getFname());
                     pstmt.setString(2,e.getMname());
                      pstmt.setString(3,e.getLname());
                      pstmt.setString(4,e.getContact());
                      pstmt.setString(5,e.getEmail());
                      pstmt.setString(6,e.getProfile());
                      pstmt.setString(7,e.getDate());
                   pstmt.setInt(8,e.getId());

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
    
    public static String deleteCollegeWorker(int id)
    {
            String result="";
                try
                {
                    String query="Delete from customer where id=?;";
                    
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
        String dbName="Project2",dbPass="takemeaway";
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
