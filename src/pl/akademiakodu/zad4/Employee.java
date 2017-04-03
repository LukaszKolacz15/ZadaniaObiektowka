package pl.akademiakodu.zad4;

/**
 * Created by Lukasz Kolacz on 15.03.2017.
 */
public class Employee {

    private String name;
    private String surname;
    private int yearOfBirth;
    private int seniority;

    public Employee(String name, String surname, int yearOfBirth, int seniority) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.seniority = seniority;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }



    public void Show(){
        System.out.println("Imie: " + getName() +" "+ "Nazwisko: " + getSurname() +" "+ "Rok urodzenia: " + getYearOfBirth() +" "+ "Lat doświadczenia: " + getSeniority());
    }

}
