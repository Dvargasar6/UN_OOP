from PlanetType import PlanetType
from Planet import Planet

UA = 149.597870

def main():

    earth = Planet("Earth",1,5.972e24,1.083e12,12756,1*UA,PlanetType.LAND,True)
    jupyter = Planet("Jupyter",95,1.898e27,1.43128e15,139820,5.203*UA,PlanetType.GASEOUS,True)

    earth.printAttributes()
    jupyter.printAttributes()

    earth.planetDensity()
    jupyter.planetDensity()

    earth.exteriorPlanet()
    jupyter.exteriorPlanet()


if __name__ == "__main__":
    main()
    