from .Gato import Gato
from .razas_sin_pelo import razas_sin_pelo

class GatoSinPelo(Gato):
    def __init__(self, nombre, edad, color, altura_salto:float, longitud_salto:float, raza:razas_sin_pelo):
        super().__init__(nombre,edad,color,altura_salto,longitud_salto)
        self._raza = raza

    def atributos(self):
        print(f'El gato se llama {self._nombre}, tiene {self._edad} anos y es de color {self._color.value}.')
        print(f'El gato salta {self._altura_salto} m de alto y {self._longitud_salto} m de longitud.')
        print(f'Es de raza {self._raza.value}.\n')

    @staticmethod
    def sonido():
        Gato.sonido()
    