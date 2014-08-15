import java.io.*;
import java.net.*;
class ChatClient
{
	public static void main(String [] sadf)
	{
		try
		{
			Socket s=new Socket("LocalHost",8001);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			DataInputStream in=new DataInputStream(s.getInputStream());
			DataOutputStream out=new DataOutputStream(s.getOutputStream());
			String msg;
			System.out.println("Enter STOP to stop chatting");
			System.out.println("Enter input: ");
			while((msg=br.readLine())!=null)
			{
				out.writeBytes(msg + "\n");
				
				if(msg.equals("STOP"))
					break;
				
				System.out.println("Server says: " +in.readLine());
				System.out.println("Client says: ");
				
			}
			s.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

