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

        System.out.println("Total de questões: 5");
        System.out.println("Digite o gabarito");
        String gabarito = keyboard.nextLine();
        saida.println(gabarito);

        int qtd = entrada.nextInt();
        System.out.println(qtd);
        saida.close();
        entrada.close();
        s.close();
    }
}