

public class Carro {
    private String marca;
    private String modelo;
    private int velocidadeAtual;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = 0;
    }

    public void exibirStatus() {
        System.out.println(marca + " " + modelo + " está a " + velocidadeAtual + " km/h.");
    }

    // Classe Interna de Membro (NÃO ESTÁTICA)
    // Cada Motor pertence a uma instância específica de Carro
    public class Motor {
        String tipoCombustivel;
        int cavalosVapor;

        public Motor(String tipoCombustivel, int cv) {
            this.tipoCombustivel = tipoCombustivel;
            this.cavalosVapor = cv;
        }

        public void ligarMotor() {
            System.out.println("Motor " + tipoCombustivel + " de " + cavalosVapor + "cv ligado para o " + marca + " " + modelo + ".");
            // Pode acessar 'marca' e 'modelo' diretamente porque são atributos da classe externa
            // E também pode acessar 'velocidadeAtual'
            // System.out.println("Velocidade atual do carro: " + velocidadeAtual);
        }
    }
}

// Classe principal para testar
class TesteCarroMotor {
    public static void main(String[] args) {
        // Primeiro, crie uma instância da CLASSE EXTERNA
        Carro meuCarro = new Carro("Honda", "Civic");
        meuCarro.exibirStatus();

        // Para criar uma instância da CLASSE INTERNA, você usa o objeto da CLASSE EXTERNA
        Carro.Motor motorDoMeuCarro = meuCarro.new Motor("Gasolina", 150);
        motorDoMeuCarro.ligarMotor();

        System.out.println("\n---");

        // Outro carro, outro motor
        Carro carroDoVizinho = new Carro("Toyota", "Corolla");
        carroDoVizinho.exibirStatus();
        Carro.Motor motorDoVizinho = carroDoVizinho.new Motor("Flex", 140);
        motorDoVizinho.ligarMotor();
    }
}
