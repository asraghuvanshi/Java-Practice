import java.util.Scanner;
import java.util.Stack;

import javax.print.event.PrintEvent;

public class Braces {

    public static boolean balancedParenthesis(String str) {
        Stack stack = new Stack();

        char []characters = str.toCharArray();
        for(int i = 0; i<characters.length; i++){
            char chars = characters[i];
            if (chars == '{' || chars == '[' || chars == '('){
               System.out.println("stack characters are :" + stack.push(chars));
               continue;
            }

            if(stack.isEmpty()){
                return false;
            }

            char popCharacters;
            switch(chars){
                case '{':
                    break;
                case '[':
                    break;
                case '(':
                    break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        if (balancedParenthesis(str)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
