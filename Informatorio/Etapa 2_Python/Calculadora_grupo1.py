from OperadoresMatematicos import sumar, restar, multiplicar, dividir

inicio = 0
while inicio == 0:
    print("1. SUMAR\n2. RESTAR\n3. MULTIPLICAR\n4. DIVIDIR")
    operacion = int(input("Operacion a realizar: \t"))
    print("Ingrese 2 números")
    n1 = int(input("Número 1: "))
    n2 = int(input("Número 2: "))

    if operacion == 1:
        resultado = sumar(n1, n2)
        print("Su resultado es:", resultado)
    elif operacion == 2:
        resultado = restar(n1, n2)
        print("Su resultado es:", resultado)
    elif operacion == 3:
        resultado = multiplicar(n1, n2)
        print("Su resultado es:", resultado)
    elif operacion == 4:
        resultado = dividir(n1, n2)
        print("Su resultado es:", resultado)
    else:
        print("Opción incorrecta")

    inicio = int(input("Para continuar presione 0, para salir cualquier tecla: "))
