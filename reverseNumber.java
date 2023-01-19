// Reverse of the number

import java.util.Scanner;
public class reverseNumber
{
    public static void main(String[] args) {
		int reverse = 0;
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original_number = num;
        while(num>0){
          reverse = reverse * 10 + num % 10 ;
          num = num/10;
          ++counter;
        }
            System.out.println("Reverse of the "+ original_number+": = "+reverse + " & counter is "+ counter);

	}
}
