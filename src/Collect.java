import java.util.*;
public class Collect {
        public static void main(String args[]) {
            ArrayList<String> cars = new ArrayList<String>();
            ArrayList<String> cars2 = new ArrayList<String>();
            cars.add("Race");
            cars.add("Lightning");
            cars2.add("MC");
            cars2.add("Queen");
            System.out.println(cars);
            Collections.sort(cars);
            System.out.println(cars);
            Collections.copy(cars2, cars);
            System.out.println(cars2);
            int checker;
            checker=Collections.binarySearch(cars2,"Race");
            System.out.println(checker);
            System.out.println("The frequency of Boat is " + Collections.frequency(cars, "Boat"));
            Collections.shuffle(cars2);
            System.out.println(cars2);
            Collections.reverse(cars2);
            System.out.println(cars2);









        }
    }
