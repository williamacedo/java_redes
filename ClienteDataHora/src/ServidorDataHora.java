import java.net.*;
import java.io.*;
import java.util.*;

public class ServidorDataHora {
    public static void main(String args[]) throws IOException {
     ServerSocket servidor = new ServerSocket(9000);
     Socket s = servidor.accept();
     Date d = new Date();
     PrintWriter saida = 
             new PrintWriter(s.getOutputStream(), true);
     saida.println(d.toString());
     s.close();
     servidor.close();
    }
}
