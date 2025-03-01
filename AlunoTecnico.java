package AtivEAD2803;

// Subclasse AlunoTecnico, herda de Aluno
public class AlunoTecnico extends Aluno {
    private String modalidade;  // Atributo específico para a modalidade do curso técnico

    // Construtor da classe AlunoTecnico
    public AlunoTecnico(String nome, int idade, double nota, String modalidade) {
        super(nome, idade, nota);  // Chama o construtor da superclasse (Aluno)
        this.modalidade = modalidade;  // Atribui a modalidade do curso técnico
    }

    // Getter para a modalidade (método para acessar a modalidade do curso técnico)
    public String getModalidade() {
        return modalidade;
    }

    // Sobrescrita do método exibirDados para adicionar a modalidade do curso técnico
    @Override
    public void exibirDados() {
        super.exibirDados();  // Chama o método da superclasse para exibir os dados básicos
        System.out.println("Modalidade do Curso Técnico: " + getModalidade());  // Exibe a modalidade do curso técnico
    }
}
