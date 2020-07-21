import java.sql.*;
class Insert1
{
public static void main(String args[])
{
try{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/Abhi";
String uname="root";
String pass="root";
Connection conn=DriverManager.getConnection(url,uname,pass);
Statement stmt=conn.createStatement();
String q="insert into table1 values(12,'Abhishke','LKO');";
stmt.executeUpdate(q);
System.out.println("value INserted ");
//conn.Close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}