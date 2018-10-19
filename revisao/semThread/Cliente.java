import java.io.PrintWriter;
import java.util.Scanner;
import java.net.InetAddress;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) throws Exception {
        InetAddress end = InetAddress.getLocalHost();
        Socket s = new Socket(end, 3000);

        Scanner keyboard = new Scanner(System.in);
        Scanner entrada = new Scanner(s.getInputStream());
        PrintWriter saida = new PrintWriter(s.getOutputStream(), true);

        System.out.println("Digite sua mensagem");
        String msg = keyboard.nextLine();
        saida.println(msg);

        int qtd = entrada.nextInt();
        System.out.println(qtd);
        keyboard.close();
        entrada.close();
        s.close();
    }
}