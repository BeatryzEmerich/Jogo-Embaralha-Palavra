package exercicioFinal;

public class InverterEmbaralhador implements Embaralhador {
    @Override
    public String embaralhar(String palavra) {
        StringBuilder resultado = new StringBuilder();
        for (int i = palavra.length() - 1; i >= 0; i--) {
            resultado.append(palavra.charAt(i));
        }
        return resultado.toString();
    }
}



