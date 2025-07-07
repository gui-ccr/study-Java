public class ExemploFor {
    public static void main(String[] args) {
        // System.out.println("Contando de 0 à 20: ");

        // for(int i = 0; i < 21; i++){
        //     System.out.println("numero: " + i);
        // }
        // for(int i = 20; i >= 1; i--){
        //     System.out.println("numero: " + i);
        // }


        // System.out.println("Tabuada de 1 a 5:");
        // for (int i = 1; i <= 10; i++) { // Loop externo para os números (de 1 a 5)
        //     System.out.println("\nTabuada do " + i + ":");
        //     for (int j = 1; j <= 10; j++) { // Loop interno para os multiplicadores (de 1 a 10)
        //         System.out.println(i + " x " + j + " = " + (i * j));
        //     }


        // }

        // String[] frutas = {"Maçã", "Banana", "Laranja", "Uva"};

        // System.out.println("Lista de frutas:");
        // for (String fruta : frutas) { // Para cada String 'fruta' dentro do array 'frutas'
        //     System.out.println(fruta);
        // }

        System.out.println("Numeros pares de 2 à 20: ");
        for(int i = 2; i < 21; i += 2){
            System.out.println("numero: " + i);
        }

        System.out.println("Lista de amigos");
        String amigos[] = {"Guilherme", "matheus", "milena", "henrique", "luiza"};
        for(String amigo : amigos){
            System.out.println("Os meus amigos são: " + amigo  );
        }



    }
}
