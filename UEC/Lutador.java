public class Lutador implements Metodos {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int derrota;
    private int vitoria;
    private int empate;

    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int derrota, int vitoria,
            int empate) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setDerrota(derrota);
        this.setVitoria(vitoria);
        this.setEmpate(empate);
    }
    

    
    String getNome() {
        return nome;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }
    private String getNacionalidade() {
        return nacionalidade;
    }
    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    private int getIdade() {
        return idade;
    }
    private void setIdade(int idade) {
        this.idade = idade;
    }
    private float getAltura() {
        return altura;
    }
    private void setAltura(float altura) {
        this.altura = altura;
    }
    private float getPeso() {
        return peso;
    }
    private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if (this.getPeso()<52.2) {
            this.categoria ="invalido";
        }else if (this.getPeso()<=70.3) {
            this.categoria = "leve";
        }else if (this.getPeso()<=83.9) {
            this.categoria = "medio";
        }else if (this.getPeso()<=120.2) {
            this.categoria = "pesado";
        }else {
            this.categoria = "invalido";
        }
    }
    private int getDerrota() {
        return derrota;
    }
    private void setDerrota(int derrota) {
        this.derrota = derrota;
    }
    private int getVitoria() {
        return vitoria;
    }
    private void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }
    private int getEmpate() {
        return empate;
    }
    private void setEmpate(int empate) {
        this.empate = empate;
    }
    @Override
    public void apresentar() {
        System.out.println("-=-=-=-=-=-=-=-=-=- UFC  APRESENTA -=-=-=-=-=-=-=-=-=-");
        System.out.println("nome :"+this.getNome());
        System.out.println("diretamente do ;"+this.getNacionalidade());
        System.out.println("com a idade de; "+this.getIdade());
        System.out.println("com a altura de :"+this.getAltura());
        System.out.println("pesando :"+this.getPeso());
    }
    @Override
    public void status() {
        System.out.println(this.getNome());
        System.out.println("categoria:"+this.getCategoria());
        System.out.println("derrotas :"+this.getDerrota());
        System.out.println("vitorias :"+this.getVitoria());
        System.out.println("empates :"+this.getEmpate());
    }
    @Override
    public void ganharluta() {
        this.setVitoria(this.getVitoria()+1);
    }
    @Override
    public void perderluta() {
        this.setDerrota(this.derrota+1);
    }
    @Override
    public void empatarluta() {
        this.setEmpate(this.getEmpate()+1);
        
    }
}