import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Servidor {

    public static void main(String[] args) throws Exception {
        ServerSocket serv = new ServerSocket(3000);
        while(true) {
            System.out.println("Servidor Aguardando");
            Socket s = serv.accept();
            System.out.println("Cliente conectado: " + s.getInetAddress().getHostAddress());
            Worker w = new Worker(s);
            w.start();
        }
    }

}

class Worker extends Thread {
    private Socket s;
    public Worker(Socket s) {
        this.s = s;
    }

    public void run() {
        try {
            String msg;
            Scanner keyboard = new Scanner(System.in);
            Scanner entrada = new Scanner(s.getInputStream());
            PrintWriter saida = new PrintWriter(s.getOutputStream(), true);
           
            int q = 0;

            msg = entrada.nextLine().toLowerCase();
                for(int i = 0; i < msg.length(); i++){
                    char c = msg.charAt(i);
                    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        q++;
                    }
                }
            System.out.println(q);
            saida.println(q);   
            entrada.close();
            s.close();
        } catch(Exception e) {}
    }
}