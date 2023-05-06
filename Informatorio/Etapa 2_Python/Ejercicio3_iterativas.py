'''Escribe un programa que pida al usuario un número y luego imprima la tabla de
 multiplicar correspondiente a ese número del 1 al 10.'''

# Defino las variables a ser utilizadas
numero1 = int(input("Ingresa el numero: "))
producto = 0

# El bucle for un range, donde inica en 1 y finaliza en 11 (10)
for i in range(1, 11):
    producto = numero1 * i # Utilizamos la "i" de iteracion, ira variando de 1 en 1.
    # Mostramos la tabla del numero X
    print(f"{numero1} x {i} = {producto}")


