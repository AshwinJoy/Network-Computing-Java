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


}
catch(Exception e)
{
}
}

}