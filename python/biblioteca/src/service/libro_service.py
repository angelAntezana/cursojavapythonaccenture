from domain.libro.libro import Libro
class LibroService:
    def __init__(self):
        pass

    def get_libro_by_nombre(self, libros: list[Libro], nombre) -> Libro:
        encontrado = [l for l in libros if l.nombre == nombre]
        return encontrado[0] if len(encontrado) == 1 else None
    