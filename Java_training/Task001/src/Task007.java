class Customer{
    public static void accept() {
        System.out.println("accept customer called");
    }
    public static void display(){
        System.out.println("display customer called");
    }
}


class Customer1{
    void accept() {
        System.out.println("accept customer-1 called");
    }
    void display(){
        System.out.println("display customer-1 called");
    }
}

public class Task007 {
    public static void main(String[] args) {
        //pattern 1 for calling using public method
        Customer.accept();
        Customer.display();
        //pattern 2 for calling using object 
        Customer1 customer = new Customer1();
        customer.accept();
        customer.display();
    }


    
}
