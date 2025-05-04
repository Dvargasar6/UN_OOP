class Rectangle:

    def __init__(self, base, height):
        self.base = base
        self.height = height

    def area(self):
        area = self.base*self.height
        return area
    
    def perimeter(self):
        perimeter = 2*(self.base + self.height)
        return perimeter