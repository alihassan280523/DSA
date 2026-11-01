package DSA.DsaLabs.Lab1.Task3;

import java.util.Map;
import java.util.HashMap;

public class TicketBooking {
    public static void main(String[] args) {
        
        Map<Integer,String> bookings=new HashMap<>();

        bookings.put(1, "VIP");
        bookings.put(2, "Regular");
        bookings.put(3, "VIP");
        bookings.put(4, "Regular");

        System.out.println(bookings);

        System.out.println(bookings.get(1));

        System.out.println("Removing: "+bookings.remove(3));

        System.out.println(bookings);

        System.out.println(bookings.containsKey(3));
    }
}
