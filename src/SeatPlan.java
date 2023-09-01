public class SeatPlan {
    private Seat[][] seats;

    public SeatPlan(int rows, int cols) {
        seats = new Seat[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = new Seat();
            }
        }
    }

    public void printSeatPlan() {
        System.out.print(" ");
        for (int i = 0; i < seats[0].length; i++) {

            System.out.print("  "+(char)('A' + i) + " ");
        }
        System.out.println();
        for (int i = 0; i < seats.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print("| " + seats[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println();
    }

    public void seatLimit(int row, int col) {
        if (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length) {
            System.out.println("Invalid Seat");
        }
    }

    public void reserveSeat(int row, int col) {
        if (seats[row][col].isReserved()) {
            System.out.println("Sorry, the seat is already reserved.");
            return;
        }

        seats[row][col].reserve();
        System.out.println("Seat " + (char) ('A' + row) + (col + 1) + " successfully reserved.");
    }


}
