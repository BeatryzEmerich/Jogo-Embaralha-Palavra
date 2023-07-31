package exercicioFinal;

import java.util.Random;

public class PermutarEmbaralhador implements Embaralhador {
    @Override
    public String embaralhar(String palavra) {
        char[] letras = palavra.toCharArray();
        Random random = new Random();

        for (int i = 0; i < letras.length; i++) {
            int indiceAleatorio = random.nextInt(letras.length);
            char temp = letras[i];
            letras[i] = letras[indiceAleatorio];
            letras[indiceAleatorio] = temp;
        }

        return new String(letras);
    }
}
