import java.util.Scanner;

public class CWH_05_Takinginput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int a = sc.nextInt();
        System.out.println("Enter num2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of these numbers is: ");
        System.out.println(sum);
    }
}
