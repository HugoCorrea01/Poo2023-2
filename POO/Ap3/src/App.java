public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sistema de Gestão de Eventos!");

        Aluno al1 = new Aluno("João", "Eng Comp");
        Palestrante palest1 = new Palestrante("Vicotr");

        Evento ev1 = new Evento(palest1, "Palestra", 150);
        ev1.inscreverAluno(al1.nome);

        PainelControle painel = new PainelControle();
        painel.adicionaEvento(ev1.nome);

        System.out.println(painel.listaEventos);
    }
}
