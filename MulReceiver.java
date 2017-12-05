import java.net.*;
import java.io.*;
class MulReciever
{
public static void main(String[] args) throws Exception
{
int port = 5000;
String group = "225.4.5.6";

MulticastSocket s = new MulticastSocket(port);
s.joinGroup(InetAddress.getByName(group));

byte buf[] =new byte[1024];
DatagramPacket pack = new DatagramPacket(buf, buf.length);
s.receive(pack);

byte[] data=pack.getData();
int len=pack.getLength();
String msg=new String(data,0,len);
System.out.println(msg);

s.leaveGroup(InetAddress.getByName(group));
s.close();
}
}