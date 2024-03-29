import java.util.*;
public class TimedComputation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long startTime;
        long endTime;
        long compTime;
        double seconds;

        double width, height, hypotenuse;
        System.out.println("Triangle hypotenuse calculator");
        System.out.println("______________________________");

        System.out.print("Width: ");
        width = input.nextDouble();
        System.out.print("Height: ");
        height = input.nextDouble();

        startTime = System.nanoTime();

        hypotenuse = Math.sqrt( width*width + height*height );
        System.out.print("A triangle with sides "+ width + " and "+ height+ " has hypotenuse ");
        System.out.println(hypotenuse);
        System.out.println("______________________________");

        System.out.println("\nMathematically, sin(x)*sin(x) + "
                + "cos(x)*cos(x) - 1 should be 0.");
        System.out.println("Let's check this for x = 100:");
        System.out.print("      sin(100)*sin(100) + cos(100)*cos(100) - 1 is: ");
        System.out.println( Math.sin(100)*Math.sin(100) + Math.cos(100)*Math.cos(100) - 1 );
        System.out.println("(There can be round-off errors when" + " computing with real numbers!)");

        System.out.print("\nHere is a random number:  ");
        System.out.println( Math.random() );

        System.out.print("\nThe value of Math.PI is ");
        System.out.println( Math.PI );

        endTime = System.nanoTime();
        compTime = endTime - startTime;
        seconds = compTime / 1000000000.0;

        System.out.print("\nRun time in nanoseconds was: ");
        System.out.println(compTime);
        System.out.println("(This is probably not perfectly accurate!");
        System.out.print("\nRun time in seconds was:  ");
        System.out.println(seconds);
    }
}
