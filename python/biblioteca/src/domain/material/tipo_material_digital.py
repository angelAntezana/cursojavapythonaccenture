from enum import Enum
class TipoMaterialDigital(Enum):
    DOCUMENTO = "documento"
    AUDIO = "audio"
    VIDEO = "video"

    def __str__(self):
        return f"{self.value}"