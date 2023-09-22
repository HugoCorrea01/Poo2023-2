public class PainelControle {
    String listaEventos;
    String listaPalestrantes;
    String eventosDisponiveis;

    PainelControle() {
        this.listaEventos = "";
        this.listaPalestrantes = "";
        this.eventosDisponiveis = "";
    }

    void adicionaEvento(String novoEvento) {
        if (!this.listaEventos.equals("")) {
            this.listaEventos = ";";
        }
        this.listaEventos += novoEvento;
    }

    String listaEventosDisponiveis() {
        return this.eventosDisponiveis;
    }
}
