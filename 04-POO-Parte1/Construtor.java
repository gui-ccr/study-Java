class Carro {
    String marca;
    
    // Não definimos nenhum construtor, então o Java cria um implícito:
    // public Carro() { }
}

public class Construtor {
    public static void main(String[] args) {
        Carro meuCarro = new Carro(); // Chamando o construtor padrão implícito
        System.out.println("Marca: " + meuCarro.marca); // Saída: Marca: null
    }
}
