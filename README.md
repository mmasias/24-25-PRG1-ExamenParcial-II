# Programación I - 2do Examen parcial

## Pregunta 1 - 8 puntos.

Quiero reconocer el esfuerzo de aquellos que han dedicado tiempo a estudiar adecuadamente, practicar las actividades propuestas y preparar este examen. Para ello:

- Proporcione enlace(s) a los repositorios donde haya trabajado en los ejercicios o proyectos relacionados con la materia.
- Asegúrese que los repositorios contengan:
  - Commits recientes que reflejen su progreso.
  - Código funcional o en desarrollo relacionado con los temas estudiados. Entre ellos:
    - La solución trabajada del examen parcial y de los retos.
    - Soluciones alternativas a los retos resueltos en clase.
    - Solución a los retos extendidos.
  - Documentación adicional que demuestre su proceso de aprendizaje.

Se valorará positivamente el uso de las buenas prácticas de programación que hemos ido viendo durante la asignatura. 

La evidencia debe ser clara y verificable. No se considerarán repositorios sin actividad reciente o trabajos que no reflejen su esfuerzo.

## Pregunta 2 - 4 puntos.

La transformada de fourier es una herramienta matemática fundamental que permite descomponer una señal periódica en una suma de funciones sinusoidales simples. En el siguiente ejemplo se presenta una señal compuesta por tres armónicos.

<div align=center>

```math
\int_a^b 5 * (sin(x/1.59) + 0.33 * sin(3x/1.59) + 0.2 * sin(5x/1.59))
```

![](/images/transformadaFourier.png)

</div>

Proponga un código **limpio, sencillo y elegante** que resuelva la integral entre los puntos `a` y `b` (que son pedidos al usuario).

## Pregunta 3 - 4 puntos.

Cuatro niños suelen jugar al escondite en el parque de las llamas, donde hay seis sitios para esconderse: un árbol, un banco, un arbusto, un columpio, una caseta y un tobogán. Tres niños se esconden en ubicaciones aleatorias y el cuarto (orientado por el usuario) debe encontrarlos, teniendo un máximo de diez intentos. Cuando el usuario busca en un sitio en el que están, los niños tienen un 10% de ocultarse de modo que el usuario no los encuentre.

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

Proponga un código **limpio, sencillo y elegante** que permita jugar.

## Pregunta 4 - 2 puntos.

Extienda el problema anterior para:

- Impedir que dos niños puedan esconderse en el mismo sitio
- Agregar la probabilidad -en cada turno- de que un niño se ponga nervioso y antes de cada turno par pueda hacer un ruido que delate su posición: la probabilidad es del 5%.

Proponga un código **limpio, sencillo y elegante** que extienda el problema anterior.
