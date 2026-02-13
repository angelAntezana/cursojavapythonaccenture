#Crea una tupla llamada libro con esta información:
#
#("Cien años de soledad", "Gabriel García Márquez", 1967, 471)
#
#Tareas
#Muestra el título.
#Muestra el número de páginas.
#Muestra el último elemento usando índice negativo.
#Muestra los dos primeros elementos usando slicing.
#Muestra cuántos elementos tiene la tupla.
#Comprueba si 1967 está dentro.
#Cuenta cuántas veces aparece el autor.
#Pista: Usa len(), in, count() y slicing [:].

libros = ("Cien años de soledad", "Gabriel García Márquez", 1967, 471)
print(libros[0])
print(libros[-1])
print(libros[0:2])
print(f"Numero de elementos: {len(libros)}")
print(f"1967 está en la tupla: {libros.__contains__(1967)}")
print(f"Numeor de veces que aparece el autor: {libros.count('Gabriel García Márquez')}")

#Parte 2: Coordenadas
#Cada punto del plano se representa como (x, y).
#
#Crea:
#
#punto = (4, -3)
#Tareas
#Desempaqueta la tupla en x e y.
#Muestra ambas variables.
#Intenta modificar x dentro de la tupla.
#Describe el error.
punto = (4, -3)
x = punto[0]
y = punto[1]
print(f"Coordenadas: {x} {y}")
#punto[0] = 5
#Al asignar un nuevo valor a un elemento de la tupla nos sale TypeError
#  indicando que el object no soporta asignaciones de elemento






#Parte 3: Tuplas anidadas (grupo de estudiantes)
#Define una única tupla llamada estudiantes que contenga:
#
#("Ana", 17, "Biología") ("Luis", 18, "Historia") ("Marta", 17, "Matemáticas")
#
#Es decir, una tupla de tuplas.
#
#Tareas
#Muestra la edad de Luis.
#Muestra la asignatura de Marta.
#Comprueba si existe algún estudiante llamado "Ana".
#Muestra cuántos estudiantes hay.
#Muestra solo los nombres.
#Pistas:
#
#Accede primero al estudiante: estudiantes[1]
#Luego al dato interno: [1]
#Para los nombres: accede siempre al índice 0 de cada subtupla.
def comprobar(nombre):
    if (nombre == "Ana"):
        print("Ana existe")
    else:
        print("Ana no existe")

estudiantes = ("Ana", 17, "Biología"), ("Luis", 18, "Historia") ,("Marta", 17, "Matemáticas")

pos = tuple(elemento[0] for elemento in estudiantes if comprobar(elemento[0]))
print(pos)












#SOLUCIÓN 
#Parte 1 libro
#libro = ("Cien años de soledad", "Gabriel García Márquez", 1967, 471)
#
#print(libro[0])          # título
#print(libro[3])          # páginas
#print(libro[-1])         # último elemento
#print(libro[:2])         # dos primeros
#print(len(libro))        # número de elementos
#print(1967 in libro)     # comprobar año
#print(libro.count("Gabriel García Márquez"))
#
#=========
#
#punto = (4, -3)
#
#x, y = punto
#print(x)
#print(y)
#
#
#============
#
#estudiantes = (
#    ("Ana", 17, "Biología"),
#    ("Luis", 18, "Historia"),
#    ("Marta", 17, "Matemáticas")
#)
#
#print(estudiantes[1][1])   # edad de Luis
#print(estudiantes[2][2])   # asignatura de Marta
#
#print("Ana" in estudiantes[0])
#print(len(estudiantes))
#
## Mostrar solo nombres
#print(estudiantes[0][0])
#print(estudiantes[1][0])
#print(estudiantes[2][0])
#
#=============
#unión
#
#grupo1 = ("Ana", "Luis")
#grupo2 = ("Marta", "Carlos")
#
#grupo_total = grupo1 + grupo2
#print(grupo_total)
#print("Carlos" in grupo_total)
#
#===== 
#búsqueda
#
#numeros = (5, 2, 8, 2, 9, 2)
#
#print(numeros.count(2))
#print(numeros.index(2))
#
#==========
#comparación
#a = (1, 2, 3)
#b = (1, 2, 4)
#
#print(a < b)