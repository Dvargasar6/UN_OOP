from PlanetType import PlanetType

class Planet:

    def __init__(self, name: None, satellitesNumber: 0,
    mass: 0.0, volume: 0.0, diameter: 0,
    major_semiaxis: 0, planet_type: PlanetType,
    observable: False):

        self.name = name
        self.satellitesNumber = satellitesNumber
        self.mass = mass
        self.volume = volume
        self.diameter = diameter
        self.major_semiaxis = major_semiaxis
        self.planet_type = planet_type
        self.observable = observable

    def printAttributes(self):
        print(f'Nombre del planeta : {self.name}')
        print(f'Numero de satelites : {self.satellitesNumber}')
        print(f'Masa del planeta : {self.mass} kg')
        print(f'Volumen del planeta : {self.volume} km^3')
        print(f'Diametro del planeta : {self.diameter} km')
        print(f'Semieje mayor del planeta : {self.major_semiaxis} Mkm')
        print(f'Tipo del planeta : {self.planet_type.value}')
        print(f'Observable : {self.observable}')
        print(f'\n')
        return
    
    def planetDensity(self):
        density = self.mass/self.volume
        print(f'Densidad del planeta {self.name} : {density} kg/km³ \n')
        return density

    def exteriorPlanet(self):
        exterior = False
        if self.major_semiaxis > 149.597870*3.4:
            exterior = True
        print(f'El planeta {self.name} es exterior : {exterior} \n')
        return exterior


