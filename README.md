Welcome to the Trunfo Game project! Please choose your preferred language to view the documentation:

- [Português](#jogo-trunfo---jogo-de-cartas-em-java)
- [English](#trunfo-game---card-game-in-java)




# **Jogo Trunfo - Jogo de Cartas em Java**

Este projeto implementa um jogo de cartas semelhante ao "Super Trunfo" em Java, onde o jogador compete contra o computador (COM). O jogo é baseado em atributos das cartas e é executado no terminal.

## **Índice**

- [Descrição do Projeto](#descrição-do-projeto)
- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Regras do Jogo](#regras-do-jogo)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Contribuições](#contribuições)
- [Criadores](#criadores)

## **Descrição do Projeto**

O projeto "Jogo Trunfo" é um jogo de cartas baseado no terminal onde o usuário joga contra o computador. Cada jogador tem um baralho de cartas e, a cada rodada, escolhe um atributo (como ataque, defesa, velocidade, etc.). O jogador com o maior valor vence a rodada. O jogo termina quando um jogador ganha 5 rodadas ou quando as cartas acabam.

## **Funcionalidades**

- Opção para inserir o nome do jogador.
- Exibição das cartas com seus atributos.
- Jogo contra o computador (COM), com seleção automática de atributos para o COM.
- Exibição do placar durante o jogo.
- Determinação automática do vencedor ao final do jogo.
- Saída colorida no terminal para destacar as ações do jogo.

## **Tecnologias Utilizadas**

- **Linguagem:** Java 8+
- **Entrada/Saída:** `Scanner` para entrada do jogador.
- **Cores no Terminal:** Códigos ANSI de escape.

## **Regras do Jogo**

1. O jogo é disputado entre dois jogadores: o jogador humano e o computador (COM).
2. Cada jogador possui um baralho de cartas com atributos como ataque, defesa, velocidade, etc.
3. A cada rodada, o jogador escolhe um atributo de sua carta atual.
4. O jogador com o maior valor no atributo escolhido vence a rodada e ganha um ponto.
5. O jogo continua até que um jogador ganhe 5 rodadas ou até que 10 rodadas sejam concluídas.
6. O vencedor é exibido ao final do jogo.

## **Contribuições**

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

1. Faça um fork do projeto.
2. Crie uma branch para suas alterações: `git checkout -b minha-feature`.
3. Comite suas alterações: `git commit -m 'Minha nova feature'`.
4. Faça o push para a branch: `git push origin minha-feature`.
5. Abra um Pull Request.

## **Estrutura do Projeto**

A estrutura do projeto é organizada da seguinte forma:

src/

├── trunfo/

│ ├── Colors.java - Definições de cores para o terminal

│ ├── Game.java - Lógica principal do jogo

│ ├── Player.java - Classe Player (jogador ou COM)

│ ├── Card.java - Classe Card com os atributos das cartas

## **Criadores**

Este projeto foi desenvolvido por:

- [Jean](https://github.com/JeanLima2112) - Desenvolvedor
- [Oliver](https://github.com/kenzoliver) - Desenvolvedor


# **Trunfo Game - Card Game in Java**

This project implements a card game similar to "Super Trunfo" in Java, where the player competes against the computer (COM). The game is based on the attributes of the cards and is executed in the terminal.

## **Table of Contents**

- [Project Description](#project-description)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Game Rules](#game-rules)
- [Project Structure](#project-structure)
- [Contributions](#contributions)
- [Creators](#creators)

## **Project Description**

The "Trunfo Game" project is a terminal-based card game where the user plays against the computer. Each player has a deck of cards, and in each round, they choose an attribute (such as attack, defense, speed, etc.). The player with the highest value wins the round. The game ends when a player wins 5 rounds or when the cards run out.

## **Features**

- Option to enter the player's name.
- Display of cards with their attributes.
- Play against the computer (COM), with automatic attribute selection for the COM.
- Score display during the game.
- Automatic determination of the winner at the end of the game.
- Colorful terminal output to highlight game actions.

## **Technologies Used**

- **Language:** Java 8+
- **Input/Output:** `Scanner` for player input.
- **Terminal Colors:** ANSI escape codes.

## **Game Rules**

1. The game is played between two players: the human player and the computer (COM).
2. Each player has a deck of cards with attributes such as attack, defense, speed, etc.
3. In each round, the player chooses an attribute from their current card.
4. The player with the highest value in the chosen attribute wins the round and earns a point.
5. The game continues until one player wins 5 rounds or until 10 rounds have been completed.
6. The winner is displayed at the end of the game.

## **Contributions**

Contributions are welcome! Feel free to open issues or submit pull requests.

1. Fork the project.
2. Create a branch for your changes: `git checkout -b my-feature`.
3. Commit your changes: `git commit -m 'My new feature'`.
4. Push to the branch: `git push origin my-feature`.
5. Open a Pull Request.

## **Project Structure**

The project structure is organized as follows:

src/

├── trunfo/ 

│ ├── Colors.java - Color definitions for the terminal

 │ ├── Game.java - Main game logic
 
  │ ├── Player.java - Player class (player or COM) 
  
  │ ├── Card.java - Card class with card attributes
## **Creators**

This project was developed by:

- [Jean](https://github.com/JeanLima2112) - Developer
- [Oliver](https://github.com/kenzoliver) - Developer