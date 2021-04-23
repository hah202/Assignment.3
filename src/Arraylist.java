import java.util.ArrayList;
public class Arraylist {
    public static void main(String args[]){
        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<String> cars2 = new ArrayList<String>();
        cars.add("E");
        cars.add("e");
        cars2.add("MC");
        cars2.add("Queen");
        System.out.println(cars);
        boolean checker = cars.contains("o");
        if (checker)
            System.out.println("The list contains o.");
            else
                System.out.println("The list does not contains o.");
            cars.set(1, new String("Lightning"));
        System.out.println(cars);

        cars.remove(1);
        System.out.println(cars);

        cars.retainAll(cars2);
        System.out.println(cars2);








    }
}
