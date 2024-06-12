import java.util.ArrayList;

public class Medico {
    private String nome;
    private int crm;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public Medico(String nome, int crm) {
        this.nome = nome;
        this.crm = crm;
    }

    ArrayList<Consulta> medicos = new ArrayList<>();

    public void agendar(Consulta p) {
        medicos.add(p);
    }

    public void cancelar(int v) {
        medicos.remove(v);
    }


    public void exibirInformacoes(String medico) {
        if (medico.equals(getNome())){
        for (Consulta c : medicos) {
            System.out.println("O paciente é: " + c.getPaciente().getNome());
            System.out.println("No dia: " + c.getData());
            System.out.println("No horarios das: " + c.getHora());
            System.out.println("====================================");
        }
    }
    }
}