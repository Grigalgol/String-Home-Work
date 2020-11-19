import java.util.*;
public class Ten {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int i;
        s=s+" ";
        String s1 = "";
        for (i=0; i<s.length()-1; i++) {
            char c = s.charAt(i), d = s.charAt(i+1);
            if(c!=' ' || d!=' ') s1=s1+c;
        }
        System.out.println(s1);
    }
}
