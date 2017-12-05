import java.net.*;
class UdpReceiver
{
public static void main(String[] args) throws Exception
{
DatagramSocket ds=new DatagramSocket(2000);

byte[] data=new byte[1024];


DatagramPacket dp=new DatagramPacket(data,1024);
while(true)
{
ds.receive(dp);

byte[] rdata=dp.getData();
int len=dp.getLength();

String msg=new String(rdata,0,len);

System.out.println(msg);
}

}
}