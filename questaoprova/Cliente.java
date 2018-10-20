import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws Exception {
        InetAddress end = InetAddress.getLocalHost();
        Socket s = new Socket(end, 3000);

        Scanner keyboard = new Scanner(System.in);
        Scanner entrada = new Scanner(s.getInputStream());
        PrintWriter saida = new PrintWriter(s.getOutputStream(), true);

        System.out.println("Digite o numero de questoes");
        String questoes = keyboard.next();

        System.out.println("Digite as respostas");
        String respostas = keyboard.next();

        System.out.println("Digite seu gabarito");
        String gabarito = keyboard.next();

        int qtd;

        String informacoes = questoes+" "+respostas+" "+gabarito;
        saida.println(informacoes);

        qtd = entrada.nextInt();
        System.out.println(qtd);
        saida.close();
        entrada.close();
        s.close();
    }
}