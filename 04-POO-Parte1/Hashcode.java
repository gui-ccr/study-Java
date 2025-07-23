// class Produto {
//     private String codigo;
//     private String nome;
//     private double preco;

//     public Produto(String codigo, String nome, double preco) {
//         this.codigo = codigo;
//         this.nome = nome;
//         this.preco = preco;
//     }

//     // Getters aqui...

//     @Override
//     public boolean equals(Object obj) {
//         // 1. Reflexividade: Verificar se é a mesma instância
//         if (this == obj) {
//             return true;
//         }
//         // 2. Nulidade e Tipo: Verificar se o objeto é nulo e se é da mesma classe
//         if (obj == null || getClass() != obj.getClass()) {
//             return false;
//         }
//         // 3. Cast: Converter para o tipo correto
//         Produto outroProduto = (Produto) obj;
//         // 4. Comparar atributos para igualdade lógica
//         return codigo.equals(outroProduto.codigo); // Assumimos que o código é único
//                                                   // Poderia comparar todos os atributos se necessário
//     }
// }



// import java.util.Objects; // Classe utilitária para gerar hashCode

// class Produto {
//     private String codigo;
//     private String nome;
//     private double preco;

//     public Produto(String codigo, String nome, double preco) {
//         this.codigo = codigo;
//         this.nome = nome;
//         this.preco = preco;
//     }

//     // Getters aqui...

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj) return true;
//         if (obj == null || getClass() != obj.getClass()) return false;
//         Produto outroProduto = (Produto) obj;
//         return codigo.equals(outroProduto.codigo); // Comparando apenas pelo código
//     }

//     @Override
//     public int hashCode() {
//         // Se equals() usa 'codigo', então hashCode() também deve usar 'codigo'.
//         // Objects.hash() é a forma mais segura e fácil de gerar um bom hash.
//         return Objects.hash(codigo);
//     }
// }
