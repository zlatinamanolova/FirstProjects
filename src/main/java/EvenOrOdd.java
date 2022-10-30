import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numberToCheck = scan.nextInt();
        scan.close();
        int Remainder = numberToCheck % 2;
        if(Remainder == 0) {
            System.out.print("Even");

        } else {
            System.out.println("Odd");
        }
    }
}
