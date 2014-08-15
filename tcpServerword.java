import java.io.*;
import java.net.*;
class tcpServerword
{
	public static void main(String [] dasdb)
	{
		try
		{
			ServerSocket ss=new ServerSocket(8001);
			System.out.println("Server Started...!! ");
			Socket s=ss.accept();
			DataInputStream in=new DataInputStream(s.getInputStream());
			String no=in.readLine();
			System.out.println(no);
			String a=convertDigit(no);
			System.out.println(a);
			DataOutputStream otc=new DataOutputStream(s.getOutputStream());
			otc.writeBytes(a+ "\n");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static String convertDigit(String no) throws Exception
	{
		String str="	";
		for(int i=0;i<no.length();i++)
		{
			int p=no.charAt(i);
			if(p==48)
			{
				str+="zero";
			}
			if(p==49)
			{
				str+="one";
			}
			if(p==50)
			{
				str+="two";
			}
			if(p==51)
			{
				str+="three";
			}
			if(p==52)
			{
				str+="four";
			}
			if(p==53)
			{
				str+="five";
			}
			if(p==56)
			{
				str+="six";
			}
			if(p==57)
			{
				str+="seven";
			}
			if(p==58)
			{
				str+="eight";
			}
			if(p==59)
			{
				str+="nine";
			}
		}
		return str;
	}
}
