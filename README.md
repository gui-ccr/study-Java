# ☕ Jornada Java: Do Zero ao Avançado

**Um repositório pessoal para registrar e solidificar meus estudos na linguagem Java, com foco em Orientação a Objetos.**

[![Java](https://img.shields.io/badge/Language-Java-blue.svg)](https://www.java.com/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Status do Projeto](https://img.shields.io/badge/status-finalizado-green.svg)](#-status-do-projeto)

## 📖 Sobre o Projeto

Este repositório é o meu diário de bordo no universo Java. Ele é um guia de
estudos granular, organizado por módulos, do zero absoluto até tópicos de
Programação Orientada a Objetos mais avançados (concorrência, tratamento de
exceções). Cada módulo contém:

- Um **`README.md` de estudo**, explicando os conceitos com exemplos e
  comentários — não apenas um índice de arquivos.
- `src/concepts/` — exemplos de código focados em demonstrar um conceito.
- `src/desafios/` — exercícios práticos que aplicam esses conceitos.

Também há um [**glossário de termos**](GLOSSARIO.md) na raiz do repositório,
para consulta rápida de definições de Java e POO.

O conteúdo é voltado para quem está na mesma jornada — **desenvolvedores,
estudantes de programação e recrutadores** — que queiram acompanhar meu
progresso ou revisitar conceitos fundamentais da linguagem.

## 📚 Módulos do Curso

| Módulo | Conteúdo | Guia |
|---|---|---|
| 01 — Fundamentos | Sintaxe básica, tipos primitivos, variáveis, constantes, operadores, Strings, entrada/saída com `Scanner` | [README](modulo01_fundamentos/README.md) |
| 02 — Controle de Fluxo | Operadores relacionais/lógicos, `if`/`else`/`switch`, laços `for`/`while`/`do-while` | [README](modulo02_controle_fluxo/README.md) |
| 03 — Estruturas de Dados | Arrays, Java Collections Framework (`List`, `Set`), `Map`/`HashMap` | [README](modulo03_estruturas_dados/README.md) |
| 04 — POO Parte 1 | Classes, objetos, atributos, métodos, construtores, encapsulamento, `static`, `final`, herança, polimorfismo, interfaces, enums, `hashCode`/`equals`, records | [README](modulo04_poo_parte1/README.md) |
| 05 — POO Parte 2 | Herança, polimorfismo/`@Override`, classes abstratas e interfaces (teoria), Threads e condições de corrida (prática) | [README](modulo05_poo_parte02/README.md) |
| 06 — Exceções | `try`/`catch`/`finally`, checked vs unchecked, `try-with-resources`, exceções customizadas com `throw` | [README](modulo06_excecoes/README.md) |
| 07 — JavaFX | Interfaces gráficas (GUI): `Application`, `Stage`, `Scene`, `Node`, layouts (`VBox`/`HBox`/`GridPane`/`BorderPane`), componentes, eventos e binding básico | [README](modulo07_javafx/README.md) |

## 💻 Status do Projeto

O projeto está **em pleno desenvolvimento**. Os módulos de Fundamentos,
Controle de Fluxo, Estruturas de Dados e POO Parte 1 estão bem
estabelecidos; POO Parte 2, Exceções e JavaFX seguem em expansão.

## 🛠️ Tecnologias Utilizadas

* **Java:** A linguagem principal usada para todos os códigos e exemplos.
* **Git & GitHub:** Para controle de versão e gerenciamento do repositório.

## 🚀 Instalação e Uso

Você pode facilmente executar os códigos deste repositório em sua máquina local.

1.  **Clone o repositório:**
    ```sh
    git clone https://github.com/gui-ccr/study-Java.git
    ```
2.  **Navegue até a pasta do código de um módulo:**
    ```sh
    cd study-Java/modulo01_fundamentos/src
    ```
3.  **Compile o arquivo `.java`:**
    ```sh
    javac HelloWorld.java
    ```
4.  **Execute o programa:**
    ```sh
    java HelloWorld
    ```

    > Para arquivos com `package` declarado (ex.: `package src.concepts;`),
    > compile/execute a partir da raiz do módulo (onde a pasta `src` fica),
    > usando o nome totalmente qualificado, ex.: `java src.concepts.Maps`.

## 🤝 Como Contribuir

Apesar de ser um repositório de estudos pessoais, sugestões e correções são sempre bem-vindas! Se você encontrar um erro ou tiver uma ideia para melhorar um código, sinta-se à vontade para contribuir.

1.  **Faça um Fork** do projeto.
2.  **Crie uma nova Branch** (`git checkout -b feature/MelhoriaIncrivel`).
3.  **Faça o Commit** de suas alterações (`git commit -m 'Adiciona MelhoriaIncrivel'`).
4.  **Faça o Push** para a Branch (`git push origin feature/MelhoriaIncrivel`).
5.  **Abra um Pull Request**.

## 👤 Autor

| Foto de Perfil | Nome (Clique para visitar) | Responsabilidade |
|:---:|---|---|
| <img src="https://github.com/gui-ccr.png" width="100" alt="Foto do Guilherme" style="border-radius: 50%;"> | [**Guilherme (gui-ccr)**](https://github.com/gui-ccr) | Autor |

## 📄 Licença

Este projeto está distribuído sob a licença MIT.
