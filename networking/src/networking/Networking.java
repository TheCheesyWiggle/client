
package networking;

import java.net.*;

public class Networking {

   
    public static void main(String[] args) {
        try{  
            InetAddress ip=InetAddress.getByName("www.javatpoint.com");
            URL url=new URL("http://www.javatpoint.com/java-tutorial");  

            System.out.println("Host Name: "+ip.getHostName());  
            System.out.println("IP Address: "+ip.getHostAddress());
            System.out.println("Port Number: "+url.getPort());  
            System.out.println("File Name: "+url.getFile());
            System.out.println("Protocol: "+url.getProtocol()); 
            System.out.println(ip);
        }
        catch(Exception e){
            System.out.println(e);
        }  
    } 
}
