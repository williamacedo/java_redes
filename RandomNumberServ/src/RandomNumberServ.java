
//import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.lang.Math; 


public class RandomNumberServ {
    public static void main(String args[]) throws Exception {
        int rand = (int) (Math.random()*100);
        ServerSocket serv = new ServerSocket(8000);
        while (true) {
            System.out.println("Servidor aguardando");
            Socket s = serv.accept();
            Worker w = new Worker(s, rand);
            w.start();
       }
    }
}

class Worker extends Thread {

    private Socket s;
    private int rand = 0;
    public Worker(Socket s, int rand) {
         this.s = s;
         this.rand = rand;
    }
    public void run() {
        try {
        Scanner entrada = new Scanner(s.getInputStream());
        PrintWriter saida = new PrintWriter(s.getOutputStream(), true);
        int msg = 0;
        do {
            msg = entrada.nextInt();
            //saida.println(msg);
            if(msg == rand){
                saida.println("Você acertou");
            }
            else if(msg < rand) {
                saida.println("O numero é menor");
            } else if(msg > rand) {
                saida.println("O numero é maior");
            } else if (msg > 100) {
                saida.println("Numero invalido");
            }          
            System.out.println(rand);
            System.out.println(msg);
        } while (msg == rand);
        entrada.close();
        saida.close();
        s.close();
       } catch (Exception e) {}
    }    
}
