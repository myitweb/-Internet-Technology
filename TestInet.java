import java.net.*;
class TestInet
{
	public static void main(String args[])
	{
		try
		{
			if(args.length<=0)
			{
			System.out.println("No IP address/hostname provided, see next line for usage");
			System.out.println("usage : java testinetdemo <hostname>");
			System.out.println("<hostname> could be an IP Address such as 4.2.2.2 or india.gov.in, without http://");
			System.out.println("Example : java testinetdemo hostname");
			}	
			else
			{
			InetAddress obj[] = InetAddress.getAllByName(args[0]);
				for(int i = 0 ; i < obj.length ; i++)
				{
				System.out.println("Hostname : " + obj[i].getHostName());
				System.out.println("IP Address : " + obj[i].getHostAddress());
				} 
			}
						
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}

	}
}