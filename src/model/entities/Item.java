package model.entities;


public class Item {
    private Integer quantity;
    private Product product;

    public Item(){

    }
    public Item(int quantity, Product product){
        this.quantity =  quantity;
        this.product = product;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setProduct(Product product){
        this.product = product;
    }

    public int getQuantity(){
        return quantity;
    }

    public Product getProduct(){
        return product;
    }

    public Double subTotal(){
        return quantity * product.getPrice();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(product.getName());
        sb.append(String.format(", $%.2f,",product.getPrice()));
        sb.append("Quantity: "+ quantity);
        sb.append(String.format(",Subtotal: $%.2f",subTotal()));
        return sb.toString();
    }
}
