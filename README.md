# Python Beginner
## Algoritmos

Algoritmos são os passo a passo que levamos para escrever um programa. Os algoritmos usam dos recursos computacionais para realizar certo passo a passo, esses recursos computacionais são conhecidos como memória e CPU. Para cada problema existe vários tipos de algoritmos que podem soluciona-lo por isso existe um cálculo de complexidade para calcular qual algoritmo tem o melhor desempenho e o menor consumo de recursos computacionais.

## Complexidade de algoritmos

**Complexidade de espaço:**
É relativo a quantidade de memória usada no programa.

**Complexidade de tempo:**
É relativo a quantidade de operações que estão sendo realizadas.

```
a = 5
b = 4
c = a+b
```
Neste exemplo podemos calcular a complexidade de espaço pelo número de variáveis declarada.

`Ex.: 1+1+1 - Complexidade de espaço`

Em termos de complexidade de tempo pode ser calculada pelo número de operações que no caso só temos uma operação.

`Ex.: 1 - Complexidade de tempo`

Ou Seja, um algoritmo bem feito vai rodar todas as ações muito mais otimizado e irá usar até menos recursos de sua máquina, por isso é tão importante estudar bem os algoritmos.

## Listas e alocação sequencial

Listas são uma estrutura de dados que guarda dados sequencialmente, onde podemos fazer algumas ações para buscar por um dado, remover dados, acrescentar dados e etc.

<img src="./images/lista.png" width="300"/>

Uma lista é armazenada sequencialmente na memória, caso essa lista seja de um tipo que ocupe 3 Bytes cada casa dessa lista será alocada de 3 em 3 Bytes na memória, isso para listas que tenham o mesmo tipo. Já para listas que contenha vários tipos diferentes dentro dela como inteiros, string, booleanos e etc, será um pouco diferente para alocar essa lista, pois como tem tipos diferentes terá tamanhos em Bytes diferentes e não será possível calcular a próxima casa da lista então para solucionar isso a lista usará ponteiros em vez do valor direto, com o ponteiro cada casa apontará para um endereço da memória que fica armazenado o valor referente aquela casa da lista.