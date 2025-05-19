from .Perro import Perro
from .razas_grandes import razas_grandes

class PerroGrande(Perro):
    def __init__(self, nombre, edad, color, peso : float, muerde : bool, raza : razas_grandes):
        super().__init__(nombre,edad,color,peso,muerde)
        self._raza = raza
        

    def atributos(self):
        print(f'El perro se llama {self._nombre}, tiene {self._edad} anos y es de color {self._color.value}.')
        if self._muerde:
            print(f'El perro pesa {self._peso} kg y muerde.')
        else:
            print(f'El perro pesa {self._peso} kg y no muerde.')
        print(f'La raza del perro es {self._raza.value}.\n')

    @staticmethod
    def sonido():
        Perro.sonido()