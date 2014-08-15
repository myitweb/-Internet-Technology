import java.io.*;
import java.net.*;
class tcpClientword
{
	public static void main(String [] ajhsadj)
	{
		try
		{
			Socket cs=new Socket("LocalHost",8001);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Number: ");
			String str=br.readLine();
			DataOutputStream out=new DataOutputStream(cs.getOutputStream());
			out.writeBytes(str+ "\n");
			DataInputStream in=new DataInputStream(cs.getInputStream());
			System.out.println("The converted representation is:" +in.readLine());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
