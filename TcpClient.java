import java.net.*;
import java.io.*;
class TcpClient
{
public static void main(String[] args) throws Exception
{
InetAddress add=InetAddress.getLocalHost();
Socket s=new Socket(add,2000);

OutputStream out=s.getOutputStream();
PrintWriter pw=new PrintWriter(out,true);
pw.println("hello");


InputStream in=s.getInputStream();
BufferedReader br=new BufferedReader(new InputStreamReader(in));
String msg=br.readLine();
System.out.println("from Server: "+msg);
}

}
