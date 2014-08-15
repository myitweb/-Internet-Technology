import java.net.*;
import java.io.*;
class EchoServer
{
   public static void main(String args[])
   {
    try
    {
	ServerSocket ss=new ServerSocket(7000);
	System.out.println("Server Started........");
	Socket s =ss.accept();
	DataInputStream ifc=new DataInputStream(s.getInputStream());
	DataOutputStream otc=new DataOutputStream(s.getOutputStream());
	String input;
	while((input=ifc.readLine())!=null)
	{
	      System.out.println("Server : " +input);
	      otc.writeBytes(input +"\n");
                          if(input.equals("Bye"))
	       break;
	}
	otc.close();
	ifc.close();
	s.close();
	ss.close();	
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       }
  }

	