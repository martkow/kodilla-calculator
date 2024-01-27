//Wyobraź sobie sytuację, w której okazuje się, że kod napisany przez dewelopera z innej firmy przechowuje zduplikowane wartości dotyczące zamówień w sklepie internetowym. Przez to wysyłane są czasem dwa produkty zamiast jednego.
//
//Z tego, co wiadomo, developer użył ArrayList do przechowywania numerów zamówienia. Czy jest to dobry pomysł?
//
//Twoim zadaniem jest wykonanie własnej implementacji przechowywania numerów zamówień. Pamiętaj, aby sprawdzić, czy Twoje rozwiązanie pozwala na przechowywanie zduplikowanych wartości!
package module4.second;

import java.util.Set;
import java.util.LinkedHashSet;

public class Main {

    public static void main (String[] args) {

        OrderNumbers orderNumbers = new OrderNumbers();
        orderNumbers.addOrderNumber(1);
        orderNumbers.addOrderNumber(30);
        orderNumbers.addOrderNumber(5);
        orderNumbers.addOrderNumber(30);
        orderNumbers.addOrderNumber(5);
        orderNumbers.addOrderNumber(10);

        orderNumbers.printOrderNumbers();
    }
}

class OrderNumbers {

    /* LinkedHashSet:
     *  Keeps track of the order that elements were inserted in.
     *  No duplicates (additionally adding an element that is already in the set does not change its position in the iteration order).
     */
    private Set<Integer> orderNumbers = new LinkedHashSet<>();

    public boolean addOrderNumber(int orderNumber) {

        if (orderNumbers.contains(orderNumber)) {

            System.out.println("Order " + orderNumber + " already exists in the system!");
            orderNumbers.add(orderNumber); //for checking that the implementation doesn't allow duplicates
            return false;
        }

        orderNumbers.add(orderNumber);
        System.out.println("Order " + orderNumber + " successfully addded to the system!");
        return true;
    }

    public void printOrderNumbers() {

        System.out.println("Order numbers:");
        for (int orderNumber : orderNumbers) {

            System.out.println(orderNumber);
        }
    }
}

