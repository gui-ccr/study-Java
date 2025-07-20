class CalculadoraGeometrica {
    // Atributo estático PI - compartilhado por todos os objetos da classe.
    // Se você mudar o valor de PI, TODOS os objetos e métodos (inclusive de subclasses)
    // passam a usar o novo valor automaticamente.
    public static double PI = 3.14159;

    // Atributo de instância - cada objeto tem o seu próprio valor.
    // Se você mudar o valor de fatorMultiplicador em um objeto,
    // isso NÃO afeta os outros objetos.
    public double fatorMultiplicador = 1.0;

    // Método estático: pode ser chamado sem criar um objeto.
    public static double calcularAreaCirculo(double raio) {
        double area = PI * raio * raio;
        return area;
    }

    public static double calcularAreaRetangulo(double altura, double largura) {
        double area = altura * largura;
        return area;
    }

    // Método de instância: usa o fatorMultiplicador do objeto específico.
    public double calcularAreaCirculoComFator(double raio) {
        double area = PI * raio * raio * this.fatorMultiplicador;
        return area;
    }
}

public class TesteCalculadoraGeometrica {
    public static void main(String[] args) {
        // Usando métodos e atributo estático
        double areaCirculoCalculada = CalculadoraGeometrica.calcularAreaCirculo(5.0);
        System.out.println("Área do círculo com raio 5 (static): " + areaCirculoCalculada);

        // Criando dois objetos com fatores diferentes
        CalculadoraGeometrica calc1 = new CalculadoraGeometrica();
        CalculadoraGeometrica calc2 = new CalculadoraGeometrica();

        // Alterando o fatorMultiplicador de cada objeto individualmente
        calc1.fatorMultiplicador = 2.0; // muda só para calc1
        calc2.fatorMultiplicador = 0.5; // muda só para calc2

        // Usando método de instância que depende do fatorMultiplicador de cada objeto
        System.out.println("Área do círculo com raio 5 e fator 2.0 (obj1): " + calc1.calcularAreaCirculoComFator(5.0));
        System.out.println("Área do círculo com raio 5 e fator 0.5 (obj2): " + calc2.calcularAreaCirculoComFator(5.0));

        // Mudando o valor de PI (estático) afeta todos os objetos e métodos
        CalculadoraGeometrica.PI = 3.0;
        // Agora, todos os métodos e objetos usam o novo valor de PI
        System.out.println("Área do círculo com raio 5 (static, PI alterado): " + CalculadoraGeometrica.calcularAreaCirculo(5.0));
        System.out.println("Área do círculo com raio 5 e fator 2.0 (obj1, PI alterado): " + calc1.calcularAreaCirculoComFator(5.0));
    }
}
