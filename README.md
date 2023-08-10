# Jogo de Palavras Embaralhadas
Este é um simples jogo de palavras embaralhadas, onde o jogador deve adivinhar a palavra correta a partir das letras embaralhadas.

# Como Jogar
 Execute a classe Principal para começar o jogo. Você será apresentado com uma palavra embaralhada e deve tentar adivinhar a palavra correta. Você pode fazer isso no console, digitando sua resposta e pressionando Enter.

# Componentes do Jogo
 O jogo é composto por várias classes, cada uma com responsabilidades específicas:

Principal: Classe que contém o método main(), responsável por interagir com o jogador e iniciar o jogo.

BancoDePalavras: Classe que fornece palavras aleatórias de uma lista lida a partir de um arquivo.

Embaralhador: Interface que define métodos para embaralhar palavras. Existem pelo menos duas implementações dessa interface.

FabricaEmbaralhadores: Classe que retorna uma implementação de Embaralhador de forma aleatória.

MecanicaDoJogo: Interface que controla o andamento e a lógica do jogo, determinando quando o jogo termina, se o jogador acertou a palavra, etc. Existem pelo menos duas implementações dessa interface.

FabricaMecanicaDoJogo: Classe que retorna uma implementação de MecanicaDoJogo a ser utilizada.
