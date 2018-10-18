import java.io.PrintWriter;
import java.net.*;
import java.util.*;

public class ServidorEcho {
    public static void main(String args[]) throws Exception {
        
        int port = 8000;
        ServerSocket servidor = new ServerSocket(port);
        while(true) {
            System.out.println("Servidor escutando na porta " + port);
            Socket s = servidor.accept();
            Scanner entrada = new Scanner(s.getInputStream());
            PrintWriter saida = new PrintWriter(s.getOutputStream(), true);
            String msg = entrada.nextLine();
            System.out.println(msg);
            saida.println(msg);
            s.close();  
        }
    }
}
