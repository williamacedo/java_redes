
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.ByteBuffer;

public class Servidor {
    public static void main(String[] args) throws Exception {
        
        DatagramSocket s = new DatagramSocket(9000);
        byte buffer[] = new byte[1024];
        DatagramPacket pacote = new DatagramPacket(buffer, buffer.length);
        System.out.println("Aguadando coeficientes");
        s.receive(pacote);
        
        byte dados[] = pacote.getData();
        String coeficiente = new String(dados);
        System.out.println(coeficiente);
        //"a b c"
        String str[] = coeficiente.split(" ");
        double a = Double.parseDouble(str[0]);
        double b = Double.parseDouble(str[1]);
        double c = Double.parseDouble(str[2]);
        
        double delta = (b*b) - (4*a*c);
        double x1 = (-b + Math.sqrt(delta)/(2*a));
        double x2 = (-b - Math.sqrt(delta)/(2*a));
        String raizes = x1+" "+x2;
        byte buffer2[] = raizes.getBytes();       
        InetAddress end = InetAddress.getLocalHost();
        int porta = pacote.getPort();
        DatagramPacket pacote2 = new DatagramPacket (buffer2, buffer2.length,end,porta);
        
        s.send(pacote2);
        System.out.println("Coeficientes enviados para o servidor !");        
           
        
        System.out.println("Valor de x1" + x1 + "Valor de x2" + x2);
        
        s.close();
    }
}
