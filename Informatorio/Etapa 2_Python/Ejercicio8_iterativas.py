"""Escribe un programa que pida al usuario una cadena de texto y luego imprima
 el número de palabras que contiene"""

# Defino la variable y pido al usuario el texto y lo convierto en lista
cadena = input("Escribe una cadena de texto: ").split()
# Defino la variable palabra que va a tener las palabras contadas en la cadena(lista)
palabras = len(cadena)
# Imprimo la cantidad de palabras
print(f"la palabra tiene: {palabras} palabras")
    

