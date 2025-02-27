package model.entities;

public class Item {
    private Integer quantity;
    private Double price;
    private Product product;

    public Item(){

    }
    public Item(int quantity, double price, Product product){
        this.quantity =  quantity;
        this.price = price;
        this.product = product;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setProduct(Product product){
        this.product = product;
    }

    public int getQuantity(){
        return quantity;
    }
    public Double getPrice() {
        return price;
    }
    public Product getProduct(){
        return product;
    }

    public Double subTotal(){
        return quantity * price;
    }
}
