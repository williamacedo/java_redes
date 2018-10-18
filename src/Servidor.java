import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	public static void main(String[] args) throws Exception {
		ServerSocket servidor = new ServerSocket(3000); // escutando o servidor na porta 3000
		Socket s = servidor.accept(); // Accept socket from client 
		Scanner entrada = new Scanner(s.getInputStream());
		PrintWriter saida = new PrintWriter(s.getOutputStream());
		String msg = null;
		int q = 0;

		msg = entrada.nextLine().toLowerCase();

		for(int i = 0;i < msg.length(); i++) {
			char c = msg.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				q++;
			}

		}

		saida.println(q);
		s.close();
		entrada.close();
		saida.close();
	}
}