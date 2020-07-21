import java.sql.*;
class create Table
{
public static void main(Strinf args[])
{
try{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/Abhi";
String uname="root";
String pass="root";

Connection conn=DriverManager.getConnection(url,uname,root);
String q="create table table1(tID int(20) primary key auto_increment,tName varchar(20),tCity varchar(200))";
Statement stmt=con.createStatement();
stmt.executUpdate(q);
System.out.println("Table is created now");

}
catch(Exception e)
{
System.out.println(e);
}
}
}
