package DSA.DsaLabs.Lab1.Task4;

import java.util.Queue;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class Customer implements Comparable<Customer>{
    private String name;
    private String type;

    public Customer(String name,String type){
        this.name=name;
        this.type=type;
    }

    public String getType(){
        return type;
    }

    public String getName(){
        return name;
    }

    @Override 
    public int compareTo(Customer obj){
        return 1;
    }
}
public class CustomerQueue {
    public static void main(String[] args) {
        
        Queue<Customer> customerQueue=new PriorityQueue<>(new Comparator<Customer>() {
            
            @Override 
            public int compare(Customer obj1,Customer obj2){
                return (obj2.getType().compareTo(obj1.getType()));
            }
        });

        customerQueue.add(new Customer("Ali", "Regular"));
        customerQueue.add(new Customer("Sara", "Vip"));
        customerQueue.add(new Customer("Bilal", "Regular"));
        customerQueue.add(new Customer("Hira", "Vip"));

        System.out.println("Processing: "+customerQueue.peek().getName()+"("+customerQueue.poll().getType()+")");
        System.out.println("Processing: "+customerQueue.peek().getName()+"("+customerQueue.poll().getType()+")");
        System.out.println("Processing: "+customerQueue.peek().getName()+"("+customerQueue.poll().getType()+")");
        System.out.println("Processing: "+customerQueue.peek().getName()+"("+customerQueue.poll().getType()+")");

    }
}
