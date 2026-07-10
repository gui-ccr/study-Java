package src.concepts;

/*
 * Exemplo didático de try-with-resources.
 *
 * Qualquer classe que implemente a interface AutoCloseable pode ser usada
 * dentro dos parênteses do try. O Java garante que o método close() seja
 * chamado automaticamente ao final do bloco, mesmo que uma exceção ocorra
 * — sem precisar de um bloco finally manual. É assim que, na prática, se
 * trabalha com arquivos, conexões de banco de dados, Scanner, etc.
 */
public class TryWithResources {

    // Recurso fictício que "precisa" ser fechado após o uso
    static class ConexaoFicticia implements AutoCloseable {
        ConexaoFicticia() {
            System.out.println("Conexão aberta.");
        }

        void executarConsulta() {
            System.out.println("Executando consulta...");
        }

        @Override
        public void close() {
            // Chamado automaticamente ao sair do try, em ordem inversa à abertura
            System.out.println("Conexão fechada automaticamente.");
        }
    }

    public static void main(String[] args) {
        // Não é preciso um "finally" para fechar o recurso: o try-with-resources cuida disso
        try (ConexaoFicticia conexao = new ConexaoFicticia()) {
            conexao.executarConsulta();
        }
        System.out.println("Fim do programa.");
    }
}
