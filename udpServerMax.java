import java.io.*;
import java.net.*;

public class udpServerMax
{
	public static void main(String args[])
	{
		try
		{
			DatagramSocket ds=new DatagramSocket(4000);
			byte b[]=new byte[1024];
			byte b1[]=new byte[1024];
			byte b2[]=new byte[1024];
			String str2=new String();
			DatagramPacket dp=new DatagramPacket(b,b.length);
			ds.receive(dp);
			String str=new String(dp.getData(),0,dp.getLength());
			int num1=Integer.parseInt(str);
			DatagramPacket dp1=new DatagramPacket(b1,b1.length);
			ds.receive(dp1);
			String str1=new String(dp1.getData(),0,dp1.getLength());
			int num2=Integer.parseInt(str1);
			if(num1>num2)
			{
				str2=num1+" is greater\n";
			}
			else if(num2>num1)
			{
				str2=num2+" is greater\n";
			}
			else
			{
				str2=num1+" and "+num2+" both are same"; 
			} 
			b2=str2.getBytes();
			DatagramPacket dp2=new DatagramPacket(b2,b2.length,InetAddress.getLocalHost(),3000);
			ds.send(dp2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}