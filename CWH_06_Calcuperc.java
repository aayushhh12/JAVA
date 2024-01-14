import java.util.Scanner;
public class CWH_06_Calcuperc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks are out of");
        float a = sc.nextFloat();

        System.out.println("Subject 1 Marks");
        float b = sc.nextFloat();

        System.out.println("Subject 2 Marks");
        float c = sc.nextFloat();

        System.out.println("Subject 3 Marks");
        float d = sc.nextFloat();

        System.out.println("Subject 4 Marks");
        float e = sc.nextFloat();

        System.out.println("Subject 5 Marks");
        float f = sc.nextFloat();

        float g = b + c + d + e + f;
        System.out.println("Total marks obtained");
        System.out.println(g);
        
        float h = a*5;
        System.out.println("Total marks");
        System.out.println(h);

        float i = g / h;
        System.out.println("The Percentage obtained by the KID is: ");
        System.out.println(i*100);



    }
}
