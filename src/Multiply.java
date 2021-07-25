import java.util.Scanner;

public class Multiply {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first num:");
        int first_num = scan.nextInt();
        System.out.println("Enter second num:");
        int second_num = scan.nextInt();
        System.out.println("Product of entered numbers is :" + first_num*second_num);
    }

}
