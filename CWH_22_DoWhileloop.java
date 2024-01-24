import java.util.Scanner;

public class CWH_22_DoWhileloop {
    public static void main(String[] args) {
         /* int b = 10;
         do {
             System.out.println(b);
             b++;
         } while (b<5); */

         // Quick Quiz
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the end point: ");
        n = sc.nextInt();

        int c = 1;
        do {
            System.out.println(c);
            c++;
        }while(c<=n);

    }
}
