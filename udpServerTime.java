import java.io.*;
import java.net.*;
import java.util.*;

public class udpServerTime
{
public static void main(String args[])
{
try
{
DatagramSocket ds=new DatagramSocket(2000);
System.out.println("Waiting for client..........");
byte b1[]=new byte[1024];
DatagramPacket dp1=new DatagramPacket(b1,b1.length);
ds.receive(dp1);
String name=new String(dp1.getData(),0,dp1.getLength());
System.out.println(name);
Date d=new Date();
String time=d.toString();
String output="Hello....\n The current date & time is:"+time;
byte b2[]=new byte[1024];
b2=output.getBytes();
DatagramPacket dp2=new DatagramPacket(b2,b2.length,InetAddress.getLocalHost(),1000);
ds.send(dp2);
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
