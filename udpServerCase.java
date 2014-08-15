import java.io.*;
import java.net.*;
public class udpServerCase
{
	public static void main(String []dasbdj)
	{
		try
		{
			DatagramSocket ds=new DatagramSocket(2000);
			byte b[]=new byte[1024];
			DatagramPacket dp=new DatagramPacket(b,b.length);
			ds.receive(dp);
			String str=new String(dp.getData(),0,dp.getLength());
			String up=str.toUpperCase();
			String low=str.toLowerCase();
			byte b1[]=new byte[1024];
			String str1="UPPER CASE STRING: " +up+ "\n lower case string: "+low;
			b1=str1.getBytes();
			DatagramPacket dp2=new DatagramPacket(b1,b1.length,InetAddress.getLocalHost(),1000);
			ds.send(dp2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
