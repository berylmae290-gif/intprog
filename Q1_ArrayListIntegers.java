// TEST 1
import java.util.ArrayList;
public class Q1_ArrayListIntegers {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(15);
        integers.add(42);
        integers.add(8);
        integers.add(99);
        integers.add(23);

        integers.add(21);
        integers.add(50);
        integers.add(100);
        integers.add(67);
        integers.add(15);

        System.out.println("Numbers in the list: " + integers);

        int max = integers.get(0);

        for(int i = 1; i < integers.size(); i++){
            if (integers.get(i) > max){
                max = integers.get(i);
            }

        }

        int min = integers.get(0);

        for(int a = 1; a < integers.size(); a++){
            if(integers.get(a) < min){
                min = integers.get(a);
            }
        }

        int sum = 0;
        for(int integer : integers){
            sum += integer;
        }

        int average = sum / integers.get(0);

        System.out.println("The maximum number in the ArrayList is: " + max);
        System.out.println("The minimum number in the ArrayList is: " + min);
        System.out.println("The average number in the ArrayLIst is: " + average);
        // Challenge: find the center number
        System.out.println("The center number in the ArrayList is: "); // ??

    }
}
