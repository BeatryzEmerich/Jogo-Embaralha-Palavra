package testes;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import exercicioFinal.PermutarEmbaralhador;

class PermutarEmbaralhadorTest {

    @Test
    public void testEmbaralhar() {
        PermutarEmbaralhador embaralhador = new PermutarEmbaralhador();

        // Teste com palavras de exemplo
        String palavra1 = "teste";
        String embaralhada1 = embaralhador.embaralhar(palavra1);
        assertTrue(palavra1.length() == embaralhada1.length() && !palavra1.equals(embaralhada1));

        String palavra2 = "abcd";
        String embaralhada2 = embaralhador.embaralhar(palavra2);
        assertTrue(palavra2.length() == embaralhada2.length() && !palavra2.equals(embaralhada2));

    }
}
