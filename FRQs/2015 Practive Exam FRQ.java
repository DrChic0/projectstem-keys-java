// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public static class HiddenWord {
    private String word;
    
    public HiddenWord(String word) {
        this.word = word;
    }
    
    public String getHint(String guess) {
        String result = "";
        for(int i = 0; i < guess.length() - 1; i++) {
            String char1 = word.substring(i, i + 1);
            String char2 = guess.substring(i, i + 1);
            boolean isInWord = false;
            
            for(int j = 0; j < word.length() - 1; j++) {
                String char = word.substring(i, i + 1);
                
                if(char.equals(char2)) {
                    isInWord = true;
                }
            }
            
            if(char1.equals(char2)) {
                result += char2;
            } else if(isInWord) {
                result += "*";
            } else {
                result += "+";
            }
        }
    }
}

public class 2015 Practive Exam FRQ {
    public static void main(String[] args) {
        HiddenWord word = new HiddenWord("HARPS");
        System.out.println(word.getHint("HELLO"));
    }
}