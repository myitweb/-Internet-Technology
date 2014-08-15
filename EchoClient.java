import java.net.*;
import java.io.*;
class EchoClient
{
   public static void main(String args[])
   {
    try
    {
	Socket cs=new Socket("LocalHost",7000);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	DataOutputStream ots=new DataOutputStream(cs.getOutputStream());
	DataInputStream ifs=new DataInputStream(cs.getInputStream());
	String uinput;
	System.out.println("Enter Bye. to stop........");
	System.out.println("Input:");
	while((uinput=br.readLine())!=null)
	{
	     ots.writeBytes(uinput+ "\n");
	     System.out.println("Echo :" +ifs.readLine());
	     if(uinput.equals("Bye."))
	     break;
	     System.out.println("Input:");
	}
	ots.close();
	ifs.close();
	br.close();
	cs.close();	
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       }
  }



	


	
      