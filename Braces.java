import java.util.Scanner;
import java.util.Stack;

public class Braces {

    public static boolean balancedParenthesis(String str) {
        Stack stack = new Stack();

        char []characters = str.toCharArray();
        for(int i = 0; i<characters.length; i++){
            char chars = characters[i];
            if (chars == '{' || chars == '[' || chars == '('){
                stack.push(chars);
                continue;
            }

            if(stack.isEmpty()){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        if (balancedParenthesis(str)) {
            System.out.println("Balanced Parenthesis");
        } else {
            System.out.println("Not balanced");
        }
    }
}
