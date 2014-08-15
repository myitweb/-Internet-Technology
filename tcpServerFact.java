import java.net.*;
import java.io.*;
class tcpServerFact
{
   public static void main(String args[])
   {
    try
    {
	ServerSocket ss=new ServerSocket(8001);
	System.out.println("Server Started........");
	Socket s =ss.accept();
	DataInputStream ifc=new DataInputStream(s.getInputStream());
	String str=ifc.readLine();
	System.out.println("The number is : " +str);
	int fact=1;
	int a=Integer.parseInt(str);
	for(int i=1;i<=a;i++)
	{
	      fact=fact*i;
	}
	String str1=fact+ "\n";
	DataOutputStream otc=new DataOutputStream(s.getOutputStream());
	otc.writeBytes(str1);
       }
       catch(Exception e)
       {
            System.out.println(e.toString());
       }
       }
  }
