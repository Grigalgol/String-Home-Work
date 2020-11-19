import java.util.*;
public class Four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s1 = new String();
        int kol=1;
        int k=0;
        int max=0;
        int imax=0;
        for (int i=0;i<s.length();i++){
            k++;
            if(k>max) { max=k; imax=i-k+1; }
            char c = s.charAt(i);
            if (c == ' ') {
                k=0;
            }
        }
        if(imax!=0)
        s1=s.substring(imax, imax+max-1);
        System.out.print(s1);
        System.out.println("");
        System.out.print(max-1);
    }
}