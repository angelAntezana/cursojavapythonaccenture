from .material_biblioteca import MaterialBiblioteca
from .tipo_material_digital import TipoMaterialDigital

class MaterialDigital(MaterialBiblioteca):
    URL_BASE_MATERIALES_DIGITALES = 'https://test?resource_id='

    def __init__(self, identificador, tipo_material_digital = TipoMaterialDigital):
        super().__init__(identificador)
        self.tipo_material_digital = tipo_material_digital
    
    def __str__(self):
        return f"""
        MaterialBiblioteca(
        identificador: {self.identificador},
        tipo_material_digital: {self.tipo_material_digital})
        """
    
    def get_resource(self):
        return f"{self.URL_BASE_MATERIALES_DIGITALES}{self.identificador}"
    