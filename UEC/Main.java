public class Main {
    public static void main(String[] args) {
       Lutador l[] = new Lutador[4];
       l[0] = new Lutador("charles","Brasil", 22, 1.73f, 85.2f, 0, 5, 2) ;

       l[1] = new Lutador("conor", "holanda", 30, 1.75f, 80.5f, 0, 0, 0);
        
       l[2] = new Lutador("mayckon", "eua", 19, 1.70f, 79.5f, 0, 10, 0);

       l[3] = new Lutador("mauricio", "alemanha", 25, 1.80f, 109.f, 5, 0, 0);
         
       Luta UEC01 = new Luta();
       UEC01.marcarluta(l[1], l[2]);
       UEC01.lutar();

       l[1].status();
       l[2].status();
      
       UEC01.marcarluta(l[1], l[2]);
       UEC01.lutar();

       l[1].status();
       l[2].status();
    }
}
