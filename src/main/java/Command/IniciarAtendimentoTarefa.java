package Command;

public class IniciarAtendimentoTarefa implements Tarefa {

    private Atendimento atendimento;

    public IniciarAtendimentoTarefa(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    public void executar() {
        this.atendimento.iniciarAtendimento();
    }

    public void cancelar() {
        this.atendimento.voltarParaAgendado();
    }
}