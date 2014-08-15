import java.io.*;
import java.net.*;
public class udpServerPrime
{
	public static void main(String []dasd)
	{
		try
		{
			DatagramSocket ds=new DatagramSocket(2000);
			byte b[]=new byte[1024];
			byte b1[]=new byte[1024];
			String str=new String();
			DatagramPacket dp=new DatagramPacket(b,b.length);
			ds.receive(dp);
			String s1=new String(dp.getData(),0,dp.getLength());
			int num=Integer.parseInt(s1);
			if(num==1||num==2||num==3)	
			{
				str=num+ "is prime no";
				b1=str.getBytes();
				DatagramPacket dp2=new DatagramPacket(b1,b1.length,InetAddress.getLocalHost(),1000);
				ds.send(dp2);
				System.exit(0);
			}
			else
			{
				int num2=num/2;
				for(int i=2;i<=num2;i++)
				{
					if(num%i==0)
					{
						str=num+ "is not prime";
						b1=str.getBytes();
						DatagramPacket dp2=new DatagramPacket(b1,b1.length,InetAddress.getLocalHost(),1000);
						ds.send(dp2);
						System.exit(0);
					}
				}
			}
			str=num+ " is prime number ";
			b1=str.getBytes();
			DatagramPacket dp2=new DatagramPacket(b1,b1.length,InetAddress.getLocalHost(),1000);
			ds.send(dp2);
			System.exit(0);
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
}
