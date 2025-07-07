import java.util.Map;
import java.util.HashMap;


public class Maps {
    public static void main(String[] args) {
        // Declaração usando a interface Map
        // Uma mapa que associa Strings (chaves) a Integers (valores)

        //* */ Map<String, Integer> idadePessoas = new HashMap<>(); // Strings (chaves) a Integers (valores)
        //* */ Map<Integer, String> codigosProdutos = new HashMap<>(); // Chave: Integer, Valor: String
        //* */ Map<String, Double> precosItens = new HashMap<>(); // Chave: String, Valor: Double

        Map<String, String> capitais = new HashMap<>();
        capitais.put("Brasil ", " Brasilia");
        capitais.put("Argentina ", " Buenos Aires");
        capitais.put("França ", " Paris");

        System.out.println(capitais); // Saída pode variar na ordem: {França=Paris, Brasil=Brasília, Argentina=Buenos Aires}

        capitais.put("Brasil ", " Rio de Janeiro"); // Sobrescreve "Brasília"
        System.out.println(capitais);

        String capitalBrasil = capitais.get("Brasil "); // Saída: Rio de Janeiro
        System.out.println("Capital do Brasil: " + capitalBrasil);


        String capitalAlemanha = capitais.get("Alemanha"); // Saída: null (porque não existe)
        System.out.println("Capital da Alemanha: " + capitalAlemanha);

        capitais.remove("Argentina");
        System.out.println(capitais); // Saída: {França=Paris, Brasil=Rio de Janeiro}


        System.out.println("Contém 'França'? " + capitais.containsKey("França"));   // true
        System.out.println("Contém 'Brasília'? " + capitais.containsValue("Brasília")); // false (foi sobrescrita)

        int quantidadePares = capitais.size();
        System.out.println("Número de países/capitais no mapa: " + quantidadePares); // Saída: 2

        System.out.println("\n Chaves (Paises): ");
        for (String pais : capitais.keySet()){
            System.out.println("- " + pais);
        }
        System.out.println("\n Valores (Capitais): ");
        for (String pais : capitais.values()){
            System.out.println("- " + pais);
        }

        System.out.println("\nPares Chave-Valor:");
        for (Map.Entry<String, String> entrada : capitais.entrySet()) {
        System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }


    }
}
