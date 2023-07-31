package exercicioFinal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FabricaEmbaralhadores fabricaEmbaralhadores = new FabricaEmbaralhadores();
        BancoDePalavras bancoDePalavras = new BancoDePalavras();

        System.out.println("Bem-vindo ao Jogo de Palavras Embaralhadas!");
        System.out.println("Escolha o modo de jogo:");
        System.out.println("1 - Modo Simples");
        System.out.println("2 - Modo Avançado");
        System.out.print("Opção: ");
        int opcao = in.nextInt();

        MecanicaDoJogo mecanicaDoJogo;
        if (opcao == 1) {
            mecanicaDoJogo = new MecanicaSimples(bancoDePalavras, fabricaEmbaralhadores.getEmbaralhadorAleatorio());
        } else if (opcao == 2) {
            int maxTentativas = 5; // Defina o número máximo de tentativas desejado para o modo avançado
            mecanicaDoJogo = new MecanicaAvancada(bancoDePalavras, fabricaEmbaralhadores.getEmbaralhadorAleatorio(), maxTentativas);
        } else {
            System.out.println("Opção inválida. Escolhendo o Modo Simples por padrão.");
            mecanicaDoJogo = new MecanicaSimples(bancoDePalavras, fabricaEmbaralhadores.getEmbaralhadorAleatorio());
        }

        mecanicaDoJogo.iniciarJogo();

        // Caso queira exibir a pontuação final no final do jogo (apenas para MecanicaAvancada)
        if (mecanicaDoJogo instanceof MecanicaAvancada) {
            int pontuacaoFinal = ((MecanicaAvancada) mecanicaDoJogo).getPontuacaoFinal();
            System.out.println("Pontuação final: " + pontuacaoFinal);
        }
    }
}

