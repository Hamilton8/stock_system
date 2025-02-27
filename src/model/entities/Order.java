package model.entities;

import model.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
     private Date moment;
     private OrderStatus status;
     private Client client;
     private List<Item> items = new ArrayList<>();

     private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

     public Order(){
     }
     public Order(Date moment, OrderStatus status, Client client){
         this.moment = moment;
         this.status = status;
         this.client = client;
     }

     public void setMoment(Date moment){
         this.moment = moment;
     }
     public void setClient(Client client){
         this.client = client;
     }

     public Date getMoment(){
         return moment;
     }
     public Client getClient(){
         return client;
     }


     public void addItems(Item item){
         this.items.add(item);
     }
     public void removeItems(Item item){
         this.items.remove(item);
     }

     public Double total(){
         double finalPrice = 0;
         for(Item item: items){
             finalPrice+= item.subTotal();
         }
         return finalPrice;
     }

     public String toString(){
         StringBuilder sb = new StringBuilder();
         sb.append("Order summary: ");
         sb.append("\nOrder moment: ");
         sb.append(sdf.format(moment));
         sb.append("\nOrder status: ");
         sb.append(status);
         sb.append("\nClient: ");
         sb.append(client);
         sb.append("\nOrder items:\n");
         for(Item item : items){
             sb.append(item);
             sb.append("\n");
         }
         sb.append("\nTotal price: "+total());
         return sb.toString();
     }
}
