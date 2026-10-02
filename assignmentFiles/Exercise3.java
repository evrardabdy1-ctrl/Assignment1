
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of hours parked: ");
        int hours = input.nextInt();

        int rate = 3000;
        int totalFee = hours * rate;

        System.out.println("Total parking fee: Rp" + totalFee);

        input.close();
    }
}