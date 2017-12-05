import java.net.*;
import java.io.*;
class TcpServer
{
public static void main(String[] args) throws Exception
{
ServerSocket ss=new ServerSocket(2000);
Socket s=ss.accept();
InputStream in=s.getInputStream();
BufferedReader br=new BufferedReader(new InputStreamReader(in));
String msg=br.readLine();
System.out.println("from client: "+msg);

String cap=msg.toUpperCase();
OutputStream out=s.getOutputStream();
PrintWriter pw=new PrintWriter(out,true);
pw.println(cap);

}

}
