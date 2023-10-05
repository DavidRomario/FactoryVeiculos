# FactoryVeiculos - Exemplo de Padrão de Design Factory Method em Java

Este projeto é um exemplo simples do padrão de design Factory Method em Java, que permite criar objetos sem especificar suas classes concretas na chamada do método de criação. Neste caso, estamos criando fábricas para produzir diferentes tipos de veículos, como carros e motos.

## Estrutura do Projeto

O projeto é composto pelos seguintes componentes:

- `Veiculo`: Uma interface que define as operações básicas que um veículo deve ter, como acelerar, frear e virar.

- `Carro` e `Moto`: Classes concretas que implementam a interface `Veiculo` e representam tipos específicos de veículos.

- `FabricaVeiculo`: Uma interface que define o método de criação de veículos.

- `FabricaCarro` e `FabricaMoto`: Classes concretas que implementam a interface `FabricaVeiculo` e criam instâncias de carros e motos, respectivamente.

- `Main`: A classe principal do projeto, onde demonstramos como usar as fábricas para criar e operar veículos.

