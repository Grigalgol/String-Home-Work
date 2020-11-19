import java.util.*;
public class Seven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = new String();
        int x = 0, y = 0;
        while (in.hasNext()) {
            s = in.next();
            int a = in.nextInt();
            switch (s) {
                case "North":
                    y += a;
                    break;
                case "South":
                    y -= a;
                case "East":
                    x += a;
                    break;
                case "West":
                    x -= a;
                    break;
            }
        }

        System.out.println(x + " " + y);
    }
}
