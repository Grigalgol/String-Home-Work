import java.util.*;
public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);
        int kod = (int) a;
        if(kod > 96 && kod<123) a = (char) (kod-32);
        else if(kod > 64 && kod < 91) a = (char) (kod+32);
        System.out.println(a);
    }
}
