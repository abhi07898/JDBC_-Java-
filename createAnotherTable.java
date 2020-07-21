import java.sql.*;
class createAnotherTable
{
public static void main(String args[])
{
try{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/Abhi";
String uname="root";
String pass="root";
Connection conn=DriverManager.getConnection(url,uname,pass);
String q=("create table table2(tID int(10)primary key auto_increment,tName varchar(20),tAddr varchar(300),tContact int(20))");
Statement stmt=conn.createStatement();
stmt.executeUpdate(q);
System.out.println("table created ");
}
catch(Exception e)
{
System.out.println(e);
}
}
}