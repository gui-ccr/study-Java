public class OperadoresBasicos {
    public static void main(String[] args) {
        int numeroA = 10;
        int numeroB = 3;

        // operadores aritmeticos
        int soma = numeroA + numeroB;
        int subtracao = numeroA - numeroB;
        int multiplicacao = numeroA *  numeroB;
        int divisao = numeroA / numeroB;
        int restoDaDivisao = numeroA % numeroB;

        double divisaoDecimal = (double) numeroA / numeroB;


        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao );
        System.out.println("divisao: " + divisao );
        System.out.println("divisao decimal: " + divisaoDecimal );
        System.out.println("Resto da divisao: " + restoDaDivisao );
    }
}
