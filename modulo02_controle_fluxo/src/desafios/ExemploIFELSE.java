public class ExemploIFELSE {
    public static void main(String[] args) {
        // boolean temCarteira = true;
        // int idade = 17;

        // if(idade >= 18 && temCarteira == true ){
        //     System.out.println("voce pode dirigir");
        // }else if(idade >= 18 && temCarteira == false){
        //     System.out.println("voce tem idade para tirar habilitacao");
        // }else if(idade < 18 && temCarteira == false){
        //     System.out.println("voce nao tem idade para tirar habilitacao");
        // }


        boolean estaChovendo = false;
        boolean estaFrio = false;
        boolean estaComSol = false;

        if (estaComSol == true && estaFrio == false && estaChovendo == true) {
            System.out.println("nao esta chovendo e nem frio pode sair de regata");
        }else if(estaComSol == false || estaChovendo == true || estaFrio == true){
            System.out.println("nao esta com sol, mas esta chovendo ou com risco de chuva leve um guarda chuva");
        }


    }
}
