class Aluno {
    String nome; // Java inicializa String com null por padrão
    int matricula; // Java inicializa int com 0 por padrão

    double[] notas;

    // Método para exibir informações do aluno
    void exibirInformacoes() {
        System.out.println("\n--- Informações do Aluno ---");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.print("Notas: [");
        if (notas != null && notas.length > 0) {
            for (int i = 0; i < notas.length; i++) {
                System.out.print(notas[i]);
                if (i < notas.length - 1) {
                    System.out.print(", ");
                }
            }
        } else {
            System.out.print("N/A"); // Se não houver notas
        }
        System.out.println("]");
    }

    // Método para calcular a média das notas do aluno
    // Não precisa de parâmetros porque ele acessa o atributo 'notas' do próprio objeto.
    double calcularMedia() {
        if (notas == null || notas.length == 0) {
            return 0.0;
        }
        double somaNotas = 0.0;
        for (double notaAtual : notas) {
            somaNotas += notaAtual;
        }
        return somaNotas / notas.length;
    }

    public Aluno(String nomeDoAluno, int numeroDaMatricula){
        this.nome = nomeDoAluno; // 'this.nome' refere-se ao atributo 'nome' da classe
        this.matricula = numeroDaMatricula; // 'this.matricula' refere-se ao atributo 'matricula' da classe
        this.notas = new double[3]; // Inicializa o array de notas com 3 posições (vazio por padrão)

        System.out.println("Novo aluno '" + this.nome + "' matriculado!");


    }

    // Outro construtor (sobrescarga de construtores) - pode ter múltiplos construtores
    public Aluno(String nomeDoAluno, int numeroMatricula, double[] notasIniciais) {
        this.nome = nomeDoAluno;
        this.matricula = numeroMatricula;
        this.notas = notasIniciais; // Atribui o array de notas passado como parâmetro
        System.out.println("Novo aluno '" + this.nome + "' matriculado com notas iniciais!");
    }


}

// DadosAluno.java
public class DadosAluno {
    public static void main(String[] args) {
        // Criando o primeiro objeto Aluno
        Aluno alunoA = new Aluno("Guilherme", 6565651);
        // Exibindo informações e média do aluno A
        alunoA.exibirInformacoes();
        System.out.printf("A média do %s foi de (%.2f)%n", alunoA.nome, alunoA.calcularMedia());

        System.out.println("\n---------------------------\n");

        // Criando um segundo objeto Aluno
        double[] notasMilena = {7.5, 8.0, 9.2, 6.8};
        Aluno alunoB = new Aluno("Milena", 98765432, notasMilena);
        alunoB.nome = "Milena";
        alunoB.matricula = 98765432;


        // Exibindo informações e média do aluno B
        alunoB.exibirInformacoes();
        System.out.printf("A média da %s foi de (%.2f)%n", alunoB.nome, alunoB.calcularMedia());
        System.out.println("\n---------------------------\n");



        // Criando um aluno que só terá notas definidas depois ou não terá
        Aluno aluno3 = new Aluno("Henrique", 1003); // O construtor criou um array de 3 notas
        aluno3.exibirInformacoes(); // Notas serão 0.0 por padrão no array
        System.out.printf("Média de %s: %.2f%n", aluno3.nome, aluno3.calcularMedia());

    }
}
