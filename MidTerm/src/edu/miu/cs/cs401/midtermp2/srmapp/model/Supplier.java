package edu.miu.cs.cs401.midtermp2.srmapp.model;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private String supplierId;
    private String supplierName;
    private List<Product> products;
    public Supplier() {

    }

    public Supplier(String supplierId, String supplierName) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.products=new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProducts(Product product) {
        this.products.add(product);
    }
    public Supplier(String supplierId, String supplierName, List<Product> products) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.products = products;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId='" + supplierId + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", products=" + products +
                '}';
    }
}
