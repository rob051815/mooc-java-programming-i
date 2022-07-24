
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 9999) {
                break;
            }
            list.add(num);
        }
        // after that, the program prints the smallest number
        int smallest = findSmallest(list);
        System.out.println("Smallest number: " + smallest);
        // and its index -- the smallest number
        // might appear multiple times
        printFoundIndex(list, smallest);


    }
    public static int findSmallest(ArrayList<Integer> list) {
        int smallest = list.get(0);
        for(int i = 1; i < list.size(); i++) {
            int cur = list.get(i);
            if(cur < smallest) {
                smallest = cur;
            }
        }
        return smallest;
    }
    public static void printFoundIndex(ArrayList<Integer> list, int query) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == query) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
