# Aplicacion de Principios Solid

Para este proyecto se realizo el diseño de clases representativas de mamíferos que heredan a la clase principal mamífero
y se aplicaron interfacez que no pueden ser herdadas por todos los mamíferos. Además de las implementación de un observador el cual puede interactuar con las clases hijas de Mammal como si se tratase de la misma clase padre.

## SINGLE RESPONSABILITY PRINCIPLE: Las clases deben tener una unica responsabilidad debe realizar una unica tarea

la clase mammal brinda el comportamiento aplicable a todos los mamíferos, la clase grizzly instancia el comportamiento
del oso pardo unicamente, al igual que el resto de los animales herederos de la clase mamífero respectivamente, las       
interfaces son simples.

## Open-Closed Principle: Las clases deben estar cerradas a la modificación de sus datos y métodos pero abiertas a la extensión

El atributo de la mamifero no es accesible desde fuera exceptuando las clases derivadas, es solo editado por un método de
de la misma clase abstracta, pero la clase se extiende al resto de animales como el oso o el venando o el perro.

## Liskov Substitution Principle: Los métodos de las clases hijas deben poder usarse como las del padre sin afectar el correcto funcionamiento del programa

Se aplico Liskov mediante la implementacion de la clase observer la cual puede trabajar de manera indiferente con las clases hijas como si de la clase padre se tratase

## Interface Segregation Principle: Las interfaces deben satisfacer las necesidades del cliente no sobrecargarlos

Las interfaces del proyecto son en extremo simple, cumpliendo con esto este principio

## Dependency Inversion Principle: Las clases de alto nivel no deben depender de las de bajo nivel, deben depender de abstracciones.

Cumplimos con el principio de Inversion de dependencias puesto que la unica clase de alto nivel actual del proyecto que sería mamífero no depende de ninguna de sus clases hijas.