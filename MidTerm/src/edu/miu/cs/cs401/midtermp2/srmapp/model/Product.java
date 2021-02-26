package edu.miu.cs.cs401.midtermp2.srmapp.model;

import java.time.LocalDate;

public class Product {
    private Long productNumber;
    private String productName;
    private double unitPrice;
    private int quantityInStock;
   private LocalDate dateSupplied;
  Supplier supplier;

    Supplier getSupplier() {
        return supplier;
    }

   public Product(Long productNumber, String productName, double unitPrice, int quantityInStock, LocalDate dateSupplied, Supplier supplier) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantityInStock = quantityInStock;
        this.dateSupplied = dateSupplied;
        this.supplier = supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }


    public Long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Long productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public LocalDate getDateSupplied() {
        return dateSupplied;
    }

    public void setDateSupplied(LocalDate dateSupplied) {
        this.dateSupplied = dateSupplied;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantityInStock=" + quantityInStock +
                ", dateSupplied=" + dateSupplied +
                '}';
    }
}

