package pl.akademiakodu.zad1;

/**
 * Created by Moody on 2017-03-14.
 */
public class Osoba {

    private String name;
    private String surname;
    private int age;
//    0 - niewiadomo; 1 - kobieta; 2 - mezczyzna
    private int gender;

//    Automatyczne generowanie: konstruktorow, geterow, seterow

    public Osoba(String name, String surname, int age, int gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
