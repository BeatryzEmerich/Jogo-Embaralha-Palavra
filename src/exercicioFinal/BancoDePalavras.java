package exercicioFinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BancoDePalavras {
    private List<String> palavras;

    public BancoDePalavras() {
        palavras = new ArrayList<>();
        carregarPalavrasDoArquivo("palavras.txt"); // Nome do arquivo contendo as palavras
    }

    private void carregarPalavrasDoArquivo(String nomeArquivo) {
        try {
            // Obtém um InputStream para o arquivo de texto a partir do pacote
            InputStream inputStream = getClass().getResourceAsStream(nomeArquivo);
            if (inputStream != null) {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                    String linha;
                    while ((linha = reader.readLine()) != null) {
                        linha = linha.trim(); // Remover espaços em branco no início e no final da linha
                        if (!linha.isEmpty()) {
                            palavras.add(linha);
                        }
                    }
                }
            } else {
                System.out.println("Arquivo não encontrado: " + nomeArquivo);
                // Você pode tratar o erro de outra forma, lançar uma exceção ou lidar com o problema adequadamente.
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + nomeArquivo);
            e.printStackTrace();
            // Você pode tratar o erro de outra forma, lançar uma exceção ou lidar com o problema adequadamente.
        }
    }

    public String getPalavraAleatoria() {
        if (palavras.isEmpty()) {
            throw new IllegalStateException("Lista de palavras está vazia. Verifique se o arquivo foi carregado corretamente.");
        }

        int indiceAleatorio = (int) (Math.random() * palavras.size());
        return palavras.get(indiceAleatorio);
    }
}
