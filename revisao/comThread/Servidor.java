import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {
        ServerSocket serv = new ServerSocket(3000);
        while(true) {
            Socket s = serv.accept();
            Worker w = new Worker(s);
            w.start();
        }        
        
    }
}

class Worker extends Thread {
    private Socket
    public Worker {
        this.s = s;
    }
    public void run() {
        try {
            Scanner keyboard = new Scanner(System.in);
            Scanner entrada = new Scanner(s.getInputStream());
            PrintWriter saida = new PrintWriter(s.getOutputStream(), true);

            String msg = entrada.nextLine();

            for(int i = 0; i < msg.length(); i++) {
                char c = msg.charAt(i);
                if(c == 'a') {
                    q++
                }
            }
            saida.println(q);
        } catch (Exception e) {}    
    }
}