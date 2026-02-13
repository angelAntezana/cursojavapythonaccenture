class MaterialBiblioteca:
    def __init__(self, identificador):
        self.identificador = identificador

    def __str__(self):
        return f"{self.identificador}"
    

    def __repr__(self):
        return str(self)