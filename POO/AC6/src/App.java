public class App {
    public static void main(String[] args) {
        AlunoDAO alunoManager = new AlunoDAO("alunos.txt");

        alunoManager.adicionarAluno(new Aluno("Guilherme", "ADS", "202301146399"));
        alunoManager.adicionarAluno(new Aluno("Hugo", "ADS", "202301134391"));
        alunoManager.adicionarAluno(new Aluno("Joao", "ADS", "202301134324"));
        alunoManager.adicionarAluno(new Aluno("Matheus", "ADS", "202301134356"));
        alunoManager.adicionarAluno(new Aluno("Pedro", "ADS", "202301134357"));
        alunoManager.adicionarAluno(new Aluno("Lucas", "ADS", "202301134358"));

        System.out.println("Lista de alunos:");
        alunoManager.listarAlunos();

        alunoManager.atualizarCurso("202301146399", "Ciência da Computação");
        alunoManager.atualizarCurso("202301134356", "Ciencia da Computacao");
        alunoManager.atualizarCurso("202301134357", "Direito");
        alunoManager.atualizarCurso("202301134358", "Engenharia da computacao");
        alunoManager.atualizarCurso("202301134391", "Medicina");
        // Listar informações de um aluno
        Aluno aluno = alunoManager.obterAluno("202301146399");
        if (aluno != null) {
            System.out.println("Informações do aluno com matrícula 202301146399:");
            System.out.println("Matrícula: " + aluno.getMatricula() + ", Nome: " + aluno.getNome() + ", Curso: " + aluno.getCurso());
        } else {
            System.out.println("Aluno não encontrado.");
        }

        // Remover um aluno
        alunoManager.removerAluno("202301146399");

        // Listar todos os alunos novamente
        System.out.println("Lista de alunos após remoção:");
        alunoManager.listarAlunos();

    }
}