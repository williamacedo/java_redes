
public class Jogador extends Thread {
    private String nome;
    public Jogador(String nome)
    { this.nome = nome; }
    public void run() {
        String x = "";
        for(int i = 1;i<=10;i++) {
           /* try ( Thread.sleep(1000); ) catch (Exception e)()
            System.out.println("Movimento do jogador" + nome);
            System.out.println(x);
            x = x + "***";
        }
    }  
 public static void main(String args[])
    {
        Jogador j1 = new Jogador("Alice");
        Jogador j2 = new Jogador("Bob");
        j1.start();
        j2.start();
    }     */         
}
        
