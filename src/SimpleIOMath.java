/**
 * A simple IO project user scanner
 * @version 10.03.22
 * @author riley kim
 */
import java.util.Scanner;

/**
 *Simple algorithm meant to modify and reprint prompted user input 
 */
public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;

    /**
     *prompting user for input into the program and storing the information in variables
     * EXTRA: if statement involving the age variable
     */
    public void promptUser() {
        System.out.println("* Sit yourself down, take a seat *\n" +
                "* All you gotta do is repeat after me *");
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.print("How old are you? ");
        age = in.nextInt();
        if (age >= 17) {
            System.out.println("Wow, you're getting old, do you have any back problems?");
        }
        else{
            System.out.println("You're really young and cool!");
        }
        System.out.print("What is your favorite number? ");
        favNumber = in.nextInt();}


    /**
     * printing out the modified information and reprinting the inputted information on the screen
     */
    public void printInfo(){
        System.out.println("I'm gonna teach you how to sing it out\n" +
                "Come on, come on, come on\n" +
                "Let me tell you what it's all about\n" +
                "Reading, writing, arithmetic\n" +
                "Are the branches of the learning tree\n");
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("At your next birthday, you will turn " +  (age + 1) + ".");
        System.out.println("The first prime factor of " + age + " is: " +  smallestPrimeFactor(age));
        System.out.println("Your favorite number is: " + favNumber);
        System.out.println("Your favorite number squared is: " + favNumber*favNumber);
        System.out.println("* end of program *");
    }
    private int smallestPrimeFactor(int num) {
        for (int i = 2; i < num; i++) {
            if(isPrime(i)){
                if(num % i == 0)
                    return i;
            }
        }
        return num;
    }
    private boolean isPrime(int num){
        for(int i = 2; i <= (int)(Math.sqrt(num)); i++){
            if(num % i == 0)
                return false;
            }
            return true;
        }

    /**
     * Main method for class SimpleIOMath
     * @param args command-line arguments, if needed
     */

    public static void main(String[] args){
        SimpleIOMath app = new SimpleIOMath();
        app.promptUser();
        app.printInfo();
    }
}
