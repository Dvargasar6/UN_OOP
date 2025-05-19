from .Persona import Persona

class Estudiante(Persona):

    def __init__(self, nombre:str, direccion:str, carrera:str, semestre:int):
        super().__init__(nombre,direccion)
        self.carrera = carrera
        self.semestre = semestre

    def getNombre(self):
        return super().getNombre()

    def setNombre(self, nuevo_nombre:str):
        super().setNombre(nuevo_nombre)

    def getDireccion(self):
        return super().getDireccion()

    def setDireccion(self, nueva_direccion:str):
        super().setDireccion(nueva_direccion)

    def getCarrera(self):
        return self.carrera

    def setCarrera(self, nuevo_carrera:str):
        self.carrera = nuevo_carrera

    def getSemestre(self):
        return self.semestre

    def setSemestre(self, nuevo_semestre:str):
        self.semestre = nuevo_semestre
