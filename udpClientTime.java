import java.io.*;
import java.net.*;

public class udpClientTime
{
public static void main(String args[])
{
try
{
DatagramSocket ds=new DatagramSocket(1000);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your name:");
String name=br.readLine();
String s="Hi,I am " +name;
byte b1[]=new byte[1024];
b1=s.getBytes();
DatagramPacket dp1=new DatagramPacket(b1,b1.length,InetAddress.getLocalHost(),2000);
ds.send(dp1);
byte b2[]=new byte[1024];
DatagramPacket dp2=new DatagramPacket(b2,b2.length);
ds.receive(dp2);
String str=new String(dp2.getData(),0,dp2.getLength());
System.out.println("\n"+str);
}
catch(Exception e)
{
e.printStackTrace();
}
}
}

