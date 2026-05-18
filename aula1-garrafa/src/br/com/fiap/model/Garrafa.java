package br.com.fiap.model;

/**
 * Classe Garrafa - representa uma garrafa no mundo real.
 * Aula 1: Classes e Objetos
 *
 * Uma classe é o MOLDE. O objeto é o que criamos a partir do molde.
 * Assim como uma garrafa de água é diferente de uma garrafa de suco,
 * mas ambas seguem o mesmo "molde" de garrafa.
 */
public class Garrafa {

    // Atributos - as CARACTERÍSTICAS da garrafa
    String marca;
    String material;   // vidro, plástico, alumínio...
    String cor;
    double capacidadeML;   // capacidade total em mililitros
    double conteudoAtualML; // quanto tem dentro agora
    boolean tampada;

    // Método para encher a garrafa
    void encher(double quantidade) {
        double espaco = capacidadeML - conteudoAtualML;
        if (quantidade > espaco) {
            System.out.println("Atenção: colocando apenas " + espaco + "ml (capacidade máxima).");
            conteudoAtualML = capacidadeML;
        } else {
            conteudoAtualML += quantidade;
            System.out.println("Garrafa enchida com " + quantidade + "ml.");
        }
    }

    // Método para beber/esvaziar parte da garrafa
    void beber(double quantidade) {
        if (!tampada) {
            if (quantidade > conteudoAtualML) {
                System.out.println("Não tem líquido suficiente! Restam apenas " + conteudoAtualML + "ml.");
                conteudoAtualML = 0;
            } else {
                conteudoAtualML -= quantidade;
                System.out.println("Bebeu " + quantidade + "ml. Restam: " + conteudoAtualML + "ml.");
            }
        } else {
            System.out.println("A garrafa está tampada! Abra antes de beber.");
        }
    }

    // Método para tampar/destampar
    void tampar() {
        tampada = true;
        System.out.println("Garrafa tampada.");
    }

    void abrir() {
        tampada = false;
        System.out.println("Garrafa aberta.");
    }

    // Método para exibir o estado atual da garrafa
    void exibirDados() {
        System.out.println("===== Garrafa =====");
        System.out.println("Marca:     " + marca);
        System.out.println("Material:  " + material);
        System.out.println("Cor:       " + cor);
        System.out.println("Capacidade: " + capacidadeML + " ml");
        System.out.println("Conteúdo:   " + conteudoAtualML + " ml");
        System.out.println("Tampada:    " + (tampada ? "Sim" : "Não"));
        System.out.println("===================");
    }
}
