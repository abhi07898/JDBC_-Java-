import java.sql.*;
class Insert2
{
public static void main(String arfgs[])
{
try{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/Abhi";
String uname="root";
String pass="root";
Connection con=DriverManager.getConnection(url,uname,pass);
Statement stmt=con.createStatement();
String q="insert into table1 values ('13','Ram','Ayodhaya')";

stmt.executeUpdate(q);
}
catch(Exception e)
{
System.out.println(e);
}
}
}