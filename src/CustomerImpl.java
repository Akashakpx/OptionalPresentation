import java.util.List;

public class CustomerImpl {

    public static Customer customerByID(List<Customer> custList,int custID){
        for(Customer c:custList){
            if(c.getId()==custID){
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Customer> customers = List.of(
                new Customer(1,"Akash"),
                new Customer(2,"Suvarno")
        );
        System.out.println("Name of Customer having specific id is : "+customerByID(customers, 5).getName());
    }
}