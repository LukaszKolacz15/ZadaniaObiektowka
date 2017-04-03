package pl.akademiakodu.zad5;

import java.time.LocalDate;

/**
 * Created by Moody on 2017-03-14.
 */
public class Guarantee {
    private Product product;
    private LocalDate guaranteeData;

    public Guarantee(Product product, LocalDate guaranteeData) {
        this.product = product;
        this.guaranteeData = guaranteeData;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getGuaranteeData() {
        return guaranteeData;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setGuaranteeData(LocalDate guaranteeData) {
        this.guaranteeData = guaranteeData;
    }

    public boolean isVaild(){
        return !LocalDate.now().isAfter(getGuaranteeData());
    }

}
