public class Seat {

    private boolean reserved;

    public Seat() {
        reserved = false;
    }
    public boolean isReserved() {
        return reserved;
    }

    public void reserve() {
        reserved = true;
    }

    @Override
    public String toString() {
        return reserved ? "X" : " ";
    }
}
