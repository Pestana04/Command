package Command;

public class Atendimento {

    private String animal;
    private String situacao;

    public Atendimento(String animal) {
        this.animal = animal;
        this.situacao = "Agendado";
    }

    public String getAnimal() {
        return animal;
    }

    public String getSituacao() {
        return situacao;
    }

    public void iniciarAtendimento() {
        this.situacao = "Em Atendimento";
    }

    public void finalizarAtendimento() {
        this.situacao = "Finalizado";
    }

    public void voltarParaAgendado() {
        this.situacao = "Agendado";
    }

    public void voltarParaEmAtendimento() {
        this.situacao = "Em Atendimento";
    }
}