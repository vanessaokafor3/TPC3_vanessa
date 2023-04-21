package folha3_exercicio12e13;

import java.time.LocalDate;
public class TarefaDiaria extends Tarefas {
    public TarefaDiaria(String descricao, LocalDate data) {
        super(descricao, data);
    }

    @Override
    public boolean ocorreEm(int year, int month, int day) {
        return true; // ocorre todos os dias
    }
}
