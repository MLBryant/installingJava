import java.util.Scanner;

public class MarsAdventure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = input.nextLine();  // Get user input
        System.out.println("Hello, " + name + " we salute your bravery to embark on this mission to Mars.");

        System.out.println("What color is your spacesuit?");

        String color = input.nextLine();
        System.out.println(color + " is in. You'll be the best dressed, well... anything on Mars");

        System.out.println("Where would you prefer to land on Mars?");

        String site = input.nextLine();
        System.out.println("I hear " + site + " is wonderful this time of year.");

        System.out.println("For reference, what is your favorite food?");

        String food = input.nextLine();
        System.out.println("I hope you have fond memories of " + food + ", it'll be a long time before you have it again.");

        System.out.println("Where's the first place your going when you get back home?");

        String place = input.nextLine();
        System.out.println("Sounds great! But " + place + " will have to wait. You have some Mars exploring to do and it'll be 15 years until the next closest alignment of Earth and Mars. Please enjoy your stay and remember, if you have an emergency, we'll promptly respond in ~26 minutes.");
    }
}
