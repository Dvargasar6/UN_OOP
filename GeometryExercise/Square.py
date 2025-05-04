class Square:

    def __init__(self, side):
        self.side = side

    def area(self):
        area = self.side**2
        return area
    
    def perimeter(self):
        perimeter = 4*self.side
        return perimeter