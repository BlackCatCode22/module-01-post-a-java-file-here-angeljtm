
import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double principal;
        double rate;
        double interest;

        System.out.print("Initial ammount invested: ");
        principal = input.nextDouble();
        rate = 0.027;
        interest = principal * rate;
        principal = principal + interest;

        System.out.println("The interest earned is $" + interest);
        System.out.println("The value of the investment after one year is $"+ principal);
    }
}
