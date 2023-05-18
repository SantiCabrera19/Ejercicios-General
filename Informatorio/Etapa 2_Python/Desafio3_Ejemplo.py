from random import randint

# Variables del programa
nombre = input("Ingrese su nombre: ")
print(f"Bienvenido, {nombre}. Vamos a jugar un juego.")

print("Tienes que adivinar un número del 1 al 100. Tienes 8 intentos.")
# Variable numero_random
numero_random = randint(1, 100)

# Los intentos que tiene el usuario
intentos_restantes = 8

