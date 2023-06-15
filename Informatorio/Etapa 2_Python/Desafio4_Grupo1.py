# Función para validar las reglas de un inmueble
def validarInmueble(inmueble):
    if inmueble["zona"] not in ["A", "B", "C"]:
        return False
    if inmueble["estado"] not in ["Disponible", "Reservado", "Vendido"]:
        return False
    if inmueble["año"] < 2000:
        return False
    if inmueble["metros"] < 60:
        return False
    if inmueble["habitaciones"] < 2:
        return False
    
    return True

# Funcion que agrega y quita inmuebles de la lista
def manipularInmuebles(lista_inmuebles):
    accion = input("¿Qué acción desea realizar? (agregar/quitar): ")

    if accion == "agregar":
        nuevo_inmueble = {}
        nuevo_inmueble["año"] = int(input("Año: "))
        nuevo_inmueble["metros"] = int(input("Metros cuadrados: "))
        nuevo_inmueble["habitaciones"] = int(input("Número de habitaciones: "))
        nuevo_inmueble["garaje"] = input("¿Tiene garaje? (sí/no): ").lower() == "sí"
        nuevo_inmueble["zona"] = input("Zona (A, B, C): ").upper()
        nuevo_inmueble["estado"] = "Disponible"

        if validarInmueble(nuevo_inmueble):
            lista_inmuebles.append(nuevo_inmueble)
            print("Inmueble agregado con éxito.")
        else:
            print("El inmueble no cumple con las reglas de validación.")

    elif accion == "quitar":
        print("Lista de inmuebles:")
        for i, inmueble in enumerate(lista_inmuebles):
            print(f"{i + 1}. {inmueble}")
        
        numero_inmueble = int(input("Ingrese el número del inmueble que desea quitar: ")) - 1

        if 0 <= numero_inmueble < len(lista_inmuebles):
            del lista_inmuebles[numero_inmueble]
            print("Inmueble eliminado con éxito.")
        else:
            print("Número de inmueble inválido.")
    
    else:
        print("Acción inválida.")

# Función que cambia el estado del inmueble
def estadoDeInmueble(lista_inmuebles):
    print("Lista de inmuebles:")
    for i, inmueble in enumerate(lista_inmuebles):
        print(f"{i + 1}. {inmueble}")

    numero_inmueble = int(input("Ingrese el número del inmueble: ")) - 1

    if 0 <= numero_inmueble < len(lista_inmuebles):
        nuevo_estado = input("Ingrese el nuevo estado del inmueble: ")
        lista_inmuebles[numero_inmueble]["estado"] = nuevo_estado
        print("Estado del inmueble actualizado.")
    else:
        print("Número de inmueble inválido.")

# Función que busca un inmueble en función a un presupuesto dado
def busquedaInmueble(lista_inmuebles, presupuesto):
    inmuebles_encontrados = []
    for inmueble in lista_inmuebles:
        if inmueble["estado"] in ["Disponible", "Reservado"]:
            precio = calcularPrecio(inmueble)
            if precio <= presupuesto:
                inmueble_con_precio = inmueble.copy()
                inmueble_con_precio["precio"] = precio
                inmuebles_encontrados.append(inmueble_con_precio)
    
    return inmuebles_encontrados

# Función para calcular el precio de un inmueble en función de la zona
def calcularPrecio(inmueble):
    precio_base = inmueble["metros"] * 100 + inmueble["habitaciones"] * 500 + int(inmueble["garaje"]) * 1500
    antiguedad = 2023 - inmueble["año"]

    if inmueble["zona"] == "A":
        precio = precio_base * (1 - antiguedad / 100)
    elif inmueble["zona"] == "B":
        precio = precio_base * (1 - antiguedad / 100) * 1.5
    elif inmueble["zona"] == "C":
        precio = precio_base * (1 - antiguedad / 100) * 2
    
    return precio

# Lista existente de inmuebles
lista_inmuebles = [
    {'año': 2010, 'metros': 150, 'habitaciones': 4, 'garaje': True, 'zona': 'C', 'estado': 'Disponible'},
    {'año': 2016, 'metros': 80, 'habitaciones': 2, 'garaje': False, 'zona': 'B', 'estado': 'Reservado'},
    {'año': 2000, 'metros': 180, 'habitaciones': 4, 'garaje': True, 'zona': 'A', 'estado': 'Disponible'},
    {'año': 2015, 'metros': 95, 'habitaciones': 3, 'garaje': True, 'zona': 'B', 'estado': 'Vendido'},
    {'año': 2008, 'metros': 60, 'habitaciones': 2, 'garaje': False, 'zona': 'C', 'estado': 'Disponible'}
]

# Ejecuto estas funciones para su uso
manipularInmuebles(lista_inmuebles)
estadoDeInmueble(lista_inmuebles)

# Ejecutamos la funcion de presupuesto
presupuesto = int(input("Ingrese el presupuesto máximo: "))
resultados_busqueda = busquedaInmueble(lista_inmuebles, presupuesto)

# Un if para que, en base a la funcion presupuesto mostremos un mensaje.
if resultados_busqueda:
    print("Inmuebles encontrados:")
    for inmueble in resultados_busqueda:
        print(inmueble)
else:
    print("No se encontraron inmuebles que cumplan con los criterios de búsqueda.")

calcularPrecio("A")


