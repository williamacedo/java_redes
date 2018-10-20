import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
    public static void main(String[] args) throws Exception {
        ServerSocket serv = new ServerSocket(3000);
            Socket s = serv.accept();

        String informacoesCliente;
        Scanner keyboard = new Scanner(System.in);
        Scanner entrada = new Scanner(s.getInputStream());
        
        PrintWriter saida = new PrintWriter(s.getOutputStream(), true);

        informacoesCliente = entrada.nextLine();
        String str[] = informacoesCliente.split(" ");
        
        double questoes = Double.parseDouble(str[0]);
        String gabaritoOficial = str[1]; 
        String gabarito = str[2];

        int q = 0;
        
        for(int i = 0;i < questoes; i++){
            char c = gabarito.charAt(i);
            char d = gabaritoOficial.charAt(i);
            if(c == d){
                q++;
            }                                                                                                                                 
        }
        saida.println(q);
        entrada.close();
        saida.close();
        s.close();                    
    }
}