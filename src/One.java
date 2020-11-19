import java.util.*;
public class One {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);
        int kod = (int) a;
        if(kod>=48 && kod<=57) System.out.println("yes");
        else System.out.println("no");
    }
}
