
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        double sum = 0;
        int qt = 0;
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1) {
                break;
            }
            list.add(num);
            qt++;
        }
        for(int num: list) {
            sum += num;
        }
        // Then it computes the average of the numbers on the list
        // and prints it.
        System.out.println("Average: " + sum / qt);
    }
}
