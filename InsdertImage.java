import java.sql.*;
import java.io.*;
class InsdertImage
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Abhi","root","root");
String q=("insert into Image(pic) values (?)");
PreparedStatement pstmt=new prepareStatement(q);
pstmt.setBinaryStream(1,fis,fis.available);
FileInputStream fis=new FileInputStream("mypic.jpg"); 
pstmt.executeUpdate();
System.out.println("yess this is now inserted into Database wooeooe");
conn.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}