import java.util.Deque;
import java.util.LinkedList;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println(validate("()[]"));
        System.out.println(validate("[]"));
        System.out.println(validate(")()("));
    }
 
    private static boolean validate(String strSrc) {
        Deque<Character> charDeque = new LinkedList<>();
        for (char tmpChar : strSrc.toCharArray()) {
            if (Character.isMirrored(tmpChar))
                if (Character.isMirrored(tmpChar + 2)) 
                    charDeque.addFirst(tmpChar);
                else charDeque.addLast(tmpChar);
        }
        if (charDeque.size() % 2 != 0) return false;
        for (int i = 0; i < charDeque.size() / 2; i++) {
            if ((charDeque.removeLast() - charDeque.removeFirst()) != 2) return false;
        }
        return true;
    }
}
