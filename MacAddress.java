import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MacAddress
{
   public static void main(String args[])
   {
     try
      {
        Scanner console=new Scanner(System.in);
         System.out.println("Enter System Name:");
         String ipaddr=console.nextLine();
         InetAddress address=InetAddress.getByName(ipaddr);
          System.out.println("address=" +address);
         NetworkInterface ni=NetworkInterface.getByInetAddress(address);
         if(ni!=null)
         {
           byte[] mac=ni.getHardwareAddress();
           if(mac!=null)
           {
               System.out.println("MAC Address: ");
               for(int i=0;i<mac.length;i++)
               {
                   System.out.format("%02X%s",mac[i],(i<mac.length-1)?"_":"");
                }
           }
           else
           {
                System.out.println("Address doesn't exist or not accessible/");
           }
        }
           else
             {
              System.out.println("Network address for spec Interface not found");
              }
        }
        catch(Exception e)
        {
         }
      }
   }
