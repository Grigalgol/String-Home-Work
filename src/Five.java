import java.util.*;
public class Five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int flag=0;
        for(int i = 0; i<s.length()/2; i++) {
            char c = s.charAt(i);
            char d = s.charAt(s.length()-1-i);
            if(c != d) flag=1;
        }
        if(flag==0) System.out.println("yes");
        else System.out.println("no");
    }
}
