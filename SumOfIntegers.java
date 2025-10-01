import java.util.*;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers separated by spaces:");
        String inputLine = sc.nextLine();

        String[] parts = inputLine.split(" ");
        for (String part : parts) {
            int value = Integer.parseInt(part);

            numbers.add(value);
        }

        int sum = 0;
        for (Integer num : numbers) { 
            sum += num;
        }

        System.out.println("The sum of integers = " + sum);

        sc.close();
    }
}
