public class Main {
    public static void main(String[] args) {

       int myInt = 19;
       double shoeSize = 10.5;
       char myInitial = 'A';

       String myName = "Angel";

       double result = myInt * shoeSize;

       System.out.println(myName.toUpperCase());

       burp();

       String bio = printName("Angel", 19);
       System.out.println(bio);

       for(int i = 0; i < 10; i++){
           System.out.println(i+ "\n");
       }

       Cat myCat = new Cat();
       myCat.name = "Destroyer";
       myCat.age = 3;

       Cat someCat = new Cat();
       someCat.name = "Princess";
       someCat.age = 23;

       System.out.println("My cat " + myCat.name + " is " + myCat.age + " years old.");
       myCat.meow();


    }

    private static void burp(){
        System.out.println("Burrpppp");
    }

    private static String printName(String name , int age){
        if (name.equals("Angel")){
            System.out.println("Oh you're Angel? You Rock!!");
        }
        else {
            System.out.println("Unknown, who are you again?");
        }
        return "My name is " + name + " and I am " + age + " years young.";
    }
}