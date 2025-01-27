import java.util.List;
import java.util.Optional;

public class CustomerOptionalImpl {
    public static Optional<Customer> customerByID(List<Customer> custList, int custID){
        for(Customer c:custList){
            if(c.getId()==custID){
                return Optional.of(c);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        List<Customer> customers = List.of(
                new Customer(1,"Akash"),
                new Customer(2,"Suvarno")
        );
        System.out.println("Name of Customer having specific id is : "+
                customerByID(customers, 5).get().getName());
        // still it throws NoSuchElement Exception. Only we switch from NullPointer Exception to NoSuchElement Exception
    }
}
