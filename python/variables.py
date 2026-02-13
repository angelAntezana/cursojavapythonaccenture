suma =  2 + 5
print(suma)

#CADENAS

texto = "11111Esto es una prueba22222"
print(texto.replace("1", " ").replace("2", " ").strip().upper())

tituloLibro = "libro de texto"
print(tituloLibro.capitalize())
print(tituloLibro.title())


#FORMAT
nombre = "Juan"
edad = 25
frase = f"Hola, mi nombre es {nombre} y tengo {edad} años"
print(frase)


usuario = "angel"
ip = "192.168.1.1"
if (usuario == "angel") or (ip == "192.168.1.1"):
        print("valido")