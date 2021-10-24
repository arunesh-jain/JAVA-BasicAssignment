package Question10;
import java.util.*;

public class WordDone {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        //boolean flag=true;
        int flag=0;
        while(flag<1)
        {
            String word= scan.next();
            if(word.equalsIgnoreCase("word")){
                //System.out.print("** word check");
                String last=scan.next();
                if(last.equalsIgnoreCase("done")) {
                    //System.out.print("** done check");
                    flag = 1;
                }
            }
            if(word.charAt(0)==word.charAt(word.length()-1)){
                System.out.println(word + " has first letter is equal to last letter");
            }
        }
    }
}
