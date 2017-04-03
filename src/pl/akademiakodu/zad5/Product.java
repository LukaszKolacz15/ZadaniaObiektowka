package pl.akademiakodu.zad5;

/**
 * Created by Moody on 2017-03-14.
 */
public class Product {

    private String name;
    private String description;
    private String specyfication;

    public Product(String name, String description, String specyfication) {
        this.name = name;
        this.description = description;
        this.specyfication = specyfication;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSpecyfication() {
        return specyfication;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSpecyfication(String specyfication) {
        this.specyfication = specyfication;
    }


}
