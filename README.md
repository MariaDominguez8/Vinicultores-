# Vinicultores-
Ejercicios en Java utilizando métodos y estructuras de control de tipo If

Ejercicio a resolver : 
La asociación de vinicultores tiene como política fijar un precio inicial al kilo de
uva, la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la
venta del producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto
recibirá un productor por la uva que entrega en un embarque, considerando lo siguiente:
si es de tipo A, se le cargan 20$ al precio inicial cuando es de tamaño 1; y 30$ si es de
tamaño 2. Si es de tipo B, se rebajan 30$ cuando es de tamaño 1, y 50$ cuando es de
tamaño 2. Realice un algoritmo para determinar la ganancia obtenida.

Paso a paso de como se penso en resolver el ejercicio : 

1 - Definimos las variables con su tipo de dato a utilizar en el programa para poder resolver el problema.
2 - Enviamos un mensaje por consola al usuario para que ingrese los datos correspondientes.
3 - Creamos un método para leer cada valor que viene por consola (porque todos los valores que ingresan por consola
son de tipo String) y lo convertimos al tipo de dato que necesitamos utilizar. Al fragmentar partes de código y almacenarlas
en un método, luego podemos reutilizar el código en distintas partes del programa y haciendo que éste sea más legible y prolijo.  
4 - Creamos el método calcularGanancia y le pasamos como párametros las variables y sus tipos de datos que necesitamos
para poder hacer el calculo. 
En él utilizamos la estructura de control de tipo if para definir el calculo a utilizar
dependiendo de los datos que ingrese el usuario por consola y definimos variables extras que necesitemos.
Ej : Si el tipo de uva es A y el tamaño es 1, al precio inicial se le va a sumar $20. 
Al final del método, vamos a hacer el calculo de la ganancia y se lo asignaremos a esa variable para que luego sea retornada.
5 - Volviendo al método main (que es el que ejecuta el programa), a la variable ganancia se le asigna el método calcularGanancia 
y se le pasan por párametros las variables (datos) necesarios para poder ejecutar el método, realizar el calculo en este caso. 
Luego finalizamos el programa enviando un mensaje al usuario por consola, informandole de cuanto sería su ganancia. 




