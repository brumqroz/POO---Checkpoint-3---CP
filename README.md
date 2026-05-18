# Projeto Garrafa - Aula 1: Classes e Objetos

## Informações do Aluno

- **Nome:** [Seu Nome Completo]
- **RM:** [Seu RM]
- **Turma:** [Sua Turma]
- **Curso:** [Seu Curso]
- **GitHub:** [@seu-usuario]

---

## Descrição do Projeto

Este projeto foi desenvolvido como exercício prático da Aula 1 de Programação Orientada a Objetos, com o objetivo de demonstrar os conceitos fundamentais de **Classes** e **Objetos** em Java.

O domínio escolhido foi uma garrafa de água. A escolha foi intencional: uma garrafa é um objeto do cotidiano que qualquer pessoa conhece, tem características claras (marca, cor, capacidade) e comportamentos bem definidos (encher, beber, tampar, abrir). Isso torna a modelagem direta e fácil de validar mentalmente — se o código faz sentido com uma garrafa real, ele está correto.

---

## Estrutura do Projeto

```
aula1-garrafa/
    src/
        br/
            com/
                fiap/
                    model/
                        Garrafa.java
                    main/
                        Main.java
    README.md
```

---

## Como Compilar e Executar

**Pré-requisito:** JDK 8 ou superior instalado.

**1. Compilar:**
```bash
javac -d out src/br/com/fiap/model/Garrafa.java src/br/com/fiap/main/Main.java
```

**2. Executar:**
```bash
java -cp out br.com.fiap.main.Main
```

---

## Explicação do Código

### O que é uma Classe?

Uma classe é um molde. Ela descreve como um objeto deve ser: quais características ele tem e quais ações ele pode executar. A classe `Garrafa` não é uma garrafa — ela é a definição do que toda garrafa deve ter.

```java
public class Garrafa {
    String marca;
    String material;
    String cor;
    double capacidadeML;
    double conteudoAtualML;
    boolean tampada;
}
```

### O que é um Objeto?

Um objeto é uma instância concreta criada a partir da classe. Enquanto a classe é o molde, o objeto é a garrafa de verdade, existindo na memória do computador com valores próprios.

```java
Garrafa minhaGarrafa = new Garrafa();
minhaGarrafa.marca        = "Contigo";
minhaGarrafa.capacidadeML = 500.0;
```

### Atributos

Os atributos representam as características do objeto. Cada objeto criado a partir da classe `Garrafa` terá seu próprio conjunto de valores, independente dos outros objetos.

| Atributo | Tipo | Descrição |
|---|---|---|
| `marca` | String | Nome do fabricante da garrafa |
| `material` | String | Material de fabricação (vidro, plástico, alumínio) |
| `cor` | String | Cor da garrafa |
| `capacidadeML` | double | Volume máximo que a garrafa comporta, em mililitros |
| `conteudoAtualML` | double | Volume de líquido presente no momento |
| `tampada` | boolean | Indica se a garrafa está tampada ou aberta |

### Métodos

Os métodos representam os comportamentos do objeto. Eles definem o que a garrafa sabe fazer.

**`encher(double quantidade)`** — Adiciona líquido à garrafa. Verifica se a quantidade solicitada cabe; caso não caiba, enche até o limite máximo e informa o usuário.

**`beber(double quantidade)`** — Remove líquido da garrafa. Verifica se a garrafa está tampada antes de permitir a operação, e se há líquido suficiente para a quantidade solicitada.

**`tampar()`** — Fecha a garrafa, impedindo que se beba diretamente.

**`abrir()`** — Abre a garrafa, permitindo que se beba.

**`exibirDados()`** — Imprime no console o estado atual completo da garrafa.

### Dois Objetos, Uma Classe

Um dos pontos centrais da aula é que a mesma classe pode gerar múltiplos objetos completamente independentes. No `Main.java`, criamos dois objetos distintos:

```java
Garrafa minhaGarrafa  = new Garrafa(); // garrafa plástica de 500ml
Garrafa garrafaDeVidro = new Garrafa(); // garrafa de vidro de 1000ml
```

Ambos seguem o mesmo molde (`Garrafa`), mas são entidades separadas na memória. Alterar o conteúdo de uma não afeta a outra. A comparação `minhaGarrafa == garrafaDeVidro` retorna `false` porque são referências a endereços de memória diferentes.

---

## Saída Esperada do Programa

```
=== AULA 1: Classes e Objetos - Garrafa ===

>> Estado inicial:
===== Garrafa =====
Marca:      Contigo
Material:   Plástico
Cor:        Azul
Capacidade: 500.0 ml
Conteúdo:   0.0 ml
Tampada:    Não
===================

>> Enchendo com 300ml:
Garrafa enchida com 300.0ml.

>> Tampando a garrafa e tentando beber:
Garrafa tampada.
A garrafa está tampada! Abra antes de beber.

>> Abrindo e bebendo 150ml:
Garrafa aberta.
Bebeu 150.0ml. Restam: 150.0ml.

>> Tentando encher com 400ml (só cabe 200ml):
Atenção: colocando apenas 200.0ml (capacidade máxima).

>> Estado final:
===== Garrafa =====
Marca:      Contigo
Material:   Plástico
Cor:        Azul
Capacidade: 500.0 ml
Conteúdo:   350.0 ml
Tampada:    Não
===================

>> Criando uma segunda garrafa (mesmo molde, objeto diferente):
===== Garrafa =====
Marca:      Naaya
Material:   Vidro
Cor:        Transparente
Capacidade: 1000.0 ml
Conteúdo:   1000.0 ml
Tampada:    Sim
===================

São o mesmo objeto? false
(Mesmo MOLDE - classe Garrafa - mas objetos DIFERENTES na memória)
```

---

## Decisões de Projeto

**Por que os atributos não são `private`?**

Esta é a versão da Aula 1, que foca exclusivamente em Classes e Objetos. O encapsulamento com `private`, getters e setters é introduzido na Aula 3. Manter os atributos sem modificador de acesso permite acessá-los diretamente no `main` (`minhaGarrafa.marca = "Contigo"`), o que torna o código mais legível para quem está aprendendo o conceito pela primeira vez.

**Por que uma garrafa e não um objeto mais técnico?**

Objetos do cotidiano são mais eficazes para fixar o conceito de classe e objeto porque permitem validar o código com intuição: "faz sentido uma garrafa tampada não deixar beber?" — sim, faz. Essa validação mental é importante nas primeiras aulas.

---

## Pergunta de Reflexão

**Por que precisamos de uma classe `Garrafa` ao invés de criar variáveis soltas como `String marca = "Contigo"` e `double capacidade = 500.0` diretamente no `main`?**

Variáveis soltas funcionam para um único objeto em um programa pequeno. O problema aparece quando precisamos de mais de uma garrafa. Com variáveis soltas, teríamos `marcaGarrafa1`, `marcaGarrafa2`, `capacidadeGarrafa1`, `capacidadeGarrafa2` — para 10 garrafas, seriam 60 variáveis individuais sem nenhuma relação formal entre elas.

A classe resolve isso criando um tipo próprio. `Garrafa minhaGarrafa` agrupa automaticamente todos os 6 atributos em um único nome. Para 10 garrafas, usamos um array ou lista de `Garrafa` e um loop — o código não cresce com a quantidade de objetos.

Além disso, a classe une dados e comportamento. As variáveis soltas são apenas dados: `double conteudo = 300`. A classe `Garrafa` sabe o que fazer com esse dado — o método `beber()` valida se a garrafa está tampada, verifica se há conteúdo suficiente e atualiza o valor. Esse comportamento pertence à garrafa, não ao `main`.

---

*Bons estudos.*
