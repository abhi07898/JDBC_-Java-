import java.sql.*;
import java.io.*;
class InsertDataPreaparedDayanamic
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Abhi","root","root");
String q=("insert into table1(tName,tCity) values(?,?)");
PreparedStatement pstmt=conn.prepareStatement(q);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Pls enter your name");
String Name=br.readLine();
System.out.println("PLs enetr your city");
String City=br.readLine();
pstmt.setString(1,Name);
pstmt.setString(2,City);
pstmt.executeUpdate();

System.out.println("value inserted correctly dayanmically");

conn.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}