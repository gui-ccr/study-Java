class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor 1: Inicializa todos os atributos do produto.
    public Produto(String nomeProduto, double precoProduto, int quantidadeEstoqueProduto){
        this.nome = nomeProduto;
        this.preco = precoProduto;
        this.quantidadeEstoque = quantidadeEstoqueProduto;
    }

    // Construtor 2: Inicializa o produto com nome e preço, definindo a quantidadeEstoque em 0 por padrão.
    public Produto(String nomeProduto, double precoProduto){
        this.nome = nomeProduto;
        this.preco = precoProduto;
        this.quantidadeEstoque = 0; // Atribui 0 ao atributo de instância 'quantidadeEstoque'
        // O uso de 'this.' é uma boa prática para diferenciar atributos da classe de parâmetros com o mesmo nome e para clareza.
    }

    // SETTERS (para modificar atributos privados de forma controlada)
    // Convenção: métodos setters são void e não retornam o valor.
    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public void setPreco(double novoPreco){
        if (novoPreco >= 0) { // Validação: preço não pode ser negativo
            this.preco = novoPreco;
        } else {
            System.out.println("Erro: Preço inválido. Preço não atualizado.");
        }
    }

    public void setEstoque(int novaQuantidade){
        if (novaQuantidade >= 0) { // Validação: quantidade não pode ser negativa
            this.quantidadeEstoque = novaQuantidade;
        } else {
            System.out.println("Erro: Quantidade inválida. Estoque não atualizado.");
        }
    }

    // GETTERS (para obter valores de atributos privados)
    // Convenção: métodos getters retornam o tipo do atributo e têm o prefixo 'get'.
    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getEstoque(){
        return this.quantidadeEstoque;
    }

    // Método para exibir os detalhes do produto (o estado atual do objeto).
    // Usando getters para acessar os próprios atributos (boa prática de encapsulamento).
    void exibirDetalhes(){
        System.out.println("O preço do " + getNome() + " é R$" + getPreco() + " reais, e temos " + getEstoque() + " em estoque!");
    }
}
public class Loja {
    public static void main(String[] args) {
        /*
         * Criei 2 objetos Produto:
         * - Produto1: Usando o construtor que especifica nome, preço e 20 unidades em estoque.
         * - Produto2: Usando o construtor que define o estoque como 0 por padrão, sem necessidade de informá-lo.
         */
        Produto Produto1 = new Produto("Caneta", 3.99, 20);
        Produto Produto2 = new Produto("Lapis", 2.99);

        System.out.println("Exibindo os detalhes dos produtos:"); // Adicionei um dois pontos para melhor leitura
        Produto1.exibirDetalhes();
        Produto2.exibirDetalhes();

        // System.out.println(nomeProduto); -> isso vai dar um erro por nao como meu nome agora é privado nao consigo exibilo para isso eu preciso usar o met getNome

        System.out.println("O nome do meu produto1 é: '" + Produto1.getNome() + "' ");
        System.out.println("O estoque do meu produto1 é: '" + Produto1.getEstoque() + "' ");
        System.out.println("O preco do meu produto1 é: '" + Produto1.getPreco() + "' ");


        // caso eu queria modificar os valores dos meus objetos em vez agora eu utilizo o meu setter
        Produto1.setPreco(199.00);
        Produto1.setNome("Moletom do medo Ordem Paranormal");
        Produto1.setEstoque(50);


        System.out.println("O nome do meu produto1 é: '" + Produto1.getNome() + "' ");
        System.out.println("O estoque do meu produto1 é: '" + Produto1.getEstoque() + "' ");
        System.out.println("O preco do meu produto1 é: '" + Produto1.getPreco() + "' ");

        System.out.println("Exibindo os novos detalhes do produto1: ");
        Produto1.exibirDetalhes();
    }
}
