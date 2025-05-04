import math

class Triangle:

    def __init__(self, base, height):
        self.base = base
        self.height = height

    def area(self):
        area = self.base*self.height/2
        return area
    
    def hypotenuse(self):
        hypotenuse = (self.base**2 + self.height**2)**(1/2)
        return hypotenuse
    
    def perimeter(self):
        hypotenuse = self.hypotenuse()
        perimeter = hypotenuse + self.base + self.height
        return perimeter
    
    def typeTriangle(self):
        typeTriangle = ""
        a = self.hypotenuse()
        b = self.base
        c = self.height

        if a==b and b==c and a==c:
            typeTriangle = "Equilatero"

        elif a!=b and b!=c and a!=c:
            typeTriangle = "Escaleno"

        else:
            typeTriangle = "Isosceles"
        
        return typeTriangle

        