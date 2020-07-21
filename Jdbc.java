import java.sql.*;
class Jdbc
{
public static void main(String args[])
{
int tID=0;
String tName=null,Tcity=null;

Connection c;
Statement s;
int i;
try
{
Class.forName("com.mysql.jdbc.Driver");
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
s=c.createStatement();
i=s.executeUpdate("insert into table1 values(4,'Ravi','Lko')");

if(i>0)
System.out.println("insertion successfully "+i);
else
System.out.println("insertion unsuccecsfully");

}
catch (Exception e)
{
System.out.println(e);
}
}
} 