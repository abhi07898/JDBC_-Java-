
####errorrr


import java.sql.*;
import java.io.*;
class InsertTableandDataPreaparedDayanamic
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Abhi","root","root");
String table=("create table table2(tID int(10)primary key auto_increment,tName varchar(10),tCity varchar(100))");
String q=("insert into table2(tName,tCity) values(?,?)");
Statement stmt=conn.createStatement(table);
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




# we cant perform table creating and inserting value simeltiounesloy in jdbc

