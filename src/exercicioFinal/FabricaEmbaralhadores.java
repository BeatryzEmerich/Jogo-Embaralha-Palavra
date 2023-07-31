package exercicioFinal;

import java.util.Random;

public class FabricaEmbaralhadores {
    public Embaralhador getEmbaralhadorAleatorio() {
        Random random = new Random();
        int opcao = random.nextInt(2); // Número de implementações de Embaralhador disponíveis
        switch (opcao) {
            case 0:
                return new InverterEmbaralhador();
            case 1:
                return new PermutarEmbaralhador();
            // Adicione outros casos conforme novas implementações de Embaralhador
            // sejam criadas.
            default:
                return new InverterEmbaralhador(); // Retorna um valor padrão (caso algum erro ocorra)
        }
    }
}

