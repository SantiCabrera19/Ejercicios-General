from random import randint

# Variables del programa
nombre = input("Ingrese su nombre: ")
print(f"Bienvenido, {nombre}. Vamos a jugar un juego.")

print("Tienes que adivinar un número del 1 al 100. Tienes 8 intentos.")
# Variable numero_random
numero_random = randint(1, 100)

# Los intentos que tiene el usuario
intentos_restantes = 8
# Bandera para el While
intentos = True

# While del programa
while intentos and intentos_restantes > 0:
    numero_ingresado = input("Ingresa un número: ")

    if not numero_ingresado.isdigit():
        print("El valor ingresado no es un número entero.")
    else:
        numero_ingresado = int(numero_ingresado)

        # If que indica la cercania al numero, sea la primera condicion o la segunda la que se cumpla, el codigo fluira a restar un intento, en cambio si el numero es correcto la bandera es False, y el bucle termina..

        if numero_ingresado < numero_random:
            print("El número a adivinar es mayor.")
        elif numero_ingresado > numero_random:
            print("El número a adivinar es menor.")
        else:
            print(f"¡Felicidades, {nombre}! Has adivinado el número en el intento {9 - intentos_restantes}.")
            intentos = False
            
    # Restamos intentos..
    intentos_restantes -= 1
    # if que lleva a cabo el conteo de los intentos, la condicion es intentos = true, ya que aun no es false para terminar el bucle while.
    if intentos_restantes > 0 and intentos:
        print(f"Intentos restantes: {intentos_restantes}\n")
        
# If que indica que el usuario ha superado los intentos...
if intentos_restantes == 0:
    print(f"Has superado los intentos, {nombre}. El número a adivinar era {numero_random}.")

print("¡Gracias por jugar!")
