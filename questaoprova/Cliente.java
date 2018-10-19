import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws Exception {
        InetAddress end = InetAddress.getLocalHost();
        Socket s = new Socket(end, 3000);

        Scanner keyboard = new Scanner(System.in);
        Scanner entrada = new Scanner(s.getInputStream());
        PrintWriter saida = new PrintWriter(s.getOutputStream(), true);

        System.out.println("Digite o gabarito");
        String gabarito = keyboard.nextLine();
        int questoes = gabarito.length();
        String gabaritoOficial = "ABCDE";
        
        String informacoes = gabarito+" "+questoes+" "+gabaritoOficial;
        saida.println(informacoes);

        saida.close();
        entrada.close();
        s.close();
    }
}