import java.util.Scanner;
public class UserInput {
    Scanner scan = new Scanner(System.in);
    public String getUserAnswerString(){
        return scan.next();
    }public boolean getUserAnswerBoolean(){
        return scan.nextBoolean();
    }

}
