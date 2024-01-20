public class VarsAndMath {
    public static void main(String[] args) {

        System.out.println("\n Welcome to variables and math !! \n");

        // A variable is a storage location in memory with a specific type and a name.
        /* this is a longer comment

          comments are ignored but the compiler, but are important for the programmer!
         */

       // Declaring an integer variable named 'a' and initializing it with the value 10
        int a = 10;

        // Declaring a double variable named 'b' and initializing it with the value 5.5
        double b = 5.5;

        // Performing a mathematical operation: adding 'a' and 'b'
        double sum = a + b;

        System.out.println("\n\n The sum of " + a + " and " + b + " is " + sum);

        // Variables can also be used to store the results of other operations
        double product = a * b;
        System.out.println("The product of " + a + " and " + b + " is: " + product);

        // Demonstrating variable value change
        a = 20; // Changing the value of 'a' to 20
        sum = a + b; // Recalculating sum with the new value of 'a'
        System.out.println("\n\nThe new sum of " + a + " and " + b + " is: " + sum + "\n\n");






    }
}