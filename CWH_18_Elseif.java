import java.util.Scanner;
public class CWH_18_Elseif {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age>56) {
            System.out.println("You are experienced");
        }
        else if (age>46) {
            System.out.println("You are semi-experienced");
        }
        else if (age>36) {
            System.out.println("You are semi-semi-experienced");
        }
        else {
            System.out.println("You are not experienced");
        }
        if(age>10) {
            System.out.println("You are Teenager");
        }
        else if (age>5) {
            System.out.println("You are not a kid");
        }
        else {
            System.out.println("You are a kid");
        }
    }
}
