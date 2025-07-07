import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeNotas {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();

        System.out.println("---Gerenciador de notas---");


        // notas iniciais

        notas.add(2.5);
        notas.add(9.1);
        notas.add(8.9);
        notas.add(3.8);

        System.out.println("\n notas atuais: ");
        for(int i = 0; i < notas.size(); i++){
            System.out.println((i + 1) + ". nota: " + notas.get(i));
        }

        double somaNotas = 0.0;
        for(double temp : notas){
            somaNotas += temp;
        }

        double media = somaNotas / notas.size();
        System.out.printf("Media de notas %.2f%n", media);

        if (!notas.isEmpty()) {
            System.out.println("removendo a segunda nota da lista '" + notas.get(1));
            notas.remove(1);

        }
        System.out.println("Notas atualizadas");
        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota restante");
        }else{
            for(double nota : notas){
                System.out.println("- " + nota);
            }
        }







    }

}
