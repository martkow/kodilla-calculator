//W tym zadaniu przypomnisz sobie HashMapy.
//Napisz program, który przekopiuje wszystkie wartości z HashMapy myFavoriteColours i myFriendsFavoriteColours
//do HashMapy ourFavoriteColours:
package module4.third;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Main {

    public static void main (String[] args) {

        Map<Integer,String> myFavoriteColours = new HashMap<>();
        Map<Integer,String> myFriendsFavoriteColours = new HashMap<>();

        myFavoriteColours.put(1, "Red");
        myFavoriteColours.put(2, "Green");
        myFavoriteColours.put(3, "Black");
        System.out.println("Values in first map: " + myFavoriteColours);
        myFriendsFavoriteColours.put(4, "White");
        myFriendsFavoriteColours.put(5, "Blue");
        myFriendsFavoriteColours.put(6, "Orange");
        System.out.println("Values in second map: " + myFriendsFavoriteColours);

        Map<Integer,String> ourFavoriteColours = new HashMap<>();

        Iterator<Integer> iterator = myFavoriteColours.keySet().iterator();
        while (iterator.hasNext()) {

            Integer key = iterator.next();
            ourFavoriteColours.put(key, myFavoriteColours.get(key));
            System.out.println(key);
        }

        Iterator<Map.Entry<Integer,String>> iterator2 = myFriendsFavoriteColours.entrySet().iterator();
        while (iterator2.hasNext()) {

            Map.Entry<Integer,String> entry = iterator2.next();
            ourFavoriteColours.put(entry.getKey(), entry.getValue());
            System.out.println(entry);
        }

        System.out.println("Values in third map: " + ourFavoriteColours);

        //  ourFavoriteColours.put(1, "Yellow");
        //  System.out.println("Values in third map: " + ourFavoriteColours);
        //  System.out.println("Values in first map: " + myFavoriteColours);
        //  for (int key : myFavoriteColours.keySet()) {

        //  ourFavoriteColours.put(key, myFavoriteColours.get(key));
        // }
    }
}
