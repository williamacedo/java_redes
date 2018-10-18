import java.net.*;
public class servidorUDP {
    public static void main(String args[]) throws Exception {
        DatagramSocket s = new DatagramSocket(12000);
        byte buffer[] = new byte[1];
        DatagramPacket pacote = new DatagramPacket(buffer, buffer.length);
        System.out.println("Aguardando...");
        s.receive(pacote);
        byte b[] = pacote.getData();
        System.out.println(b[0]);
        s.close();
    }
}
