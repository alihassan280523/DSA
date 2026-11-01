package DSA.DsaLabs.Lab1.Task2;

import java.util.HashMap;
import java.util.Map;

public class Ticketbooking {
    
    public static void main(String[] args) {
        
        Map<String,String> booking=new HashMap<>();

        booking.put("101", "VIP");
        booking.put("102", "Regular");
        booking.put("103", "VIP");

        System.out.println("Customer 2 ticket type: "+booking.get("102"));
        System.out.println(booking);
        System.out.println(booking.remove("101"));
        System.out.println(booking);
    }
}
