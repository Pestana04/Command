package Command;

public class FinalizarAtendimentoTarefa implements Tarefa {

    private Atendimento atendimento;

    public FinalizarAtendimentoTarefa(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    public void executar() {
        this.atendimento.finalizarAtendimento();
    }

    public void cancelar() {
        this.atendimento.voltarParaEmAtendimento();
    }
}