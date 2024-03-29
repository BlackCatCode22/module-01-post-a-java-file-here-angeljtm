// single line comment
/*mutli
line
comment
 */

import java.util.Scanner;
import java.util.*;
public class Animal {
    public static final double FAVNUMBER = 1.6180;

    private String name;
    private int weight;
    private boolean hasOwner = false;
    private byte age;
    private long uniqueID;
    private char favoriteChar;
    private double speed;
    private float height;

    protected static int numberOfAnimals = 0;

    static Scanner userInput = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public long getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
        System.out.println("Unique ID set to: "+ this.uniqueID);
    }
    public void setUniqueID() {
        long minNumber =1;
        long maxnumber = 1000000;

        this.uniqueID= minNumber + (long) (Math.random() * ((maxnumber - minNumber) + 1));
        String stringNumber = Long.toString(maxnumber);
        int numberString = Integer.parseInt(stringNumber);
        System.out.println("Unique ID set to: " + this.uniqueID);
    }


    public char getFavoriteChar() {
        return favoriteChar;
    }

    public void setFavoriteChar(char favoriteChar) {
        this.favoriteChar = favoriteChar;
    }
    public void setFavoriteChar() {
        int randomNumber = (int) (Math.random() * 126) + 1;
        this.favoriteChar = (char) randomNumber;
        if (randomNumber == 32) {
            System.out.println("Favorite character set to space");
        } else if (randomNumber == 10) {
            System.out.println("Favorite character set to new line");
        } else {
            System.out.println("Favorite character set to: " + this.favoriteChar);
        }
        if ((randomNumber > 97) && (randomNumber < 122)) {
            System.out.println("Favorite character set to a lowercase letter");
        }
        if (((randomNumber > 97) && (randomNumber < 122)) || ((randomNumber > 64) && (randomNumber < 91))) {
            System.out.println("Favorite character is a letter");
        }
        int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;
        switch (randomNumber){
            case 8:
                System.out.println("Favorite character set to backspace");
                break;
        }
    }
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    protected static void countTo(int startingNumber){
        for(int i =startingNumber; i<=100; i++){
            if(i == 90) continue;
            System.out.println(i);
        }
    }
    protected static String printNumbers(int maxNumber){
        int i =1;
        while (i< (maxNumber / 2)){
            System.out.println(i);
            i++;

            if (i == (maxNumber/2) ) break;
        }
        Animal.countTo(maxNumber/2);
        return "end of printNumbers";
    }

    protected static void guessMyNumber (){
        int number;
        do {
            System.out.println("Guess a number up to 100");

            while(!userInput.hasNextInt()){
                String numberEntered = userInput.next();
                System.out.printf("%s is not a number \n", numberEntered);
            }
            number = userInput.nextInt();
        } while (number != 50);
    }

    public String makeSound(){
        return "Grrr";
    }

    public static void speakAnimal (Animal randAnimal){
        System.out.println("Animal says " + randAnimal.makeSound());
    }

    public Animal() {
        numberOfAnimals++;
         int sumOfNumbers = 1+5;
         System.out.println("5 + 1 = " + sumOfNumbers);
        int diffOfNumbers = 5-1;
        System.out.println("5 - 1 = " + diffOfNumbers);
        int multOfNumbers = 5*1;
        System.out.println("5 * 1 = " + multOfNumbers);
        int divOfNumbers = 5/1;
        System.out.println("5 / 1 = " + divOfNumbers);
        int modOfNumbers = 5%3;
        System.out.println("5 % 3 = " + modOfNumbers);

        System.out.print("Enter the name: \n");

        if (userInput.hasNextLine()){
            this.setName(userInput.nextLine());
        }

        this.setUniqueID();
    }

    public static void main(String[] args) {
        Animal theAnimal = new Animal();
        int[] favoriteNumber = new int[20];
        favoriteNumber[0] = 100;

        String[] stringsArray = {"Random" + "Words"+ "Here"};
        for(String word : stringsArray){
            System.out.println(word);
        }

        String[][][] arrayName = { { { "000" }, { "100" }, { "200" }, { "300" } }, { { "010" }, { "110" }, { "210" }, { "310" } }, { { "020" }, { "120" }, { "220" }, { "320" } }};

        for(int i = 0; i < arrayName.length; i++)
        {
            for(int j = 0; j < arrayName[i].length; j++){

                for(int k = 0; k < arrayName[i][j].length; k++)
                {
                    System.out.print("| " + arrayName[i][j][k] + " ");
                }
            }
            System.out.println("|");
        }
        String[] cloneOfArray = Arrays.copyOf(stringsArray, 3);
        System.out.println(Arrays.toString(cloneOfArray));
        System.out.println(Arrays.binarySearch(cloneOfArray, "Random"));
}}
