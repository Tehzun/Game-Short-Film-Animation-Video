<%@ page language="java" import="java.sql.*"%>
<html>
    <head></head>
    <body bgcolor="black"><font color="red">
        <h1>This is a User Page</h1>
        <%
            String str = (String) session.getAttribute("username");
            out.print("Welcome " + str);
        %>
        </font>
 
    </body>
</html>