import java.util.Comparator;

public class SortByPrice implements Comparator<Car> {
    @Override
    public int compare(Car a, Car b) {
        return a.price.compareTo(b.price);
    }
}
