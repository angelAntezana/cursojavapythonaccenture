from domain.libro.libro import Libro
from domain.material.material_digital import MaterialDigital
from domain.material.tipo_material_digital import TipoMaterialDigital
from domain.obra.tipo_obra import TipoObra

tipo_obra_novela = TipoObra.NOVELA
tipo_obra_comedia = TipoObra.COMEDIA
mi_libro = Libro("1984", "Orwell", tipo_obra_novela)
libro2 = Libro("La Metamorfosis", "Kafka", tipo_obra_novela)
libro3 = Libro("Tres sombreros de copa", "Mihura", tipo_obra_comedia)
material_digital = MaterialDigital(1, TipoMaterialDigital.DOCUMENTO)
lista_libros = [mi_libro, libro2, libro3]
mi_libro.add_material_biblioteca(material_digital)
mi_libro.add_material_biblioteca(material_digital)



print(mi_libro)
print(lista_libros)

