import java.util.Scanner;

public class IfPositiveValue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Integer = scan.nextInt();
        if (Integer > 0) {
            System.out.println("This number is positive");
        } else if (Integer == 0){
            System.out.println("This number is 0");
        } else {
        System.out.println("This number is negative");
        }
    }
}
