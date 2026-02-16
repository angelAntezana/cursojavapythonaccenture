from pathlib import Path

def ruta_por_defecto() -> Path:
    """Devuelve la ruta al passwods.txt"""
    return Path(__file__).resolve().parent / "data" / "passwords.txt"

def iter_comprometidas(ruta: Path | str | None = None):
    """recorre todo el fichero para devolver contraseñas 1 a 1"""
    ruta_final = Path(ruta) if ruta is not None else ruta_por_defecto()

    with ruta_final.open("r", encoding="utf-8", errors="ignore") as fichero:
        for linea in fichero:
            pwd = linea.strip()
            if pwd:
                yield 
                
def esta_comprometida_generador(password: str, ruta: Path | str | None = None):
    """Comprueba recorriendo línea a línea (memoria baja, más consumo por consulta)"""
    objetivo = password.strip()
    for pwd in iter_comprometidas(ruta):
        if pwd == objetivo:
            return True    
    return False


def cargar_comprometidas_set(ruta: Path | str | None = None) -> set[str]:
    """Carga todas en memoria en un set (memoria, consultas rápidas)"""
    return set(iter_comprometidas(ruta))


_COMPROMETIDAS_CACHE: set[str] | None = None

def esta_comprometida_cache(password: str, ruta: Path | str | None = None):
    global _COMPROMETIDAS_CACHE
    
    if _COMPROMETIDAS_CACHE is None:
        _COMPROMETIDAS_CACHE = cargar_comprometidas_set(ruta)

    return password.strip() in _COMPROMETIDAS_CACHE


def validar_password(password: str):
    pass