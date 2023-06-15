# Importamos biblioteca
from datetime import datetime

# Clase usuario
class Usuario:
    def __init__(self, id, nombre, apellido, telefono, username, email, contraseña):
        # Inicialización de atributos del usuario
        self.id = id
        self.nombre = nombre
        self.apellido = apellido
        self.telefono = telefono
        self.username = username
        self.email = email
        self.contraseña = contraseña
        self.fecha_registro = datetime.now()  # Fecha y hora actual
        self.avatar = None
        self.estado = 'Activo'
        self.online = False
    
    # Método login()
    def login(self):
        self.online = True
        print(f'Usuario {self.username} ha iniciado sesión.')
    
    # Método registrar()
    def registrar(self):
        print(f'Usuario {self.username} se ha registrado correctamente.')

# Clase articulo
class Articulo:
    def __init__(self, id_usuario, titulo, resumen, contenido, imagen):
        # Inicialización de atributos del artículo
        self.id_usuario = id_usuario
        self.titulo = titulo
        self.resumen = resumen
        self.contenido = contenido
        self.fecha_publicacion = None
        self.imagen = imagen
        self.estado = 'Borrador'
        self.comentarios = []
    
    # Método publicar()
    def publicar(self):
        self.fecha_publicacion = datetime.now()  # Fecha y hora actual
        self.estado = 'Publicado'
        print(f'El artículo "{self.titulo}" ha sido publicado.')
    
    # Método agregar_comentario()
    def agregar_comentario(self, comentario):
        self.comentarios.append(comentario)
        print(f'Se ha agregado un comentario al artículo "{self.titulo}".')

# Clase comentario
class Comentario:
    def __init__(self, id_usuario, id_articulo, contenido):
        # Inicialización de atributos del comentario
        self.id_usuario = id_usuario
        self.id_articulo = id_articulo
        self.contenido = contenido
        self.fecha_hora = datetime.now()  # Fecha y hora actual
        self.estado = 'Activo'

# Clase publico
class Publico(Usuario):
    def __init__(self, id, nombre, apellido, telefono, username, email, contraseña):
        super().__init__(id, nombre, apellido, telefono, username, email, contraseña)
        self.es_publico = True
    
    # Método comentar()
    def comentar(self, articulo, contenido):
        comentario = Comentario(self.id, articulo.id, contenido)
        articulo.agregar_comentario(comentario)
        print(f'Usuario {self.username} ha comentado en el artículo "{articulo.titulo}".')

# Clase colaborador
class Colaborador(Usuario):
    def __init__(self, id, nombre, apellido, telefono, username, email, contraseña):
        super().__init__(id, nombre, apellido, telefono, username, email, contraseña)
        self.es_colaborador = True
    
    # Método comentar()
    def comentar(self, articulo, contenido):
        comentario = Comentario(self.id, articulo.id, contenido)
        articulo.agregar_comentario(comentario)
        print(f'Usuario {self.username} ha comentado en el artículo "{articulo.titulo}".')
    
    # Método publicar()
    def publicar(self, titulo, resumen, contenido, imagen):
        articulo = Articulo(self.id, titulo, resumen, contenido, imagen)
        articulo.publicar()
        print(f'Usuario {self.username} ha publicado el artículo "{articulo.titulo}".')

# Código de prueba
opcion = input("¿Deseas registrar un nuevo usuario (R) o iniciar sesión (I)? ").lower()

if opcion == "r":
    # Registro de usuario
    id = input("Ingrese el ID del usuario: ")
    nombre = input("Ingrese el nombre del usuario: ")
    apellido = input("Ingrese el apellido del usuario: ")
    telefono = input("Ingrese el teléfono del usuario: ")
    username = input("Ingrese el username del usuario: ")
    email = input("Ingrese el email del usuario: ")
    contraseña = input("Ingrese la contraseña del usuario: ")
    
    usuario = Usuario(id, nombre, apellido, telefono, username, email, contraseña)
    usuario.registrar()
elif opcion == "i":
    # Inicio de sesión
    username = input("Ingrese el username: ")
    contraseña = input("Ingrese la contraseña: ")

    # Crear instancia de Usuario directamente # Aqui quise crear algun metodo de autentificacion pero no tuve exito
    usuario = Usuario(None, None, None, None, username, None, contraseña)
    usuario.login()

    # Comentar como Usuario Público
    if isinstance(usuario, Publico):  # Verifica si el usuario es de tipo Publico
        articulo = Articulo(1, 'Título del artículo', 'Resumen del artículo', 'Contenido del artículo', 'imagen.jpg')
        contenido_comentario = input("Ingrese su comentario: ")
        usuario.comentar(articulo, contenido_comentario)

    # Publicar como Colaborador
    if isinstance(usuario, Colaborador):  # Verifica si el usuario es de tipo Colaborador
        titulo_articulo = input("Ingrese el título del artículo: ")
        resumen_articulo = input("Ingrese el resumen del artículo: ")
        contenido_articulo = input("Ingrese el contenido del artículo: ")
        imagen_articulo = input("Ingrese el nombre de la imagen del artículo: ")
        usuario.publicar(titulo_articulo, resumen_articulo, contenido_articulo, imagen_articulo)
else:
    print("Opción no válida.")
