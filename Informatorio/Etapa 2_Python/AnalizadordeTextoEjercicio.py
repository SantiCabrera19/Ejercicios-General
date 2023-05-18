
vartexto = input("Ingresa un texto: ")
varletras = input("Ingresa tres letras separadas por espacios: ").split()

'''Contador de letras en especifico'''

for varletra in varletras:
    cantidad = 0
    for caracter in vartexto:
        if caracter == varletra:
            cantidad += 1
    print(f"La letra '{varletra}' aparece {cantidad} veces.")

'''Contador de letras totales'''

palabras = len(vartexto.split())
print(f"Hay {palabras} palabras en el texto.")

'''Primera y Ultima Letra'''

primera_letra = vartexto[0]
print(f"primera letra: '{primera_letra}'")
ultima_letra = vartexto[-1]
print(f"ultima letra: '{ultima_letra}'")

'''Inversion de texto'''

texto_inverso = vartexto[::-1]
print(f"El texto en orden inverso es: {texto_inverso}")


aparece = "python" in vartexto.lower()

aparece_texto = {True: "Si aparece Python", False: "No aparece Python"}

print(aparece_texto[aparece])


