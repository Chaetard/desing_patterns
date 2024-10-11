# Patron Factory

Este patrón de diseño es uno de los más utilizados en la programación orientada a objetos. Su objetivo es proporcionar una interfaz para crear objetos de un tipo determinado sin especificar su clase concreta. 

En otras palabras, el patrón Factory permite a una clase delegar la creación de objetos a una o varias subclases. Esto se logra definiendo una interfaz común para crear objetos, pero permitiendo a las subclases alterar el tipo de objetos que se crearán.

## Estructura del Patrón

El patrón Factory se compone de los siguientes elementos:

- **Producto:** Define la interfaz de los objetos que el Factory puede crear.
- **Producto Concreto:** Implementa la interfaz del Producto.
- **Factory:** Declara un método para crear objetos del tipo Producto.
- **Factory Concreto:** Implementa el método de creación de objetos del tipo Producto.

## Ventajas y Desventajas

### Ventajas

- **Desacopla el código:** El patrón Factory permite desacoplar el código que crea objetos de los objetos reales, lo que facilita la modificación y extensión del sistema.

- **Simplifica la creación de objetos:** Al centralizar la creación de objetos en una sola clase, el código se vuelve más limpio y fácil de mantener.

- **Facilita la adición de nuevos productos:** Al utilizar el patrón Factory, es más sencillo añadir nuevos tipos de productos sin tener que modificar el código existente.

### Desventajas

- **Puede complicar el código:** En algunos casos, el uso excesivo del patrón Factory puede complicar el código y hacerlo más difícil de entender.

- **Requiere una jerarquía de clases:** Para implementar el patrón Factory, es necesario definir una jerarquía de clases que puede resultar innecesaria en algunos casos.

## Escenarios de Uso

El patrón Factory es útil en los siguientes escenarios:

- Cuando una clase no puede anticipar la clase de objetos que debe crear.

- Cuando una clase quiere delegar la responsabilidad de creación de objetos a una o varias subclases.


-En un ejemplo ambiguo y sin la complejidad de codigo podriamos decir que el patron factory es como si fuera una fabrica de juguetes por ejemplo, y tu eres un niño que requiere un juguete, lo que haces es ir a la fabrica y le dices al encargado que te de un juguete, el encargado te da el juguete que necesitas sin que tu sepas como se hizo, solo sabes que lo necesitas y lo obtienes.


# @Chaetard