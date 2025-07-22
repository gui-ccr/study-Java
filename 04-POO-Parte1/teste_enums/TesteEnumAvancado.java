package teste_enums;

public class TesteEnumAvancado {
    public static void main(String[] args) {
        StatusPedido meuStatus = StatusPedido.PROCESSANDO;

        System.out.println("Status: " + meuStatus);
        System.out.println("Código: " + meuStatus.getCodigo());
        System.out.println("Descrição: " + meuStatus.getDescricao());

        System.out.println("Pode ser cancelado? " + meuStatus.podeSerCancelado());

        StatusPedido statusEntregue = StatusPedido.ENTREGUE;
        System.out.println("Status Entregue pode ser cancelado? " + statusEntregue.podeSerCancelado());

        System.out.println("\nTodos os status de pedido:");
        for (StatusPedido status : StatusPedido.values()) {
            System.out.println(status.getCodigo() + " - " + status.name() + ": " + status.getDescricao());
        }

        StatusPedido statusEncontrado = StatusPedido.buscarPorCodigo(3);
        if (statusEncontrado != null) {
            System.out.println("\nStatus encontrado pelo código 3: " + statusEncontrado.getDescricao());
        }
    }
}
