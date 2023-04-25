import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task_3{

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println( checkOn(deque) ? "Палиндром" : "Не палиндром" );

    }

    public static boolean checkOn(Deque<Integer> deque) {
        boolean checkOn = true;
        for (int i = 0; i < deque.size() / 2; i++){
            int a = deque.pollFirst();
            int b = deque.pollLast();
            if (a != b){
                checkOn = false;
            }
        }
        return checkOn;
    }
       
}