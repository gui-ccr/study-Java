class Produtos {
    private String codigo;
    private double peso;
    private static int contadorProdutossCriados = 0; // Atributo estático

    // Bloco de Inicialização de Instância
    {
        System.out.println("Executando Bloco de Inicialização de Instância para um novo produtos.");
        // Lógica de inicialização mais complexa aqui, se necessário.
        // Por exemplo, gerar um código complexo
        this.codigo = "PROD-" + (++contadorProdutossCriados); // Usa o contador estático para gerar um código
        // Ex: poderia validar algum recurso ou carregar uma configuração específica para cada instância
    }

    // Construtor
    public Produtos(double peso) {
    System.out.println("Executando Construtor do Produtos.");
    this.peso = peso;
}

    public void exibirInfo() {
        System.out.println("Produtos Código: " + codigo + ", Peso: " + peso + "kg");
    }
}

public class TesteInitializerBlock {
    public static void main(String[] args) {
        System.out.println("Iniciando main.");
        Produtos p1 = new Produtos(1.5);
        p1.exibirInfo(); // Saída: PROD-1

        System.out.println("\n--- Criando outro produtos ---");
        Produtos p2 = new Produtos(2.0);
        p2.exibirInfo(); // Saída: PROD-2
        System.out.println("Finalizando main.");
    }
}
