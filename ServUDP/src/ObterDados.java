import java.net.*;
import java.util.Scanner;
public class ObterDados {
    public static void main(String args[]) throws Exception {
        
        URL u = new URL("http://www.fainor.com.br");
        URLConnection c = u.openConnection();
        Scanner entrada = new Scanner(c.getInputStream());
        while(entrada.hasNext()) {
            String str = entrada.nextLine();
            System.out.println(str);
        }
        entrada.close();
    }
}
