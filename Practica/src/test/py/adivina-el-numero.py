import random

print('Existe un número oculto entre 1 y 100. Puedes encontrarlo?')

numeroOculto: int = random.randint(1, 100)
numeroUsuario: int = 0
cantidadIntentos: int = 0

while numeroOculto != numeroUsuario:
    numeroUsuario = int(input('Ingrese un número entero: '))

    if numeroOculto > numeroUsuario:
        print('El número oculto es mayor')
    elif numeroOculto < numeroUsuario:
        print('El número oculto es menor')
    cantidadIntentos += 1

print(
    f'Correcto! Encontraste el número oculto en {cantidadIntentos} intentos.')
