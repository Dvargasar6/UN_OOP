from TiendaMascotas.Mascota import Mascota

class Perro(Mascota):

    def __init__(self, nombre, edad, color, peso : float, muerde : bool):
        super().__init__(nombre,edad,color)
        self._peso = peso
        self._muerde = muerde

    @staticmethod
    def sonido():
        print("Los perros ladran.\n")

    def atributos(self):
        print(f'El perro se llama {self._nombre}, tiene {self._edad} anos y es de color {self._color.value}.')
        if self._muerde:
            print(f'El perro pesa {self._peso} kg y muerde.\n')
        else:
            print(f'El perro pesa {self._peso} kg y no muerde.\n')

        