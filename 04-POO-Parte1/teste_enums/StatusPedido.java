package teste_enums;

public enum StatusPedido {
    // 3. Listar as constantes, chamando o construtor e passando os valores
    PENDENTE(1, "O pedido está aguardando processamento."),
    PROCESSANDO(2, "O pedido está sendo preparado para envio."),
    ENVIADO(3, "O pedido foi enviado e está a caminho."),
    ENTREGUE(4, "O pedido foi entregue com sucesso."),
    CANCELADO(5, "O pedido foi cancelado.");

    // 1. Definir os atributos (campos)
    private final int codigo;
    private final String descricao;

    // 2. Definir o construtor (implicitamente private)
    StatusPedido(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    // 4. (Opcional) Criar métodos para acessar os atributos
    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    // Método adicional para um comportamento específico
    public boolean podeSerCancelado() {
        return this == PENDENTE || this == PROCESSANDO;
    }

    // Método estático para encontrar um enum pelo código
    public static StatusPedido buscarPorCodigo(int codigo) {
        for (StatusPedido status : StatusPedido.values()) { // .values() retorna um array com todas as constantes
            if (status.getCodigo() == codigo) {
                return status;
            }
        }
        return null; // Ou lançar uma exceção se o código não for encontrado
    }
}
