def generar_usuarios(n):
    # Produce: user001, user002, user003...
    for i in range(1, n + 1):
        yield f"user{i:03d}"


def buscar_con_generador(objetivo, n):
    for usuario in generar_usuarios(n):
        print("Revisando:", usuario)  # para ver el recorrido
        if usuario == objetivo:
            return True
    return False


def construir_set(n):
    base = set(generar_usuarios(n))
    return base

objetivo = "user007"
esta = buscar_con_generador(objetivo, 10)
print("\n¿Encontrado?", esta)


#CON SET
base = construir_set(10)
print("Base cargada:", base)

objetivo_set = "user007"
print("\n¿Encontrado?", objetivo_set in base)