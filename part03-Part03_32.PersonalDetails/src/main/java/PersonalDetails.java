
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> birthYears = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] inputArr = input.split(",");
            birthYears.add(Integer.valueOf(inputArr[1]));
            names.add(inputArr[0]);
        }

        System.out.println("Longest name: " + names.get(getIndLongestName(names)));
        System.out.println("Average of the birth years: " + getAverageYear(birthYears));
    }

    public static int getIndLongestName(ArrayList<String> names) {
        if (names.size() == 0) {
            return -1;
        }
        int indLongestName = 0;
        for (int i = 1; i < names.size(); i++) {
            String cur = names.get(i);
            if (cur.length() > names.get(indLongestName).length()) {
                indLongestName = i;
            }
        }
        return indLongestName;
    }

    public static double getAverageYear(ArrayList<Integer> years) {
        if (years.size() == 0) {
            return -1;
        }
        double sum = 0;
        int qt = years.size();

        for (double year : years) {
            sum += year;
        }
        return sum / qt;
    }
}

