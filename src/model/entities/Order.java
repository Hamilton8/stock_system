package model.entities;

import model.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
     private Date moment;
     private OrderStatus status;
     private Client client;
     private List<Item> items = new ArrayList<>();

     public Order(){
     }
     public Order(Date moment, OrderStatus status){
         this.moment = moment;
         this.status = status;
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
         //To Implement
         return null;
     }
}
