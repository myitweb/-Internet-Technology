import java.io.*;
import java.net.*;

public class udpClientMax
{
	public static void main(String args[])
	{
		try
		{
			DatagramSocket ds=new DatagramSocket(3000);
			byte b[]=new byte[1024];
			byte b1[]=new byte[1024];
			byte b2[]=new byte[1024];
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the first number : ");
			String num1=br.readLine();
			b=num1.getBytes();
			DatagramPacket dp=new DatagramPacket(b,b.length,InetAddress.getLocalHost(),4000);
			ds.send(dp);
			System.out.println("Enter the second number : ");
			String num2=br.readLine();
			b1=num2.getBytes();
			DatagramPacket dp1=new DatagramPacket(b1,b1.length,InetAddress.getLocalHost(),4000);
			ds.send(dp1);
			DatagramPacket dp2=new DatagramPacket(b2,b2.length);
			ds.receive(dp2);
			String str=new String(dp2.getData(),0,dp2.getLength());
			System.out.println(str);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}