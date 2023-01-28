import java.util.Arrays;

public class deepToString {
    public static void main(String[] args) {
        String array[][] = new String[3][3];
        array[0][0] = "C" ;
        array[0][1] = "Cpp";
        array[0][2] = "Java";
        array[1][0] = "Python";
        array[1][1] = "Ruby" ;
        array[1][2] = "Swift";
        array[2][0] = "Go" ;
        array[2][1] = "Rust";
        array[2][2] = "JavaScript";
        System.out.println(Arrays.deepToString(array));
    }
}
