import java.util.Random;

public class PasswordGenerator {
    private String prefix;
    private int generatedCount;

    public PasswordGenerator(int num, String prefix) {
        this.prefix = prefix;
        this.generatedCount = num;
    }

    public PasswordGenerator(int num) {
        this.prefix = "A";
        this.generatedCount = num;
    }

    public String pwGen() {
        Random random = new Random();
        String password = "";
        
        password += prefix + ".";
        
        for (int i = 0; i < 4; i++) {
            password += (int) (Math.random() * 10);
        }
        
        generatedCount++;
        return password;
    }

    public int pwCount() {
        return generatedCount;
    }

    public static void main(String[] args) {
        PasswordGenerator pw1 = new PasswordGenerator(4, "chs");
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
    }
}