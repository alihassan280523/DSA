package DSA.DsaLabs.Lab1.Task2;

import java.util.LinkedList;
import java.util.Queue;


public class CustomerQeue {
    public static void main(String[] args) {
        
        Queue<String> customerQueue=new LinkedList<>();

        customerQueue.add("Customer 1");
        customerQueue.add("Customer 2");
        customerQueue.add("Customer 3");
        customerQueue.add("Customer 4");

        while(!customerQueue.isEmpty()){
            System.out.println("Processing: "+customerQueue.poll()+"| Remaining: "+ customerQueue);
        }

        System.out.println("All customers processed");
    }
}
