# Advent of Code 2021

Este repositorio es el resultado de trabajo en equipo de [@AntonioSerranosp](https://github.com/AntonioSerranosp) y [@javadabadoo](https://github.com/javadabadoo) de los ejercicios de [Advent of Code 2021](https://adventofcode.com/2021/)

## [Day 1: Sonar Sweep](https://adventofcode.com/2021/day/1)

#### Parte 1
Iterar los valores de las medidas buscando los incrementos en las mediciones y llevar un conteo de los eventos

#### Parte 2
1. Recorrido de los valores de las medidas (measurements)
2. Indicar a que grupo le corresponde considerando el grupo (intersección entre numero de linea y columna).
    - Determinar el desplazamiento de las linea de acuerdo al indice de la columna. Ejemplo Columna 0 tiene desplazamiento 0. Columna 3, tiene desplazamiento 3
    - Calcular el numero de linea de grupo que le corresponde con la expresion `x % 4` (la linea cuyo modulo sea 0 no le pertenece a ningun grupo)
3. Tomar el valor del mapa que representa la sumatoria del grupo, si no existe, se crea con valor 0
4. Sumar el valor de la medida al valor de la sumatoria del grupo (obtenido previamente)
5. Recorrer el mapa de manera alfabetica para encontrar cuantas veces se incrementa el valor de la sumatoria de las medidas