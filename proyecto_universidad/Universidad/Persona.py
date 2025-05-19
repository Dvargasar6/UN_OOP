
class Persona():
    def __init__(self, nombre:str, direccion:str):
        self.nombre = nombre
        self.direccion = direccion

    def getNombre(self):
        return self.nombre

    def setNombre(self, nuevo_nombre:str):
        self.nombre = nuevo_nombre

    def getDireccion(self):
        return self.direccion

    def setDireccion(self, nuevo_direccion:str):
        self.direccion = nuevo_direccion
      