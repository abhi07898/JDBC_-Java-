import java.sql.*;
class InsertDataPrepared
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");

String url="jdbc:mysql://localhost:3306/Abhi";
String uname="root";
String pass="root";
Connection conn=DriverManager.getConnection(url,uname,pass);
String q=("insert into table1(tName,tCity)values(?,?)");
PreparedStatement pstmt=conn.prepareStatement(q);
pstmt.setString(1,"Abhihsek");
pstmt.setString(2,"Lucknow");
pstmt.executeUpdate();
System.out.println("Inserted");
conn.close(); 
}
catch(Exception e)
{
System.out.println(e);
}
}
}