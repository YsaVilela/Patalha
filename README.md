
# Patalha

Este projeto foi desenvolvido por **Ysadora Vilela** e **Gustavo Nicacio**.

## Descrição do Jogo

A "Patalha" é um jogo simples de estratégia desenvolvido em Java. O objetivo é que cada jogador utilize sua habilidade de escolha para selecionar o melhor pato em competições durante 10 rodadas. Ao final dessas rodadas, o jogador com o melhor desempenho será o vencedor.

## Regras do Jogo

1. **Distribuição de Patos:**
   - No início da partida, o jogador e o robô recebem 10 patos aleatórios. Cada pato possui 3 atributos: canto, voo e beleza.
   
2. **Rodadas:**
   - O jogo acontece em 10 rodadas.
   - Em cada rodada, o jogador escolhe:
      - A modalidade de competição, que pode ser baseada em uma das habilidades dos patos (canto, voo ou beleza).
      - O pato que ele deseja utilizar para competir na modalidade escolhida.
   - O robô, de forma automática, seleciona um dos seus patos para disputar a rodada contra o pato escolhido pelo jogador.

3. **Modalidades de Competição:**
   - As modalidades de competição são baseadas nos atributos dos patos:
    - Canto: Qual pato canta melhor.
    - Voo: Qual pato voa mais alto ou rápido.
    - Beleza: Qual pato é o mais bonito.

4. **Decisão do Vencedor da Rodada:**
   - A cada rodada, o desempenho dos patos é comparado com base no atributo da modalidade escolhida. O pato com o maior valor no atributo vence a rodada.

5. **Final do Jogo:**
   - Após 10 rodadas, o jogo declara o vencedor com base no número de rodadas vencidas por cada participante.

## Estrutura do Código

- **Classe `Pato`**: Representa um pato com atributos específicos para diferentes modalidades.
- **Classe `Jogador`**: Controla os patos do jogador e permite a escolha de patos para as rodadas.
- **Classe `Robo`**: Oponente automático que escolhe os patos adversários nas rodadas.
- **Classe `Patalha`**: Gerencia a lógica das rodadas e modalidades.
- **Classe `Placar`**: Gerencia a pontuação dos participantes e rodada atual.

## Como Executar

1. Clone o repositório: 
   ```bash
   git clone https://github.com/YsaVilela/Patalha.git
   ```
2. Compile o código:
   ```bash
   javac Patalha.java
   ```
3. Execute o jogo:
   ```bash
   java Patalha
   ```

## Melhorias Futuras

- Implementação de mais modalidades de competição.
- Melhoria na lógica de seleção do robô.
- Implementação de uma interface gráfica.
