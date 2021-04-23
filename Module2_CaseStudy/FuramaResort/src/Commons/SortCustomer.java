package Commons;

import Models.Customer;

import java.util.Comparator;

public class SortCustomer implements Comparator<Customer> {
    public int compare(Customer o1, Customer o2) {
        if (o1.getNameCustomer().compareTo(o2.getNameCustomer()) != 0) {
            return o1.getNameCustomer().compareTo(o2.getNameCustomer());
        } else{
            int yearO1 = Integer.parseInt(o1.getBirthDayCustomer().substring(6, 10));
            int yearO2 = Integer.parseInt(o2.getBirthDayCustomer().substring(6, 10));
            return yearO1 - yearO2;
        }
    }
}
