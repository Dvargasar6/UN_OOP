from .Persona import Persona

class Profesor(Persona):

    def __init__(self, nombre:str, direccion:str, departamento:str, categoria:str):
        super().__init__(nombre,direccion)
        self.departamento = departamento
        self.categoria = categoria

    def getNombre(self):
        return super().getNombre()

    def setNombre(self, nuevo_nombre:str):
        super().setNombre(nuevo_nombre)

    def getDireccion(self):
        return super().getDireccion()

    def setDireccion(self, nueva_direccion:str):
        super().setDireccion(nueva_direccion)

    def getDepartamento(self):
        return self.departamento

    def setDepartamento(self, nuevo_departamento:str):
        self.departamento = nuevo_departamento

    def getCategoria(self):
        return self.categoria

    def setCategoria(self, nuevo_categoria:str):
        self.categoria = nuevo_categoria
