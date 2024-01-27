//Definicja algorytmu Euklidesa
//
//Algorytm Euklidesa jest szybkim sposobem obliczania największego wspólnego dzielnika (NWD) dwóch, zwłaszcza dużych liczb całkowitych.
//
//Działanie w uproszczeniu: odejmujemy liczbę mniejszą od większej, następnie tę różnicę odejmujemy od liczby mniejszej. Powtarzamy to aż obie liczby staną się równe. Ta ostatnia wartość to nasz szukany wspólny dzielnik.
//
//Dodatkowo w rozwiązaniu możmy zastosować dwie drogi: z użyciem odejmowania lub dzielenia z resztą. Poniżej wyjaśniamy to konkretnie.
//
//Wyzwanie może wydawać się trudne na samym początku, ale jest to naprawdę prosty program. Podzielimy implementację tego programu na konkretne etapy, co pozwoli nam na spojrzenie na nie w prosty sposób. Skupmy się na wykorzystaniu odejmowania.
//
//Aby wykonać poprawnie to zadanie potrzebne będzie wykorzystanie poniższych instrukcji języka Java:
//
//while,
//if-else,
//System.out.println().
//Rozpocznij swój program w edytorze udostępnionym przez Kodillę, aby mieć wszystko gotowe przed implementacją.
//
//Pierwszym krokiem do utworzenia programu powinna być deklaracja zmiennych. Wiemy, że algorytm operuje na 2 zmiennych, dla których szuka dzielnika, wiemy też, że liczby są liczbami całkowitymi. Stwórz i przypisz im domyślne wartości.
//Kolejnym krokiem jest utworzenie pętli while, która będzie trwać do końca znalezienia wspólnego dzielnika 2 zmiennych.
//Wewnątrz pętli while należy skorzystać z warunku if i else oraz operatora -=. Dzięki temu nasz program wykona działanie a = a - b, czyli pomniejszy wartość a o wartość b i przypisze ją do zmiennej a:
//a -= b;
//Wykonując te trzy kroki i implementując odpowiednio logikę, jesteś w stanie zaimplementować algorytm Euklidesa. Swój kod skompiluj i prześlij do Mentora. Powodzenia!
//
//Użycie modulo
//Dla treningu możesz też spróbować użycia reszty z dzielenia. Aby obliczyć NWD(a, b) drugim sposobem, wykonujemy kolejno następujące kroki:
//
//Dzielimy z resztą liczbę a przez liczbę b.
//Jeżeli reszta = 0, to NWD(a,b)=b.
//Jeżeli reszta !=0, to przypisujemy liczbie a wartość liczby b, a liczbie b wartość otrzymanej reszty. Następnie wykonujemy ponownie punkt 1.
package module4.seven;

public class Main {
    public static void main (String[] args) {
        GCDCalculator calculator1 = new GCDCalculator(0);
        calculator1.printGCD(-6,30);
        calculator1.printGCD(0,0);

        GCDCalculator calculator2 = new GCDCalculator(1);
        calculator2.printGCD(10,-25);
        calculator2.printGCD(0,0);
    }
}


