class Carro {
    private String marca;
    private String modelo;
    private int velocidade;
    private String direcao;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0;
        this.direcao = "Parado";
    }

    // Métodos que retornam 'this' (a própria instância do Carro)
    public Carro acelerar(int kmh) {
        this.velocidade += kmh;
        System.out.println(marca + " " + modelo + " acelerou para " + velocidade + " km/h.");
        return this; // RETORNA O PRÓPRIO OBJETO CARRO
    }

    public Carro virarADireita() {
        this.direcao = "Virando à direita";
        System.out.println(marca + " " + modelo + " está virando à direita.");
        return this; // RETORNA O PRÓPRIO OBJETO CARRO
    }

    public Carro virarAEsquerda() {
        this.direcao = "Virando à esquerda";
        System.out.println(marca + " " + modelo + " está virando à esquerda.");
        return this; // RETORNA O PRÓPRIO OBJETO CARRO
    }

    public Carro frear() {
        this.velocidade = 0;
        this.direcao = "Parado";
        System.out.println(marca + " " + modelo + " freou e está parado.");
        return this; // RETORNA O PRÓPRIO OBJETO CARRO
    }

    public void exibirStatus() { // Este não retorna 'this', então não pode ser encadeado
        System.out.println("Status: " + marca + " " + modelo + " - Velocidade: " + velocidade + " km/h, Direção: " + direcao);
    }
}

public class TesteEncadeamento {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Ford", "Mustang");

        // Encadeamento de Métodos:
        meuCarro.acelerar(60)       // Retorna meuCarro
                 .virarADireita()   // Chamado sobre o meuCarro retornado
                 .acelerar(20)      // Chamado sobre o meuCarro retornado
                 .virarAEsquerda()  // Chamado sobre o meuCarro retornado
                 .frear()           // Chamado sobre o meuCarro retornado
                 .acelerar(10);     // Chamado sobre o meuCarro retornado

        meuCarro.exibirStatus(); // Exibe o status final
    }
}
