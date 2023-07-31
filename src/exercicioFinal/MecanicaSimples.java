package exercicioFinal;

import java.util.Scanner;

public class MecanicaSimples implements MecanicaDoJogo {
    private BancoDePalavras bancoDePalavras;
    private Embaralhador embaralhador;
    private Scanner scanner;

    public MecanicaSimples(BancoDePalavras bancoDePalavras, Embaralhador embaralhador) {
        this.bancoDePalavras = bancoDePalavras;
        this.embaralhador = embaralhador;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void iniciarJogo() {
        System.out.println("Bem-vindo ao Jogo de Palavras Embaralhadas (Modo Simples)!");
        System.out.println("Para sair do jogo, digite 'sair'.");

        while (true) {
            String palavra = bancoDePalavras.getPalavraAleatoria();
            String palavraEmbaralhada = embaralhador.embaralhar(palavra);
            System.out.println("Palavra embaralhada: " + palavraEmbaralhada);

            System.out.print("Digite sua tentativa: ");
            String tentativa = scanner.nextLine();

            if (tentativa.equalsIgnoreCase("sair")) {
                System.out.println("Até logo! Obrigado por jogar!");
                break;
            }

            if (tentativa.equalsIgnoreCase(palavra)) {
                System.out.println("Parabéns, você acertou!");
            } else {
                System.out.println("Tente novamente!");
            }
        }
    }
}
