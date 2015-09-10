import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Admin on 9/9/2015.
 */
public class ProblemE {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        while(true){
            int count = Integer.parseInt(s.nextLine());
            if(count == 0)
                break;
            ArrayList<String> names = new ArrayList<>();
            for(int i = 0; i < count; i++){
                names.add(s.nextLine());
            }
            Collections.sort(names);

            String name1 = names.get(count/2);
            String name2 = names.get(count/2 - 1);
            int length;
            if(name1.length() < name2.length()){
                length = name1.length();
            }
            else{
                length = name2.length();
            }
            String output = "";
            for(int i = 0; i < length; i++){
                if (i == length - 1) {
                    output = name2;
                    break;
                }

                if(name1.charAt(i) == name2.charAt(i)){
                    output += (name2.charAt(i));
                }

                else {
                    output += (char)(name2.charAt(i) + 1);
                    break;
                }
            }
            System.out.println(output);
        }
    }
}
