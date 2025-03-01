package AtivEAD2803;

// Classe base Aluno
public class Aluno {
    private String nome;    // Atributo privado para o nome do aluno
    private int idade;      // Atributo privado para a idade do aluno
    private double nota;    // Atributo privado para a nota do aluno

    // Construtor da classe Aluno
    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;   // Atribuindo o nome do aluno
        this.idade = idade; // Atribuindo a idade do aluno
        this.nota = nota;   // Atribuindo a nota do aluno
    }

    // Getter para o nome (método para acessar o nome do aluno)
    public String getNome() {
        return nome;
    }

    // Getter para a idade (método para acessar a idade do aluno)
    public int getIdade() {
        return idade;
    }

    // Getter para a nota (método para acessar a nota do aluno)
    public double getNota() {
        return nota;
    }

    // Método para exibir os dados do aluno
    public void exibirDados() {
        System.out.println("Nome: " + getNome());    // Exibe o nome
        System.out.println("Idade: " + getIdade());  // Exibe a idade
        System.out.println("Nota: " + getNota());    // Exibe a nota

        // Verifica se o aluno foi aprovado ou reprovado
        if (getNota() > 7)
            System.out.println("Aprovado!");
        else
            System.out.println("Reprovado!");
    }
}
