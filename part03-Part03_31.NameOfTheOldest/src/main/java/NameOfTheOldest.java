
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] inputArr = input.split(",");
            ages.add(Integer.valueOf(inputArr[1]));
            names.add(inputArr[0]);
        }
        String oldest = names.get(getIndOldest(ages));
        System.out.println("Name of the oldest: " + oldest);
    }

    public static int getIndOldest(ArrayList<Integer> ages) {
        if (ages.size() == 0) {
            return -1;
        }
        int indOldest = 0;
        for (int i = 1; i < ages.size(); i++) {
            int cur = ages.get(i);
            if (cur > ages.get(indOldest)) {
                indOldest = i;
            }
        }
        return indOldest;
    }

}

