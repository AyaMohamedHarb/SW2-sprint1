package controller;

import Repository.ProductRep;

import javax.xml.ws.RequestWrapper;

@Entity
public class Product {
    @Id
    int ID;
    ProductRep p;
    String name,price ,catigory,brandName;
    @RequestMapping(value = "/login/{name}/{price}/{catigory}/{brandname}",method = RequestMethod.POST)
    boolean AddProduct(@PathVariable String n,@PathVariable String price,@PathVariable String c,@PathVariable String bname){
        Product pro=new Product();
        p.save(pro);
        return true;

    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getCatigory() {
        return catigory;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setCatigory(String catigory) {
        this.catigory = catigory;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
