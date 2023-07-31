package exercicioFinal;


import java.util.Scanner;

public class MecanicaAvancada implements MecanicaDoJogo {
    private BancoDePalavras bancoDePalavras;
    private Embaralhador embaralhador;
    private Scanner scanner;
    private int maxTentativas;
    private int pontuacao;

    public MecanicaAvancada(BancoDePalavras bancoDePalavras, Embaralhador embaralhador, int maxTentativas) {
        this.bancoDePalavras = bancoDePalavras;
        this.embaralhador = embaralhador;
        this.scanner = new Scanner(System.in);
        this.maxTentativas = maxTentativas;
        this.pontuacao = 0;
    }

    @Override
    public void iniciarJogo() {
        System.out.println("Bem-vindo ao Jogo de Palavras Embaralhadas (Modo Avançado)!");
        System.out.println("Você tem " + maxTentativas + " tentativas por palavra. Para sair do jogo, digite 'sair'.");

        while (true) {
            String palavra = bancoDePalavras.getPalavraAleatoria();
            String palavraEmbaralhada = embaralhador.embaralhar(palavra);
            System.out.println("Palavra embaralhada: " + palavraEmbaralhada);

            for (int tentativaAtual = 1; tentativaAtual <= maxTentativas; tentativaAtual++) {
                System.out.print("Tentativa " + tentativaAtual + ": ");
                String tentativa = scanner.nextLine();

                if (tentativa.equalsIgnoreCase("sair")) {
                    System.out.println("Até logo! Obrigado por jogar!");
                    return;
                }

                if (tentativa.equalsIgnoreCase(palavra)) {
                    int pontosTentativa = maxTentativas - (tentativaAtual - 1);
                    pontuacao += pontosTentativa;
                    System.out.println("Parabéns, você acertou! Pontos da tentativa: " + pontosTentativa);
                    break;
                } else {
                    System.out.println("Tente novamente!");
                }
            }
        }
    }

    public int getPontuacaoFinal() {
        return pontuacao;
    }
}
