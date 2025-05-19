from .color import color

class Mascota:
    def __init__(self, nombre: str, edad: int, color: color):
        self._nombre = nombre
        self._edad = edad
        self._color = color

    def atributos(self):
        print(f'La mascota se llama {self._nombre}, tiene {self._edad} anos y es de color {self._color.value}.\n')