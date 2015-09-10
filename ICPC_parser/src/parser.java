import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Admin on 9/9/2015.
 */
public class parser {
    Scanner s;
    public parser(Scanner scan){
        System.out.println("created parser");
        s = scan;
    }

    public ArrayList<String> readline(){
        ArrayList<String> line;
        line = new ArrayList<>(Arrays.asList(s.nextLine().split(" ")));
        return line;
    }

    public ArrayList<ArrayList<String>> read_test(){
        ArrayList<ArrayList<String>> test = new ArrayList<>();
        ArrayList<String> line = readline();
        if(end_of_file(line))
            return new ArrayList<>();
        while(!end_of_test(line)){
            test.add(line);
            line = readline();
        }
        return test;
    }

    public boolean end_of_test(ArrayList<String> bob){
        if(bob.get(0).equals("-1") && bob.get(1).equals("-1"))
            return true;
        return false;
    }

    public boolean end_of_file(ArrayList<String> bob){
        if(bob.get(0).equals("0") && bob.get(1).equals("0"))
            return true;
        return false;
    }

    public static void main(String []args){
        Scanner k = new Scanner(System.in);
        parser myparser = new parser(k);

        ArrayList<ArrayList<String>> line1 = myparser.read_test();

        System.out.println("bob");
    }
}


