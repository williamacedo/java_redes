import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
    public static void main(String[] args) throws Exception {
        ServerSocket serv = new ServerSocket(3000);
        Socket s = serv.accept();

        Scanner keyboard = new Scanner(System.in);
        Scanner entrada = new Scanner(s.getInputStream());
        PrintWriter saida = new PrintWriter(s.getOutputStream(), true);

        String msg = entrada.nextLine();

        int q = 0;

        for(int i = 0;i < msg.length();i++) {
            char c = msg.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                q++;
            }
        }
        saida.println(q);

    }
}