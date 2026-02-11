# 1. Definir la clase
class Libro:
    def __init__(self, nombre, autor):
        self.nombre = nombre
        self.autor = autor

 # Este es el toString() de Python
    def __str__(self):
        return f"{self.nombre}, {self.autor}"
    def saludar(self):
        return f"El autor del libro {self.nombre} es {self.autor}."