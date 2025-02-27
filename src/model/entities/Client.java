package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private String name;
    private String email;
    private Date birthDate;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

   public Client(){

   }
   public Client(Date birthDate, String name, String email) {
        this.birthDate = birthDate;
        this.name = name;
        this.email = email;
   }

   public void setName(String name){
       this.name = name;
   }
   public void setEmail(String email){
       this.email = email;
   }
   public void setBirthDate(Date birthDate){
       this.birthDate = birthDate;
   }

   public String getName(){
     return name;
   }
   public String getEmail(){
       return email;
   }
   public Date getBirthDate(){
       return birthDate;
   }

   public String toString(){
       StringBuilder sb  = new StringBuilder();
       sb.append(name);
       sb.append(" ("+sdf.format(birthDate));
       sb.append(") - "+email);
       return sb.toString();
   }
}
