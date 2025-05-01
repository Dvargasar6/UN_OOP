/**
 * @startuml
 * class Person {
 *   -String name
 *   -int age
 *   +void introduce()
 * }
 * @enduml
 */

public class Person {
    
    private String name;
    private String lastName;
    private int id;
    private int birthYear;
    private String country;
    private char genre;

    public Person(String name, String lastName, int id, int birthYear, String country, char genre){
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.birthYear = birthYear;
        this.country = country;
        this.genre = genre;
    }

    void printAttributes() {
        System.out.println("Nombre : " + name);
        System.out.println("Apellidos : " + lastName);
        System.out.println("Número de documento de identidad : " + id);
        System.out.println("Año de nacimiento : " + birthYear);
        System.out.println("País de nacimiento : " + country);
        System.out.println("Género : " + genre);
    }

}