public class Main {
    public static void main(String[] args) {
        Medico m1 = new Medico("Paulo",2023);
        Paciente p1 = new Paciente("Iago",19556412);
        Paciente p2 = new Paciente("Igor",20145789);
        Paciente p3 = new Paciente("Paulo",14753692);
        Consulta c1 = new Consulta(10,19,p1);
        Consulta c2 = new Consulta(15,10,p2);
        Consulta c3 = new Consulta(6,15,p3);
        m1.agendar(c1);
        m1.agendar(c2);
        m1.agendar(c3);
        Medico m2 = new Medico("Luan",2025);
        Paciente p4 = new Paciente("Joao",45789423);
        Paciente p5 = new Paciente("Gabriel",25647519);
        Paciente p6 = new Paciente("Renam",25368412);
        Consulta c4 = new Consulta(17,8,p4);
        Consulta c5 = new Consulta(23,16,p5);
        Consulta c6 = new Consulta(18,7,p6);
        m2.agendar(c4);
        m2.agendar(c5);
        m2.agendar(c6);
        m1.cancelar(2);
        m2.cancelar(0);
        m2.exibirInformacoes("Luan");
        m1.exibirInformacoes("Paulo");
    }
}
