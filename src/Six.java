import java.util.*;
public class Six {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int i,j;
        int flag=0;
        for(i=0; i<s.length()-1; i++) {
            for(j=i+1; j<s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    System.out.println(s.charAt(i));
                    flag++;
                    break;
                }
            }
            if(flag!=0) break;
        }
    }
}
