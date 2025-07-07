public class Constantes {
    public static void main(String[] args) {
        // Uma variável normal pode ter seu valor alterado a qualquer momento.
        int idadeMutavel = 18;
        System.out.println("Idade mutável inicial: " + idadeMutavel);
        idadeMutavel = 19; // Funciona sem problemas
        System.out.println("Idade mutável alterada: " + idadeMutavel);

        System.out.println("-----------------");

        // Uma constante (final) só pode ter seu valor atribuído UMA VEZ.
        final int MAIORIDADE_LEGAL = 18;

        // Note uma convenção de nomenclatura importante. Nomes de constantes em Java são, por padrão, escritos em MAIUSCULAS_SEPARADAS_POR_UNDERLINE.

        System.out.println("A maioridade legal no Brasil é: " + MAIORIDADE_LEGAL + " anos.");

        // A linha abaixo causaria um ERRO DE COMPILAÇÃO
        // MAIORIDADE_LEGAL = 19;
    }
}
