import java.net.*;
import sun.net.*;
class MulSender
{
public static void main(String[] args)throws Exception
{
int port = 5000;
String group = "225.4.5.6";

DatagramSocket s = new DatagramSocket();
String msg="hello";
byte[] buf= msg.getBytes();
DatagramPacket pack = new DatagramPacket(buf, buf.length,
					 InetAddress.getByName(group), port);

s.send(pack);
s.close();
}
}