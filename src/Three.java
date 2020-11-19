import java.util.*;
public class Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int kol=1;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c == ' ') {
                kol++;
            }
         }
        System.out.println(kol);
    }
}
