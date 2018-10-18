
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClienteUDP {
    public static void main(String args[]) throws Exception {
        DatagramSocket s = new DatagramSocket();
        byte info = 15;
        byte buffer[] = new byte[1];
        buffer[0] = info;
        InetAddress end = InetAddress.getLocalHost();
        DatagramPacket pacote = new DatagramPacket(buffer, buffer.length, end,12000);
        System.out.println("Enviando msg");
        s.send(pacote);
        s.close();
    }
}
