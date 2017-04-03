package pl.akademiakodu.zad2;

/**
 * Created by Moody on 2017-03-14.
 */
public class Car {

    private String brant;
    private String model;
    private double price;

    public Car(String brant, String model, double price) {
        this.brant = brant;
        this.model = model;
        this.price = price;
    }

    public String getBrant() {
        return brant;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setBrant(String brant) {
        this.brant = brant;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void Show(){
        System.out.println("Marka: " + getBrant()+"cena: "+getPrice());
    }
}
