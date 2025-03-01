package AtivEAD2803;

import java.util.Scanner;  // Importa a classe Scanner para leitura de dados do usuário

public class CadastroAluno {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para capturar dados do usuário
        try (Scanner sc = new Scanner(System.in)) {
            // Coleta de dados gerais do aluno
            System.out.print("Digite o nome do aluno: ");
            String nome = sc.nextLine();
            System.out.print("Digite a idade do aluno: ");
            int idade = sc.nextInt();
            System.out.print("Digite a nota do aluno: ");
            double nota = sc.nextDouble();
            sc.nextLine(); // Consumir a linha em branco após o nextInt() ou nextDouble()

            // Coleta do tipo de curso (Graduação ou Técnico)
            System.out.print("Digite o tipo de curso (1 para Graduação, 2 para Técnico): ");
            int tipoCurso = sc.nextInt();
            sc.nextLine();  // Consumir a linha em branco após o nextInt()

            // Validação para garantir que a idade e a nota são válidas
            if (idade < 0 || idade > 100) {
                System.out.println("Idade inválida.");
                return;
            }

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida.");
                return;
            }

            // Processa o cadastro dependendo do tipo de curso
            if (tipoCurso == 1) {
                // Cadastro de aluno de graduação
                System.out.print("Digite o curso de graduação: ");
                String curso = sc.nextLine();
                AlunoGraduacao alunoGraduacao = new AlunoGraduacao(nome, idade, nota, curso);
                alunoGraduacao.exibirDados();  // Exibe os dados do aluno de graduação
            } else if (tipoCurso == 2) {
                // Cadastro de aluno técnico
                System.out.print("Digite a modalidade do curso técnico: ");
                String modalidade = sc.nextLine();
                AlunoTecnico alunoTecnico = new AlunoTecnico(nome, idade, nota, modalidade);
                alunoTecnico.exibirDados();  // Exibe os dados do aluno técnico
            } else {
                // Caso o tipo de curso não seja válido
                System.out.println("Tipo de curso inválido.");
            }
        } catch (Exception e) {
            // Trata possíveis exceções, como entradas inválidas
            System.out.println("Erro ao processar os dados. Tente novamente.");
        }
    }
}
