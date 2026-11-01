package DSA.DsaLabs.Lab1.Task2;

import java.util.HashSet;

public class TicketTypes {
    public static void main(String[] args) {
        
        HashSet<String> ticketTypes=new HashSet<>();

        ticketTypes.add("VIP");
        ticketTypes.add("Regular");
        ticketTypes.add("VIP");

        System.out.println(ticketTypes);


    }
}
