import java.util.List;
import java.util.Optional;

public class isPresentMethodImpl {
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
        Optional<Customer> cust = customerByID(customers,5);
        System.out.println("Name of Customer having specific id is : "+
                (cust.isPresent()?
                    (cust.get().getName())
                    :
                    ("Unknown")
                ));
        // still there is not such improvement right?
        // we are using it like traditional if else condition
        // for this we need to use other methods in optional
    }
}
