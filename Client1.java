import java.net.*;
import java.io.*;
class Client
{
public static void main(String[] args)
{
try
{
InetAddress add=InetAddress.getLocalHost();
Socket s=new Socket(add,2000);


PrintWriter pw=new PrintWriter(s.getOutputStream(),true);

pw.println("hello");


BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
String msg=in.readLine();
System.out.println("from server"+msg);
}
catch(Exception e)
{
}
}

}