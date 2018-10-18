import java.io.PrintWriter;
import java.net.*;
import java.util.*;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) throws Exception {
		InetAddress end = InetAddress.getLocalHost(); // Pega o endereço local
		Socket s = new Socket(end, 3000); // conecta ao localhost na porta 3000
		Scanner teclado = new Scanner(System.in);
		Scanner entrada = new Scanner(s.getInputStream()); // armazena a resposta do servidor na entrada
		PrintWriter saida = new PrintWriter(s.getOutputStream(), true); // joga a saida armazenada pro servidor

		System.out.println("Digite uma mensagem");
		String msg = teclado.nextLine();

		if(teclado.hasNextLine()) {
			saida.println(msg);
		} else {
			//System.out.println('error');
			return;
		}
		// recebe as vogais
		int numero = entrada.nextInt();
		System.out.println("Vogais" + numero);
		entrada.close();
		saida.close();
		teclado.close();
		s.close();
	}
}

