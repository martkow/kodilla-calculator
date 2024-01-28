//Część 1
//
//Napisz klasę Cannon (z ang. armata) z prywatnym polem loaded (z ang. załadowana) typu boolean oraz metodą fire() (z ang. wystrzel), która sprawdza przed wystrzeleniem, czy kula znajduje się w armacie.
//
//Jeśli armata nie jest załadowana, zostanie wyświetlona informacja (System.out.println) o braku kuli w armacie, a następnie kula zostanie załadowana do tej armaty.
//
//Część 2
//
//W metodzie main klasy Program utwórz kolekcję typu LinkedList do przechowywania armat.
//
//Dodaj kilka obiektów klasy Cannon do kolekcji, a następnie – używając pętli for – załaduj wszystkie armaty.
package module4.four;

import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main (String[] args) {
        List<Cannon> cannons = new LinkedList<>();

        cannons.add(new Cannon());
        cannons.add(new Cannon(true));
        cannons.add(new Cannon(false));

        for (Cannon cannon : cannons) {
            cannon.load();
        }
    }
}

