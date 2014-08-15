import java.io.*;
import java.net.*;
public class udpClientCase
{
	public static void main(String []dasbdj)
	{
		try
		{
			DatagramSocket ds=new DatagramSocket(1000);
			byte b[]=new byte[1024];
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the string");
			String s=br.readLine();
			b=s.getBytes();
			DatagramPacket dp=new DatagramPacket(b,b.length,InetAddress.getLocalHost(),2000);
			ds.send(dp);
			byte b1[]=new byte[1024];
			DatagramPacket dp2=new DatagramPacket(b1,b1.length);
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
