import java.util.Scanner;

public class IfRemainder {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int Integer = scan.nextInt();
        if (Integer % 2 == 0){
            System.out.println("It's divisible by 2");
        }
        else if (Integer % 3 == 0) {
            System.out.println("It's divisible by 3");
        }
        else {
            System.out.println("It's divisible by any other");
        }
        }
}
