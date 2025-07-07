public class TiposPrimitivos {
    public static void main(String[] args) {
        // 1. declaração de uma variavel em java
        //?  int idade = 18;

        // 2. agora a impressao dessa variavel
        //? System.out.println(idade);

        // 3. para concatenar variveis em java é so usar o +

        //? System.out.println("Eu tenho " + idade + " anos.");

        // string/ texto e o string é com S maiusculo aqui

        String nome = "Guilherme";

        // numeros inteiros
        int idade = 18;

        // numeros com casas decimais
        double altura = 1.83;

        //valores boleanos
        boolean ehEstudante = true;

        // imprindo tudo de forma organizada

        System.out.println("----Ficha Cadastral----");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("É estudante? " + ehEstudante);
        System.out.println("-------------------------");
    }
}
