'''Escribe un programa que pida al usuario una palabra y luego imprima la misma
 palabra pero con las letras en orden inverso'''

palabra = input('Escribe una palabra: ')  # Solicita al usuario que ingrese una palabra y la guarda en la variable 'palabra'

palabra_inversa = ''  # Crea una variable vacía para almacenar la palabra invertida

for i in range(len(palabra) - 1, -1, -1):  # Itera por los índices de la palabra en orden inverso
    palabra_inversa = palabra_inversa + palabra[i]  # Concatena la letra correspondiente en cada iteración a la variable 'palabra_inversa'

print("La palabra en orden inverso es:", palabra_inversa)  # Imprime la palabra invertida

