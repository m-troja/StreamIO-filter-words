import java.util.*;
public class Main {

     static int minimumNumber = 0;

    public static void main(String[] args) {
        String[] input = takeUserInput();
        String[] filtered = filterWordsByLength(minimumNumber,input);
        System.out.println(Arrays.toString(filtered));

    }

    private static String[] takeUserInput() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter minimum chars number: ");
            minimumNumber = sc.nextInt();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter random words separated by space: ");
            String input = scanner.nextLine();
            String[] words = input.split("\\s+");
            return words;

    }
    public static String[] filterWordsByLength(int minLength, String[] words) {

            return Arrays.stream(words)
                    .filter(word -> word.length() >= minLength)
                    .toArray(String[]::new);
        }
}