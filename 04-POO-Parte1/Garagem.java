// A classe 'Carro' define o que um carro tem e o que um carro faz.
class Carro {
    // Atributos (características)
    String marca;  // Característica: a marca do carro
    String modelo; // Característica: o modelo do carro
    int ano;       // Característica: o ano de fabricação
    String cor;    // Característica: a cor do carro
    // ... outros atributos como velocidadeAtual, estaLigado, etc.

    int velocidadeAtual = 0; // Novo atributo para o exemplo de método

    // Método sem parâmetros e sem retorno (void)
    void ligar() {
        System.out.println("O " + marca + " " + modelo + " está ligado.");
    }

    // Método com parâmetro e sem retorno (void)
    void acelerar(int aumentoVelocidade) {
        velocidadeAtual += aumentoVelocidade; // Aumenta a velocidade
        System.out.println("O carro acelerou para " + velocidadeAtual + " km/h.");
    }

    // Método para simular frenagem
    void frear() {
        velocidadeAtual = 0; // Simplesmente para a velocidade
        System.out.println("O carro freou e está parado.");
    }

    // Método sem parâmetros, mas com retorno (String)
    String obterDescricao() {
        return "Este é um " + ano + " " + marca + " " + modelo + " de cor " + cor + ".";
    }
}

public class Garagem {
    public static void main(String[] args) {
        // Criação de objetos
        Carro carroA = new Carro();
        carroA.marca = "Fiat";
        carroA.modelo = "Palio";
        carroA.ano = 2018;
        carroA.cor = "Branco";

        Carro carroB = new Carro();
        carroB.marca = "Chevrolet";
        carroB.modelo = "Onix";
        carroB.ano = 2022;
        carroB.cor = "Vermelho";

        // Usando os métodos dos objetos
        System.out.println(carroA.obterDescricao()); // Chama o método e imprime o retorno
        carroA.ligar();
        carroA.acelerar(50); // Passa 50 como argumento para o parâmetro 'aumentoVelocidade'
        carroA.frear();

        System.out.println("\n---");

        System.out.println(carroB.obterDescricao());
        carroB.ligar();
        carroB.acelerar(80);
        carroB.acelerar(20); // Acelera mais um pouco
        carroB.frear();
    }
}
