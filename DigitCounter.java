/* 
Total number of count 1234567: = 7
     123456
     12345
     1234
     123
     12
     1
     0
*/

import java.util.Scanner;
public class DigitCounter
{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int counter = 0;
    int inp = sc.nextInt();
    int original_num = inp;
    int sum = 0 ;
    for(int i =0; inp>0 ;i++){
        sum = sum + inp % 10;
        inp= inp/10;
        System.out.println(inp);
        counter++;
    }
    System.out.println("Total number of count "+ original_num+ ": = " + counter+ " & sum is :=" +sum);	
    }
}
