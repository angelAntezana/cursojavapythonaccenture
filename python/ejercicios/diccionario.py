#Laboratorio de Programación: Introducción a los Diccionarios en Python
#En esta práctica vamos a trabajar con diccionarios. Un diccionario almacena información en forma de clave : valor.
#
#Si una lista es como una fila numerada y una tupla como una ficha fija, un diccionario es como una agenda: buscas por el nombre (clave) y obtienes el dato asociado (valor).
#
#No se permite usar comprensiones ni estructuras avanzadas. Trabajaremos con operaciones básicas.
#
#Parte 1: Ficha de un Videojuego
#Crea un diccionario llamado videojuego con la siguiente información:
#
#"titulo": "The Legend of Zelda"
#"plataforma": "Nintendo Switch"
#"anio": 2017
#"precio": 59.99
videojuego = {
        'titulo': 'The Legend of Zelda',
        'plataforma': 'Nintendo Switch',
        'anio': 2017,
        'precio': 59.99,
        }
#1. Acceso a datos
#Muestra el título.
print(videojuego.get('titulo'))
#Muestra el año de lanzamiento.
print(videojuego.get('anio'))
#Muestra el precio.
print(videojuego.get('precio'))
#Parte 2: Modificación de valores
#El precio baja a 49.99. Actualiza el diccionario.
videojuego['precio'] = 49.99
print(videojuego.get('precio'))
#Añade una nueva clave llamada "stock" con valor 25.
#Muestra el diccionario completo actualizado.
#Parte 3: Consulta segura
#Comprueba si existe la clave "descuento".
#Intenta obtener el valor de "descuento" usando .get().
#Explica qué diferencia hay entre acceder con diccionario["clave"] y usar .get().
#Parte 4: Recorrido del diccionario
#Recorre el diccionario mostrando solo las claves.
#Recorre el diccionario mostrando solo los valores.
#Recorre el diccionario mostrando clave y valor en el mismo print.
#(No uses comprensiones, solo bucles básicos.)
#
#Parte 5: Gestión de Estudiantes
#Crea un diccionario llamado notas con la siguiente información:
#
#"Ana": 8
#"Luis": 6
#"Marta": 9
#Tu tarea:
#Muestra la nota de Ana.
#Cambia la nota de Luis a 7.
#Añade un nuevo estudiante "Carlos" con nota 5.
#Elimina a Marta del diccionario.
#Muestra el diccionario final.
#Preguntas para pensar
#¿En qué casos es más útil un diccionario que una lista?
#¿Por qué las claves deben ser únicas?
#¿Qué ventajas tiene acceder por clave en lugar de por índice?
#Cuando termines deberías poder:
#
#Crear diccionarios.
#Acceder y modificar valores.
#Añadir y eliminar claves.
#Usar .get().
#Recorrer claves y valores.