public class Livro implements Publicao {
    private String titulo;
    private String autor;
    private int totaldepag;
    private int paginaatual;
    private boolean aberto;
    private Pessoa leitor;
    
    public Livro(String titulo, String autor, int totaldepag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totaldepag = totaldepag;
        this.paginaatual = 0;
        this.setAberto(false);
        this.leitor = leitor;
    }
    //metodos funcionais
    public String detalhes() {
        return "titulo do livro: " + titulo + "\n autor: " + autor + "\n total de paginas : " + totaldepag + "\n pagina atual : "+ paginaatual + "\n aberto :" + aberto + "\n leitor : " + leitor.getNome() ;
    }
    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("livro aberto");
    }
    @Override
    public void fechar() {
        this.setAberto(false);
    }
    @Override
    public void folhear(int p) {
        if (p>this.totaldepag) {
            this.paginaatual = 0;
        }else{
            this.paginaatual = p;
        }
    }
    @Override
    public void avancarpag() {
        this.setPaginaatual(this.getPaginaatual()+1);
        
    }
    @Override
    public void voltarpag() {
        this.setPaginaatual(this.getPaginaatual()-1);;
    //metodos de retorno
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotaldepag() {
        return totaldepag;
    }
    public void setTotaldepag(int totaldepag) {
        this.totaldepag = totaldepag;
    }
    public int getPaginaatual() {
        return paginaatual;
    }
    public void setPaginaatual(int paginaatual) {
        this.paginaatual = paginaatual;
    }
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    

    
    
}
