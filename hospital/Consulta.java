public class Consulta {
    private int data;
    private int hora;
    private Paciente paciente;


    public Consulta(int data, int hora, Paciente paciente) {
        this.data = data;
        this.hora = hora;
        this.paciente = paciente;
    }

    public int getData() {
        
        return data;
    }

    public void setData(int data) {
        
        this.data = data;
    }

    public int getHora() {
        
        return hora;
    }

    public void setHora(int hora) {
        
        this.hora = hora;
    }

    public Paciente getPaciente() {
        
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        
        this.paciente = paciente;
    }
}