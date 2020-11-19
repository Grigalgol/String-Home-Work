import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class dop {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int k = 0, max = 0, i, a = 0, x = 0, y;
        byte err = 1;
        char c;
        String ans = "";

        BufferedReader o = new BufferedReader(new InputStreamReader(System.in));
        String s = o.readLine();
        s+=" ";

        y = s.length()-1;
        for (i=0;i<s.length();i++){
            c = s.charAt(i);
            if (c != ' ') {
                err = 0;
                k++;
            }
            else{
                if (k > max) {
                    max = k;
                    x = a;
                    y = i - 1;
                }
                a = i + 1;
                k = 0;
            }
        }
        for (i=x;i<=y;i++){
            ans += s.charAt(i);
        }
        if (err == 1) {
            System.out.println(0);
        }
        else {
            System.out.println(ans);
            if (max == 0) {
                max = s.length();
            }
            System.out.println(max);
        }
    }
}