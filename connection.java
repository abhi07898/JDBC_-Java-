import java.sql.*;
class connection
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/Abhi";
String uname="root";
String pass="root";
Connection con=DriverManager.getConnection(url,uname,pass);
//check the connection

if(con.isClosed())
{

System.out.println("Closed");
}
else
{
System.out.println("Created ");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}