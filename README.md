# Conversor de Dólar para Real

Projeto simples em Java que calcula quanto será pago em reais na compra de dólares, incluindo 6% de IOF. O exercício pratica o uso de uma classe utilitária com membros estáticos.

## Como funciona

O programa solicita:

1. A cotação do dólar em reais.
2. A quantidade de dólares que será comprada.

Em seguida, calcula o total com a fórmula:

```text
total em reais = cotação do dólar × quantidade de dólares × (1 + IOF)
```

A taxa de IOF é de 6% (`0.06`). Por exemplo, com cotação de `3.10` e compra de `200` dólares, o total é `657.20` reais.

## Estrutura

- `src/application/Main.java`: lê os dados digitados e exibe o total.
- `src/util/CurrencyConverter.java`: define a taxa de IOF e calcula o valor final.

## Como executar

Abra o projeto no IntelliJ IDEA e execute a classe `application.Main`. Quando solicitado, informe a cotação e a quantidade de dólares. Use ponto como separador decimal, por exemplo, `3.10`.

Também é possível compilar e executar pelo terminal, a partir da pasta do projeto:

```bash
javac -d out src/util/CurrencyConverter.java src/application/Main.java
java -cp out application.Main
```

## Conceitos praticados

- Classes e métodos `static`.
- Constantes com `static final`.
- Entrada de dados com `Scanner`.
- Formatação de números com duas casas decimais.
