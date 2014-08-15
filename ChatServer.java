import java.io.*;
import java.net.*;
class ChatServer
{
	public static void main(String[] dasd)
	{
		try
		{
			ServerSocket ss=new ServerSocket(8001);
			System.out.println("Server Started....");
			Socket s=ss.accept();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			DataInputStream in=new DataInputStream(s.getInputStream());
			DataOutputStream out=new DataOutputStream(s.getOutputStream());
			String send,receive;
			
			while((receive=in.readLine())!=null)
			{
				if(receive.equals("STOP"))
					break;
				System.out.println("Client says : " +receive);
				System.out.println("Server says:");
				send=br.readLine();
				out.writeBytes(send + "\n");
					
			}
			ss.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
