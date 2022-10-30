import java.util.Scanner;

public class InsertName {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String MyName = scan.nextLine();
        System.out.println("Enter your age");
        int Years = scan.nextInt();
        scan.close();
        System.out.println("My name is " + MyName + " and I am " + Years + " years old");
    }
}
