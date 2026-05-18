package br.com.fiap.main;

import br.com.fiap.model.Garrafa;

/**
 * Classe principal - demonstra Aula 1: Classes e Objetos com Garrafa.
 *
 * Compilar:
 *   javac -d out src/br/com/fiap/model/Garrafa.java src/br/com/fiap/main/Main.java
 * Rodar:
 *   java -cp out br.com.fiap.main.Main
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== AULA 1: Classes e Objetos - Garrafa ===\n");

        // Criando o OBJETO a partir da CLASSE (molde)
        Garrafa minhaGarrafa = new Garrafa();

        // Definindo os atributos do objeto
        minhaGarrafa.marca          = "Contigo";
        minhaGarrafa.material       = "Plástico";
        minhaGarrafa.cor            = "Azul";
        minhaGarrafa.capacidadeML   = 500.0;
        minhaGarrafa.conteudoAtualML = 0.0;
        minhaGarrafa.tampada        = false;

        // Exibindo estado inicial
        System.out.println(">> Estado inicial:");
        minhaGarrafa.exibirDados();

        // Enchendo a garrafa
        System.out.println("\n>> Enchendo com 300ml:");
        minhaGarrafa.encher(300.0);

        // Tampando e tentando beber
        System.out.println("\n>> Tampando a garrafa e tentando beber:");
        minhaGarrafa.tampar();
        minhaGarrafa.beber(100.0);

        // Abrindo e bebendo
        System.out.println("\n>> Abrindo e bebendo 150ml:");
        minhaGarrafa.abrir();
        minhaGarrafa.beber(150.0);

        // Tentando encher além da capacidade
        System.out.println("\n>> Tentando encher com 400ml (só cabe 200ml):");
        minhaGarrafa.encher(400.0);

        // Estado final
        System.out.println("\n>> Estado final:");
        minhaGarrafa.exibirDados();

        // -----------------------------------------------
        // Segundo objeto - mesma CLASSE, outro objeto!
        // -----------------------------------------------
        System.out.println("\n>> Criando uma segunda garrafa (mesmo molde, objeto diferente):");
        Garrafa garrafaDeVidro = new Garrafa();
        garrafaDeVidro.marca           = "Naaya";
        garrafaDeVidro.material        = "Vidro";
        garrafaDeVidro.cor             = "Transparente";
        garrafaDeVidro.capacidadeML    = 1000.0;
        garrafaDeVidro.conteudoAtualML = 1000.0;
        garrafaDeVidro.tampada         = true;

        garrafaDeVidro.exibirDados();

        System.out.println("\nSão o mesmo objeto? " + (minhaGarrafa == garrafaDeVidro));
        System.out.println("(Mesmo MOLDE - classe Garrafa - mas objetos DIFERENTES na memória)");
    }
}
