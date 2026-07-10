# 📝 Fundamentos da Programação Orientada a Objetos (POO) em Java - Parte 1

Este documento resume os principais conceitos de Programação Orientada a Objetos em Java que foram abordados, servindo como material de consulta rápida e reforço do aprendizado. A POO é um paradigma que organiza o software em torno de "objetos", tornando o código mais modular, reutilizável e manutenível.

---

## 🏗️ Conceitos Essenciais

### 1. Classes e Objetos: O Molde e a Materialização

* **Classes:** São os **projetos**, **moldes** ou **plantas** que definem a estrutura (atributos) e o comportamento (métodos) de um tipo de entidade. Não são executáveis por si só, apenas especificações.
* **Objetos:** São as **instâncias concretas** de uma classe. Criados com a palavra-chave `new`, ocupam espaço na memória e possuem seus próprios valores para os atributos, além de poderem executar os métodos definidos na classe.

### 2. Atributos e Métodos: O Estado e o Comportamento

* **Atributos:** Variáveis que representam as **características** ou o **estado** dos objetos de uma classe (ex: `nome`, `preco` de um `Produto`).
* **Métodos:** Funções que representam os **comportamentos** ou as **ações** que os objetos podem realizar (ex: `exibirDetalhes()` de um `Produto`).

### 3. Construtores: O Nascimento do Objeto

* Métodos especiais que inicializam um objeto no momento de sua criação (`new`). Possuem o mesmo nome da classe e não têm tipo de retorno.
* Permitem a **sobrecarga**, ou seja, múltiplos construtores com diferentes parâmetros para inicializar objetos de diversas maneiras.

---

## 🔒 Pilares da POO e Modificadores

### 4. Encapsulamento: Protegendo o Estado Interno

* Princípio de agrupar dados e métodos em uma classe e **restringir o acesso direto aos dados internos** (atributos).
* **Modificadores de Acesso:**
    * **`private`**: Acessível apenas dentro da **própria classe**. Essencial para proteger atributos, forçando o uso de Getters e Setters.
    * **`public`**: Acessível de **qualquer lugar**. Usado para a interface pública da classe (métodos).
* **Getters e Setters:** Métodos `public` usados para **obter** (Getters) e **modificar** (Setters) o valor de atributos `private` de forma controlada, permitindo validações.

### 5. A Palavra-Chave `static`: Membros da Classe

* Quando um atributo ou método é `static`, ele **pertence à CLASSE**, não a objetos individuais.
* **Atributos `static`**: Possuem uma **única cópia compartilhada** por todas as instâncias e pela própria classe (ex: constantes como `PI`).
* **Métodos `static`**: Podem ser chamados diretamente pela classe (`Classe.metodoStatic()`) sem a necessidade de criar um objeto. Não podem acessar membros não-estáticos.
* O método `main()` é `static` por ser o ponto de entrada da aplicação.

### 6. A Palavra-Chave `final`: Imutabilidade e Restrição

* **`final` com Variáveis:** Torna a variável uma **constante**, atribuível apenas uma vez.
* **`final` com Métodos:** Impede que o método seja **sobrescrito** por subclasses.
* **`final` com Classes:** Impede que a classe seja **herdada**.

---

## 🌳 Relações entre Classes e Abstração

### 7. Herança (`Inheritance`): Relação "É um tipo de"

* Permite que uma **subclasse** (`extends`) herde atributos e métodos de uma **superclasse**, promovendo reuso de código.
* A subclasse pode adicionar suas próprias características e comportamentos, e **sobrescrever** (redefinir) métodos da superclasse.
* Uma classe só pode estender **uma única superclasse**.

### 8. Polimorfismo (`Polymorphism`): "Muitas Formas"

* Capacidade de um objeto assumir **muitas formas**, permitindo que uma referência de um tipo pai aponte para objetos de diferentes tipos filhos, com o comportamento correto sendo determinado em tempo de execução.
* **Sobrecarga de Métodos (`Overloading`):** Múltiplos métodos com o mesmo nome, mas **parâmetros diferentes**. Decisão em tempo de **compilação**.
* **Sobrescrita de Métodos (`Overriding`):** Subclasse fornece sua própria implementação para um método da superclasse (`@Override`). Decisão em tempo de **execução**.

### 9. Interfaces: Relação "É capaz de fazer"

* Definem um **contrato de comportamento**. Contêm métodos abstratos (sem implementação) que **DEVEM** ser implementados por classes que as `implements`.
* Podem ter constantes (`public static final`) e, a partir do Java 8, métodos `default` (com implementação padrão, que podem ou não ser sobrescritos) e `static` (métodos utilitários da interface).
* Uma classe pode **implementar MÚLTIPLAS interfaces**, oferecendo flexibilidade para ter diversas "capacidades".

### 10. Enums (Enumerações): Constantes Nomeadas

* Um tipo especial de classe que representa um grupo fixo e finito de **constantes nomeadas** (ex: dias da semana, status de pedido).
* Melhoram a legibilidade e a segurança do tipo em comparação com constantes simples (`int`, `String`).
* Podem ter atributos, construtores e métodos, permitindo associar dados e comportamentos a cada constante.

---

## 🧬 Outros Conceitos Praticados no Módulo

### 11. `hashCode()` e `equals()`

* `equals()` define **quando dois objetos são considerados iguais em conteúdo** (por padrão, `Object.equals()` compara referência, igual ao `==`). Sobrescrever `equals()` permite dizer, por exemplo, que dois objetos `Produto` são "iguais" se tiverem o mesmo código.
* `hashCode()` gera um número (hash) usado por coleções baseadas em tabela hash (`HashMap`, `HashSet`) para organizar e localizar objetos rapidamente.
* **Regra de ouro:** sempre que `equals()` é sobrescrito, `hashCode()` também deve ser, de forma consistente — objetos considerados iguais por `equals()` **devem** ter o mesmo `hashCode()`. Quebrar essa regra causa bugs sutis em `HashMap`/`HashSet` (ex.: um objeto "sumir" de um `Set` mesmo estando lá).

### 12. Bloco de inicialização (`Initializer Block`)

* Um bloco `{ ... }` dentro da classe (fora de qualquer método) que roda **toda vez que um objeto é criado**, antes do construtor. Útil para lógica de inicialização compartilhada entre múltiplos construtores.

### 13. Records (Java 14+)

* `record` é uma forma compacta de declarar uma classe **imutável** focada em apenas carregar dados (um "carregador de dados"). O compilador gera automaticamente construtor, getters, `equals()`, `hashCode()` e `toString()` a partir dos campos declarados.
* Ideal para modelar dados simples (ex.: um `record Ponto(int x, int y)`) sem precisar escrever todo o código repetitivo de uma classe tradicional.

---

Com este sólido entendimento dos fundamentos da POO em Java, o próximo passo é aprofundar Herança, Polimorfismo e Interfaces no [Módulo 05](../modulo05_poo_parte02/README.md).

## Arquivos deste módulo

### `src/concepts`
| Arquivo | Conceito principal |
|---|---|
| `Carro.java` | Classes, atributos, métodos |
| `Construtor.java` | Construtores e sobrecarga |
| `Loja.java` | Encapsulamento (getters/setters) |
| `Hashcode.java` | `equals()` e `hashCode()` |
| `StatusPedido.java` | Enum simples |
| `TesteEnumAvancado.java` | Enum com atributos, construtor e métodos |

### `src/desafios`
| Arquivo | Conceito principal |
|---|---|
| `TestePessoa.java` | Classes e objetos básicos |
| `DadosAluno.java` | Atributos e encapsulamento |
| `Garagem.java` | Composição de objetos (`Carro` dentro de `Garagem`) |
| `TesteComputador.java` | Encapsulamento com getters/setters |
| `TesteAutocomplete.java` | Prática de métodos e atributos |
| `TesteCalculadoraGeometrica.java` | `static` (métodos utilitários sem estado) |
| `TesteFinalVariavel.java` | `final` em variáveis |
| `TesteInitializerBlock.java` | Bloco de inicialização |
| `TesteInterfaces.java` | Interfaces e contratos |
| `TesteEncademento.java` | Encadeamento de chamadas (method chaining) |
| `TesteRecordBasico.java` | `record` |

Veja também o [glossário de termos](../GLOSSARIO.md) para consulta rápida.
