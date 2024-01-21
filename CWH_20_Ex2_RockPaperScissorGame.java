import java.util.Random;
import java.util.Scanner;

public class CWH_20_Ex2_RockPaperScissorGame {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor");
        int uI = sc.nextInt();

        Random random = new Random();
        int cI = random.nextInt(3);

        if(uI == cI) {
            System.out.println("Draw");
        } else if (uI == 0 && cI == 2 || uI == 1 && cI == 0 || uI == 2 && cI == 1) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Win!");
        }
        System.out.println("Computer choice: " + cI);
    }
}
