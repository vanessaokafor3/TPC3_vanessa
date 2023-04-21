package folha3_exercicio12e13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {
    private List<Tarefas> tarefas;

    public Collection() {
        this.tarefas = new ArrayList<>();
    }

    public void criarTarefa(Tarefas tarefa) {
        tarefas.add(tarefa);
    }

    public void modificarTarefa(int index, Tarefas tarefa) {
        tarefas.set(index, tarefa);
    }

    public void apagarTarefa(int index) {
        tarefas.remove(index);
    }

    public List<Tarefas> listarTarefasParaData(LocalDate data) {
        List<Tarefas> tarefasParaData = new ArrayList<>();
        Iterator<Tarefas> iterator = tarefas.iterator();
        while (iterator.hasNext()) {
            Tarefas tarefa = iterator.next();
            if (tarefa.ocorreEm(data.getYear(), data.getMonthValue(), data.getDayOfMonth())) {
                tarefasParaData.add(tarefa);
            }
        }
        return tarefasParaData;
    }
}
