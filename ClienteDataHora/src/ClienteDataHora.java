import java.net.*;
import java.util.*;

public class ClienteDataHora {
    public static void main(String args[]) throws Exception 
    {
        InetAddress end = InetAddress.getLocalHost();
        Socket s = new Socket(end, 9000);
        Scanner entrada = new Scanner(s.getInputStream());
        String msg = entrada.nextLine();
        System.out.println(msg);
        entrada.close();
        s.close();
    }
}
