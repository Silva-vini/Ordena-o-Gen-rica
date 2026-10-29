# Ordenação Genérica com Comparable

Exercício em Java que pratica a interface `Comparable` e a criação de métodos genéricos para ordenar e exibir listas de qualquer tipo.

## Sobre o projeto

Um pequeno sistema de estoque em que produtos são ordenados automaticamente pelo **preço, do menor para o maior**. A ordenação é feita por um método utilitário genérico, que pode ser reaproveitado com qualquer classe que saiba se comparar.

## Conceitos praticados

- Implementação da interface `Comparable<T>` em uma classe de domínio
- Métodos genéricos com tipo limitado (`<T extends Comparable<T>>`)
- Ordenação de coleções com `Collections.sort`
- Sobrescrita do método `toString()`
- Uso de `List` e `ArrayList`

## Estrutura

| Arquivo | Responsabilidade |
|---|---|
| `Produto.java` | Classe de domínio com `nome` e `preco`. Define o critério de ordenação (`compareTo`) e a exibição (`toString`). |
| `ListaUtil.java` | Classe utilitária com o método genérico estático `ordenarExibir`, que ordena e imprime qualquer lista de elementos comparáveis. |
| `Estoque.java` | Classe principal que monta uma lista de produtos fora de ordem e testa a ordenação. |

## Como executar

Pré-requisito: JDK 8 ou superior instalado.

```bash
javac *.java
java Estoque
```

## Resultado esperado

Os produtos são exibidos em ordem crescente de preço:

```
Nome: Sofa, Preço: 780.3
Nome: Iphone 13, Preço: 2599.99
Nome: Geladeira, Preço: 3826.41
Nome: Notebook, Preço: 5290.0
```

## Autor

Vini, estudante de Análise e Desenvolvimento de Sistemas e em transição para o desenvolvimento back-end Java.
