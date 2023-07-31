package exercicioFinal;

import java.util.Random;

public class FabricaMecanicaDoJogo {
    public MecanicaDoJogo getMecanicaDoJogo() {
        Random random = new Random();
        int opcao = random.nextInt(2); // Número de implementações de MecanicaDoJogo disponíveis

        BancoDePalavras bancoDePalavras = new BancoDePalavras();
        FabricaEmbaralhadores fabricaEmbaralhadores = new FabricaEmbaralhadores();
        Embaralhador embaralhador = fabricaEmbaralhadores.getEmbaralhadorAleatorio();

        switch (opcao) {
            case 0:
                return new MecanicaSimples(bancoDePalavras, embaralhador);
            case 1:
                // Podemos configurar o número máximo de tentativas na mecânica avançada (por exemplo, 5).
                int maxTentativas = 5;
                return new MecanicaAvancada(bancoDePalavras, embaralhador, maxTentativas);
            // Adicione outros casos conforme novas implementações de MecanicaDoJogo
            // sejam criadas.
            default:
                return new MecanicaSimples(bancoDePalavras, embaralhador); // Retorna um valor padrão (caso algum erro ocorra)
        }
    }
}

