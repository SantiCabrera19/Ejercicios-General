'''Escribe un programa que imprima la suma de todos los números pares del 1 al
 100.'''

suma = 0

# Esto calcula la suma de los números pares del 1 al 100
for i in range(1, 101):
    if i % 2 == 0:
        suma = suma + i

# Imprimir el resultado final
print("La suma de los números pares del 1 al 100 es:", suma)
