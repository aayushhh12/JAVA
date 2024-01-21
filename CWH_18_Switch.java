import java.util.Scanner;

public class CWH_18_Switch {
    public static void main(String[] args) {
        int var;
        System.out.print("Enter your Age= ");
        Scanner sc = new Scanner(System.in);
        var = sc.nextInt();

        switch(var){
            case 18:
                System.out.println("Becoming an Adult");
                break;

            case 23:
                System.out.println("Becoming an job vala banda");
                break;

            case 30:
                System.out.println("Becoming a Married Man");
                break;

            case 60:
                System.out.println("Becoming an Aged Budha");
                break;

            default:
                System.out.println("Enjoy your life");
        }
    }
}
