package testes;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import exercicioFinal.InverterEmbaralhador;

class InverterEmbaralhadorTest {

    @Test
    public void testEmbaralhar() {
        InverterEmbaralhador embaralhador = new InverterEmbaralhador();

        // Teste com palavras de exemplo
        assertEquals("odacraB", embaralhador.embaralhar("Barcado"));
        assertEquals("otuaM", embaralhador.embaralhar("Mauto"));
        assertEquals("aifargocixeL", embaralhador.embaralhar("Lexicografia"));
        assertEquals("naiborA", embaralhador.embaralhar("Arobian"));

        // Teste com palavras de tamanho 1
        assertEquals("A", embaralhador.embaralhar("A"));
        assertEquals("b", embaralhador.embaralhar("b"));
    }
}
