import java.net.*;
import java.io.*;
class tcpClientFact
{
   public static void main(String args[])
   {
    try
    {
	Socket cs=new Socket("LocalHost",8001);
	System.out.println("Enter a number: ");
	BufferedReader infu=new BufferedReader(new InputStreamReader(System.in));
	String str=infu.readLine();
	DataOutputStream out=new DataOutputStream(cs.getOutputStream());
	out.writeBytes(str+ "\n");
	DataInputStream infs=new DataInputStream(cs.getInputStream());
	String str1=infs.readLine();
	System.out.println("The Factorial of "+str+" is : "+str1);
	cs.close();
       }
       catch(Exception e)
       {
             System.out.println(e.toString());
       }
       }
   }
