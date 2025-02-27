package application;

import model.entities.Client;
import model.entities.Item;
import model.entities.Order;
import model.entities.Product;
import model.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Scanner;

public class Program {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter client data");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Birth Date (dd/mm/yyyy): ");
        Date date = sdf.parse(input.next());
        Client client1 = new Client(date,name,email);
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(input.next());
        Order order  = new Order(new Date(), status,client1);
        System.out.println("How many items to this order: ");

        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter #"+(1+i)+" item data");
            System.out.print("Product name: ");
            String prodName = input.next();
            System.out.print("Product price: ");
            double price = input.nextDouble();
            System.out.print("Quantity: ");
            int quant = input.nextInt();
            Product product = new Product(prodName,price);
            Item item = new Item(quant,product);
            order.addItems(item);
        }
        System.out.println(order);



    }
}
