package src.concepts;

/*
 * Exemplo didático de tratamento de exceções em Java.
 *
 * Cobre: try/catch/finally, exceção checked vs unchecked, e o lançamento
 * (throw) de uma exceção customizada.
 */
public class TratamentoDeExcecoes {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};

        // --- try / catch / finally ---
        try {
            // ArrayIndexOutOfBoundsException é uma unchecked exception (RuntimeException):
            // o compilador NÃO obriga a tratá-la, mas ela ainda pode ocorrer em tempo de execução.
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice fora dos limites do array. " + e.getMessage());
        } finally {
            // O bloco finally SEMPRE executa, tenha havido exceção ou não.
            // Útil para liberar recursos (fechar arquivos, conexões, etc.).
            System.out.println("Bloco finally: sempre executado.");
        }

        // --- Múltiplos catch e divisão por zero ---
        try {
            int resultado = 10 / 0; // ArithmeticException (unchecked)
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");
        }

        // --- Exceção customizada, lançada manualmente com throw ---
        try {
            validarIdade(-5);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro de validação: " + e.getMessage());
        }
    }

    // Método que lança (throw) uma exceção customizada quando a regra de negócio é violada
    private static void validarIdade(int idade) throws IdadeInvalidaException {
        if (idade < 0) {
            throw new IdadeInvalidaException("Idade não pode ser negativa: " + idade);
        }
        System.out.println("Idade válida: " + idade);
    }
}

/*
 * Exceção customizada (checked): estende Exception diretamente, portanto o
 * compilador OBRIGA quem chama o método a tratá-la (com try/catch) ou
 * repassá-la (declarando "throws" na assinatura do método).
 *
 * Se estendesse RuntimeException em vez de Exception, seria unchecked
 * (tratamento opcional).
 */
class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}
