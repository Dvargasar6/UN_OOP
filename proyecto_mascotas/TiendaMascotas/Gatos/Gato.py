from TiendaMascotas.Mascota import Mascota

class Gato(Mascota):

    def __init__(self, nombre, edad, color, altura_salto:float, longitud_salto:float):
        super().__init__(nombre,edad,color)
        self._altura_salto = altura_salto
        self._longitud_salto = longitud_salto

    @staticmethod
    def sonido():
        print("Los gatos maullan y ronronean.\n")

    def atributos(self):
        print(f'El gato se llama {self._nombre}, tiene {self._edad} anos y es de color {self._color.value}.')
        print(f'El gato salta {self._altura_salto} m de alto y {self._longitud_salto} m de longitud.\n')

        