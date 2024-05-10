# INTRODUCCIÓN
La Prueba de la Parada es un problema matemático computacional, que propuesto por Alan Turing en 1936, busca determinar si un programa dado se detendrá después de ejecutarse durante un tiempo finito, o si entrará en un bucle infinito y nunca se detendrá. Esta es una cuestión clave en la teoría de la computación y la lógica computacional, ya que tiene implicaciones directas en la previsibilidad y seguridad de los programas informáticos.

# OBJETIVO
El objetivo de este proyecto, ha sido simular la Prueba de la Parada utilizando el Patrón de Diseño de Cadena de Responsabilidades para verificar el comportamiento de dos programas diferentes:
  -  ProgramaCountDown: Este programa realiza un conteo regresivo desde 10 hasta 0. Al alcanzar 0, el programa se detiene, lo que significa que el programa se considera que cumple con la condición de detención.
  -  ProgramaCountUp: Este programa realiza un conteo ascendente desde 0 hasta el infinito. El programa nunca se detiene, ya que el ciclo while siempre cumple la condición. Esto significa que el programa entra en un bucle infinito.

# ESTRUCTURA:
 - Interfaz Programa: Define el método contar(), que se implementará en las clases ProgramaCountDown y ProgramaCountUp.
 - Clases ProgramaCountDown y ProgramaCountUp: Implementan la interfaz Programa. ProgramaCountDown cuenta desde 10 hasta 0, y ProgramaCountUp cuenta desde 0 hasta el infinito.
 - Clase Manejador: Es una clase abstracta que define el método manejar() y tiene un atributo sucesor que representa el siguiente manejador en la cadena de responsabilidad.
 - Clases ManejadorCountDown y ManejadorCountUp: Heredan de Manejador y manejan los programas ProgramaCountDown y ProgramaCountUp, respectivamente.
 - Clase HaltChecker: Predice si un programa se detiene o no.
 - Clase Reverser: Utiliza la cadena de responsabilidad para decidir si un programa se detiene o no, y actúa en consecuencia. Puede ejecutar un bucle infinito si el programa se detiene o terminar inmediatamente si no se detiene.
 - Clase VistaUsuario: Representa la interfaz de usuario y permite al usuario elegir qué programa probar (CountUp o CountDown). Además, maneja la interacción con Reverser para mostrar los resultados en un área de texto.

# DOCUMENTACIÓN:
 - Pruebas Unitarias (@Test): Se han implementado pruebas unitarias utilizando la biblioteca JUnit. Estas pruebas comprueban el correcto funcionamiento de los métodos y clases del programa garantizando la precisión y robustez del código y ayudando a identificar y a corregir errores a medida que se desarrolla el sistema.
 - Diagrama UML: Se ha creado un diagrama UML que muestra la estructura del programa, incluyendo las clases, sus relaciones y herencias. Esto proporciona una visión general clara de cómo se organiza el código, ayudando a los desarrolladores a comprender mejor la arquitectura y facilitar la colaboración y el mantenimiento.
 - JavaDoc: El código está documentado con comentarios JavaDoc y con el correspondiente documento, lo que permite a otros desarrolladores comprender fácilmente los objetivos, parámetros y retornos de cada método y clase. Esta documentación mejora la legibilidad del código y hace que sea más fácil para otros desarrolladores utilizar y mantener el sistema principal.
   
Link al JavaDoc: http://localhost:63342/SamuelMunozVallejoExamenPatronesComportamiento/JavaDoc/index.html
Link al Repositorio: https://github.com/Samuu10/SamuelMunozVallejoExamenPatronesComportamiento.git
