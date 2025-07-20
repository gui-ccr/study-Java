class ExemploFinalVariavel {
    // Constante de CLASSE (final static) - valor único para toda a classe
    public static final double GRAVIDADE = 9.81; // Inicializada na declaração

    // Atributo final de INSTÂNCIA - cada objeto terá seu próprio valor,
    // que é definido APENAS UMA VEZ no construtor.
    public final String idProduto;

    // Variável final sem inicialização no construtor
    public final String nomeVendedor;


    public ExemploFinalVariavel(String id, String vendedor) {
        this.idProduto = id; // Inicializado no construtor
        this.nomeVendedor = vendedor;
    }

    public final void imprimirDetalhes(final int valorImutavel) { // Parâmetro final (não pode ser alterado dentro do método)
        // e o meu metodo não pode ser sobrescrito caso a minha classe seja estendida
        // GRAVIDADE = 9.80; // ERRO: Não pode reatribuir um campo final
        // idProduto = "XYZ"; // ERRO: Não pode reatribuir um campo final

        final String mensagem = "Olá"; // Variável local final
        // mensagem = "Adeus"; // ERRO: Não pode reatribuir uma variável local final

        System.out.println("Gravidade: " + GRAVIDADE);
        System.out.println("ID do Produto: " + idProduto);
        System.out.println("Valor Imutável (parâmetro): " + valorImutavel);
        System.out.println("Mensagem local: " + mensagem);
    }

}

final class ConfiguracaoBase { // Esta classe não pode ser estendida
    public String versao = "1.0";
}

// class ConfiguracaoCustomizada extends ConfiguracaoBase { // ERRO: Não pode herdar de uma classe final


public class TesteFinalVariavel {
    public static void main(String[] args) {
        ExemploFinalVariavel produtoA = new ExemploFinalVariavel("P001", "Ana");
        produtoA.imprimirDetalhes(10);

        ExemploFinalVariavel produtoB = new ExemploFinalVariavel("P002", "Bruno");
        produtoB.imprimirDetalhes(20);

        // GRAVIDADE pode ser acessada pela classe
        System.out.println("Aceleracao da Gravidade Global: " + ExemploFinalVariavel.GRAVIDADE);
    }
}
