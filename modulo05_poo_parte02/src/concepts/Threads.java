/*
 * Exemplo didático de Threads e condição de corrida (race condition).
 *
 * Duas threads (t1 e t2) incrementam a mesma variável estática "i" ao
 * mesmo tempo. Como i++ não é uma operação atômica (na verdade é
 * ler-incrementar-gravar em 3 passos), rodar o programa várias vezes pode
 * produzir saídas diferentes (ex.: contadores "pulando" valores). Esse é o
 * problema clássico que motiva o uso de sincronização (synchronized,
 * AtomicInteger, etc.) em programação concorrente.
 */
public class Threads {
    // Variável compartilhada entre as duas threads: fonte da condição de corrida
    static int i = 0;

    public static void main(String[] args) {
        // start() inicia a execução da thread em paralelo (não bloqueia a main)
        new Thread(t1).start();
        new Thread(t2).start();
    }

    private static void countMe(String name){
        i++;
        System.out.println("Current Counter is: " + i + ", updated by: " + name);
    }

    // Runnable define o código que a Thread vai executar (o método run())
    private static Runnable t1 = new Runnable() {
        public void run() {
            try{
                for(int i=0; i<5; i++){
                    countMe("t1");
                }
            } catch (Exception e){}

        }
    };

    private static Runnable t2 = new Runnable() {
        public void run() {
            try{
                for(int i=0; i<5; i++){
                    countMe("t2");
                }
            } catch (Exception e){}
       }
    };
}
