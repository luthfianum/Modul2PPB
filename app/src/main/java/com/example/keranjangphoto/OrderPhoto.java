package com.example.keranjangphoto;

public class OrderPhoto {
    private CatalogPhoto catalogPhoto;
    private int numOrder;
    private String ukuran;
    private double subTotal;

    public CatalogPhoto getCatalogPhoto(){
        return catalogPhoto;
    }

    public int getNumOrder() {
        return numOrder;
    }

    public String getUkuran() {
        return ukuran;
    }

    public double getSubTotal() {
        return subTotal;
    }
}
