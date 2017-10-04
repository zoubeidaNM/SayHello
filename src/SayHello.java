import java.util.Scanner;

public class SayHello {

    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);

        String name = "Bart";
        System.out.println("Enter your Name: ");
        name = keyboard.nextLine();

        System.out.println(helloName(name));
    }

        public static String helloName(String name) {
            return "Hello, " + name + "!";
        }
}

