import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car> carList=new ArrayList<Car>();
        carList.add(new Car(2300,80));
        carList.add(new Car(1500,60));
        carList.add(new Car(6500,30));


        Collections.sort(carList,new SortByPrice());

       }

}