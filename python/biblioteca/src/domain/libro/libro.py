from ..material.material_biblioteca import MaterialBiblioteca
from ..obra.tipo_obra import TipoObra
class Libro:
    def __init__(self, nombre, autor, tipo_obra: TipoObra):
        self._nombre = nombre
        self._autor = autor
        self._tipo_obra = tipo_obra
        self._lista_materiales_bibliotecas: list[MaterialBiblioteca] = []

    @property
    def nombre(self):
        return self._nombre
    
    @nombre.setter
    def nombre(self, value):
        self._nombre = value

    @property
    def autor(self):
        return self._autor
    
    @autor.setter
    def autor(self, value):
        self._autor = value

    @property
    def tipo_obra(self):
        return self._tipo_obra
    
    @tipo_obra.setter
    def tipo_obra(self, value):
        self._autor = value
    @property
    def lista_materiales_bibliotecas(self):
        return self._lista_materiales_bibliotecas

    def __str__(self):
        return f"""
        Libro(
        nombre: {self.nombre},
        autor: {self.autor},
        tipo_obra: {self.tipo_obra}
        materiales_bibliotecas: {self.lista_materiales_bibliotecas})
        """
        # Hola Angel te estaba imprimiendo: 1984, Orwell, [<domain.material.material_digital.MaterialDigital object at 0x000001AA1D839A90>]
        # EL libro si tenía __str__ pero el problema es que las listas usan __repr__, no str, te he creado el método en material_biblioteca
        # EL error que me dada era por la variables que creo que habías empezado a hacerlas privadas. Te las he cambiado a publicas para 
        # poder ejecutar main, luego sigue con esa modificación.
   
    def __repr__(self):
       return f"{self}"
    
    def add_material_biblioteca(self, material_biblioteca = MaterialBiblioteca):
        self._lista_materiales_bibliotecas.append(material_biblioteca)

    def remove_material_biblioteca(self, material_biblioteca = MaterialBiblioteca):
        self._lista_materiales_bibliotecas.remove(material_biblioteca)
