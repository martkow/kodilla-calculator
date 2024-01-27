//Wykorzystaj poniższą listę do iteracji w pętli for:
//
//List<String> companies = new ArrayList<>();
//companies.add("DELL");
//companies.add("APPLE");
//companies.add("SAMSUNG");
//companies.add("SONY");
//companies.add("ALCATEL");
//Używając konkatenacji, zapisz wszystkie nazwy po przecinku tak, aby otrzymać wynik:
//
//DELL, APPLE, SAMSUNG, SONY, ALCATEL
//

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main (String[] args) {

        List<String> companies = new ArrayList<>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        String result = companies.get(0);
        for (int i = 1; i < companies.size(); i++) {

            result = result + ", " + companies.get(i);
        }

        System.out.println(result);

        Iterator iterator = companies.iterator();
        String result2 = "";
        while (iterator.hasNext()) {

            result2 = result2 + ", " + iterator.next();
        }

        System.out.println(result2.substring(2));
    }
}