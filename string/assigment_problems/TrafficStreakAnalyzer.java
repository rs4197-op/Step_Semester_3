public class TrafficStreakAnalyzer {

    static void findLongestStreak(String signalLog) {
        if (signalLog.length() == 0) {
            return;
        }

        int currentLength = 1;
        int longestLength = 1;

        char currentColor = signalLog.charAt(0);
        char longestColor = signalLog.charAt(0);

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentColor) {
                currentLength++;
            } else {
                currentColor = signalLog.charAt(i);
                currentLength = 1;
            }

            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestColor = currentColor;
            }
        }

        System.out.println(
            "Longest Streak: '" + longestColor +
            "' repeated " + longestLength + " times"
        );
    }

    public static void main(String[] args) {
        String signalLog = "RRGGGYRR";

        findLongestStreak(signalLog);
    }
}
