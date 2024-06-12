public class Main {
    public static void main(String[] args) {
        
    
    Pessoa p1 = new Pessoa("mayckon", 19, "masculino");
    Livro l1 = new Livro("a queda", "george", 100, p1);
    l1.abrir();
    l1.avancarpag();
    System.out.println(l1.detalhes());
    
}
}