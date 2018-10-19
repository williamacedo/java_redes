import java.io.PrintWriter;
import java.net.*;
import java.util.*;
import java.util.Scanner;

public class Cliente {
    
    public static void main(String[] args) throws Exception {
        InetAddress end = InetAddress.getLocalHost();
        Socket s = new Socket(end, 3000);
        Scanner keyboard = new Scanner(System.in);
        Scanner entrada = new Scanner(s.getInputStream());
        PrintWriter saida = new PrintWriter(s.getOutputStream(), true);

        int qtd;

        System.out.println("Digite sua mensagem");
        String msg = keyboard.nextLine();
        saida.println(msg);

        qtd = entrada.nextInt();
        System.out.println(qtd);
        saida.close();
        s.close();
    }
}
