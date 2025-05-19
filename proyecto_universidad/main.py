from Universidad.Profesor import Profesor
from Universidad.Estudiante import Estudiante

def main():

    alberto = Profesor("Alberto","Direccion","Fisica","Planta")
    print(f'Nombre: {alberto.getNombre()}\nDireccion: {alberto.getDireccion()}\nDepartamento:{alberto.getDepartamento()}\nCategoria: {alberto.getCategoria()}')
    alberto.setNombre("Juan")
    alberto.setDireccion("Nueva direccion")
    alberto.setDepartamento("Matematicas")
    alberto.setCategoria("Ocasional")
    print(f'Nombre: {alberto.getNombre()}\nDireccion: {alberto.getDireccion()}\nDepartamento:{alberto.getDepartamento()}\nCategoria: {alberto.getCategoria()}')
    
    mateo = Estudiante("Mateo","Direccion","Ingenieria Fisica",4)
    print(f'Nombre: {mateo.getNombre()}\nDireccion: {mateo.getDireccion()}\nCarrera:{mateo.getCarrera()}\nSemestre: {mateo.getSemestre()}')
    mateo.setNombre("Estiven")
    mateo.setDireccion("Nueva direccion")
    mateo.setCarrera("Ingenieria Quimica")
    mateo.setSemestre(8)
    print(f'Nombre: {mateo.getNombre()}\nDireccion: {mateo.getDireccion()}\nCarrera:{mateo.getCarrera()}\nSemestre: {mateo.getSemestre()}')


if __name__=="__main__":
    main()