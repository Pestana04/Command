package Command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecepcaoTest {

    @Test
    void deveIniciarAtendimento() {
        Atendimento atendimento = new Atendimento("Rex");
        Recepcao recepcao = new Recepcao();

        Tarefa tarefa = new IniciarAtendimentoTarefa(atendimento);
        recepcao.executarTarefa(tarefa);

        assertEquals("Em Atendimento", atendimento.getSituacao());
    }

    @Test
    void deveCancelarInicioAtendimento() {
        Atendimento atendimento = new Atendimento("Rex");
        Recepcao recepcao = new Recepcao();

        Tarefa tarefa = new IniciarAtendimentoTarefa(atendimento);
        recepcao.executarTarefa(tarefa);

        recepcao.cancelarUltimaTarefa();

        assertEquals("Agendado", atendimento.getSituacao());
    }

    @Test
    void deveFinalizarAtendimento() {
        Atendimento atendimento = new Atendimento("Rex");
        Recepcao recepcao = new Recepcao();

        Tarefa iniciar = new IniciarAtendimentoTarefa(atendimento);
        Tarefa finalizar = new FinalizarAtendimentoTarefa(atendimento);

        recepcao.executarTarefa(iniciar);
        recepcao.executarTarefa(finalizar);

        assertEquals("Finalizado", atendimento.getSituacao());
    }

    @Test
    void deveCancelarFinalizacaoAtendimento() {
        Atendimento atendimento = new Atendimento("Rex");
        Recepcao recepcao = new Recepcao();

        Tarefa iniciar = new IniciarAtendimentoTarefa(atendimento);
        Tarefa finalizar = new FinalizarAtendimentoTarefa(atendimento);

        recepcao.executarTarefa(iniciar);
        recepcao.executarTarefa(finalizar);

        recepcao.cancelarUltimaTarefa();

        assertEquals("Em Atendimento", atendimento.getSituacao());
    }
}