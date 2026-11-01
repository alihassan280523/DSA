package DSA.DsaLabs.Lab1.Task2;

import java.util.LinkedList;
import java.util.Queue;


public class CustomerQeue {
    public static void main(String[] args) {
        
        Queue<String> customerQueue=new LinkedList<>();

        customerQueue.add("Customer 1");
        customerQueue.add("Customer 2");
        customerQueue.add("Customer 3");

        System.out.println("Processing: "+customerQueue.poll());
        System.out.println(customerQueue);
    }
}
