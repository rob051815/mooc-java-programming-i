
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> ages = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] inputArr = input.split(",");
            ages.add(Integer.valueOf(inputArr[1]));
        }
        int oldest = getOldest(ages);
        if (oldest >= 0) {
            System.out.println("Age of the oldest: " + getOldest(ages));
        }
    }

    public static int getOldest(ArrayList<Integer> numbers) {
        if (numbers.size() == 0) {
            return -1;
        }
        int oldest = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            int cur = numbers.get(i);
            if (cur > oldest) {
                oldest = cur;
            }
        }
        return oldest;
    }
}
