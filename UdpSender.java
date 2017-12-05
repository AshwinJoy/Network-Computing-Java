import java.net.*;
import java.io.*;
class UdpSender
{
public static void main(String[] args) throws Exception
{
DatagramSocket ds=new DatagramSocket();

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String msg=br.readLine();

InetAddress add=InetAddress.getLocalHost();

byte[] data=msg.getBytes();
int len=data.length;

DatagramPacket dp=new DatagramPacket(data,len,add,2000);
ds.send(dp);
ds.close();
}
}