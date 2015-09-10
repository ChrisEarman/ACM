import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Admin on 9/9/2015.
 */
public class ProblemD {
    public static void main(String []args){
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            String input = keyboard.nextLine();
            String[] strs = input.split(" ");
            int essays = Integer.parseInt(strs[0]);
            int rels = Integer.parseInt(strs[1]);
            ArrayList<int[]> pairs = new ArrayList<int[]>();
            if (essays == 0 && rels == 0) {
                break;
            }
            HashMap<Integer, Integer> incoming = new HashMap<Integer, Integer>();
            for (int i = 0; i < rels; i++) {
                input = keyboard.nextLine();
                strs = input.split(" ");
                int a = Integer.parseInt(strs[0]);
                int b = Integer.parseInt(strs[1]);
                pairs.add(new int[] {a, b});
                if (!incoming.containsKey(a)) {
                    incoming.put(a, 0);
                }
                if (!incoming.containsKey(b)) {
                    incoming.put(b, 0);
                }
                incoming.put(b, incoming.get(b) + 1);
            }
            while (true) {
                ArrayList<Integer> next = new ArrayList<Integer>();
                for (int key : incoming.keySet()) {
                    if (incoming.get(key) == 0) {
                        next.add(key);
                    }
                }
                if (incoming.size() == 1) {
                    System.out.println(1);
                    break;
                }
                if (next.size() == 0) {
                    System.out.println(0);
                    break;
                }
                if (next.size() > 1) {
                    System.out.println(2);
                    break;
                }
                int inc = next.get(0);
                for (int[] pair : pairs) {
                    if (pair[0] == inc) {
                        incoming.put(inc, incoming.get(inc) - 1);
                    }
                }
                incoming.remove(inc);
            }
        }
    }
}
