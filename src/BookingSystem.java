import java.util.Scanner;

public class BookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SeatPlan seatPlan = new SeatPlan(4, 10);


        while(true) {
            seatPlan.printSeatPlan();
            String input = scanner.nextLine().trim().toLowerCase();

            if(input.equals("abort")) {
                System.out.println("Thank you, Come again. Goodbye!");
                break;
            }

            if(input.length() != 2) {
                System.out.println("Invalid input, please enter another seat code");
                continue;
            }

            char columnChar = input.charAt(0);
            int column = columnChar - 'a';
            int row = input.charAt(1) - '0';

            if (columnChar < 'a' || columnChar > 'j' || row < 1 || row > 4) {
                System.out.println("Seat does not exist. Find another seat.");
                continue;
            }
            seatPlan.reserveSeat(row - 1, column);
        }
    }
}
