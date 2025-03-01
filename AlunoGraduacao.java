package AtivEAD2803;

// Subclasse AlunoGraduacao, herda de Aluno
public class AlunoGraduacao extends Aluno {
    private String curso;  // Atributo específico para o curso de graduação

    // Construtor da classe AlunoGraduacao
    public AlunoGraduacao(String nome, int idade, double nota, String curso) {
        super(nome, idade, nota);  // Chama o construtor da superclasse (Aluno)
        this.curso = curso;        // Atribui o curso de graduação
    }

    // Getter para o curso (método para acessar o curso de graduação)
    public String getCurso() {
        return curso;
    }

    // Sobrescrita do método exibirDados para adicionar o curso de graduação
    @Override
    public void exibirDados() {
        super.exibirDados();  // Chama o método da superclasse para exibir os dados básicos
        System.out.println("Curso de Graduação: " + getCurso());  // Exibe o curso de graduação
    }
}
