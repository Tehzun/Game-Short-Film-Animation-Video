import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StreamWorker 
{
    public static String addStream(Stream s)
            {
                String result="";
                try
                {
                    String query="Insert into stream(StreamName,Year) values (?,?);";
                    PreparedStatement pstmt=DatabaseConnector.getPreparedStatement(query);
                    pstmt.setString(1,c.getStreamName());
                    pstmt.setId(2,c.getYear());
                    
                   
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
   
   
    public static String updateStream(Stream s)
    {
       
                String result="";
                try
                {
                    String query="Update stream set StreamName=?,Year=?";
                   
                    PreparedStatement pstmt=DatabaseConnector.getPreparedStatement(query);
                    pstmt.setString(1,c.getStreamName());
                    pstmt.setId(2,c.getYear());
                   
                   
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
   
    public static String deleteStream(int id)
    {
            String result="";
                try
                {
                    String query="Delete from Stream where id=?;";
                   
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
   
}