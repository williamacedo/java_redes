import java.net.*;
import java.util.*;
import java.io.PrintWriter;

public class Cliente {
    public static void main(String[] args) throws Exception {
        InetAddress end = InetAddress.getLocalHost();
        Socket s = new Socket(end, 3000);    
        Scanner keyboard = new Scanner(System.in);
        Scanner entrada = new Scanner(s.getInputStream());

        PrintWriter saida = new PrintWriter(s.getOutputStream(), true);

        System.out.println("Digite o a");
        String a = keyboard.next();

        System.out.println("Digite o b");
        String b = keyboard.next();

        System.out.println("Digite o c");
        String c = keyboard.next();

        String coeficientes = a+" "+b+" "+c;
        saida.println(coeficientes);

        String result = entrada.nextLine();
        String str[] = result.split(" ");

        double x1 = Double.parseDouble(str[0]);
        double x2 = Double.parseDouble(str[1]);
        System.out.println(x1+" "+x2);
        
        entrada.close();
        saida.close();
        s.close();

    }
}