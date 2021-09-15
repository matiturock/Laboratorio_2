import random

print("Adivina el número. Hay un número oculto entre 1 y 100")
numero_oculto: int = int(random.randint(1, 100))
cantidad_intentos = 0
numero_usuario: int = 0

while numero_oculto != numero_usuario:
    numero_usuario = int(input("Ingrese un número entero: "))

    if numero_oculto > numero_usuario:
        print("El número oculto es mayor")
    elif numero_oculto < numero_usuario:
        print("El número oculto es menor")

    cantidad_intentos += 1

print(f"Correcto! Lo logaste en {cantidad_intentos} intentos")
