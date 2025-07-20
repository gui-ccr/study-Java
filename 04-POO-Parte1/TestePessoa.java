class Pessoa{
    private String nome; // Atributo privado: só pode ser acessado dentro da classe Pessoa
    private int idade;   // Atributo privado

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        // Validação: Exemplo de controle de acesso ao atributo privado
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida. Idade definida para 0.");
            this.idade = 0;
        }
    }

    // Método público para "setar" (modificar) a idade de forma controlada
    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida. Não foi possível atualizar.");
        }
    }

    // Método público para "getar" (obter) o nome
    public String getNome() { // Convenção: get + NomeDoAtributo
        return this.nome;
    }

    // Método público para "getar" a idade
    public int getIdade() { // Convenção: get + NomeDoAtributo
        return this.idade;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome() + ", Idade: " + getIdade()); // Métodos da própria classe podem acessar atributos privados
    }
}

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Alice", 30);
        // p1.nome = "Bob"; // ERRO de compilação! 'nome' tem acesso privado
        // p1.idade = -5;   // ERRO de compilação! 'idade' tem acesso privado

        System.out.println("Nome: " + p1.getNome()); // Acessa via método público (getter)
        System.out.println("Idade: " + p1.getIdade()); // Acessa via método público (getter)

        p1.setIdade(31); // Modifica via método público (setter)
        System.out.println("Nova idade: " + p1.getIdade());

        p1.setIdade(-10); // Tentativa de idade inválida, método setter controla
        System.out.println("Idade após tentativa inválida: " + p1.getIdade());
    }
}
