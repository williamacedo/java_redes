import java.io.PrintWriter;
import java.net.*;
import java.util.*;

public class ClienteEcho {
    public static void main(String args[]) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String msg;
        InetAddress end = InetAddress.getLocalHost();
        System.out.println("Digite sua mensagem");
        Socket s = new Socket(end, 8000);
        PrintWriter saida = new PrintWriter(s.getOutputStream(), true);     
        //teclado.close();
        //saida.close();  
        
        do{
            msg = teclado.nextLine();
            saida.println(msg); 
        }while(!msg.equals("bye"));
        s.close();
    }
}