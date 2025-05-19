from TiendaMascotas.Mascota import Mascota
from TiendaMascotas.color import color
from TiendaMascotas.Perros.Perro import Perro
from TiendaMascotas.Perros.PerroGrande import PerroGrande
from TiendaMascotas.Perros.razas_grandes import razas_grandes
from TiendaMascotas.Perros.PerroPequeno import PerroPequeno
from TiendaMascotas.Perros.razas_pequenas import razas_pequenas
from TiendaMascotas.Perros.PerroMediano import PerroMediano
from TiendaMascotas.Perros.razas_medianas import razas_medianas
from TiendaMascotas.Gatos.GatoPeloLargo import GatoPeloLargo
from TiendaMascotas.Gatos.GatoPeloCorto import GatoPeloCorto
from TiendaMascotas.Gatos.GatoSinPelo import GatoSinPelo
from TiendaMascotas.Gatos.razas_sin_pelo import razas_sin_pelo
from TiendaMascotas.Gatos.razas_pelo_corto import razas_pelo_corto
from TiendaMascotas.Gatos.razas_pelo_largo import razas_pelo_largo


def main():
    molly = Mascota("Molly",8,color.GRIS)
    molly.atributos()

    pelusita = GatoPeloLargo("Pelusita",12,color.BLANCO,1.3,1.2,razas_pelo_largo.ANGORA)
    pelusita.atributos()

    mambo = GatoPeloCorto("Mambo",6,color.NEGRO,1.4,1.5,razas_pelo_corto.MANX)
    mambo.atributos()

    mandy = GatoSinPelo("Mandy",6,color.NEGRO,1.4,1.5,razas_sin_pelo.ESFINGE)
    mandy.atributos()
    mandy.sonido()

    manchitas = PerroPequeno("Manchitas",12,color.NEGRO,3.2,False,razas_pequenas.SCHNAUZER)
    manchitas.atributos()

    marmaduke = PerroGrande("Marmaduke",4,color.MARRON,7.4,False,razas_grandes.DOBERMAN)
    marmaduke.atributos()

    lupita = PerroMediano("Lupita",4,color.MARRON,7.4,True,razas_medianas.SABUESO)
    lupita.atributos()
    lupita.sonido()

if __name__ == "__main__":
    main()




