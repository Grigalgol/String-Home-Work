import java.util.*;
public class Eight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s1 = "", s2 = "";
        int i;
        char c;
        for (i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c != ' ') {
                s1 += c;
            }
        }
        for (i = s.length() - 1; i >= 0; i--) {
            c = s.charAt(i);
            if (c != ' ') {
                s2 += c;
            }
        }
        if (s1.equals(s2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}