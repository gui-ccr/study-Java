class Computador {
    // atributo estatico da classe externa - compartilado por todas as instancias e
    // acessivel pela propria classe

    static String tipoProcessador = "Intel i7";

    // atributo de instacia da classe externa - cada objeto Computador tera o seu
    // proprio

    String modeloComputador;

    // Atributo de instância do tipo da classe aninhada (PlacaMae)
    // Isso permite que cada objeto Computador tenha sua própria PlacaMae associada.
    PlacaMae placaMaeDoComputador;

    // construtor para inicializar o modelo computador
    public Computador(String modelo) {
        this.modeloComputador = modelo;
    }

    // classe aninhada ESTATICA - nao precisa de um objeto 'Computador' para ser
    // instanciada
    // pode acessar APENAS membros estaticos da classe externa

    public static class PlacaMae {
        String fabricante;

        // construtor
        public PlacaMae(String fabricante) {
            this.fabricante = fabricante;
        }

        public void exibirDetalhesPlacaMae() {
            System.out.println("- Fabricante da Placa Mae: " + fabricante);
            System.out.println("- Processador Padrao ( da classe Computador): " + Computador.tipoProcessador);

        }
    }
    // metodo para exibir informações completas do computador
    // este e um metodo de instancia, entao ele pode acessar modeloComputador e
    // placaMaeDoComputador

    public void exibirInfoComputador() {
        System.out.println("\n--- Detalhes do Computador ---");
        System.out.println("Modelo do computador: " + this.modeloComputador);
        if (this.placaMaeDoComputador != null) {
            System.out.println("detalhes da Placa Mae:");
            this.placaMaeDoComputador.exibirDetalhesPlacaMae();
        } else {
            System.out.println("Este computador ainda nao tem placa mae");
        }
    }
}

public class TesteComputador{
    public static void main(String[] args) {
        System.out.println("--- Teste de classe aninhada estatica (PlacaMae) ---");

        Computador.PlacaMae minhaPlacaMae = new Computador.PlacaMae("ASUS");

        minhaPlacaMae.exibirDetalhesPlacaMae();

        System.out.println("\n-----------------------------------------\n");

        System.out.println("--- Criando e Configurando um Computador ---");

        Computador meuPc = new Computador("SAMSUNG");
        Computador.PlacaMae placaDoMeuPc = new Computador.PlacaMae("NVIDIA");
        meuPc.placaMaeDoComputador = placaDoMeuPc;

        meuPc.exibirInfoComputador();

        System.out.println("\n-----------------------------------------\n");



    }
}
