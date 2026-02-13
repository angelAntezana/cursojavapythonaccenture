from enum import Enum
class TipoObra(Enum):
    NOVELA = "Novela"
    COMEDIA = "Comedia"
    ENCICLOPEDIA = "Enciclopedia"
    TRATADO = "Tratado"
    CUENTO_INFANTIL = "Cuento infantil"

    def __str__(self):
        return f"{self.value}"