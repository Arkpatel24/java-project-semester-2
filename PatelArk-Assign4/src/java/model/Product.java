package model;


import java.io.Serializable;
import java.text.NumberFormat;

public class Product implements Serializable {

    private Long productId;

    private String code;

    private String description;

    private double price;

    public Product() {
    }
    
    public Product(String code,String desc,Double price){
        this.code=code;
        this.description=desc;
        this.price=price;
    }

    public Long getId() {

        return productId;

    }

    public void setProductId(Long productId) {

        this.productId = productId;

    }

    public void setCode(String code) {

        this.code = code;

    }

    public String getCode() {

        return code;

    }

    public void setDescription(String description) {

        this.description = description;

    }

    public String getDescription() {

        return description;

    }

    public void setPrice(double price) {

        this.price = price;

    }

    public double getPrice() {

        return price;

    }

    public String getPriceCurrencyFormat() {

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        return currency.format(price);

    }

}
