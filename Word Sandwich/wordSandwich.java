public class wordSandwich {
    private String[] wordSandwiches;

    public wordSandwich(String str1, String str2) {
        makeAllSandwiches(str1, str2);
    }

    private void makeAllSandwiches(String str1, String str2) {
        wordSandwiches = new String(str1.length() - 1);
        for(int i = 0; i < wordSandwiches.length; i++) {
            wordSandwiches[i] = makeSandwich(str1, str2, i + 1);
        }
    }

    private String makeSandwich(String str1, String str2, int n) {
        return str1.substring(0, n) + str2 + str1.substring(n);
    }

    public String[] getFillings(int start, int end) {
        String[] result = new String(wordSandwiches.length);
        for(int i = 0; i < wordSandwiches.length; i++) {
            result[i] = wordSandwiches[i].substring(start, end);
        }

        return result;
    }
}