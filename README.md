# Programación I - 2do Examen parcial

## Parte I

### Pregunta 1 - *(8 puntos)*

Durante estas semanas ha tenido la oportunidad de practicar y estudiar con los ejercicios propuestos en clase. Esta pregunta busca evaluar el trabajo continuo y la dedicación demostrados.

Proporcione evidencia de su trabajo personal durante este período mediante:

1. El enlace a su repositorio de GitHub donde haya estado trabajando los ejercicios.
1. Al menos tres commits significativos, realizados en diferentes días.
1. Código que demuestre que ha trabajado en los problemas propuestos.

#### Importante

- Los commits y el código deben haberse realizado entre el examen parcial y la fecha de este examen.
- La evidencia debe ser verificable (enlaces públicos a los repos).
- El código debe ser de su autoría.
- Se valorará especialmente:
  - La continuidad en el tiempo del trabajo realizado.
  - La solución trabajada del examen parcial y de los retos.
  - Soluciones alternativas a los retos resueltos en clase.
  - Solución a los retos extendidos.

#### Formato de respuesta

En un archivo en formato markdown, reemplazando el README.md de la raíz de su repositorio de entrega:

```text
Enlace al repositorio: [URL del repositorio]

Evidencias de trabajo:
1. [URL al commit 1] - [fecha] - [breve descripción]
2. [URL al commit 2] - [fecha] - [breve descripción]
3. [URL al commit 3] - [fecha] - [breve descripción]
4. ...

Ejercicios trabajados:
1. [Nombre del ejercicio 1] - [URL al código]
2. [Nombre del ejercicio 2] - [URL al código]
3. ...
4. ...
...
```

## Parte 2

|Para esta parte|Criterios de evaluación|
|-|-|
|No se admite código que no sea limpio, sencillo y elegante, acorde al estilo de desarrollo visto durante la asignatura.|Aplicación de los principios de vistos en clase.|
|No debe usar conceptos no vistos en clase.|Calidad y descriptividad de los commits realizados.|
|Debe entregarse en la carpeta /src de su repositorio de entrega.|Claridad del código resultante.|

### Pregunta 2 - *(4 puntos)*

La transformada de fourier es una herramienta matemática fundamental que permite descomponer una señal periódica en una suma de funciones sinusoidales simples. En el siguiente ejemplo se presenta una señal compuesta por tres armónicos.

<div align=center>

```math
\int_a^b 5 * (sin(x/1.59) + 0.33 * sin(3x/1.59) + 0.2 * sin(5x/1.59))
```

![](/images/transformadaFourier.png)

</div>

Proponga una solución que, para la fórmula indicada, resuelva la integral entre los puntos `a` y `b` (que son pedidos al usuario).

### Pregunta 3 - *(4 puntos)*

Cuatro niños suelen jugar al escondite en el parque de las llamas, donde hay seis sitios para esconderse: un árbol, un banco, un arbusto, un columpio, una caseta y un tobogán. 

Tres niños se esconden en ubicaciones aleatorias y el cuarto (orientado por el usuario) debe encontrarlos, teniendo un máximo de doce intentos. 

Cuando el usuario busca cerca del sitio en el que están, los niños tienen un 10% de probabilidades de ocultarse de modo que el usuario no los vea y por tanto no los encuentre.

Proponga una solución que permita jugar.

```
¡Los niños se han escondido!
1-Árbol 2-Banco 3-Arbusto 4-Columpio 5-Caseta 6-Tobogan
¿Dónde quieres buscar? 1
Has mirado en el Árbol... ¡Has encontrado al niño 3!
Llevas 1 intento y has encontrado 1 niño.

1-Árbol 2-Banco 3-Arbusto 4-Columpio 5-Caseta 6-Tobogan
¿Dónde quieres buscar? 2
Has mirado en el banco... ¡No hay nadie!
Llevas 2 intentos y has encontrado 1 niño.

1-Árbol 2-Banco 3-Arbusto 4-Columpio 5-Caseta 6-Tobogan
¿Dónde quieres buscar? 5
Has mirado en la caseta... ¡Has encontrado al niño 1!
Llevas 3 intentos y has encontrado 2 niños.
```

### Pregunta 4 - *(2 puntos)*

Proponga una solución que extienda el problema anterior para:

- Impedir que dos niños puedan esconderse en el mismo sitio.
- Agregar la probabilidad -en cada turno- de que un niño se ponga nervioso y antes de cada turno par pueda hacer un ruido que delate su posición: la probabilidad es del 5%.

### Pregunta 5 - *(2 puntos)*

Proponga una solución que extienda el problema anterior para:

- Permitir que en el turno 7 los niños cambien (sigilosamente) su ubicación. La probabilidad de querer intercambiar es del 30%.

### Pregunta 6 - *(4 puntos)*

Proponga una solución que simule la siguiente situación.

Un montacargas está instalado en un edificio en construcción de 10 plantas. Al inicio del día está situado en la planta 0 y un usuario elige una planta de destino, con lo cual el ascensor inicia su trayecto (subiendo o bajando). Cuando llega a su destino, se queda detenido esperando una nueva carga. Por limitaciones de diseño, el montacargas solo puede ser tomado en la planta en la que ha llegado, donde se repite la operación anterior (un usuario sube, elige a qué planta ir, el montacargas va...).

<div align=center>

<table>
<tr>
  <td align=center>Inicio</td>
  <td align=center>Subiendo a la planta 7</td>
  <td align=center>Bajando a la planta 3</td>
</tr>
<tr><td>
  
```text
9     |   |
8     |   |
7     |   |
6     |   |
5     |   |
4     |   |
3     |   |
2     |   |
1     |   |
0    [ --- ]
-----------------
```   
</td><td>

```text
9     |   |
8     |   |
7     |   |
6     |   |
5     |   |
4    [^ 7 ^]
3     |   |
2     |   |
1     |   |
0     |   |
-----------------
```
</td><td>

```text
9     |   |
8     |   |
7    [v 3 v]
6     |   |
5     |   |
4     |   |
3     |   |
2     |   |
1     |   |
0     |   |
-----------------
```
</td><tr>
</table></div>

### Pregunta 7 - *(2 puntos)*

Proponga una solución que extienda el problema anterior para:

- Conocer la carga que sube en el ascensor con cada llamada (la carga suele ser entre los 30 y 75 kilos).
- Saber la carga total transportada en el ascensor durante la simulación.

```text
9     |   |
8     |   |
7     |   |
6     |   |
5     |   |
4    [^ 7 ^]
3     |   |
2     |   |
1     |   |
0     |   |
-----------------
Ascensor transportando 45 kilos.
```
