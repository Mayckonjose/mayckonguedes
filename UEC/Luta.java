import java.util.Random;
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;

    public void marcarluta(Lutador l1,Lutador l2){
       if (l1.getCategoria().equals(l2.getCategoria())&& l1!=l2) {
        this.setAprovada(true);
        this.setDesafiado(l1);
        this.setDesafiante(l2);
       }else{
        this.setAprovada(false);
        this.desafiado = null;
        this.desafiante = null;
       }
    }
    public void lutar(){
       if (this.aprovada) {
        System.out.println("=-=-=-=-=desafiado=-=-=-=-=");
        this.desafiado.apresentar();
        this.desafiado.status();
        System.out.println("=-=-=-=-=desafiante=-=-=-=-=");
        this.desafiante.apresentar();
        this.desafiante.status();
        
        Random aleatorio = new Random();
        int vencedor = aleatorio.nextInt(3);
        switch (vencedor) {
            case 0:
            System.out.println("empate");
            this.desafiado.empatarluta();
            this.desafiante.empatarluta();    
                break;
            case 1:
            System.out.println(" venceu o "+ this.desafiado.getNome());
            this.desafiado.ganharluta();
            this.desafiante.perderluta(); 
                break;
            case 2:
            System.out.println("venceu o "+ this.desafiante.getNome());
            this.desafiante.ganharluta();
            this.desafiado.perderluta();
                break;    
        }

       }else {
        System.out.println("a luta não foi aprovada, então não acontecera ");
       }

    }
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRound() {
        return round;
    }
    public void setRound(int round) {
        this.round = round;
    }
    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
