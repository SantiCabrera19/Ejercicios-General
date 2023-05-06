'''Escribe un programa que pida al usuario una palabra y determine si es un
 palíndromo (es decir, si se lee igual de izquierda a derecha que de derecha a
 izquierda).'''

# Se solicita al usuario que ingrese una palabra y se guarda en la variable palabra.
palabra = input("Ingrese una palabra: ")
# Se inicializa una variable booleana es_palindromo como True, asumiendo inicialmente que la palabra es un palíndromo.
palindromo = True

# Se utiliza un bucle for para iterar sobre la mitad de la longitud de la palabra. El operador // realiza una división entera, asegurando que el resultado sea un número entero.
for i in range(len(palabra) // 2):
    # Dentro del bucle, se compara la letra en la posición i con la letra en la posición correspondiente desde el final de la palabra (-(i + 1)). Si alguna de las letras no coincide, se establece la variable es_palindromo como False, indicando que la palabra no es un palíndromo.
    if palabra[i] != palabra[-(i + 1)]:
        palindromo = False

if palindromo:
    print("La palabra es un palíndromo.")
else:
    print("La palabra no es un palíndromo.")

