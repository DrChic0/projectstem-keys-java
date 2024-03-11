public class GuessingGame {
    private int target;
    private int count;
    private boolean gameWon;

    public GuessingGame(int max) {
        target = (int) (max * Math.random()) + 1;
        count = 0;
        gameWon = false;
    }

    public String guessAnswer(int guess) {
        if(gameWon) {
            return "Game already over";
        }
        count++;

        if(guess > target) {
            return "Too high";
        }

        if(guess < target) {
            return "Too low";
        }

        gameWon = true;

        return "Correct";
    }

    public int numGuesses() {
        return count;
    }

    public static void main(String[] args) {
        GuessingGame g = new GuessingGame(24);
        System.out.println(g.numGuesses());
        System.out.println(g.guessAnswer(55));
        System.out.println(g.numGuesses());
        System.out.println(g.guessAnswer(12));
        System.out.println(g.guessAnswer(30));
        System.out.println(g.numGuesses());
        System.out.println(g.guessAnswer(24));
        System.out.println(g.numGuesses());
        System.out.println(g.guessAnswer(26));
        System.out.println(g.guessAnswer(24));
        System.out.println(g.numGuesses());
    }
}