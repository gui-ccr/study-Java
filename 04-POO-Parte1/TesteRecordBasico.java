// Record 'Ponto' com componentes 'x' e 'y'
record Ponto(double x, double y) {
    // Internamente, Java gera:
    // - private final double x;
    // - private final double y;
    // - public Ponto(double x, double y) { this.x = x; this.y = y; } (Construtor canônico)
    // - public double x() { return this.x; } (Acessor para x)
    // - public double y() { return this.y; } (Acessor para y)
    // - public boolean equals(Object o) { ... }
    // - public int hashCode() { ... }
    // - public String toString() { ... }
}

public class TesteRecordBasico {
    public static void main(String[] args) {
        // Criando instâncias de Ponto
        Ponto p1 = new Ponto(10.0, 20.0);
        Ponto p2 = new Ponto(10.0, 20.0);
        Ponto p3 = new Ponto(5.0, 15.0);

        // Acessando componentes usando os métodos gerados (sem 'get')
        System.out.println("P1: X = " + p1.x() + ", Y = " + p1.y()); // Saída: P1: X = 10.0, Y = 20.0

        // Usando toString() gerado automaticamente
        System.out.println("P1 toString(): " + p1); // Saída: Ponto[x=10.0, y=20.0]

        // Usando equals() gerado automaticamente
        System.out.println("P1 equals P2? " + p1.equals(p2)); // Saída: true (conteúdo é o mesmo)
        System.out.println("P1 equals P3? " + p1.equals(p3)); // Saída: false

        // Usando hashCode() gerado automaticamente
        System.out.println("P1 hashCode: " + p1.hashCode());
        System.out.println("P2 hashCode: " + p2.hashCode()); // Serão iguais para objetos iguais
    }
}
