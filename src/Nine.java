import java.util.*;
public class Nine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int a = in.nextInt();
        int direction = -1;
        List<Character> m = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        char[] chArray = s.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            char c = chArray[i];
            boolean isLower = Character.isLowerCase(c);
            if (!isLower) {
                c = Character.toLowerCase(c);
            }
            int index = m.indexOf(c);
            int position = index + direction * a;
            if (position < 0) {
                position += m.size();
            } else if (position > m.size()) {
                position -= m.size();
            }
            c = m.get(position);
            if (!isLower) {
                c = Character.toUpperCase(c);
            }
            chArray[i] = c;
        }
        System.out.println(chArray);
    }
}
