edificios = [
    "chalet",
    "rascacielos",
    "museo",
    "polideportivo"
]

copy_edificios = edificios.copy();

numeros = [1,2,3,4,5]

for num in numeros:
    print(f"{num}")

iterador = iter(numeros)

print(type(iterador))

print(f" next iterador = {next(iterador)}")
print(f" next iterador = {next(iterador)}")
print(f" next iterador = {next(iterador)}")
print(f" next iterador = {next(iterador)}")
print(f" next iterador = {next(iterador)}")

try:
    print(f"next iterador = {next(iterador)}")
except StopIteration:
    print("Se acabaron los elementos")


class ContadorHasta:
    """
    Un contador que se para en un número máximo
    """

    def __init__(self, maximo):
        self.maximo = maximo
        self.actual = 0

    def __iter__(self):
        return self
    
    def __next__(self):
        self.actual += 1
        if self.actual > self.maximo:
            raise StopIteration
        return self.actual
    

contador = ContadorHasta(50)

for num in contador:
    print(f" {num}")