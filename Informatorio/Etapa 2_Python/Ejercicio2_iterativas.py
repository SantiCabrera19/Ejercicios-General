'''Escribe un programa que pida al usuario un número y calcule la suma de todos
 los números naturales del 1 hasta ese número'''


# Defino la variable y pido el numero
numero = int(input("Ingrese un número: "))

# Inicializo la variable para la suma
suma = 0

# Itero desde 1 hasta el número ingresado
for i in range(1, numero + 1, 1):
    suma = suma + i

# Muestro el resultado
print(suma)
