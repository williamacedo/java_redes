import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
    public static void main(String[] args) throws Exception {
        ServerSocket serv = new ServerSocket(3000);
            Socket s = serv.accept();

        String gabarito;
        Scanner keyboard = new Scanner(System.in);
        Scanner entrada = new Scanner(s.getInputStream());
        
        PrintWriter saida = new PrintWriter(s.getOutputStream(), true);

        gabarito = entrada.nextLine().toUpperCase();
        // ABCDE
        int q = 0;
        String gabaritoOficial = "ABCDE";
        for(int i = 0;i < gabarito.length(); i++){
            char c = gabarito.charAt(i);
            char d = gabaritoOficial.charAt(i);
            if(c == d){
                q++;
            }                                                                                                                                 
        }

        System.out.println(q);
        saida.println(q);
        entrada.close();
        saida.close();
        s.close();                    
    }
}