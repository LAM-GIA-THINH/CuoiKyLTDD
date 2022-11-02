package com.example.giuaky;

public class MainModel {
    String ProductName, ProductDescription, turl;

    MainModel(){

    }

    public MainModel(String productName, String productDescription, String turl) {
        ProductName = productName;
        ProductDescription = productDescription;
        this.turl = turl;

    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String productDescription) {
        ProductDescription = productDescription;
    }

    public String getTurl() {
        return turl;
    }

    public void setTurl(String turl) {
        this.turl = turl;
    }


}

