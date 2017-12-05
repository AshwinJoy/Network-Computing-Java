import java.net.*;
import java.io.*;
class Server
{
public static void main(String[] args)
{

try
{
ServerSocket ss=new ServerSocket(2000);
Socket s=ss.accept();
BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
String msg=in.readLine();
System.out.println("from client"+msg);

PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
String replaymsg=msg.toUpperCase();
pw.println(replaymsg);

}
catch(Exception e)
{
System.out.println(e);
}
}

}