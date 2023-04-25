import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task_4 {

    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        // result [6,6,0,1]
        System.out.println(sum(d1, d2));
    }


    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> sum = new ArrayDeque<>();
        for (int i = 0; i <= d1.size() ; i++){
            for (int j = 0; j <= d2.size() ; j++){
                int d1collector = d1.pollFirst();
                int d2collector = d2.pollFirst();
                sum.add((d1collector + d2collector)%10);
                if ((d1collector + d2collector)%10 == 0){
                    sum.add((d1collector + d2collector)/10);
                }
            }
        }
        return sum;
    }
}