public class TriangleNumberTracker {
    private int term = 1;
    private int number = 1;

    public TriangleNumberTracker(int startTerm) {
        for (int i = 2; 1 <= startTerm; i++) {
            nextTriangle();
        }
    }

    public int currentTriangle() {
        return number;
    }

    public void nextTriangle() {
        term++;
        number += term;
    }

    public void prevTriangle() {
        term--;
        number -= term;
    }
}
