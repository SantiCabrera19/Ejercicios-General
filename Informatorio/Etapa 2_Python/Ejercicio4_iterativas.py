'''Escribe un programa que imprima los números pares del 1 al 100.'''

# Un bucle for que empieza en 1 y termina en 101 (100)

for i in range(1, 101):
    if i % 2 == 0: # If con la condicional de que si i modulo 2 es 0 imprima i (es par)
        print(i) # Muestro el resultado que es el numero par