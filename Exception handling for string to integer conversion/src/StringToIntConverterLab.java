import java.util.NoSuchElementException;
import java.util.Scanner;

public class StringToIntConverterLab {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner scanner = new Scanner(System.in);
        boolean validInput = false; // Check validInput
        while (!validInput) {      // This loop will continue to prompt the user until a valid integer is entered
            try {
                System.out.print("Please enter a string to convert to an integer: ");
                String input = scanner.nextLine();
                int convertedNumber = Integer.parseInt(input);
                System.out.println("The converted integer is: " + convertedNumber + "\n");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value" + "\n");
            } catch (NoSuchElementException e) {
                System.out.print("ctrl+c/ctrl+z akan menutup program");
                System.exit(0);
            }
        }
        scanner.close();
    }
}
