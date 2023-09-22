public class Evento {
    Palestrante palestrante;
    String nome;
    String data, local;
    int capacidade;
    String listaAlunos;
    String informacoesAdicionais;

    Evento(Palestrante palestrante, String nome, int capacidade) {
        this.palestrante = palestrante;
        this.nome = nome;
        this.capacidade = capacidade;
        this.data = "Sem data!";
        this.local = "Sem local!";
        this.listaAlunos = "";
        this.informacoesAdicionais = "";
    }

    void inscreverAluno(String nomeAluno) {
        if (!this.listaAlunos.equals("")) {
            this.listaAlunos = ";";
        }
        this.listaAlunos += nomeAluno;
    }

    void adicionarInformacoes(String texto) {
        this.informacoesAdicionais = texto;
    }

    void agendaData(String data) {
        this.data = data;
    }

    void reservaLocal(String local) {
        this.local = local;
    }
}
