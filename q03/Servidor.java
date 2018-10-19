import java.net.*;
import java.util.*;
import java.io.PrintWriter;

public class Servidor {
    public static void main(String[] args) throws Exception {
        ServerSocket serv = new ServerSocket(3000);
        Socket s = serv.accept();
        Scanner keyboard = new Scanner(System.in);
        Scanner entrada = new Scanner(s.getInputStream());
        PrintWriter saida = new PrintWriter(s.getOutputStream(), true);
        String coeficientes = entrada.nextLine();
        String str[] = coeficientes.split(" ");

        double a = Double.parseDouble(str[0]);
        double b = Double.parseDouble(str[1]);
        double c = Double.parseDouble(str[2]); 

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        double delta = (b*b) - (4*a*c);
        double x1 = b + (Math.sqrt(delta))/(2*a);
        double x2 = b - (Math.sqrt(delta))/(2*a);

        String respostas = x1 + " " + x2;
        saida.println(respostas);

        saida.close();
        entrada.close();
        s.close();
    }
}