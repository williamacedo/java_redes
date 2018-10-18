import java.io.PrintWriter;
import java.net.*;
import java.util.*;
import java.util.Scanner;

public class ClienteEcho {
    public static void main(String args[]) throws Exception {
        InetAddress end = InetAddress.getLocalHost();
        Socket s = new Socket(end, 8000);
        Scanner teclado = new Scanner(System.in);      
        Scanner entrada = new Scanner(s.getInputStream());
        PrintWriter saida = new PrintWriter(s.getOutputStream(), true); 
        String msgSend = null;
            
        do{
            System.out.println("Digite uma mensagem");
            int receber = teclado.nextInt();
            saida.println(receber);
            
            msgSend = entrada.nextLine();    
            System.out.println(msgSend);
        }while(msgSend.equals("Bye"));
        s.close();
        teclado.close();
        
    }
  }