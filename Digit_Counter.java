import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int counter = 0;
    int inp = sc.nextInt();
    int original_num = inp;
    for(int i =0; inp>0 ;i++){
        inp = inp/10;
        counter++;
    }
    System.out.println("Total number of count "+ original_num+ ": =" + counter);	
	}
}