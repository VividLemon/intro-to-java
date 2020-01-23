import java.util.Scanner;

public class InputAndOutput{

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter some input!");
        String input = keyboard.next();
        System.out.println("Here is your input as output: " + input);
    }

}