from Rectangle import Rectangle
from Square import Square
from Circle import Circle
from Triangle import Triangle



def main():

    circle = Circle(3.45)

    areaCircle = circle.area()
    perimeterCircle = circle.perimeter()

    print(f"El area del circulo es: {areaCircle}")
    print(f"El perimetro del circulo es: {perimeterCircle} \n")


    rectangle = Rectangle(3.5,4.3)

    area_rectangle = rectangle.area()
    perimeter_rectangle = rectangle.perimeter()

    print(f"El area del rectangulo es: {area_rectangle}")
    print(f"El perimetro del rectangulo es: {perimeter_rectangle} \n")


    square = Square(3.7)

    area_square = square.area()
    perimeter_square = square.perimeter()

    print(f"El area del cuadrado es: {area_square}")
    print(f"El perimetro del cuadrado es: {perimeter_square} \n")


    triangle = Triangle(3.0,3.0)

    area_triangle = triangle.area()
    perimeter_triangle = triangle.perimeter()

    print(f"El area del triangulo es: {area_triangle}")
    print(f"La hipotenusa del triangulo es: {triangle.hypotenuse()}")
    print(f"El perimetro del triangulo es: {perimeter_triangle}")
    print(f"El triangulo es {triangle.typeTriangle()} \n")
    


