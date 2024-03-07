public class ActivityLog {
    private int actMins;
    private int longest;
    private int longestHigh;


    public void log(int minutes, boolean high) {
        if(high) {
            actMins += 2 * minutes;
            if(minutes > longestHigh) {
                longestHigh = minutes;
            } 
        } else {
            actMins += minutes;
        }

        longest = Math.max(longest, minutes);
    }

    public int longest(boolean highOnly) {
        return highOnly ? longestHigh : longest;
    }

    public int activeMinutes() {
        return actMins;
    }

    public static void main(String[] args) {
        ActivityLog a = new ActivityLog();
        System.out.println(a.activeMinutes());
        System.out.println(a.longest(false));
        System.out.println(a.longest(true));
        System.out.println();

        a.log(45, false);
        a.log(30, true);
        a.log(30, true);
        System.out.println(a.activeMinutes());
        System.out.println(a.longest(false));
        System.out.println(a.longest(true));
        System.out.println();

        a.log(50, true);
        a.log(30, false);
        System.out.println(a.activeMinutes());
        System.out.println(a.longest(false));
        System.out.println(a.longest(true));
    }
}