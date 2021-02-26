package du.miu.cs.cs401.midtermp2.srmapp;

import java.time.LocalDate;

import edu.miu.cs.cs401.midtermp2.srmapp.model.Product;
import edu.miu.cs.cs401.midtermp2.srmapp.model.Supplier;

public class SRMApp {
    public static void main(String[] args) {

        Supplier s1=new Supplier("S101","United Farms");
        Supplier s2=new Supplier("S102","ElSengundo Agro");
        Supplier s3=new Supplier("S103","La Boulangerie");
       
        s1.addProducts(new Product(3109128478l,"Bnanas",1.25,480, LocalDate.of(2021,02,14),s1));
        s1.addProducts(new Product(2910019138l,"Apples",1.09,525,LocalDate.of(2021,01,31),s1));
        s2.addProducts(new Product(7281100287l,"Avocados",2.49,164,LocalDate.of(2021,02,11),s2));
        s3.addProducts(new Product(2102799156l,"Brioche",1.89,96,LocalDate.of(2021,01,04),s3));
        Supplier[] suppliers= {s1,s2,s3};
        for (int i=0;i<suppliers.length;i++){
            System.out.println(suppliers[i]);
        }

    }
}
