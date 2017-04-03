package pl.akademiakodu;

import pl.akademiakodu.zad1.Osoba;
import pl.akademiakodu.zad10.Punkt2D;
import pl.akademiakodu.zad10.Punkt3D;
import pl.akademiakodu.zad2.Car;
import pl.akademiakodu.zad3.Game;
import pl.akademiakodu.zad3.Player;
import pl.akademiakodu.zad4.Company;
import pl.akademiakodu.zad4.Employee;
import pl.akademiakodu.zad5.Guarantee;
import pl.akademiakodu.zad5.Product;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
//        tworzenie listy osob
//         wprowadzanie osoby + drukowanie wprowadzenia
        List<Osoba> osobaList = new ArrayList<>();
        osobaList.add(new Osoba(sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt()));

        for (Osoba osoba:osobaList){
            System.out.println(osoba.getName() + osoba.getSurname() + osoba.getAge() + osoba.getGender());
        }

//        osobaList.add(new Osoba("Adam", "Rokowski", 67, 2));
//        osobaList.add(new Osoba("Karolina", "Polak", 18, 1));
//        osobaList.add(new Osoba("Konczita", "Wurst", 18, 0));

//        wyswietlanie obojniakow z listy Osoba
//        for(Osoba osoba:osobaList){
//            if (osoba.getGender()==0){
//                System.out.println("Imię: "+osoba.getName());
                //Zwraca rozmiar listy
//                System.out.println(osobaList.size());
//            }
//        }
//----------------------------------------------------------------------------------
//        List<Car> carrList = new ArrayList<>();
//        carrList.add(new Car("BMW", "E36", 9000.00));
//        carrList.add(new Car("FORD", "Focus", 4000.00));
//        carrList.add(new Car( "AUDI", "A8", 12000.00));
//
//        for(Car car : carrList){
//            car.Show();
//        }
//------------------------------------------------------------------------------------

//        List<Player> playerList = new ArrayList<>();
//        playerList.add(new Player("Oskar", "hajt", 124));
//        playerList.add(new Player("Adam", "polak", 50));
//        playerList.add(new Player("Dorota", "ares", 97));
//
//        Game game = new Game("Deadmatch", playerList);
//
//        Player playerWhoWin = game.getWinner();
//
//        System.out.println("Wygrywający: " + game.getWinner().getFullName());

//--------------------------------------------------------------------------------------

//        LocalDate dataGuarantee = LocalDate.now();
//        dataGuarantee = dataGuarantee.minus(Period.ofYears(1));
//
//        List<Product> productList = new ArrayList<>();
//        productList.add(new Product("Drukarka", "Ladnie drukuje","Szybko drukuje"));
//        productList.add(new Product("Laptop", "Czarny laptop","Dziala ze az strach"));
//        productList.add(new Product("Samochod", "bialy","Niemiec plakal jak sprzedawal"));
//
//        Guarantee guarantee1 = new Guarantee(productList.get(0), dataGuarantee);
//        Guarantee guarantee2 = new Guarantee(productList.get(1), dataGuarantee);
//        Guarantee guarantee3 = new Guarantee(productList.get(2), dataGuarantee);
//
//        System.out.println("Czy gwarancja w produkcie1 obowiązuje?: " + guarantee1.isVaild());
//        System.out.println("Czy gwarancja w produkcie2 obowiązuje?: " + guarantee2.isVaild());
//        System.out.println("Czy gwarancja w produkcie3 obowiązuje?: " + guarantee3.isVaild());

// -------------------------------------------------------------------------------------

// zad10:
//
//        Punkt2D p1 = new Punkt2D(5,5);
//        Punkt3D p2 = new Punkt3D(4,4,20);
//        System.out.println("Y: " + p2.getY());

    }

}
