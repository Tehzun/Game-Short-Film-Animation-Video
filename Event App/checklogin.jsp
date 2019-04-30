<%@ page language="java" import="java.sql.*"%><b><center>     
        <%
            String name = request.getParameter("uname");
            String pass = request.getParameter("upass");
            try {
                Class.forName("");
                Connection con = DriverManager.getConnection("");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from reg");
                int x = 0;
                while (rs.next()) {
                    if ((rs.getString("uname").equals(name)) && rs.getString("upass").equals(pass)) {
                        String stp = rs.getString("utype");
                        if (stp.equals("admin")) {
                            x = 1;
                            break;
                        } else {
                            x = 2;
                            break;
                        }
                    }
                }
                if (x == 2) {
                    response.sendRedirect("student.jsp");
                } else if (x == 1) {
                    response.sendRedirect("admin.jsp");
                } else {
                    out.println("Either you enter Invalid UserName or Password! Please Try Again");
        %>
        <jsp:include page="index.html" />
        <%}
 
            } catch (Exception e) {
                out.println(e);
            }
 
            session.setAttribute("username", name);
        %> 