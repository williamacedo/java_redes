
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de a:");
        String a = teclado.next();
        System.out.println("Digite o valor de b:");
        String b = teclado.next();
        System.out.println("Digite o valor de c:");
        String c = teclado.next();
        String coeficientes = a+" "+b+" "+c;
        DatagramSocket s = new DatagramSocket();
        byte buffer[] = coeficientes.getBytes();       
        InetAddress end = InetAddress.getLocalHost();
        DatagramPacket pacote = new DatagramPacket (buffer, buffer.length,end,9000);
        
        s.send(pacote);
        System.out.println("Coeficientes enviados para o servidor !");

        byte buffer2[] = new byte[1024];
        DatagramPacket pacote2 = new DatagramPacket(buffer2, buffer2.length);
        System.out.println("Aguardando raizes");
        s.receive(pacote);
        
        
        byte dados[] = pacote.getData();
        String result = new String(dados);
        System.out.println(result);
        s.close();
        
    }
    
}
