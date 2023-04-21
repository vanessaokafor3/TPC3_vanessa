package folha3_exercicio12e13;

import java.time.LocalDate;

public class Tarefas {
    private String descricao;
    private LocalDate data;

    public Tarefas(String descricao, LocalDate data) {
        this.descricao = descricao;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public boolean ocorreEm(int year, int month, int day) {
        return data.getYear() == year && data.getMonthValue() == month && data.getDayOfMonth() == day;
    }
}
